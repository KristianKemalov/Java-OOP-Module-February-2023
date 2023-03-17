package ReflectionAnnotation.barracksWars;

import ReflectionAnnotation.barracksWars.core.commands.CommandInterpreterImpl;
import ReflectionAnnotation.barracksWars.interfaces.CommandInterpreter;
import ReflectionAnnotation.barracksWars.interfaces.Repository;
import ReflectionAnnotation.barracksWars.interfaces.Runnable;
import ReflectionAnnotation.barracksWars.interfaces.UnitFactory;
import ReflectionAnnotation.barracksWars.core.Engine;
import ReflectionAnnotation.barracksWars.core.factories.UnitFactoryImpl;
import ReflectionAnnotation.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        CommandInterpreter commandInterpreter = new CommandInterpreterImpl(repository,unitFactory);

        Runnable engine = new Engine(commandInterpreter);
        engine.run();
    }
}
