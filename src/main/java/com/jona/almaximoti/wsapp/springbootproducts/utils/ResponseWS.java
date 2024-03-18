package com.jona.almaximoti.wsapp.springbootproducts.utils;

/**
 * <h2>ResponseWS</h2>
 * 
 * Clase que genera instancias para responder al cliente.
 * Genera una estructura simple; muestra el estado de la peticion
 * "ok" que puede ser true o false dependiendo el resultado
 * de la peticion. Posee un atributo generico <b>T</b> para establecer
 * el tipo del resultado a volver
 * 
 * @author Jonathan Sanchez
 */
public class ResponseWS<T> {
    private Boolean ok;
    private T result;
    
    
    public ResponseWS() {
    }



    /**a
     * Estructura de respuesta para los servicios web.
     * @param ok {@link Boolean} Si todo salio bien, es true.
     * @param result {@link T} Datos de resultado, pueden ser un objeto o lista.
     */
    public ResponseWS(Boolean ok, T result) {
        this.ok = ok;
        this.result = result;
    }


    public Boolean getOk() {
        return ok;
    }


    public void setOk(Boolean ok) {
        this.ok = ok;
    }


    public T getResult() {
        return result;
    }


    public void setResult(T result) {
        this.result = result;
    }

    
}
