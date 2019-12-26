package pageObjects.cliente.propostaAdesao;

import org.openqa.selenium.By;

import core.BasePage;

public class IncluirPropostaAdesaoPage extends BasePage {

	public void setTipoPessoa(String tipoPessoa) {
		selecionarComboPeloXPath("//select[@ng-reflect-name='tipo']", tipoPessoa);
	}

	public void setConvenio(String convenio) {
		selecionarComboPeloXPath("//select[@name='convenio']", convenio);
	}

	public void setCpfCnpj(String cpfCnpj) {
		escrever(By.xpath("//input[@name='numeroDocumento']"), cpfCnpj);
//		 clicarBotao(By.xpath("//button[text()='Sim']"));
	}

	public void setNome(String nome) {
		escrever(By.xpath("//input[@name='nome']"), nome);
	}

	public void setRazaoSocial(String razaoSocial) {
		escrever(By.xpath("//input[@name='razaoSocial']"), razaoSocial);
	}

	public void setRg(String rg) {
		escrever(By.xpath("//input[@name='rg']"), rg);
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		escrever(By.xpath("//input[@name='orgaoEmissor']"), orgaoEmissor);
	}

	public void setGenero(String genero) {
		selecionarComboPeloXPath("//select[@name='genero']", genero);
	}

	public void setNacionalidade(String nacionalidade) {
		selecionarComboPeloXPath("//select[@name='nacionalidade']", nacionalidade);
	}

	public void setEstadoCivil(String estadoCivil) {
		selecionarComboPeloXPath("//select[@name='estadoCivil']", estadoCivil);
	}

	public void setDataNascimento(String nascimento) {
		escrever(By.xpath("//input[@name='nascimento']"), nascimento);
	}

	public void setEmancipado(String menorEmancipado) {
		if (menorEmancipado.trim().equals("Sim")) {
			clicarCheck(By.xpath("//label[@class='mt-checkbox mt-checkbox-outline']//span"));
		}
	}

	public void setTelefoneComercial(String telefoneComercial) {
		escrever(By.xpath("//input[@name='telefoneComercial']"), telefoneComercial);
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		escrever(By.xpath("//input[@name='telefoneResidencial']"), telefoneResidencial);
	}

	public void setEmail(String email) {
		escrever(By.xpath("//input[@name='email']"), email);
		escrever(By.xpath("//input[@name='confirmeEmail']"), email);
	}

	public void setTelefoneCelular(String telefoneResidencial) {
		clicarBotao(By.xpath("//a[contains(text(),'Novo telefone')]"));
		escrever(By.xpath(
				"//div[@class='row']//div[@class='col-md-12']//input[@class='form-control ng-untouched ng-pristine ng-valid']"),
				telefoneResidencial);
		clicarBotao(By.xpath("//button[contains(text(),'Adicionar')]"));
	}

	public void setProfissao(String profissao) {
		selecionarComboPeloXPath("//select[@name='profissao']", profissao);
	}

	public void setGrauInstrucao(String grauInstrucao) {
		selecionarComboPeloXPath("//select[@name='grauInstrucao']", grauInstrucao);
	}

	public void setRendaMensal(String rendaMensal) {
		selecionarComboPeloXPath("//select[@name='rendaMensal']", rendaMensal);
	}

	public void setEnderecoCep(String endereco_cep) {
		escrever(By.xpath("//input[@name='endereco_cep']"), endereco_cep);
	}

	public void setSocioAdministrador() {
		clicarBotao(By.xpath("//button[contains(text(),'Novo Sócio-Administrador')]"));
	}

	public void setNomeSocioAdministrador(String nomeSocioAdministrador) {
		escrever(By.xpath("(//input[@name='nome'])[2]"), nomeSocioAdministrador);
	}

	public void setCpfSocioAdministrador(String cpfSocioAdministrador) {
		escrever(By.xpath("(//input[@name='numeroDocumento'])[2]"), cpfSocioAdministrador);
	}

	public void setCargoSocioAdministrador(String cargoSocioAdministrador) {
		escrever(By.xpath("//input[@formcontrolname='cargo']"), cargoSocioAdministrador);
	}

	public void setDataNascimentoSocioAdministrador(String dataNascimentoSocioAdministrador) {
		escrever(By.xpath("//input[@class='form-control']"), dataNascimentoSocioAdministrador);
	}

	public void setGeneroSocioAdministrador(String generoSocioAdministrador) {
		selecionarComboPorXPath("//select[@name='genero']", generoSocioAdministrador);
	}

	public void setEstadoCivilSocioAdministrador(String estadoCivilSocioAdministrador) {
		selecionarComboPorXPath("//select[@name='estadoCivil']", estadoCivilSocioAdministrador);
	}

	public void setEmailSocioAdministrador(String emailSocioAdministrador) {
		escrever(By.xpath("(//input[@name='email'])[2]"), emailSocioAdministrador);
		escrever(By.xpath("(//input[@name='confirmeEmail'])[2]"), emailSocioAdministrador);
	}

	public void setTelefoneSocioAdministrador(String telefoneSocioAdministrador) {
		clicarBotao(By.xpath("(//a[contains(text(),'Novo telefone')])[2]"));
		escrever(By.xpath(
				"(//div[@class='row']//div[@class='col-md-12']//input[@class='form-control ng-untouched ng-pristine ng-valid'])"),
				telefoneSocioAdministrador);
		clicarBotao(By.xpath("(//button[contains(text(),'Adicionar')])[1]"));
	}

	public void setReceberNovidades(String receberNovidades) {
		if (isCheckMarcado(
				By.xpath("//label[contains(text(),'Gostaria de receber as novidades da Bancorbrás por e-mail')]/span"))
				&& receberNovidades.trim().equals("Não")) {
			clicarCheck(By.xpath(
					"//label[contains(text(),'Gostaria de receber as novidades da Bancorbrás por e-mail')]/span"));
		}
	}

	public void setContactarAssociado(String contactarAssociado) {
		if (isCheckMarcado(By.xpath("//label[contains(text(),'Contactar este associado')]/span"))
				&& contactarAssociado.trim().equals("Não")) {
			clicarCheck(By.xpath(
					"//label[contains(text(),'Gostaria de receber as novidades da Bancorbrás por e-mail')]/span"));
		}
	}

	public void adicionarSocioAdministrador() {
		clicarBotao(By.xpath("//button[@class='btn btn-success']"));
	}

	public void salvarContinuar() {
		clicarBotao(By.xpath("//button[contains(text(),'SALVAR PROPOSTA & PRÓXIMO')]"));
		scrollPageUP();
	}

	public void setCampanha(String idCampanha) {
		esperarElementoFicarVisivel2(By.xpath("//select[@name='idCampanha']"));
		selecionarComboPeloXPath("//select[@name='idCampanha']", idCampanha);
	}

	public void setProduto(String produtos) {
		for (String produto : produtos.split(","))
			clicarBotao(By.xpath("//h2[text()='" + produto.trim() + "']//ancestor::div[2]//button"));
	}

	public void setCanalVendasVendedor(String canalVendasVendedor) {
		selecionarComboPeloXPath("//select[@name='canalVendaVendedor']", canalVendasVendedor);
	}

	public void setDescontoVendedor(String descontoVendedor) {
		escrever(By.xpath("//div[@class='input-group bootstrap-touchspin']//input"), descontoVendedor);
	}

	public void setIndicador(String indicador, String canalVendasIndicador, String vendedorIndicador) {
		if (indicador.trim().equals("Sim")) {
			clicarCheck(By.xpath("//h4[contains(text(),'Indicador')]//span"));
			selecionarComboPeloXPath("//select[@name='canalVendaIndicador']", canalVendasIndicador);
			selecionarComboPeloXPath("//select[@name='indicador']", vendedorIndicador);
		}
	}

	public void setParcelasProduto(String quantidadeParcelas) {
		selecionarComboPorXPath("//select[@name='quantidadeParcelas']", quantidadeParcelas);
	}

	public void setMesmaFormaPagamento(String mesmaFormaPagamento) {
		if (isCheckMarcado(By.xpath("//input[@formcontrolname='todasFormas']//parent::label/span"))
				&& mesmaFormaPagamento.trim().equals("Não")) {
			clicarCheck(By.xpath("//input[@formcontrolname='todasFormas']//parent::label/span"));
		}
	}

	public void setFormaPagamento(String formaPagamento) {
		clicarRadio(By.xpath("//label[contains(text(),'" + formaPagamento + "')]/span"));
	}

	public void setDiaDebito(String diaDebito) {
		selecionarComboPorXPath("//select[@name='diaDebito']", diaDebito);
	}

	public void setBanco(String formaPagamento, String banco) {
		if (formaPagamento.trim().contains("Débito")) {
			selecionarComboPorXPath("//label[text()='Banco: ']//parent::div//select", banco);
		}
	}

	public void setAgencia(String formaPagamento, String agencia) {
		if (formaPagamento.trim().contains("Débito")) {
			escrever(By.xpath("//input[@name='agenciaNumero']"), agencia);
		}
	}

	public void setDigitoAgencia(String formaPagamento, String agencias) {
		if (formaPagamento.trim().contains("Débito")) {
			for (String agencia : agencias.split("-")) {
				escrever(By.xpath("//input[@name='agenciaDigito']"), agencia);
			}
		}
	}

	public void setConta(String formaPagamento, String conta) {
		if (formaPagamento.trim().contains("Débito")) {
			escrever(By.xpath("//input[@name='debito_conta']"), conta);
		}
	}

	public void setDigitoConta(String formaPagamento, String contas) {
		if (formaPagamento.trim().contains("Débito")) {
			for (String conta : contas.split("-")) {
				escrever(By.xpath("//input[@name='contaDigito']"), conta);
			}
		}
	}

	public void setBandeira(String formaPagamento, String bandeira) {
		if (formaPagamento.trim().contains("Cartão")) {
			selecionarComboPeloXPath("//select[@name='cartao_bandeira']", bandeira);
		}
	}

	public void setNomeImpressoCartao(String formaPagamento, String nomeImpressoCartao) {
		if (formaPagamento.trim().contains("Cartão")) {
			escrever(By.xpath("//input[@name='nomeImpresso']"), nomeImpressoCartao);
		}
	}

	public void setNumeroCartao(String formaPagamento, String numeroCartao) {
		if (formaPagamento.trim().contains("Cartão")) {
			escrever(By.xpath("//input[@name='cartao_numero']"), numeroCartao);
		}
	}

	public void setCodigoSegurancaCartao(String formaPagamento, String codigoSegurancaCartao) {
		if (formaPagamento.trim().contains("Cartão")) {
			escrever(By.xpath("//input[@name='cvc']"), codigoSegurancaCartao);
		}
	}

	public void setDataValidadeCartao(String formaPagamento, String dataValidade) {
		if (formaPagamento.trim().contains("Cartão")) {
			escrever(By.xpath("//input[@name='dataValidade']"), dataValidade);
		}
	}

	public void salvarPropostaAdesao() {
		clicarBotao(By.xpath("//button[@class='btn green button-submit']"));
	}

	// public void setDadosPagamento(String formaPagamento, String bandeira, String
	// nomeCartao, String numeroCartao,
	// String codigoSeguracaoCartao, String dataValidadeCartao, String banco, String
	// agencia, String conta) {
	// if (formaPagamento.trim().contains("Cartão")) {
	// clicarRadio(By.xpath("//label[contains(text(),'" + formaPagamento +
	// "')]/span"));
	// selecionarComboPorXPath("//select[@name='cartao_bandeira']", bandeira);
	// escrever(By.xpath("//input[@name='nomeImpresso']"), nomeCartao);
	// escrever(By.xpath("//input[@name='cartao_numero']"), numeroCartao);
	// escrever(By.xpath("//input[@name='cvc']"), codigoSeguracaoCartao);
	// escrever(By.xpath("//input[@name='dataValidade']"), dataValidadeCartao);
	// } else if (formaPagamento.trim().contains("Débito")) {
	// selecionarComboPorXPath("//select[@class='form-control ng-untouched
	// ng-pristine ng-invalid']", banco);
	//
	// }
	// }

}
