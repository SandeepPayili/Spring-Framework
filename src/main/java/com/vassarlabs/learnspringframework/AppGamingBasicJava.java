package com.vassarlabs.learnspringframework;

import com.vassarlabs.learnspringframework.game.GameRunner;
import com.vassarlabs.learnspringframework.game.MarioGame;
import com.vassarlabs.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
	
	public static void main(String[] args) {
//		var marioGame = new MarioGame();
//		var gameRunner = new GameRunner(marioGame);
		
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		
		gameRunner.run();
	}
}
