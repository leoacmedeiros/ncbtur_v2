#language: pt
@IncluirReserva
Funcionalidade: Incluir Reserva

  #Contexto: Como usuário desejo incluir uma Nova Reserva
    #Dado que eu acesse o sistema CBTUR
    #Quando informar os dados de logon
      #| Usuário | 002.747.501-80 |
      #| Senha   |           0000 |
    #Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Nova Reserva
    Dado que acesse o módulo de Reserva
    E acesse o menu Iniciar Reserva
    E realize pesquisa pelo nome do Cliente
      | Cliente | Mirella Emily da Silva |
    E realize pesquisa pelo nome do Destino
      | Destino | HOTEL MARANATA |
    E informe a data de Chegada e Saída
    E selecione a quantidade de Quartos
      | Qtd. Quartos | 1 |
    E clique em Pesquisar para realizar a busca de Hospedagem
    E selecione a quantidade de diárias para usar
    	|Qtd. Diarias| 1 |
    E selecione a opção Ver Quartos do Meio de Hospedagem pesquisado
    E clique para confirmar as acomodações
		E clique em Avançar
		Então irá ser apresentado os detalhes da reserva e o botão para confirmar
		Quando clicar para confirmar 
		Então a Reserva será confirmada
		