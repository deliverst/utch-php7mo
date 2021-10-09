package com.app.utch.controladores;

import com.app.utch.entidades.Cliente;
import com.app.utch.servicios.ClienteServicios;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    private final ClienteServicios clienteServicio;

    public ClienteRestController (ClienteServicios clienteServicio) {
        this.clienteServicio = clienteServicio;
    }

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable("id") Integer clienteId) {
        try {
            return clienteServicio.findById(clienteId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/all")
    public List<Cliente> findAll() {
        return clienteServicio.findAll();
    }

    @PostMapping("/create")
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteServicio.create(cliente);
    }

    @PutMapping("/update/{id}")
    public Cliente update(@PathVariable("id") Integer clienteId, @RequestBody Cliente cliente){
        try {
            return clienteServicio.update(clienteId, cliente);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer clienteId) {
        try {
            clienteServicio.deleteById(clienteId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



