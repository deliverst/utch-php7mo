package com.app.utch.dominios;

import com.app.utch.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clienteRepositorio extends JpaRepository<Cliente, Integer> {
}
