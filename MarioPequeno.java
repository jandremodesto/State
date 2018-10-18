package br.metodista.dp.state2;
/**
 *Análise e Desenvovimento de Sistemas
 * @author SCORPION TAIY
 * 27/08/18 quinta-feira - 00:50
 */
public class MarioPequeno implements MarioState {
    
	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario grande");
		return new MarioGrande();
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario grande com fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario grande com capa");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario morto");
		return new MarioMorto();
	}
}
