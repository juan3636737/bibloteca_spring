/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sinfloo.CrudSpringBoot.interfaceService;

import com.sinfloo.CrudSpringBoot.modelo.Persona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Sena
 */
public interface IpersonaService {
    public List<Persona>listar();
    public Optional<Persona>listarId(int id);
    public int save(Persona p);
    public void delete(int id);
}
