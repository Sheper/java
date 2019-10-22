/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pp.controller;

/**
 *
 * @author pp
 */
import com.pp.ejb.NotaFacadeLocal;
import com.pp.model.Nota;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ComentarController implements Serializable {

    @EJB
    private NotaFacadeLocal notaEJB;
    private List<Nota> notas;
    private Nota nota;

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @PostConstruct
    public void init() {
        notas = notaEJB.findAll();
    }

    public void asignar(Nota nota) {
        this.nota = nota;
    }

}