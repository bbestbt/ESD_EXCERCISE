package kmitl.esd.exercise1.composite;

import java.util.logging.Logger;

public class Team implements BusinessUnit {
    protected Integer id;
    protected String name;

    /**
     * constructor
     * @param id id of team
     * @param name name of team
     */
    public Team(Integer id,String name){
        this.id=id;
        this.name=name;
    }

    /**
     * function that display team detail
     */
    @Override
    public void displayDetails() {
        Logger.getLogger(Team.class.getName()).info(id + "  " + name);
    }
    }
