package tr.edu.maltepe.oop;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Cat {
    // Attributes of the cat
    String name;
    String color;
    int age;

    // Constructor to initialize the cat's attributes
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Method to describe the cat
    public void describe() {
        System.out.println("This is " + name + ", a " + age + "-year-old " + color + " cat.");
    }

    // Method for the cat to meow with sound effect
    public void meow() {
        System.out.println(name + " says: Meow!");
        playMeowSound();
    }

    // Play the "meow" sound effect
    private void playMeowSound() {
        try {
            // Create a file object with the path to the sound file
            File soundFile = new File("C:\\Users\\Berivan\\IdeaProjects\\my-cat-class-berivandemirr\\module1\\src\\cat-meow-6226.wav"); // Path to your meow.wav file
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            Thread.sleep(1000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Error playing the sound: " + e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
