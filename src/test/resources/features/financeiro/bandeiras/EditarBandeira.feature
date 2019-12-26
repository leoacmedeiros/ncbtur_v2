#language: pt
@EditarBandeira
Funcionalidade: Editar Bandeira

  Contexto: Como usuário desejo Editar uma Bandeira de Cartão
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Editar Bandeira do Cartão
    Dado que acesse o Menu Financeiro
    E acesse o Menu Bandeiras
    E pesquise a Bandeira 
      | Nome Bandeira | Cartão Visa Teste Auto |
    E clique no botão para Editar
    E altere o nome 
    |Nome Bandeira alterado|Cartão Visa Teste Auto - ALTERADO|
    E clique no botão para Salvar a Edição
    Então o nome da Bandeira irá ser alterado