package com.app.utch.servicios;

import com.app.utch.entidades.Herramienta;
import com.app.utch.dominios.HerramientasRepositorio;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HerramientaServicios {

    private final HerramientasRepositorio rHerramienta;

    public HerramientaServicios(HerramientasRepositorio rHerramienta) {
        this.rHerramienta = rHerramienta;
    }

    public Herramienta findById(Integer herramientaId) throws Exception {
        Herramienta rMatch = rHerramienta.findById(herramientaId).get();

        if (rMatch != null) {
            return rMatch;
        } else {
            throw new Exception("No se encuentra esta Herramienta");
        }
    }

    public List<Herramienta> findAll() {
        return rHerramienta.findAll(Sort.by("herramientaId"));
    }

    public Herramienta create(Herramienta tool) {
        return rHerramienta.save(tool);
    }

    public Herramienta update(Integer herramientaId, Herramienta tool) throws Exception {
        Herramienta rMatch = rHerramienta.findById(herramientaId).get();

        if (rMatch != null) {
            return rHerramienta.save(tool);
        } else {
            throw new Exception("No se encuentra esta Herramienta");
        }
    }

    public void deleteById(Integer herramientaId) throws Exception {
        Herramienta rMatch = rHerramienta.findById(herramientaId).get();

        if (rMatch != null) {
            rHerramienta.delete(rMatch);
        } else {
            throw new Exception("No se encontro esta Herramienta");
        }
    }


}
