#language: pt
@VisualizarProduto
Funcionalidade: VisualizarProduto

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Visualizar Produto
    Dado que acesse o modulo de Produto para vizualizar um Produto
    Quando buscar pelo Produto
      | nome | Produto criado pela automação |
    E visualzar o Produto buscado
    Então será apresentado os dados do Produto
