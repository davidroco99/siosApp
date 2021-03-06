package com.utn.meraki.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.utn.meraki.entity.Localidad;

@Repository("localidadRepository")

public interface LocalidadRepository extends JpaRepository<Localidad, Serializable>{
	
	public Localidad findLocalidadByNombreLocalidad(String nombreLocalidad);
	
	public Localidad findLocalidadById(String id);

}
