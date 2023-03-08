package com.vassarlabs.learnspringframework;

import com.vassarlabs.learnspringframework.game.GameRunner;
import com.vassarlabs.learnspringframework.game.MarioGame;
import com.vassarlabs.learnspringframework.game.SuperContraGame;
import com.vassarlabs.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {
	
	public static void main(String[] args) {

		
//		var game = new SuperContraGame();
//		var game = new MarioGame();
		var game = new PacmanGame();
		
		
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
	}
}
