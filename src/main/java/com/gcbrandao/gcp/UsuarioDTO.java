package com.gcbrandao.gcp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
// annotations do lombok que criam nossos getter / setters e toString
public class UsuarioDTO implements Serializable {
    // implementamos a interface Serializable para podermos serializar o objeto

    private static final long serialVersionUID = 2144711324757918439L;

    private String nome;
    private String login;


    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    // Essa annotations resolvem problemas de serialização do tipo LocalDate
    private transient LocalDate dataNascimento;

}
