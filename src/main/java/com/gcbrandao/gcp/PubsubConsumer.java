package com.gcbrandao.gcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.cloud.gcp.pubsub.support.converter.JacksonPubSubMessageConverter;
import org.springframework.stereotype.Component;

@Component
public class PubsubConsumer implements ApplicationRunner {
    // implementamos ApplicationRunner para nos registrarmos no topico

    private final PubSubTemplate pubSubTemplate;

    public PubsubConsumer(PubSubTemplate pubSubTemplate) {
        this.pubSubTemplate = pubSubTemplate;
    }

    @Autowired
    JacksonPubSubMessageConverter jacksonPubSubMessageConverter;
    // Injetando o JacksonPubSubMessageConverter para converter as mensagens OBJ

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // sobrescrevendo o metodo run() com nosso codigo
        this.pubSubTemplate.setMessageConverter(jacksonPubSubMessageConverter);
        // informando o tipo de conversor de mensagem para o pubsubTemplate
        pubSubTemplate.subscribeAndConvert("my-subscription-teste", convertedBasicAcknowledgeablePubsubMessage -> {
            // usando o convertedBasicAcknowledgeablePubsubMessage
            System.out.println("mensagem recebida " + convertedBasicAcknowledgeablePubsubMessage.getPayload().toString());
            // Consumindo a mensagem e convertendo
            convertedBasicAcknowledgeablePubsubMessage.ack();
            // Informando o pubsub que a mensagem foi entregue
        }, UsuarioDTO.class);
        // informando qual tipo de Obj esta recebendo para ele saber como fazer a conversao

    }


    //@Override
    public void runSimple(ApplicationArguments args) throws Exception {
        // sobrescrevendo o metodo run() com nosso codigo
        this.pubSubTemplate.subscribe("my-subscription-teste", basicAcknowledgeablePubsubMessage -> {
            // metodo pubSubTemplate.subscribe se conecta no nosso subscription my-subscription-teste
            System.out.println("Mensagem Recebida " + basicAcknowledgeablePubsubMessage.toString());
            // Ele consome a mensagem
            basicAcknowledgeablePubsubMessage.ack();
            // Aqui ele informa ao pubSub com o metodo ack() que mensagem foi recebida
        });

    }


}
