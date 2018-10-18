package br.metodista.dp.state2;
/**
 *Análise e Desenvovimento de Sistemas
 * @author SCORPION TAIY
 * 27/08/18 quinta-feira - 00:50
 */
public class Mario {
    
    protected MarioState estado;
	
	public Mario() {
		estado = new MarioPequeno();
	}

	public void pegarCogumelo() {
		estado = estado.pegarCogumelo();
	}

	public void pegarFlor() {
		estado = estado.pegarFlor();
	}

	public void pegarPena() {
		estado = estado.pegarPena();
	}

	public void levarDano() {
		estado = estado.levarDano();
	}
}
