#language: pt
@PesquisarDetalhar
Funcionalidade: Pesquisar Detalhar

  #Contexto: Como usuário desejo realizar pesquisas no módulo de Reserva e Detalhar o Meio de Hospedagem
    #Dado que eu acesse o sistema CBTUR
    #Quando informar os dados de logon
      #| Usuário | 002.747.501-80 |
      #| Senha   |           0000 |
    #Então deverá exibir a tela inicial do sistema

  Cenário: Pesquisar Detalhar
    #Dado que acesse o módulo de Reserva
    #E acesse o menu Iniciar Reserva
    E realize a pesquisa pelo nome do Cliente
      | Cliente | Mirella Emily da Silva |
    E realize a pesquisa pelo CPF do Cliente
    E realize a pesquisa pelo Código do Cliente
    E realize a pesquisa pelo Destino
      | Destino | Rio de Janeiro |
    Quando clicar em Detalhar o destino
    Então irá ser visualizado os Detalhes
