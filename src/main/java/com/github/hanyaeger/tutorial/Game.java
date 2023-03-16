package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class Game extends YaegerGame {

	@Override
	public void setupGame() {
	    setGameTitle("Waterworld");
	    setSize(new Size(800, 600));
	}


	@Override
	public void setupScenes(){
	    addScene(0, new TitleScene());
	}
	
	public static void main(String[] args){
	    launch(args);
	}

}
