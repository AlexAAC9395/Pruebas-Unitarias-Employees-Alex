package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Repository;

import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpleadoRepository extends JpaRepository<Empleado,Long> {

    Optional<Empleado> findByEmail(String email);
}
