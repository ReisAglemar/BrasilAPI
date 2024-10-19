package edu.reis.modelo;

import java.util.List;

public record RespostaAPI(String cidade, String estado, String atualizado_em, List<Clima> clima) {

    public record Clima(String data, String condicao_desc, int min, int max) {
    }

}
