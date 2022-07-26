package command.cmd;

import command.vendor.CeilingFan;

public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed; // 상태 지역 변수로 선풍기의 속도를 저장

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        // 속도를 변경하기 전에 작업을 취소해야 할 때를 대비해서 이전 속도를 저장
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
