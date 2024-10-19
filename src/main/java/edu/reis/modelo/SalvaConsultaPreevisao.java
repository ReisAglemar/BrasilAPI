package edu.reis.modelo;

import java.util.ArrayList;
import java.util.List;

public class SalvaConsultaPreevisao {

    private String cidade;
    private String estado;
    private String dataAtuliazacao;
    private List<PrevisaoDia> previsaoDias = new ArrayList<>();

    public SalvaConsultaPreevisao(RespostaAPI respostaAPI) {
        this.cidade = respostaAPI.cidade();
        this.estado = respostaAPI.estado();
        this.dataAtuliazacao = respostaAPI.atualizado_em();

        for (RespostaAPI.Clima clima : respostaAPI.clima()) {
            PrevisaoDia previsaoDia = new PrevisaoDia(clima.data(), clima.condicao_desc(), clima.min(), clima.max());
            previsaoDias.add(previsaoDia);
        }
    }

    public void getCidade() {
        System.out.println("Cidade: " + cidade);
    }

    public void getEstado() {
        System.out.println("Estado: " + estado);
    }

    public void getDataAtuliazacao() {
        System.out.println("Última Atualização: " + dataAtuliazacao);
    }

    public void previsaoDias() {

        for (PrevisaoDia previsaoDia : previsaoDias) {
            System.out.println();
            previsaoDia.getDate();
            previsaoDia.getCondicao_desc();
            previsaoDia.getTemperaturaMaxima();
            previsaoDia.getTemperaturaMedia();
            previsaoDia.getTemperaturaMinima();
        }
    }
}
