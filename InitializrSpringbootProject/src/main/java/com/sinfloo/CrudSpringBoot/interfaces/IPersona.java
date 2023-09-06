/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sinfloo.CrudSpringBoot.interfaces;

import com.sinfloo.CrudSpringBoot.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sena
 */
public interface IPersona extends CrudRepository <Persona , Integer> {
    
}
