#language: pt
@CancelarReserva
Funcionalidade: Cancelar Reserva

  Contexto: Como usuário desejo Cancelar uma Reserva
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Cancelar Reserva
    Dado que acesse o módulo de Reserva
    E acesse o menu Gerenciar Reservas
    E na tela de Reservas realize a pesquisa pelo nome do Cliente
      | Cliente | Mirella Emily da Silva |
    E clique no botão Gerenciar de uma Reserva que esteja com a situação Confirmada
    E clique na opção Cancelar
    Quando confirmar o cancelamento da Reserva
    Então a Reserva será cancelada
