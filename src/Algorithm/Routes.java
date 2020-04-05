package Algorithm;

import Algorithm.Constraints;
import Common.Instance;
import Common.Nodes;

import java.util.ArrayList;

public class Routes {
    Instance inst;
    public ArrayList<Nodes> tour;
    private boolean isFeasible;
    Constraints cons;

    public Routes(ArrayList<Nodes> tour, Instance inst) {
        this.tour = tour;
        cons = new Constraints(tour, inst);
        checkFeasibility();
    }

    public boolean isFeasible() {
        return isFeasible;
    }

    public void checkFeasibility() {
        isFeasible = cons.checkCapacityConstraint() & cons.checkTimeWindowConstraint();
    }

    public void insert(Nodes v_in,int pos){
        tour.add(pos,v_in);
        cons.UpdateInfo();
    }
}
