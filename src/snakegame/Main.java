/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.EventQueue;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class Main extends JFrame {
    public Main() {
        initUI();
    }

    private void initUI() {
        add(new SnakeGame());

        setTitle("Snake");
        setSize(800, 610);
        playMusic("8-bit-dream-land-142093.wav");

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Main ex = new Main();
            ex.setVisible(true);
        });
    }
    
    private void playMusic(String location) {
    	try {
    	File musicPath = new File(location);
    	
    	AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
    	Clip clip = AudioSystem.getClip();
    	clip.open(audioInput);
    	clip.start();
    	clip.loop(Clip.LOOP_CONTINUOUSLY);
    	}
    	catch(Exception e) {
    		
    	}
    }
    
    
}

