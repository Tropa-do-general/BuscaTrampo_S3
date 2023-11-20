package com.buscatrampo.buscaTrampo.autonomo;

/**
 * @author Lincoln
 */
public record DadosDoAutonomo(
        Long id,
        String nome,
        String email,
        String senha,
        String telefone,
        String profissao
) {
    public DadosDoAutonomo (Autonomo autonomo){
        this(autonomo.getId(), autonomo.getNome(), autonomo.getEmail(), autonomo.getSenha(), autonomo.getTelefone(), autonomo.getProfissao());
    }
}
