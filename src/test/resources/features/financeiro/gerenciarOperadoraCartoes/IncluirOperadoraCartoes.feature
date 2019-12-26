#language: pt
@IncluirOperadoraCartoes
Funcionalidade: IncluirOperadoraCartoes

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Operadora de Cartões
    Dado que acesse o menu financeiro gerenciar operadoras de cartões
    Quando selecionar os dados
      | ano          |       2020 |
      | bandeira     | MASTERCARD |
      | grupo debito | Grupo 30   |
    E selecionar os meses para cada operadora
      | cielo | Julho, Agosto, Setembro, Outubro, Novembro, Dezembro |
      | rede  | Janeiro, Fevereiro, Março, Abril, Maio, Junho        |
    Quando salvar o gerenciamento
    Então será adicionado a operadora de cartão
