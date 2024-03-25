package course.command.remote;

public class RemoteDriver {

    public static void main(String[] args) {

        // Создать устройства и команды
        Light kitchenLight = new Light("Kitchen");
        Command lightOnCommand = new LightOnCommand(kitchenLight);
        Command lightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Command ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        Command ceilignFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);

        Stereo stereo = new Stereo("Bedroom");
        Command stereoOnCommand = new StereoOnCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);

        // Создать Invoker
        Remote remote = new Remote();

        // Связать команды с ячейками
        remote.setCommand(0, lightOnCommand, lightOffCommand);
        remote.setCommand(1, ceilingFanOnCommand, ceilingFanOffCommand);
        remote.setCommand(2, stereoOnCommand, stereoOffCommand);
        remote.setCommand(3, ceilignFanHighCommand, ceilingFanOffCommand);
        remote.setCommand(4, ceilingFanLowCommand, ceilingFanOffCommand);

        System.out.println(remote);

        // Тест
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);

        remote.onButtonWasPushed(1);
        remote.undoButtonWasPushed();
//        remote.offButtonWasPushed(1);

        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);

        remote.onButtonWasPushed(4);
        remote.onButtonWasPushed(3);
        remote.undoButtonWasPushed();

        // Демо Макрокоманда
        Hottub hottub = new Hottub();
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);

        TV tv = new TV("Living Room");
        TVOnCommand tvOnCommand = new TVOnCommand(tv);

        PartyOnMacroCommand partyOnMacroCommand = new PartyOnMacroCommand(new Command[]{hottubOnCommand, stereoOnCommand, tvOnCommand});
        remote.setCommand(5, partyOnMacroCommand, remote.undoCommand);

        remote.onButtonWasPushed(5);
        remote.undoButtonWasPushed();

    }
}
