package ReflectionAnnotation.barracksWars.core.commands;

import ReflectionAnnotation.barracksWars.interfaces.Repository;
import ReflectionAnnotation.barracksWars.interfaces.UnitFactory;

public class FightCommand extends Command{
    public FightCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
