package br.com.m4rc310.thermometry.api.model.thermo.silo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThermoSiloRepository extends JpaRepository<ThermoSilo, Long> {

}
