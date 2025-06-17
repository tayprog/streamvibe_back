package com.streamvibe.api.models.usuario;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    
    private int id;
    private String nome;
    private String datadenascimento;
    private String email;
    private String senha;
    private String cpf;
    
    public Usuario(DadosCadastroUsuario dados) {
        this.nome = dados.nome();
        this.datadenascimento = dados.datadenascimento();
        this.email = dados.email();
        this.senha = dados.senha();
        this.cpf = dados.cpf();
    }
}
