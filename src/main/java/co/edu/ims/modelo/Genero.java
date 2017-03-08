/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author 012345678
 */
@Entity
public class Genero {
    
    @Id
    private String codigo;
    
    //Constructores
    public Genero(){};
    public Genero(String c){
        this.codigo = c;
    }

    //Getters y setters...
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
}
