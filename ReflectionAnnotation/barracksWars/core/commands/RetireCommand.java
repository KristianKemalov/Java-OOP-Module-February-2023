package ReflectionAnnotation.barracksWars.core.commands;

import ReflectionAnnotation.barracksWars.interfaces.Repository;
import ReflectionAnnotation.barracksWars.interfaces.UnitFactory;

public class RetireCommand extends Command {
    public RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        try {
            String unitType = getData()[1];
            getRepository().removeUnit(getData()[1]);
            return String.format("%s retired!", unitType);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }

    }
}
