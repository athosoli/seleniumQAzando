# language: pt

Funcionalidade: Receber desconto
    Eu como usuario do site
    Quero receber um cupom de desconto
    Para comprar um curso com valor reduzido
  @desconto
   Cenario: Visualizar codigo de desconto
    Dado que estou no site qazando
    E preencho o email
    Quando clico em ganhar cupom
    Entao eu vejo o codigo de desconto