#language: pt
@InlcuirTaxa
Funcionalidade: Incluir Taxa

  #Contexto: Autenticar Novo CBTUR
  #Dado que eu acesse o sistema CBTUR
  #Quando informar os dados de logon
  #| Usuário | 005.838.141-40 |
  #| Senha   |           0000 |
  #Então deverá exibir a tela inicial do sistema
  Cenário: Incluir Taxa
    Dado que acesse o modulo de Produto para visualizar Taxas
    E crie a Taxa
    Quando preencher o formulário
      | tipo              | Adesão         |
      | nome              | Taxa de adesão |
      | comissao          | Não            |
      | desconto campanha | Não            |
      | desconto convenio | Não            |
      | descricao         | Taxa de adesão |
      | situacao          | Ativo          |
    E salvar os dados do formulario
    Então será criada a Taxa
