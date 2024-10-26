package br.com.m4rc310.thermometry.api.model.thermo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThermoDeviceRepository extends JpaRepository<ThermoDevice, String>{

	Boolean existsBySerialNumber(String serialNumber);

}
