package br.edu.ifpe.andrielly.gestaocliente1.model;

public enum UnidadeFederativa {

	Roraima("RR","Boa Vista","Norte"),
	Amapa("AP","Macapá","Norte"),
	Amazonas("AM","Manaus","Norte"),
	Para("PA", "Belém", "Norte"),
	Acre("AC", "Rio Branco","Norte"),
	Rondonia("RO","Porto Velho","Norte"),
	Tocantins("TO" ,"Palmas", "Norte"),
	Maranhao("MA","São Luís", "Nordeste"),
	Piaui("PI","Teresina", "Nordeste"),
	Ceara("CE", "Fortaleza", "Nordeste"),;
	
	private final String nome;
	private final String sigla;
	private final String capital;
	/**
	 * @param nome
	 * @param sigla
	 * @param capital
	 */
	private UnidadeFederativa(String nome, String sigla, String capital) {
		this.nome = nome;
		this.sigla = sigla;
		this.capital = capital;
	}


	
	
}
