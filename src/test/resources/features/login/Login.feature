#language: pt
Funcionalidade: Efetuar Login

  @LoginNovoCBTUR
  Cenário: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema
