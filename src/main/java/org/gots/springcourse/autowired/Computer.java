package org.gots.springcourse.autowired;

import org.gots.springcourse.music.IMusicPlayer;
import org.gots.springcourse.music.MusicPlayer_Autowired;
import org.gots.springcourse.music.MusicPlayer_Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private IMusicPlayer musicPlayer;

    @Autowired
    public Computer(IMusicPlayer musicPlayer) {
        id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + ". MusicPlayer:\n" + musicPlayer;
    }

    public static void main(String[] args) {
        lesson_11_1();
    }

    public static void lesson_11_1() {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextComponents.xml");
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
    }
}
