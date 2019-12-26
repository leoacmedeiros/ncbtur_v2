#language: pt
@RevisarReserva
Funcionalidade: Revisar Reserva

  Contexto: Como usuário desejo Revisar uma Reserva
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Revisar Reserva
    Dado que acesse o módulo de Reserva
    E acesse o menu Gerenciar Reservas
    E na tela de Reservas realize uma pesquisa pelo nome do Cliente
      | Cliente | Mirella Emily da Silva |
    E clique para Gerenciar uma Reserva que esteja com a situação Confirmada
    E no menu lateral clique em Revisar Reserva 
    