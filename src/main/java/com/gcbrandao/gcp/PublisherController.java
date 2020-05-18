package com.gcbrandao.gcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/filas")
public class PublisherController {

    @Autowired
    PubsubPublisher pubsubPublisher;
    // injetando a nossa service que ira publicar a mensagem

    @GetMapping("/publish/{mensagem}")
    public void publicar(@PathVariable String mensagem) {

        pubsubPublisher.publishMessage(mensagem);
        // envia a mensagem passsada como parametro para a service
        System.out.println("Recebida no controller !!!");
    }

    @PostMapping
    public ResponseEntity<?> publicarObjeto(@RequestBody UsuarioDTO UsuarioDTO) {

        System.out.println("Controller recebendo requisição de objeto");
        pubsubPublisher.publishMessageObject(UsuarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioDTO);
    }


}
