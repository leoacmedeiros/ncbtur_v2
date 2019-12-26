#language: pt
@InativarTaxa
Funcionalidade: Inativar Taxa

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Inativar Taxa
    Dado que acesse o modulo de Produto para visualizar Taxas
    Quando buscar pela Taxa
      | codigo   |                           |
      | nome     | Taxa feita pela Automação |
      | tipo     |                           |
      | situacao | Inativo                   |
    E inativar a Taxa
    Então a Taxa será inativada
