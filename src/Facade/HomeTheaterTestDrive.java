package Facade;

import Facade.subsystem.Amplifier;
import Facade.subsystem.PopcornPopper;
import Facade.subsystem.Projector;
import Facade.subsystem.Screen;
import Facade.subsystem.StreamingPlayer;
import Facade.subsystem.TheaterLights;
import Facade.subsystem.Tuner;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        // 구성 요소 초기화
        // 지금은 구성 요소를 직접 생성하지만 보통은 클라이언트에 퍼사드가 주어지므로 직접 구성 요소를 생성하지 않아도 된다.

        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
            amp,
            tuner,
            player,
            projector,
            lights,
            screen,
            popper
        );
        // 단순화된 인터페이스를 사용
        homeTheater.watchMovie("king kong");
        homeTheater.endMovie();
    }

}
