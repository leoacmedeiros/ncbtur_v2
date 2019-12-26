#language: pt
@InativarCampanha
Funcionalidade: InativarCampanha

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Inativar Produto
    Dado que acesse o modulo de Produto para inativar uma Campanha
    Quando buscar pela Campanha
      | nome | CAMPANHA KENE MARIA |
    E inativar a Campanha buscada
    Então a Campanha será inativada
