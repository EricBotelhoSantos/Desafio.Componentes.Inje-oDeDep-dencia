<h1 align="center">
  📦 Desafio: Componentes e Injeção de Dependência
</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/DevSuperior-Challenge-blue?style=for-the-badge" alt="DevSuperior" />
</p>

## 🎯 Objetivo do Desafio

Este projeto contém a solução do desafio **Componentes e Injeção de Dependência** proposto no curso da **DevSuperior** (Nélio Alves). 

O objetivo principal é construir um sistema para calcular o valor total de um pedido, aplicando na prática conceitos fundamentais do Spring Boot: **Registro de Componentes**, **Injeção de Dependência** e **Inversão de Controle**.

## 📝 Regras de Negócio

O sistema calcula o valor total de um pedido com base em seu valor básico, subtrai a porcentagem de desconto e adiciona o valor do frete. As regras de cálculo de frete são as seguintes:

| Valor Básico do Pedido (sem desconto) | Valor do Frete |
| :--- | :--- |
| Abaixo de R$ 100,00 | R$ 20,00 |
| De R$ 100,00 até R$ 200,00 exclusive | R$ 12,00 |
| R$ 200,00 ou mais | **Grátis** |

## 🏗️ Estrutura e Componentes

A arquitetura do projeto foi desenhada visando a separação de responsabilidades (Single Responsibility Principle) e a facilidade de manutenção através de Injeção de Dependência:

- **`Order` (Domínio)**: Classe que representa o pedido. Contém código, valor básico e a porcentagem de desconto.
- **`OrderService` (Serviço)**: Componente que orquestra a regra geral. É responsável por calcular o valor final da compra. Ele possui uma **dependência** do serviço de frete.
- **`ShippingService` (Serviço)**: Componente com a responsabilidade exclusiva de calcular o valor do frete em cima das regras da tabela acima.

## 🚀 Tecnologias Utilizadas

- **Java** 
- **Spring Boot** (Uso do `@Service`, `@Autowired`, e execução por `CommandLineRunner`)
- **Maven** 

## ⚙️ Como Executar o Projeto

1. Faça o clone deste repositório na sua máquina:
   ```bash
   git clone https://github.com/EricBotelhoSantos/Desafio.Componentes.Inje-oDeDep-dencia.git
   ```
2. Abra a pasta do projeto na sua IDE de preferência (IntelliJ IDEA, Eclipse, STS, VS Code).
3. Aguarde o **Maven** baixar as dependências e faça o *build* do projeto.
4. Execute a classe principal (aquela que possui a anotação `@SpringBootApplication`).
5. O resultado dos cálculos propostos pelo desafio será impresso diretamente no **console** da aplicação, graças à implementação da interface `CommandLineRunner`.

---
<p align="center">
Desenvolvido por <a href="https://github.com/EricBotelhoSantos">Eric Botelho Santos</a>.