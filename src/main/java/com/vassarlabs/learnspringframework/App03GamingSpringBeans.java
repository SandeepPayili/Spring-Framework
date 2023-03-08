package com.vassarlabs.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vassarlabs.learnspringframework.game.GameRunner;
import com.vassarlabs.learnspringframework.game.GamingConsole;
import com.vassarlabs.learnspringframework.game.MarioGame;
import com.vassarlabs.learnspringframework.game.SuperContraGame;
import com.vassarlabs.learnspringframework.game.PacmanGame;

public class App03GamingSpringBeans {
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();	
		}
	}
}