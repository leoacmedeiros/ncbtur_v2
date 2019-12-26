#language: pt
@AtivarInativarBandeira
Funcionalidade: Ativar Inativar Bandeira

  Contexto: Como usuário desejo realizar uma busca da Bandeira de cartão para Ativar e Inativar
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Ativar, Inativar Bandeira do Cartão
    Dado que acesse o Menu Financeiro
    E acesse o Menu Bandeiras
    E realize a pesquisa da Bandeira
      | Nome Bandeira | Cartão Visa Teste Auto |
    Quando clicar para Inativar a Bandeira
    Então a Bandeira ficará Inativa
    Quando clicar para Ativar a Bandeira
    Então a Bandeira ficará Ativa