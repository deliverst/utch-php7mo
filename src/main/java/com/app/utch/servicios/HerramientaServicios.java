package com.app.utch.servicios;

import com.app.utch.entidades.Herramienta;
import com.app.utch.dominios.HerramientasRepositorio;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HerramientaServicios {

    private final HerramientasRepositorio toolRepository;

    public HerramientaServicios(HerramientasRepositorio toolRepository) {
        this.toolRepository = toolRepository;
    }

    public Herramienta findById(Integer toolId) throws Exception {
        Herramienta foundTool = toolRepository.findById(toolId).get();

        if (foundTool != null) {
            return foundTool;
        } else {
            throw new Exception("Tool not found");
        }
    }

    public List<Herramienta> findAll() {
        return toolRepository.findAll(Sort.by("toolId"));
    }

    public Herramienta create(Herramienta tool) {
        return toolRepository.save(tool);
    }

    public Herramienta update(Integer toolId, Herramienta tool) throws Exception {
        Herramienta foundTool = toolRepository.findById(toolId).get();

        if (foundTool != null) {
            return toolRepository.save(tool);
        } else {
            throw new Exception("Tool not found");
        }
    }

    public void deleteById(Integer toolId) throws Exception {
        Herramienta foundTool = toolRepository.findById(toolId).get();

        if (foundTool != null) {
            toolRepository.delete(foundTool);
        } else {
            throw new Exception("Tool not found");
        }
    }


}
