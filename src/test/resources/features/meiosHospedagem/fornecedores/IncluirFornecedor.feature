#language: pt
@IncluirFornecedor
Funcionalidade: Incluir Fornecedor

  Contexto: Como usuário desejo Incluir um Novo Fornecedor
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Fornecedor
    Dado que acesse o Menu Meios de Hospedagem
    E acesse o Menu Fornecedores
    E clique no botão Novo Fornecedor
    Quando preencher os campos de Fornecedor com dados válidos
      | Nome                | Novo Fornecedor Teste Auto 1         |
      | CNPJ                | Gerado automaticamente               |
      | Razão Social        | Razão Social Fornecedor Teste Auto 1 |
      | CEP                 | 02225-200                            |
      | CEP Correspondência | 14807-220                            |
    E preencher os campos referente a Contatos
      | Tipo de contato   | Email                  |
      | Email             | Gerado automaticamente |
      | Contato Principal | Sim                    |
    E preencher os dados bancários
      | Banco          | BRB - Banco de Brasília S.A. |
      | Agência        |                         3822 |
      | Dígito Agência |                            4 |
      | Conta          |                        54887 |
      | Dígito Conta   |                            6 |
    E clicar no botao Salvar Fornecedor de Meios de Hospedagem
    Então o sistema irá incluir um novo Fornecedor
