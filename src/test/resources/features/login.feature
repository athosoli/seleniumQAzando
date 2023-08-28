# language: pt

Funcionalidade: login com Sucesso

  @login-sucesso
  Cenario: Fazer login com sucesso
    Dado que acesso a pagina de login
    E informo os dados validos do usuario
    Quando clico em entrar
    Entao vejo que estou logado no site