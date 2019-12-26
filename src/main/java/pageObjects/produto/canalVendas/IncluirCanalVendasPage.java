package pageObjects.produto.canalVendas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class IncluirCanalVendasPage extends BasePage {

	public void setTipo(String tipo) {
		selecionarComboPeloXPath("//select[@formcontrolname='classificacao']", tipo);
	}

	public void setNomeCanalVendas(String nomeCanalVenda) {
		escrever(By.xpath("(//input[@name='nome'])[1]"), nomeCanalVenda);
	}

	public void setDescricaoCanalVendas(String descricaoCanalVenda) {
		escrever(By.xpath("//textarea[@name='descricao']"), descricaoCanalVenda);
	}

	public void setParametrosVinculo(String parametrosVinculo) {
		selecionarCombo("parametro", parametrosVinculo);
	}

	public void setEmpresaCanalVendas(String empresaCanalVendas) {
		selecionarComboPorXPath("//select[@name='empresa']", empresaCanalVendas);
	}

	public void setFilialCanalVendas(String filialCanalVendas) {
		selecionarComboPorXPath("//select[@name='filial']", filialCanalVendas);
	}

	public void setRazaoSocial(String razaoSocial) {
		escrever(By.xpath("//input[@name='razaoSocial']"), razaoSocial);
	}

	public void setCnpj(String cnpj) {
		escrever(By.xpath("//input[@formcontrolname='cnpj']"), cnpj);
	}

	public void setSite(String site) {
		escrever(By.xpath("//input[@name='site']"), site);
	}

	public void setCore(String core) {
		escrever(By.xpath("//input[@name='core']"), core);
	}

	public void setCaptado(String captado) {
		escrever(By.xpath("//input[@name='input']"), captado);
		clicarBotao(By.xpath("//ul[@class='typeahead']"));
	}

	public void setContatosObrigatorios(String telefoneComercial, String email) {
		clicarBotao(By.xpath("//a[contains(text(),'Novo contato')]"));
		selecionarComboPeloXPath("//select[@name='tipoContato']", "Telefone Comercial");
		escrever(By.xpath("//div[@class='col-md-4']/input"), telefoneComercial);
		clicarBotao(By.xpath("//button[contains(text(),'Adicionar')]"));
		clicarBotao(By.xpath("//a[contains(text(),'Novo contato')]"));
		selecionarComboPeloXPath("//select[@name='tipoContato']", "Email");
		escrever(By.xpath("//div[@class='col-md-4']/input"), email);
		clicarBotao(By.xpath("//button[contains(text(),'Adicionar')]"));
	}

	public void setTelefone(String telefone) {
		clicarBotao(By.xpath("(//a[@class='btn sbold green btn-xs'])[1]"));
		escrever(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[2]"), telefone);
		clicarBotao(By.xpath("(//button[@class='btn blue btn-xs'])[1]"));
	}

	public void setEmail(String email) {
		clicarBotao(By.xpath("(//a[@class='btn sbold green btn-xs'])[2]"));
		escrever(By.xpath("(//div/input)[10]"), email);
		clicarBotao(By.xpath("(//button[@class='btn blue btn-xs'])[1]"));
	}

	public void setCep(String cep) {
		escrever(By.xpath("//input[@name='endereco_cep']"), cep);
		sleep(15);
	}

	public void setCanalVendasAtivo() {
		clicarCheck(By.xpath("//label[contains(text(),'Canal de vendas ativo?')]/span"));
	}

	public void setTaxaISS(String taxaISS) {
		escrever(By.xpath("//input[@name='taxaISS']"), taxaISS);
	}

	public void setRemuneracao(String remuneracao) {
		clicarCheck(By.xpath("(//div[@class='form-group'])[17]//span"));
	}

	public void setTempoIndeterminado(String tempoIndetermindado) {
		if (tempoIndetermindado.trim().equals("Sim")) {
			clicarCheck(By.xpath("//label[contains(text(),'Tempo Indeterminado?')]/span"));
		}
	}

	public void setDataInicio(String dataInicio) {
		escrever(By.xpath("//input[@name='inicioEm']"), dataInicio);
	}

	public void setDataFim(String dataFim) {
		escrever(By.xpath("//input[@name='fimEm']"), dataFim);
	}

	public void setColaboradorResponsavel(String colaboradorResponsavel) {
		escrever(By.xpath("(//input[@name='nome'])[2]"), colaboradorResponsavel);
	}

	public void setEmailColaboradorResponsavel(String emailColaboradorResponsavel) {
		escrever(By.xpath("//input[@name='email']"), emailColaboradorResponsavel);
	}

	public void setSituacao(String situacao) {
		clicarCheck(By.xpath("(//div[@class='form-group'])[21]//span"));
	}

	public void avancar() {
		clicarBotao(By.xpath("//button[@class='btn blue button-next']"));
	}

	public void setResponsavel() {
		scrollPageUP();
		clicarBotao(By.xpath("(//button[@class='btn sbold green'])[1]"));
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		escrever(By.xpath("(//input[@formcontrolname='nome'])[3]"), nomeResponsavel);
	}

	public void setSexoResponsavel(String sexo) {
		selecionarComboPeloXPath("(//select[@formcontrolname='sexo'])", sexo);
	}

	public void setCpfResponsavel(String cpf) {
		escrever(By.xpath("(//input[@formcontrolname='cpf'])"), cpf);
	}

	public void setRgResponsavel(String rg) {
		escrever(By.xpath("(//input[@formcontrolname='rg'])"), rg);
	}

	public void setOrgaoExpedidorResponsavel(String orgaoExpedidor) {
		escrever(By.xpath("(//input[@formcontrolname='orgaoExpedidor'])"), orgaoExpedidor);
	}

	public void setProfissaoResponsavel(String profissao) {
		selecionarComboPeloXPath("(//select[@formcontrolname='profissao'])", profissao);
	}

	public void setCargoResponsavel(String cargo) {
		selecionarComboPeloXPath("//select[@name='nome']", cargo);
	}

	public void setNacionalidadeResponsavel(String nacionalidade) {
		selecionarComboPeloXPath("//select[@name='nacionalidade']", nacionalidade);
	}

	public void setEstadoCivilResponsavel(String estadoCivil) {
		selecionarComboPeloXPath("(//select[@formcontrolname='estadoCivil'])", estadoCivil);
	}

	public void setDataNascimentoResponsavel(String dataNascimento) {
		escrever(By.xpath("//input[@name='dataNascimento']"), dataNascimento);
	}

	public void setEmailResponsavel(String emailResponsavel) {
		escrever(By.xpath("(//input[@name='email'])[2]"), emailResponsavel);
	}

	public void setTelefoneResponsavel(String telefoneResponsavel) {
		clicarBotao(By.xpath("//a[@class='btn sbold green btn-xs']"));
		escrever(By.xpath("//div[@class='form-group']//div[@class='row']//input"), telefoneResponsavel);
		clicarBotao(By.xpath("//button[text()='Adicionar ']"));
	}

	public void setCepResponsavel(String cepResponsavel) {
		escrever(By.xpath("(//input[@name='endereco_cep'])[2]"), cepResponsavel);
		sleep(10);
	}

	public void adicionarResponsavelAtivo() {
		clicarCheck(By.xpath("//label[contains(text(),'Responsável ativo?')]/span"));
		clicarBotao(By.xpath("//button[@class='btn blue btn-success']"));
	}

	public void setVendedor() {
		scrollPageUP();
		clicarBotao(By.xpath("//button[contains(text(),'Novo vendedor')]"));
	}

	public void setCpfVendedor(String cpfVendedores) {
		scrollPageUP();
		clicarBotao(By.xpath("//button[contains(text(),'Novo vendedor')]"));
		for (String cpfVendedor : cpfVendedores.split(",")) {
			escrever(By.xpath("//input[@name='cpf']"), cpfVendedor);
			clicarBotao(By.xpath("//button[@class='btn blue btn-success']"));
			clicarBotao(By.xpath("//button[contains(text(),'Novo vendedor')]"));
		}
	}

	public void setPromotorVendas(String promotorVendas) {
		if (promotorVendas.trim().equals("Sim")) {
			clicarCheck(By.xpath("//div[@class='padding-top-30']//span"));
		}
	}

	public void adicionarVendedor() {
		clicarBotao(By.xpath("//button[@class='btn blue btn-success']"));
	}

	public void setConveniado() {
		scrollPageUP();
		clicarBotao(By.xpath("//button[contains(text(),'Novo conveniado')]"));
	}

	public void setNomeConveniado(String nomeConveniado) {
		escrever(By.xpath("(//input[@name='nome'])[4]"), nomeConveniado);
	}

	public void setParametroVinculoConveniado(String parametroVinculoConveniado) {
		escrever(By.xpath("//input[@name='tiposParametrosVinculo']"), parametroVinculoConveniado);
	}

	public void adicionarConveniado() {
		clicarBotao(By.xpath("//button[contains(text(),'Adicionar conveniado')]"));
	}

	public void setValorDescontoOferta(String valorDescontoOferta) {
		escrever(By.xpath(
				"//div[@class='input-group bootstrap-touchspin']//input[@class='form-control ng-untouched ng-pristine ng-valid']"),
				valorDescontoOferta);
	}

	public void setNovoDesconto() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Novo desconto')]"));
	}

	public void setEmpresaDesconto(String empresaDesconto) {
		selecionarComboPorXPath("//select[@name='nome']", empresaDesconto);
	}

	public void setValorNovoDesconto(String novoDesconto) {
		escrever(By
				.xpath("//touchspin[@name='desconto']//input[@class='form-control ng-untouched ng-pristine ng-valid']"),
				novoDesconto);
	}

	public void setObservacoesDesconto(String observacoesDesconto) {
		escrever(By.xpath("//textarea[@name='observacao']"), observacoesDesconto);
	}

	public void adicionarDesconto() {
		clicarBotao(By.xpath("//button[text()=' Adicionar ']"));
	}

	public void setPeriodoPromocionalOferta(String periodoPromocionalOferta, String valorDescontoPeriodoPromocional,
			String dataInicioDesconto, String dataFimDesconto) {
		if (periodoPromocionalOferta.trim().equals("Sim")) {
			clicarCheck(By.xpath("//label[contains(text(),'Período promocional?')]/span"));
			escrever(By.xpath(
					"//div[@class='input-group bootstrap-touchspin']//input[@class='form-control ng-untouched ng-pristine ng-valid']"),
					valorDescontoPeriodoPromocional);
			escrever(By.xpath("//input[@name='inicioPeriodoPromocional']"), dataInicioDesconto);
			escrever(By.xpath("//input[@name='fimPeriodoPromocional']"), dataFimDesconto);
		}
	}

	public void setBancoCanalVendas(String banco) {
		selecionarComboPorXPath("//select[@class='form-control ng-untouched ng-pristine ng-invalid']", banco);
	}

	public void setAgencia(String agencia) {
		escrever(By.xpath("//input[@name='agenciaNumero']"), agencia);
	}

	public void setDigitoAgencia(String agencias) {
		for (String agencia : agencias.split("-")) {
			escrever(By.xpath("//input[@name='agenciaDigito']"), agencia);
		}
	}

	public void setConta(String conta) {
		escrever(By.xpath("//input[@name='debito_conta']"), conta);
	}

	public void setDigitoConta(String contas) {
		for (String conta : contas.split("-")) {
			escrever(By.xpath("//input[@name='contaDigito']"), conta);
		}
	}

	public void setOperacao(String operacao, String banco) {
		if (banco.trim().contains("Federal")) {
			escrever(By.xpath("//input[@name='debito_operacao']"), operacao);
		}
	}

	public void salvarCanalVendas() {
		clicarBotao(By.xpath("//button[contains(text(),'Salvar Canal de Vendas')]"));
	}

	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.className("//div[@class='toast-message']"));
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}

}
