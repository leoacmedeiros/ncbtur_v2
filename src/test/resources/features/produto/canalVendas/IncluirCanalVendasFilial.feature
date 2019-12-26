#language: pt
@InlcuirCanalVendasFilial
Funcionalidade: Incluir Canal de Vendas do tipo Filial

  #Contexto: Autenticar Novo CBTUR
  #Dado que eu acesse o sistema CBTUR
  #Quando informar os dados de logon
  #| Usuário | 005.838.141-40 |
  #| Senha   |           0000 |
  #Então deverá exibir a tela inicial do sistema
  Cenário: Como usuário desejo cadastrar um Canal de Vendas do tipo Filial
    Dado que acesse o modulo de Canal de Vendas
    E criar um Canal de Vendas
    Quando preencher os dados do canal de vendas filial
      | tipo              | Filial                         |
      | nome canal vendas | Canal Filial                   |
      | descricao         | Este é um canal do tipo filial |
      | empresa           | CLUBE BANCORBRAS               |
      | filial            | CBTUR - Vera Cruz              |
      | site              | www.canalfilial.com            |
    E adicionar contatos
      | telefone comercial | (61) 3893-7661        |
      | email              | canalfilial@canal.com |
    E informar o endereço
      | cep | 70304-914 |
    E marcar o canal de vendas como ativo
    Então avançar
    Quando preecher a vigencia do canal de vendas
      | tempo inderteminado | Sim        |
      | data inicio         | 11/12/2019 |
      | data fim            | 11/12/2020 |
    E informar dados para receber notificação
      | colaborador responsavel       | Canal Filial          |
      | email colaborador responsavel | canalfilial@canal.com |
    Então avançar
    Quando preencher o formulário de responsável do canal de vendas
      | nome            | Thiago Felipe Ramos               |
      | sexo            | Masculino                         |
      | cpf             | 442.363.421-03                    |
      | rg              | 44.031.454-9                      |
      | orgao expedidor | SSP                               |
      | profissao       | ADMINISTRADOR DE EMPRESAS         |
      | cargo           | Vice-Diretor                      |
      | nacionalidade   | Brasileira                        |
      | estado civil    | Casado                            |
      | data nascimento | 23/01/1972                        |
      | email           | thiagofeliperamos@profemme.com.br |
    E adicionar telefone
      | telefone | (61) 3789-1812 |
    E adicionar responsável
    Então avançar
    Quando preencher o formulário de vendedor do canal de vendas
      | cpf      | 005.838.141-40, 003.773.021-55, 002.747.501-80 |
      | promotor | não                                            |
    Então avançar
    Quando preencher o formulário de dados bancários do canal de vendas
      | banco   | Banco Santander S.A. |
      | agencia | 0304-1               |
      | conta   | 43858109-1           |
    Então avançar
    Quando anexar documentações
      | documento |  |
    E salvar os dados do canal de vendas
    Então será criado o canal de vendas
