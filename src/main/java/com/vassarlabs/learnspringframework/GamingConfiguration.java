package com.vassarlabs.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vassarlabs.learnspringframework.game.GameRunner;
import com.vassarlabs.learnspringframework.game.GamingConsole;
import com.vassarlabs.learnspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		return new PacmanGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
