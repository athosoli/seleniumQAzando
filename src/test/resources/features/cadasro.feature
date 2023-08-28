# language: pt

Funcionalidade: Cadastrar com Sucesso

  @cadastro-sucesso
  Cenario: Fazer cadastro com sucesso
    Dado que acesso o cadastro de usuario
    E preencho todo o formulario
    Quando clico em registrar
    Entao vejo a mensagem cadastro com sucesso