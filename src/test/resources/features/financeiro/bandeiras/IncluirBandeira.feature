#language: pt
@IncluirBandeira
Funcionalidade: Incluir Bandeira

  Contexto: Como usuário desejo incluir uma nova Bandeira de Cartão
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Bandeira de Cartão
    Dado que acesse o Menu Financeiro
    E acesse o Menu Bandeiras
    E clique no botão para incluir uma Nova Bandeira
    E informe o Nome
      | Nome Bandeira | Cartão Visa Teste Auto |
    Quando acionar o botão para salvar o registro
    Então a Bandeira de Cartão será criada
    E a Bandeira do cartão ficará ativa
      | Nome Bandeira | Cartão Visa Teste Auto |
