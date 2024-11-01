package Exercicio.Projeto06.ex01.Appication;

public class Carro {
    private String modeloDoCarro;
    private double ano1;
    private double ano2;
    private double ano3;

    public Carro(String modeloDoCarro, double ano1, double ano2, double ano3){
        this.modeloDoCarro = modeloDoCarro;
        this.ano1 = ano1;
        this.ano2 = ano2;
        this.ano3 = ano3;
    }
    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public double getAno1() {
        return ano1;
    }

    public void setAno1(double ano1) {
        this.ano1 = ano1;
    }

    public double getAno2() {
        return ano2;
    }

    public void setAno2(double ano2) {
        this.ano2 = ano2;
    }

    public double getAno3() {
        return ano3;
    }

    public void setAno3(double ano3) {
        this.ano3 = ano3;
    }

    public double mediaDosAnos(){
        return (ano1 + ano2 + ano3) / 3;
    }

    public void calcularMaioPreco(){
        if (ano1 > ano2 && ano1 > ano3){
            System.out.println("Maior Preço e : " +  ano1);
        } else if (ano2 > ano3) {
            System.out.println("Maior Preco e: " + ano2);
        }else {
            System.out.println("Maior Preco e: " + ano3);
        }
    }

    public void calcularMenorPreco(){
        if (ano1 < ano2 && ano1 < ano3){
            System.out.println("Menor Preço e : " +  ano1);
        } else if (ano2 < ano3) {
            System.out.println("Menor Preco e: " + ano2);
        }else {
            System.out.println("Menor Preco e: " + ano3);
        }
    }
}
