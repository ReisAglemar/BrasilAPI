package edu.reis.modelo;

public class UriApiPrevisao {


    private static String dominio;
    private static String operacao;
    private String IdCidade;
    private String diasDePrevisao;

    public UriApiPrevisao(String idCidade, String diasDePrevisao) {
        dominio = "https://brasilapi.com.br";
        operacao = "/api/cptec/v1/clima/previsao";
        this.IdCidade = idCidade;
        this.diasDePrevisao = diasDePrevisao;
    }

    public String montaUri() {
        return dominio + operacao + "/" + IdCidade + "/" + diasDePrevisao;
    }
}
