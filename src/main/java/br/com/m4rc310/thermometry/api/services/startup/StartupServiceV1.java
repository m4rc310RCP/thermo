package br.com.m4rc310.thermometry.api.services.startup;

import java.io.InputStream;
import java.util.Date;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.reactivestreams.Publisher;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import br.com.m4rc310.thermometry.api.dto.DtoAppInfo;
import br.com.m4rc310.thermometry.api.services.MService;
import io.leangen.graphql.annotations.GraphQLSubscription;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@GraphQLApi
@EnableScheduling
public class StartupServiceV1 extends MService {
	
	public static final String KEY_APP_INFO = "key_app_info";
	
	@Scheduled(cron = "*/10 * * * * *")
	public void jobHeartBeat() {
		try {
			if (flux.inPublish(DtoAppInfo.class, KEY_APP_INFO)) {
				flux.callPublish(KEY_APP_INFO, getDtoAppInfo());
			}
		} catch (Exception e) {
			
		}
	}
	
	private DtoAppInfo getDtoAppInfo() {
		DtoAppInfo info = new DtoAppInfo();
		info.setDateHeartBeat(new Date());
		info.setVersion(getVersion());
		return info;
	}
	
	
	@GraphQLSubscription(name=SUBSCRIPTION$info_app, description=DESC$subscription_info_app)
	public Publisher<DtoAppInfo> getAppInfo(){
		return flux.publish(DtoAppInfo.class, KEY_APP_INFO, getDtoAppInfo());
	} 
	
    public static String getVersion() {
        try {
            Resource resource = new ClassPathResource("META-INF/MANIFEST.MF");
            InputStream inputStream = resource.getInputStream();
            Manifest manifest = new Manifest(inputStream);
            Attributes attributes = manifest.getMainAttributes();
            return attributes.getValue("Implementation-Version");
        } catch (Exception e) {
            e.printStackTrace();
            return "unknown";
        }
    }
	
}
