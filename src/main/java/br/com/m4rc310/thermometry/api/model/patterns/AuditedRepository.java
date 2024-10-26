package br.com.m4rc310.thermometry.api.model.patterns;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditedRepository extends JpaRepository<Audited, Long> {

}
