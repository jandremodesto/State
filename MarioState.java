package br.metodista.dp.state2;
/**
 *Análise e Desenvovimento de Sistemas
 * @author SCORPION TAIY
 * 27/08/18 quinta-feira - 00:50
 */
public interface MarioState {
	MarioState pegarCogumelo();

	MarioState pegarFlor();

	MarioState pegarPena();

	MarioState levarDano();
}
