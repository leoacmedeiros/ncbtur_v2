#language: pt
@IncluirCampanha
Funcionalidade: IncluirCampanha

  #Contexto: Autenticar Novo CBTUR
  #Dado que eu acesse o sistema CBTUR
  #Quando informar os dados de logon
  #| Usuário | 005.838.141-40 |
  #| Senha   |           0000 |
  #Então deverá exibir a tela inicial do sistema
  Cenário: Incluir Campanha
    Dado que acesse o modulo de Produto para criar uma nova Campanha
    E crie a Campanha
    Quando preencher o formulário CAMPANHA Dados básicos
      | codigo     |                             |
      | nome       | Adesão única                |
      | tipo       | Venda                       |
      | descricao  | Venda de títulos Bancorbras |
      | situacao   | Ativa                       |
      | restricoes |                             |
    Então avançar
    Quando preencher o formulário VIGÊNCIA Duração
      | tipo de vigencia    | Período definido |
      | qtd meses           |                6 |
      | tempo inderteminado | Não              |
      | data inicio         | 12/12/2019       |
      | data fim            | 12/12/2020       |
    Então avançar
    Quando preencher o formulário PRODUTOS Itens vinculados
      | produto | Todos |
    Então avançar
    Quando preencher o formulário TAXAS e descontos
      | taxa     |  |
      | desconto |  |
    Então avançar
    Quando preencher o formulário CANAIS DE VENDA e abrangência
      | canais de venda | Todos |
      | abrangencia     | Todos |
    E salvar os dados da Campanha
    Então será criada a Campanha
