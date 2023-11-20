package com.buscatrampo.buscaTrampo.autonomo;

import jakarta.validation.constraints.NotNull;

/**
 * @author Lincoln
 */
public record DadosAtualizadoAutonomo(
        @NotNull
        Long id,
        String nome,
        String email,
        String senha,
        String telefone,
        String profissao
) {
}
