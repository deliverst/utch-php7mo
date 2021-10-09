package com.app.utch.entidades;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
    public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq_gen")
    @SequenceGenerator(name = "customer_seq_gen", sequenceName = "customer_id_seq", allocationSize = 1) //genera la llave auto incremental
    @Column(name = "cliente_id") // @Column hace referencia a la tabla real en la base de datos
    private Integer clienteId; // Por buenas practicas no se pone _ para hacer referencia a las tablas y la linea de arriba se redirecciona

    @Column(name = "name", columnDefinition = "varchar(40)", nullable = true)
    private String name;

    @Column(name = "num_tel", columnDefinition = "varchar(15)")
    private String numTelefono;

    @Column(name = "correo", columnDefinition = "varchar(30)", nullable = false, unique = true)
    private String correo;

    public Integer getClienteId() {
        return clienteId;
    }



    //GETTERS AND SETTERS
    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}





