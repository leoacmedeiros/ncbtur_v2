#language: pt
@IncluirListaDePreco
Funcionalidade: IncluirListaDePreco

  #Contexto: Autenticar Novo CBTUR
  #Dado que eu acesse o sistema CBTUR
  #Quando informar os dados de logon
  #| Usuário | 005.838.141-40 |
  #| Senha   |           0000 |
  #Então deverá exibir a tela inicial do sistema
  Cenário: Inlcuir Lista de Preço
    Dado que acesse o modulo de Produto para clonar uma Lista de Preço
    E crie uma lista de preço
    Quando preencher os dados da lista de preço
      | nome responsavel  | Bancorbrás                            |
      | email responsavel | atendimento.turismo@bancorbras.com.br |
      | data inicio       | 11/12/2019                            |
    E definir a taxa de adesão dos produtos
      | produtos          | Executivo Duplo, Executivo Triplo, Superior Duplo, Superior Triplo |
      | valor taxa adesao | R$ 395,00                                                          |
      | qtd parcelas      |                                                                 10 |
    E definir a taxa de manutenção para os produtos
      | produtos              | Executivo Duplo, Executivo Triplo, Superior Duplo, Superior Triplo |
      | valor taxa manutencao | R$ 186,30 / R$ 219,50                                              |
    Quando salvar
    Então será criada a lista de preço
