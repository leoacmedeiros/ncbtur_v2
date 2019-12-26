#language: pt
Funcionalidade: IncluirPropostaAdesao

  Contexto: Autenticar Novo CBTUR
    Dado que eu acesse o sistema CBTUR
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Como usuário desejo incluir uma proposta de adesão para Pessoa Juridica
    Dado que acesse o módulo de Cliente para criar uma Nova Proposta de Adesão
    E crie a Proposta de Adesão
    Quando preecher a aba Informações para proposta Pessoa Jurídica
      | tipo pessoa        | Jurídica                                       |
      | convenio           |                                                |
      | cpf                | 91.133.543/0001-32                             |
      | empresa            | Pessoa Juridica                                |
      | razao social       | Pessoa Juridica                                |
      | telefone comercial | (61) 2810-2440                                 |
      | email              | pessoajuridica@beentoeleticiabuffetltda.com.br |
      | telefone celular   | (61) 98724-5386                                |
      | cep                | 72542-302                                      |
    E adicionar um novo sócio-administrador
      | nome socio administrador            | Kauê Renato Pereira                |
      | cpf socio administrador             | 314.877.161-33                     |
      | cargo socio administrador           | Analista                           |
      | data nascimento socio administrador | 02/03/1940                         |
      | genero socio administrador          | Masculino                          |
      | estado civil socio administrador    | Casado(a)                          |
      | email socio administrador           | kauerenatopereira_@riguetti.com.br |
      | telefone socio administrador        | (61) 98602-4418                    |
      | receber novidades                   | Sim                                |
      | contactar associado                 | Sim                                |
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
      | parcelas              |                             3 |
      | mesma forma pagamento | Sim                           |
      | forma pagamento       | Débito                        |
      | dia debito            |                            20 |
      | banco                 | Banco do Brasil S.A.          |
      | agencia               | 0304-1                        |
      | conta                 | 43858109-1                    |
      | bandeira              | VISA                          |
      | nome no cartao        | Renan Caleb Manuel Corte Real |
      | numero cartao         |              4929908349919484 |
      | codigo seguranca      |                           950 |
      | validade              | 08/2021                       |
    E salvar a proposta
    Então será criada a proposta
