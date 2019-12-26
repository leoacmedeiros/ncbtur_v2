#language: pt
@EditarProduto
Funcionalidade: EditarProduto

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Editar Produto tipo VENDA
    Dado que acesse o modulo de Produto para vizualizar um Produto
    Quando buscar pelo Produto
      | nome | Produto criado pela automação |
    E editar o produto
      | nome                         | Produto criado pela automação editado            |
      | tipo                         | Venda                                            |
      | diarias                      |                                                7 |
      | parcelas                     |                                               12 |
      | nivel                        | Executivo                                        |
      | categoria                    | Duplo                                            |
      | descricao                    | Descrição do produto venda criado pela automação |
      | situacao                     | Ativo                                            |
      | periodo                      |                                               12 |
      | feriado prolongado           | Não                                              |
      | alta temporada               | Não                                              |
      | despesas adicionais          | Sim                                              |
      | tipo cobranca                | Taxa de manutenção                               |
      | virada periodo               | Sim                                              |
      | carencia                     | Não                                              |
      | taxa manutencao adesao       |                                                2 |
      | taxa manutencao tranferencia |                                                1 |
    Quando salvar os dados do Produto
    Então o Produto será editado
