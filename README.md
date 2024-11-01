# Gerenciamento de Informações do Carro

Este projeto Java permite gerenciar os dados de um carro, armazenando informações sobre o modelo e os preços em diferentes anos. O programa exibe o maior e o menor preço registrado, além de calcular o preço médio ao longo dos anos.

## Funcionalidades

- Exibir informações do carro, incluindo modelo e preços históricos
- Calcular o valor médio dos preços registrados
- Determinar o maior e o menor preço entre os anos registrados

## Estrutura do Projeto

- **Carro**: Classe principal que armazena o modelo e os preços de um carro em diferentes anos, além de métodos para calcular e exibir o maior e o menor preço.
- **ModeloCarro**: Classe que herda de `Carro` e adiciona o método `mostrarInformacoes()`, que exibe os dados completos do carro.
- **Principal**: Classe que executa a aplicação, instanciando um objeto `ModeloCarro` e exibindo as informações para um modelo específico.

## Exemplo de Uso

```java
Marca: Fiat Uno
No ano 2020 o valor era R$ 3000.00
No ano 2022 o valor era R$ 7000.00
No ano 2024 o valor era R$ 2500.00
Maior Preço é: 7000.0
Menor Preço é: 2500.0
