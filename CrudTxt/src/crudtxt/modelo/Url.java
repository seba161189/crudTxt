/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudtxt.modelo;

/**
 *
 * @author seba1
 */
public class Url {
    private String url;
    private String descripcion;

    public Url(String url, String descripcion) {
        this.url = url;
        this.descripcion = descripcion;
    }

    
    

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
