#language: pt
Funcionalidade: IncluirPropostaAdesao

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Como usuário desejo incluir uma proposta de adesão para Pessoa Física
    Dado que acesse o módulo de Cliente para criar uma Nova Proposta de Adesão
    E crie a Proposta de Adesão
    Quando preecher a aba Informações
      | tipo pessoa          | Física                      |
      | convenio             |                             |
      | cpf                  | 513.916.659-37              |
      | nome                 | Pessoa Fisica               |
      | rg                   | 31.389.261-1                |
      | orgao emissor        | SSP                         |
      | genero               | Feminino                    |
      | nacionalidade        | Brasileira                  |
      | estado civil         | Casado(a)                   |
      | data nascimento      | 03/10/1989                  |
      | emancipado           | Não                         |
      | telefone comercial   | (61) 3715-4624              |
      | telefone residencial | (61) 3715-4624              |
      | email                | pessoafisica@me.unicaamp.br |
      | telefone celular     | (61) 98370-5025             |
      | profissao            | ADMINISTRADOR DE EMPRESAS   |
      | grau instrução       | Ensino superior completo    |
      | renda                | De 5 a 10 salários mínimos  |
      | cep                  | 71250-715                   |
    Então salvar proposta
    Quando preencher a aba Produtos
      | campanha               | Adesão única AUT - Desc. 0% |
      | produto                | Superior                    |
      | canal vendas vendedor  | Canal Matriz AUT            |
      | desconto vendedor      | 10%                         |
      | indicador              | Não                         |
      | canal vendas indicador | Canal Representante         |
      | vendedor indicador     |                             |
    Então avançar
    Quando preencher a aba Pagamento
      | parcelas              |                                         3 |
      | mesma forma pagamento | Sim                                       |
      | forma pagamento       | Débito                                    |
      | dia debito            |                                        20 |
      | banco                 | Banco do Estado do Rio Grande do Sul S.A. |
      | agencia               | 0304-1                                    |
      | conta                 | 43858109-1                                |
      | bandeira              | VISA                                      |
      | nome no cartao        | Renan Caleb Manuel Corte Real             |
      | numero cartao         |                          4929908349919484 |
      | codigo seguranca      |                                       950 |
      | validade              | 08/2021                                   |
    E salvar a proposta
    Então será criada a proposta
