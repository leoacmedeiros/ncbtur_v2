#language: pt
@IncluirProposta
Funcionalidade: Incluir Proposta Aprovar Reserva

  #Contexto: Como usuário desejo incluir uma Nova Proposta e preencher os campos obrigatórios para aprová-la e pesquisá-la na Reserva
  #Dado que eu acesse o sistema CBTUR
  #Quando informar os dados de logon
  #| Usuário | 002.747.501-80 |
  #| Senha   |           0000 |
  #Então deverá exibir a tela inicial do sistema
  Cenário: Incluir Proposta Aprovar Reserva
    Dado que acesse o módulo de Meios de Hospedagem
    E acesse o menu Novo convênio
    E clique no botão Nova Proposta
    E preencha todos os campos
      | CNPJ                       | Gerado pela função: GeraCpfCnpj   |
      | Nome                       | HOTEL MARANATA                    |
      | Razão Social               | MARANATA LTDA                     |
      | Email                      | Gerado pela função: geraEmailAuto |
      | Site                       | www.maranata.com.br               |
      | Telefone                   |                       21995989344 |
      | Inscrição Municipal        |                           1234567 |
      | Inscrição Estadual         |                           9987654 |
      | Rede                       | REDE MARANATA E ASSOCIADOS        |
      | Taxa ISS                   |                                10 |
      | Tipo de Meio de Hospedagem | Hotel                             |
      | Tipo de Administração      | Própria                           |
      | Nome Cont. Comercial       | João Guilherme Gonçalves          |
      | Email Cont Comercial       | Gerado pela função: geraEmailAuto |
      | Telefone Cont. Comercial   |                       21985735122 |
      | CEP Endereço               |                          26383063 |
      | CEP Correspondência        |                          26140650 |
      | Administradora             | Selecionar a primeira             |
    Quando clicar no botão de Salvar Meio de Hospedagem
    Então o sistema irá incluir os dados informados
    Dado que acesse o menu Painel Meios de Hospedagem
    E acesse o Menu Dados Bancários
    E clique em Novo Dado Bancário
    E preencha os Dados
      | Banco      | Banco Honda S.A. |
      | Agência    |             3584 |
      | Dígito Ag. |                8 |
      | Conta      |             6489 |
      | Dígito Cc. |                7 |
    E clique em Salvar
    Então irá incluir o Dado Bancário
    Dado que acesse o Menu Fotos
    E clique no botão de Carregar
    E selecione uma foto
    E preencha os campos
      | Título                | Foto1  |
      | Classificação da foto | Hotel  |
      | Descrição             | Desc 2 |
    E clique no botão Salvar Foto
    Então a foto será incluída
    Dado que acesse o menu  Localização
    E informe a Latitude e Longitude
      | Latitude         |         -21.94304553 |
      | Longitude        |         -41.71289116 |
      | Desc localização | Próximo ao bar do Zé |
    Quando clicar para Salvar a Localização
    Então a localização será salva
    E clique em Nova Referência
    E preencha os dados de Referência
      | Referência  | Aeroporto |
      | Quilômetros |         5 |
    E clique para Salvar a Distância
    Então a Referência será Salva
    Dado que acesse o menu Tipo de UH
    E clique no botão Nova Unidade Habitacional
    E preencha os dados de UH
      | Tipo de Unidade Habitacional | STD         |
      | Quantidade                   |          50 |
      | Unidade Habitacional Atende  | Single      |
      | Contratado                   | Contratado  |
      | Atende PCDF                  | Atende PCDF |
      | Single                       | Solteiro    |
    E em Ocupação máxima da acomodação preencha os campos
      | Num. Max Adultos   | 2 |
      | Num. Max. Crianças | 1 |
    E em Política de Gratuidade para Criança preencha os campos
      | Clicar Sim   | Sim       |
      | Quantidade   |         1 |
      | Idade Máxima |         5 |
      | Apartamento  | Single    |
      | Cama Extra   | CAMA_PAIS |
    E em Ocupação da Unidade Habitacional selecione
      | Selecione | Sim |
    E clique para Salvar Unidade Habitacional
    Então irá ser incluído o registro
    Dado que acesse o menu Tarifário
    E clique em Nova Condição de Contrato
    E clique no botão Nova Temporada
    E preencha os campos de Nova Temporada
      | Temporada         | Alta temporada                    |
      | Funcionamento     | Selecionar todos                  |
      | Aceita check-in   | Selecionar todos                  |
      | Data Início/Fim   | Selecionar dia atual mais 30 dias |
      | Mínimo de diárias |                                 1 |
      | Dias              | Selecionar todos                  |
    Quando clicar no botão de Adicionar
    Então irá ser incluído uma Condição de Contrato
    E selecione as opções
      | Unidade Habitacional | STD              |
      | Nível Utilização     | Executivo        |
      | Forma de Pagamento   | Faturado         |
      | Regime de Pensão     | Meia pensão      |
      | Refeição             | Almoço           |
      | Dias                 | Selecionar todos |
    E inserir os valores dos quartos
      | SGl  |  5000 |
      | DBl  | 10000 |
      | TPl  | 20000 |
      | QDPL | 30000 |
    Quando clicar no botão Adicionar
    Então será incluído um novo Tarifário
    Dado que acesse o menu Bloqueio
    E clique no botão Novo Bloqueio Devolução
    E clique no botão Novo Bloqueio pra inserir a quantidade de bloqueios e a vigência
    E preencha os campos de Bloqueio e Vigência
      | Tipo de UH       | STD       |
      | Nível Utilização | Executivo |
      | Bloqueios        |        10 |
      | Vigência         | Hoje      |
    E clique no botão Adicionar Bloqueio
    E clique no botão Salvar Bloqueio e Devolução
    Então o Bloqueio será cadastrado
    Dado que acesse o menu Ativar Contrato
    E marque as opções para Ativar o Contrato
    E preencha o campo observação
      | Observação | Ativar Contrato Hotel |
    E clique no botão Ativar Contrato
    Então o Contrato ficará Ativo
