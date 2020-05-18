package com.gcbrandao.gcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.cloud.gcp.pubsub.support.converter.JacksonPubSubMessageConverter;
import org.springframework.stereotype.Component;

@Component
public class PubsubPublisher {

    private final PubSubTemplate pubSubTemplate;
    //injeta o PubSubTemplate, objeto responsavel por se comunicar com o servico Pubsub


    public PubsubPublisher(PubSubTemplate pubSubTemplate) {
        this.pubSubTemplate = pubSubTemplate;
    }

    @Autowired
    public JacksonPubSubMessageConverter jacksonPubSubMessageConverter;

    public void publishMessage(String mensagem) {
        // Passamos para o metodo publish o nosso topico criado e a mensagem recebida
        this.pubSubTemplate.publish("my-topic-teste", mensagem);
        // O pubSubTemplate publica a mensagem no topico "my-topic-teste"
        System.out.println("Mensagem publicada!!! ");
    }

    public void publishMessageObject(Object mensagem) {
        // metodo que recebe o obj
        this.pubSubTemplate.setMessageConverter(jacksonPubSubMessageConverter);
        // informa o messageconverter correto ao pubsubTemplate
        this.pubSubTemplate.publish("my-topic-teste", mensagem);
        // O pubSubTemplate publica a mensagem no topico "my-topic-teste"
        System.out.println("Mensagem publicada!!! ");
    }

}
