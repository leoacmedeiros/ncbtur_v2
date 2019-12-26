#language: pt
@AgendarArrecadacao
Funcionalidade: AgendarArrecadacao

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Agendar Arrecadação
    Dado que acesse o menu financeiro para agendar arrecadação
    Quando selecionar o calendário
    E selecionar o banco
      | grupo | Grupo 30        |
      | banco | Banco do Brasil |
    E selecionar o momento de execução
      | data execucao | 20/12/2019 |
    Quando salvar arrecadação
    Então será realizado o agendamento da Remessa
