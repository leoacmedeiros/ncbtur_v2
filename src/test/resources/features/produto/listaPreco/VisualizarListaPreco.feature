#language: pt
@VisualizarListaDePreco
Funcionalidade: VisualizarListaDePreco

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Visualizar Lista de Preço
    Dado que acesse o modulo de Produto para visualizar uma Lista de Preço
    Quando buscar pela Lista de Preço
      | situacao | Ativo |
    E Visualizar a Lista de Preço
    Então será apresentado a Lista de Preço
