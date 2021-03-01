package gameZone1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Inciso {
    private char inciso;
    private String respuesta;
    private Boolean correcto;
    
    public Inciso(){
        
    }
    
    public Inciso(char i, String r, Boolean c ){
        this.inciso = i;
        this.respuesta = r;
        this.correcto = c;
    }

    public char getInciso() {
        return inciso;
    }

    public void setInciso(char inciso) {
        this.inciso = inciso;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Boolean getCorrecto() {
        return correcto;
    }

    public void setCorrecto(Boolean correcto) {
        this.correcto = correcto;
    }

    
    public void imprimir(){
        System.out.println(this.inciso+") "+this.respuesta);
    }
}
