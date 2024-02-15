package OCP.problem;

public class Wage {
    public void calculate(Object obj){
        if (obj instanceof FulltimeContract) {
            ((FulltimeContract) obj).payment();
        }else if (obj instanceof ParttimeContract){
            ((ParttimeContract) obj).payment();
        }
    }
}
