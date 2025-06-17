package com.streamvibe.api.models.usuario;

public record DadosCadastroUsuario(
   String nome,
   String datadenascimento,
   String email,
   String senha,
   String cpf) {
    
}
