package com.app.utch.entidades;

import javax.persistence.*;

@Entity
@Table(name = "herramientas")
    public class Herramienta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tool_seq_gen")
    @SequenceGenerator(name = "tool_seq_gen", sequenceName = "tool_id_seq", allocationSize = 1)

    @Column(name = "tool_id")
    private Integer herramientaId;

    @Column(name = "name_tool", columnDefinition = "varchar(30)", nullable = false, unique = true)
    private String nombreHerramienta;

    @Column(name = "cantidad", columnDefinition = "int", nullable = false)
    private Integer cantidad;

    @Column(name = "precio", columnDefinition = "varchar(30)", nullable = false)
    private String precio;




    //GETTERS AND SETTERS
    public Integer getHerramientaId() {
        return herramientaId;
    }

    public void setHerramientaId(Integer herramientaId) {
        this.herramientaId = herramientaId;
    }

    public String getNombreHerramienta() {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
