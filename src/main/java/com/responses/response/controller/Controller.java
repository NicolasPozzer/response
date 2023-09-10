
package com.responses.response.controller;

import com.responses.response.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping ("/cliente/traer")
    @ResponseBody //Aclara que la lista q devuelve vaya dentro del body de la respuestaHTTP
    public List<Cliente> traerClientes(){
        
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L,"Zlatan","Ibrahimovic"));
        listaClientes.add(new Cliente(2L,"Leonel","Messi"));
        listaClientes.add(new Cliente(3L,"Cristiano","Ronaldo"));
        
        return listaClientes;
    }
    
    
    //@ResponseEntity: lo que nos permite es manipular
    //como nosotros queramos cada una de las partes 
    //de un paquete que respondemos en una comunicacion
    //HTTP en una response. Podemos modificar la cabecera
    //podemos modificar el status code,etc.
    
    //Manipulando Respuesta
    @GetMapping ("/pruebaresponse")
    ResponseEntity<String>  traerRespuesta(){//String ya que quiero responder un mensaje
        //Manipulo para responder StatusCodes!!!
        return new ResponseEntity<> ("Esta es una prueba de Response!", HttpStatus.NOT_FOUND);
    }
    
}
