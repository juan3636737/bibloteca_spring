/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sinfloo.CrudSpringBoot.service;

import com.sinfloo.CrudSpringBoot.interfaceService.IpersonaService;
import com.sinfloo.CrudSpringBoot.interfaces.IPersona;
import com.sinfloo.CrudSpringBoot.modelo.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Sena
 */
public class PersonaService implements IpersonaService {

    @Autowired
    private IPersona data;
    @Override
    public List<Persona> listar() {
       return  (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int save(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
