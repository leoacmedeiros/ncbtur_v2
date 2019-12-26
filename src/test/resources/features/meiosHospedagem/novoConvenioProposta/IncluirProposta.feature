#language: pt
@IncluirProposta
Funcionalidade: IncluirProposta

  Contexto: Como usuário desejo incluir uma Nova Proposta
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Nova Proposta
    Dado que acesse o módulo de Meios de Hospedagem
    E acesse o menu Novo convênio
    E clique no botão Nova Proposta
    E preencha todos os campos
      | CNPJ                       | Gerado pela função: GeraCpfCnpj   |
      | Nome                       | HOTEL POUSADA VILLA DO CERRADO    |
      | Razão Social               | Villa do Cerrado LTDA             |
      | Email                      | Gerado pela função: geraEmailAuto |
      | Site                       | www.villacerrado.com.br           |
      | Telefone                   |                       21995989344 |
      | Inscrição Municipal        |                           1234567 |
      | Inscrição Estadual         |                           9987654 |
      | Rede                       | Nova Rede Hotel Teste Auto        |
      | Taxa ISS                   |                                10 |
      | Tipo de Meio de Hospedagem | Hotel                             |
      | Tipo de Administração      | Própria                           |
      | Nome Cont. Comercial       | Henrique Fontenelle Gonçalves     |
      | Email Cont Comercial       | Gerado pela função: geraEmailAuto |
      | Telefone Cont. Comercial   |                       21985735122 |
      | CEP Endereço               |                          26383063 |
      | CEP Correspondência        |                          26140650 |
    Quando clicar no botão de Salvar Meio de Hospedagem
    Então o sistema irá incluir os dados informados
