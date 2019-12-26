package pageObjects.meiosHospedagem.proposta;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.DriverFactory;


public class IncluirPropostaAprovarReservaPage extends BasePage {

	public void acessarPainelMeioHosp() {
		sleep(20);
		scrollElementoClicar(By.xpath("//a[contains(text(),'Meios de Hospedagem')]//i[2]"));
	}

	public void acessarDadosBancarios() {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Dados Bancários')]"));		
	}

	public void novoDadoBancario() {
		clicarBotao(By.xpath("//a[contains(text(),'Novo Dado Bancário')]"));
	}
	
	public void preencheDadosBancarios(String banco, String agenciaNumero, String agenciaDigito, String debito_conta, String contaDigito) {
		sleep(3);
		selecionarComboPeloXPath("//label[contains(text(),'Banco')]//parent::div//select", banco);
		sleep(2);
	    escrever(By.name("agenciaNumero"), agenciaNumero);
		escrever(By.name("agenciaDigito"), agenciaDigito);
		escrever(By.name("debito_conta"), debito_conta);
		escrever(By.name("contaDigito"), contaDigito);
		
	}
	
	public void salvarDadosBancarios() {
		clicarBotao(By.xpath("//div//button[contains(text(),'Salvar dados bancários')]"));
	}
	
	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='toast-message']"));
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	
	public void acessarFotosMeiosHosp() {
		clicarBotao(By.xpath("//ul[@id='meiosDeHospedagem']//a[contains(text(),'Fotos')]"));
	}

	public void carregarFoto() {
		sleep(3);
		scrollElementoClicar(By.xpath("//input[@class='upload']"));
	}
	
	public void robotFoto() throws AWTException {
		
		//WebElement selecionarImagem = DriverFactory.getDriver().findElement(By.xpath("//span[contains(text(),'Carregar')]"));		
		//selecionarImagem.click();		
		
		Robot robot = new Robot();         
        robot.setAutoDelay(2000);
 
        StringSelection selection = new StringSelection("https://s3-sa-east-1.amazonaws.com/dcrepositorio/tst/hotel/43/67857060378e4de2aa8f91b1a5c3a95e.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
 
        robot.setAutoDelay(1000); 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
 
        robot.setAutoDelay(1000);
 
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
				
	}
	
	public void camposFoto(String titulo, String classificacaoFoto, String descricao) {
		escrever(By.name("titulo"), titulo);
		selecionarComboPeloXPath("//select[@name='id']", classificacaoFoto);
		escrever(By.name("descricao"), descricao);
	}

	public void salvarFoto() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Salvar foto')]"));
	}
	
	public void acessarLocalizacao() {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Localização')]"));
	}
	
	public void latitudeLongitude(String latitude, String longitude, String descricao) {
		escrever(By.name("latitude"), latitude);
		escrever(By.name("longitude"), longitude);
		escrever(By.name("descricao"), descricao);
	}
	
	public void salvarLocalizacao() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Salvar localização')]"));
	}
	
	public void novaReferencia() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Nova referência')]"));
	}
	
	public void camposReferencia(String referencia, String quilometros) {
		selecionarComboPeloXPath("//select[@formcontrolname='descricao']", referencia);
		escrever(By.xpath("//input[@formcontrolname='kilometros']"), quilometros);
	}
	
	public void salvarDistancia() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Salvar distância')]"));
	}
	
	
	public void acessarTipoUH(){
		scrollElementoClicar(By.xpath("//a[contains(text(),'Condições de Contrato')]//i[2]"));
		scrollElementoClicar(By.xpath("//a[contains(text(),'Tipo de UH')]"));
	}
	
	public void novaUnidadeHabitacional() {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Nova Unidade Habitacional')]"));
	}
	
	public void preencherDadosTipoUH(String tipoUnidade, String quantidade, String categoriaQuarto, String contratado, String atendePCDF, String configCamaSimples) {
		selecionarComboPeloXPath("//select[@name='tipo']", tipoUnidade);
		escrever(By.xpath("//touchspin[@name='quantidade']//input"), quantidade );
		
		scrollElementoClicar(By.xpath("//multiselect[@name='categoriaQuarto']"));
		scrollElementoClicar(By.xpath("(//ul//label[contains(text(),'"+categoriaQuarto+"')])[1]"));
		
		clicarCheck(By.xpath("//label[contains(text(),'"+contratado+"')]//span"));
		clicarCheck(By.xpath("//label[contains(text(),'"+atendePCDF+"')]//span"));
		selecionarComboPeloXPath("//select[@name='configCamaSimples']", configCamaSimples);
	}
	
	public void ocupacaoMaxAcomodacao(String numAdulto, String numCrianca) {
		escrever(By.xpath("//label[contains(text(),'Numero máximo de adultos')]//parent::div//input"), numAdulto);
		escrever(By.xpath("//label[contains(text(),'Numero máximo de crianças')]//parent::div//input"), numCrianca);
	}
	
	public void gratuidadeCrianca(String opcao, String qtdCrianca, String idadeMaxima, String apartamento, String camaExtra) {
		scrollElementoClicar(By.xpath("//input[@name='aceitaCriancaFree']//parent::label[contains(text(),'"+opcao+"')]//span"));
		sleep(2);
		
		escrever(By.xpath("//input[@name='quantidade']"), qtdCrianca);
		escrever(By.xpath("//input[@name='idadeMaxima']"), idadeMaxima);
		
		scrollElementoClicar(By.xpath("//multiselect[@name='categorias']"));
		scrollElementoClicar(By.xpath("(//ul//label[contains(text(),'"+apartamento+"')])[2]"));
		
		scrollElementoClicar(By.xpath("//multiselect[@name='acomodacao']"));
		scrollElementoClicar(By.xpath("(//ul//label[contains(text(),'"+camaExtra+"')])[1]"));
		
	}
	
	public void ocupacaoUnidadeHabitacional(String opcao) {
		scrollElementoClicar(By.xpath("//input[@name='permiteCamaExtra']//parent::label[contains(text(),'"+opcao+"')]//span"));
	}
	
	public void salvarUnidadeHabitacional() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Salvar Unidade Habitacional')]"));
	}
	
	public void acessarTarifario() {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Tarifário')]"));
	}

	public void novaCondicaoContrato() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Nova condição de contrato')]"));
	}

	public void novaTemporada() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Nova temporada')]"));
	}
	
	public void condicaoContrato(String temporada, String todosFuncionamento, String todosAceitaCheckin, String qtdMinDiarias, String diasMinDiarias) {
		selecionarComboPeloXPath("//select[@name='temporada']", temporada);
		
		scrollElementoClicar(By.xpath("//multiselect[@name='funcionamento']//button"));
		scrollElementoClicar(By.xpath("//multiselect[@name='funcionamento']//label[contains(text(),'"+todosFuncionamento+"')]"));
		
		scrollElementoClicar(By.xpath("//multiselect[@name='diasCheckin']//button"));
		scrollElementoClicar(By.xpath("//multiselect[@name='diasCheckin']//label[contains(text(),'"+todosAceitaCheckin+"')]"));
		
		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasInicio = hoje.plusDays(0);
		LocalDate qtdDiasFim = hoje.plusDays(30);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
		String inserirDiaInicio = qtdDiasInicio.format(formatter);
		String inserirDiaFim = qtdDiasFim.format(formatter);
	
		escrever(By.xpath("//bs-datepicker[@name='inicioEm']//input"), inserirDiaInicio);
		escrever(By.xpath("//bs-datepicker[@name='fimEm']//input"), inserirDiaFim);
				
		WebElement Click = DriverFactory.getDriver().findElement(By.xpath("//h4[contains(text(),'Mínimo de diárias')]"));
		Click.click(); Click.click();
		
		
		
		escrever(By.xpath("//touchspin[@name='quantidade']//input"), qtdMinDiarias);
		scrollElementoClicar(By.xpath("(//multiselect[@name='dias']//button)[1]"));
		scrollElementoClicar(By.xpath("(//multiselect[@name='dias']//label[contains(text(),'"+diasMinDiarias+"')])[1]"));
		
	}

	public void adicionarCondicaoContrato() {
		scrollElementoClicar(By.xpath("(//button[contains(text(),'Adicionar')])[1]"));
		
	}
	
	public void adicionarOpcoesContrato(String unidadeHabitacional, String nivelUtilizacao, String formaPagamento, String regimePensao, String refeicao, String diasOpcoesContrato) {
		selecionarComboPeloXPath("//select[@formcontrolname='id']", unidadeHabitacional);
		selecionarComboPeloXPath("//select[@name='nivelUtilizacao']", nivelUtilizacao);
		selecionarComboPeloXPath("//select[@name='formaPagamento']", formaPagamento);
		selecionarComboPeloXPath("//select[@name='regimePensao']", regimePensao);
		selecionarComboPeloXPath("//select[@name='refeicao']", refeicao);
		scrollElementoClicar(By.xpath("(//multiselect[@name='dias']//button)"));
		scrollElementoClicar(By.xpath("(//multiselect[@name='dias']//label[contains(text(),'"+diasOpcoesContrato+"')])"));
	}
	
	public void valoresQuartos(String simples, String duplo, String triplo, String quadruplo) {
		escrever(By.name("simples"), simples);
		escrever(By.name("duplo"), duplo);
		escrever(By.name("triplo"), triplo);
		escrever(By.name("quadruplo"), quadruplo);
	}
	
	public void adicionarTarifario() {
		scrollElementoClicar(By.xpath("(//button[contains(text(),'Adicionar')])[1]"));
	}
	
	public void acessarBloqueio() {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Bloqueio')]"));
	}

	public void novoBloqueioDevolucao() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Novo bloqueio / devolução')]"));
	}
	
	public void novoBloqueio() {
		scrollElementoClicar(By.xpath("(//button[contains(text(),'Novo bloqueio')])[2]"));
	}
	
	public void preencheCamposBloqueio(String tipoUH, String nivelUtilizacao, String bloqueios) {
		selecionarComboPeloXPath("//div[@formgroupname='apartamentos']//select", tipoUH);
		selecionarComboPeloXPath("//select[@name='nivelUso']", nivelUtilizacao);
		escrever(By.xpath("//touchspin[@name='quantidade']//input"), bloqueios);
		
		LocalDate diaHoje = LocalDate.now();
		DateTimeFormatter formataDiaHoje = DateTimeFormatter.ofPattern("ddMMyyyy");
		String dataHoje = diaHoje.format(formataDiaHoje);
			
		escrever(By.xpath("//bs-datepicker[@name='dataVigencia']//input"), dataHoje);
		
		WebElement Click = DriverFactory.getDriver().findElement(By.xpath("//h4[contains(text(),'Extra bloqueios')]"));
		Click.click(); Click.click();
		sleep(2);
	}
	
	public void adicionarBloqueio() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Adicionar bloqueio')]"));
	}
	
	public void salvarBloqueioDevolucao() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Salvar bloqueio e devolução')]"));
	}
	
	public void acessarAtivarContrato() {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Ativar Contrato')]"));	
	}
	
	public void marcarOpcoesAtivarContrato() {
		clicarCheck(By.xpath("//label[contains(text(),'Atender Lista de Espera')]//parent::div//span"));
		clicarCheck(By.xpath("//label[contains(text(),'Habilitar MAPA')]//parent::div//span"));
		clicarCheck(By.xpath("//label[contains(text(),'Disponível na web?')]//parent::div//span"));
		clicarCheck(By.xpath("//label[contains(text(),'Suplemento')]//parent::div//span"));
		
	}
	
	public void preencherObservacaoAtivarContrato(String observacao) {
		escrever(By.name("observacao"), observacao);
	}
		
	public void clicarAtivarContrato() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Ativar Contrato')]"));
		scrollElementoClicar(By.xpath("//button[contains(text(),'Sim')]"));
	}
	
}
