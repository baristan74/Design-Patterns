package structuralPatterns.composite.compositeExample2;

import java.util.ArrayList;
import java.util.List;

public class CompositeSoldier extends Soldier {

    private List<Soldier> soldierList = new ArrayList<>();

    public CompositeSoldier(String name, Rank rank) {
        super(name, rank);
    }

    public void addSoldier(Soldier soldier){
        soldierList.add(soldier);
    }

    public void removeSoldier(Soldier soldier){
        soldierList.remove(soldier);
    }

    @Override
    public void ExecuteOrder() {
        System.out.println("Rank: "+ rank+ " Name: " + name);
        for(Soldier soldier: soldierList){
            soldier.ExecuteOrder();
        }
    }
}
