package Facade;

import Facade.subsystem.Amplifier;
import Facade.subsystem.PopcornPopper;
import Facade.subsystem.Projector;
import Facade.subsystem.Screen;
import Facade.subsystem.StreamingPlayer;
import Facade.subsystem.TheaterLights;
import Facade.subsystem.Tuner;

public class HomeTheaterFacade {

    // composition 부분, 사용하고자 하는 서브시스템의 모든 구성 요소가 인스턴스 변수 형태로 저장된다.
    private final Amplifier amp;
    private final Tuner tuner;
    private final StreamingPlayer player;
    private final Projector projector;
    private final TheaterLights lights;
    private final Screen screen;
    private final PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer player,
        Projector projector,
        TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("영화 볼 준비 중");
        popper.on();
        popper.pop();

        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        projector.setInput(player);

        amp.on();
        amp.setDvd(player);
        amp.setSurroundSound();
        amp.setVolume(5);

        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("홈시어터 끄는 중");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }
}
