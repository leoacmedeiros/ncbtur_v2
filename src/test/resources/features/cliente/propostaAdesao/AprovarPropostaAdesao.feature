#language: pt
Funcionalidade: Aprovar Proposta Adesão Pessoa Jurídica

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Como usuário desejo aprovar Proposta de Adesão Pessoa Jurídica que esteja com situação 'Em Análise'
    Dado que acesse o módulo de Cliente para pesquisar Propostas de Adesão
      | situacao | Em Análise |
    Quando Gerenciar proposta
      | nome | Pessoa Juridica75337813000170 |
    E aprovar
    Então será alterado a situação da proposta
