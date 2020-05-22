import java.util.Collection;

public class OverdueList<O> {
    private  Collection<O> overdueList;

    public OverdueList(Collection<O> overdueList){
        this.overdueList = overdueList;
    }

    //getters
    public Collection<O> getOverdueList(){
        return overdueList;
    }

    //setters
    public void setOverdueList(Collection<O> overdueList){
        this.overdueList = overdueList;
    }