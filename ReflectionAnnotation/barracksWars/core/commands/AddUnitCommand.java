package ReflectionAnnotation.barracksWars.core.commands;

import ReflectionAnnotation.barracksWars.interfaces.Repository;
import ReflectionAnnotation.barracksWars.interfaces.Unit;
import ReflectionAnnotation.barracksWars.interfaces.UnitFactory;

public class AddUnitCommand extends Command{
    public AddUnitCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = getUnitFactory().createUnit(unitType);
        this.getRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}
