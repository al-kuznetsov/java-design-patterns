package command;

public class RemoteControlTest {

	public static void main(String[] args) {
		Light light = new Light(); // Получатель команды/запроса
		LightOnCommand lightOnCommand = new LightOnCommand(light); // Команда, с указанием получателя

		SimpleRemoteControl remote = new SimpleRemoteControl(); // Инициатор запроса

		remote.setCommand(lightOnCommand); // На кнопку назначена команда
		remote.buttonWasPressed(); // Инициировано выполнение команды получателем

		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

		remote.setCommand(garageDoorOpenCommand);
		remote.buttonWasPressed();
	}
}
