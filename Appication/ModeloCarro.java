package Exercicio.Projeto06.ex01.Appication;

public class ModeloCarro extends Carro {
    private String modeloDoCarro;
    private double ano1;
    private double ano2;
    private double ano3;

    public ModeloCarro(String modeloDoCarro, double ano1, double ano2, double ano3) {
        super(modeloDoCarro, ano1, ano2, ano3);
        this.modeloDoCarro = modeloDoCarro;
        this.ano1 = ano1;
        this.ano2 = ano2;
        this.ano3 = ano3;
    }

    public void mostrarInformacoes(){
        System.out.println("Marca: " + modeloDoCarro);
        System.out.printf("No ano 2020 o valor era R$ %.2f%n ", getAno1());
        System.out.printf("No ano 2022 o valor era R$ %.2f%n ", getAno2());
        System.out.printf("No ano 2024 o valor era R$ %.2f%n ", getAno3());
        calcularMaioPreco();
        calcularMenorPreco();
    }
}
