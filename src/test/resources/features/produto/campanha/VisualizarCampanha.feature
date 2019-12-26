#language: pt
@VisualizarCampanha
Funcionalidade: VisualizarCampanha

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Visualizar Produto
    Dado que acesse o modulo de Produto para visualizar uma Campanha
    Quando buscar pela Campanha
      | nome | Adesão única |
    E visualzar o Campanda buscada
    Então será apresentado os dados da Campanha
