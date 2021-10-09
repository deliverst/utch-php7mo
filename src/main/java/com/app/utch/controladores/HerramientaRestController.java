package com.app.utch.controladores;

import com.app.utch.entidades.Herramienta;
import com.app.utch.servicios.HerramientaServicios;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/herramientas")
public class HerramientaRestController {

    private final HerramientaServicios HerramientaServicio;

    public HerramientaRestController(HerramientaServicios HerramientaServicio) {this.HerramientaServicio = HerramientaServicio;}

    @GetMapping("/{id}")
    public Herramienta findById(@PathVariable("id") Integer herramientaId) {
        try {
            return HerramientaServicio.findById(herramientaId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/all")
    public List<Herramienta> findAll() {
        return HerramientaServicio.findAll();
    }

    @PostMapping("/create")
    public Herramienta create(@RequestBody Herramienta herramienta) {
        return HerramientaServicio.create(herramienta);
    }

    @PutMapping("/update/{id}")
    public Herramienta update(@PathVariable("id") Integer herramientaId, @RequestBody Herramienta herramienta) {
        try {
            return HerramientaServicio.update(herramientaId, herramienta);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer herramientaId) {
        try {
            HerramientaServicio.deleteById(herramientaId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
