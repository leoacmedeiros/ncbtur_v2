#language: pt
@IncluirTipoMeiosHospedagem
Funcionalidade: IncluirTipoMeiosHospedagem

  #Contexto: Como usuário desejo incluir um Novo Tipo de Meio de Hospedagem
    #Dado que eu acesse o sistema CBTUR
    #Quando informar os dados de logon
      #| Usuário | 002.747.501-80 |
      #| Senha   |           0000 |
    #Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Tipo de Meio de Hospedagem
    Dado que acesse o Menu Meios de Hospedagem
    E acesse o sub-menu Tipo de Meios de Hospedagem
    E clique no botão Novo Tipo de Meio de Hospedagem
    E preencha a descrição do Novo Tipo de Meio de Hospedagem
      | Descrição | Novo Tipo de Meio de Hospedagem - Teste Auto 1 |
    E clique no botão para salvar o registro
    E clique em Sim para confirmar a inclusão
    Então irá salvar o Novo Tipo de Meio de Hospedagem
