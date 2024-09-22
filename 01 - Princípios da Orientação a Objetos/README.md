# 1. Princípios da Orientação a Objetos

O alicerce da Programação Orientada a Objetos é baseado em quatro princípios, os quais devem ser pensados e refletidos nos processos do desenvolvimento de um sistema: Abstração, Encapsulamento, Hierarquia e Modularização.

## 1.1. Abstração

Entendimento e análise das necessidades do sistema, abstraindo do mundo real.

**Ex.:** para um sistema de gerenciamento acadêmico de uma faculdade, mais especificamente para a funcionalidade de cadastro de alunos, os moldes (classes) devem ser pensados com base nas características reais de um aluno (registro, nome, endereço, curso, data de nascimento etc.) e que sejam relevantes para o sistema. Por exemplo: informações como altura e peso podem ser irrelevantes para o sistema.

## 1.2. Encapsulamento

Encapsulamento é o princípio de isolar partes do software, organizando-o de maneira que seus componentes sejam independentes. O objetivo é tornar o software mais flexível, facilitando sua modificação e evolução. As classes devem proteger suas informações e comportamentos, garantindo controle sobre o acesso aos seus atributos e métodos. De forma análoga ao mundo real, os objetos também possuem mecanismos de proteção.

**Ex.:** quando um cliente compra um micro-ondas e deseja utilizá-lo, basta acionar os botões para programar um tempo (inserindo informações aos seus atributos) e pressionar o botão para iniciar o aquecimento (invocando um comportamento). Esses botões irão acionar os circuitos elétricos e as placas internas, sem que o cliente tenha a necessidade de conhecimento do que ocorre dentro da “CÁPSULA” do micro-ondas.

Da mesma forma, as classes devem esconder sua implementação interna, permitindo que outras classes interajam apenas com suas funcionalidades, sem a necessidade de conhecer os detalhes de sua lógica interna. Isso garante que a interação ocorra apenas através das interfaces disponibilizadas, similar aos botões do micro-ondas.