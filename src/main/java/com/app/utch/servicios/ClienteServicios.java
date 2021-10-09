package com.app.utch.servicios;

import com.app.utch.entidades.Cliente;
import com.app.utch.dominios.clienteRepositorio;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicios {

    private final clienteRepositorio clienteRepositorio;

    public ClienteServicios(clienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    public Cliente findById(Integer clienteId) throws Exception {
        Cliente matchCliente = clienteRepositorio.findById(clienteId).get();

        if (matchCliente != null) {
            return matchCliente;
        } else {
            throw new Exception("cliente not found");
        }
    }

    public List<Cliente> findAll() {
        return clienteRepositorio.findAll(Sort.by("clienteId"));
    }

    public Cliente create(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    public Cliente update(Integer clienteId, Cliente cliente) throws Exception {
        Cliente matchCliente = clienteRepositorio.findById(clienteId).get();

        if (matchCliente != null) {
            return clienteRepositorio.save(cliente);
        } else {
            throw new Exception("No se encontro el cliente");
        }
    }

    public void deleteById(Integer clienteId) throws Exception {
        Cliente matchCliente = clienteRepositorio.findById(clienteId).get();

        if (matchCliente != null) {
            clienteRepositorio.delete(matchCliente);
        } else {
            throw new Exception("No se encontro el cliente");
        }
    }
}
