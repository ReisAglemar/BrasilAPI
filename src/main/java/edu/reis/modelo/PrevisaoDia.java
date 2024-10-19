package edu.reis.modelo;

public class PrevisaoDia {

    private String date;
    private String condicao_desc;
    private float temperaturaMinima;
    private float temperaturaMaxima;
    private float temperaturaMedia;

    public PrevisaoDia(String date, String condicao_desc, float temperaturaMinima, float temperaturaMaxima) {
        this.date = date;
        this.condicao_desc = condicao_desc;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMedia = (temperaturaMaxima + temperaturaMinima)/2;
    }

    public void getDate() {
        System.out.println("Data: " + date);
    }

    public void getCondicao_desc() {
        System.out.println("Condicao: " + condicao_desc);;
    }

    public void getTemperaturaMinima() {
        System.out.println("Temperatura Mínima: " + temperaturaMinima+"ºC");
    }

    public void getTemperaturaMaxima() {
        System.out.println("Temperatura Máxima: " + temperaturaMaxima+"ºC");
    }

    public void getTemperaturaMedia() {
        System.out.println("Temperatura Média: " + temperaturaMedia+"ºC");

    }
}
