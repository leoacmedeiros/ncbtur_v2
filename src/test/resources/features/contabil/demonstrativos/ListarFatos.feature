#language: pt
@ListarFatos
Funcionalidade: ListarFatos

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Como usuário quero listar fatos
    Dado que acesse o menu contabil para visualizar os desmonstrativos
    Quando selecionar o tipo de demonstrativo e fatos
      | demonstrativo | Regime de Competência - Receber |
      | fato          | Aquisição de Título             |
    E informar selecionar o período
      | periodo inicio | 16/12/2019 |
      | periodo fim    | 16/12/2019 |
    E pesquisar
    E enviar fatos para processamento
    Então será processado o fato
