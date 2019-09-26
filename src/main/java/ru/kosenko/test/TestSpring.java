package ru.kosenko.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic music = context.getBean("musicBean", ClassicalMusic.class);



//        MusicPlayer player = context.getBean("playerBean", MusicPlayer.class);
//        player.playMusic();

        context.close();
    }
}
