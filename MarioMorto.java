package br.metodista.dp.state2;
/**
 *Análise e Desenvovimento de Sistemas
 * @author SCORPION TAIY
 * 27/08/18 quinta-feira - 00:50
 */
public class MarioMorto implements MarioState {

       @Override
	public MarioState pegarCogumelo() {
		return null;
	}

	@Override
	public MarioState pegarFlor() {
		return null;
	}

	@Override
	public MarioState pegarPena() {
		return null;
	}

	@Override
	public MarioState levarDano() {
		return null;
	}
}
