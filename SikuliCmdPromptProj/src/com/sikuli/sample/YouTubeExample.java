package com.sikuli.sample;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class YouTubeExample {

	public static void main(String[] args) throws FindFailed {
		
		App.open("C:\\Windows\\notepad.exe");
		Screen s = new Screen();
		s.find("3.png");
		s.find("4.png");
		s.type("4.png","welcome to Notepad");
	}
}
