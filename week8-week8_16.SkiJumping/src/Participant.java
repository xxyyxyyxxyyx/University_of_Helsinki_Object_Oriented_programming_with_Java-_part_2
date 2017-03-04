
import java.util.HashMap;
import java.util.Map;

class Participant implements Comparable<Participant>{
    private String name;
    private Map<Integer, Result> results;
    
    
    public Participant(String name) {
        
        this.name = name;
        this.results = new HashMap<Integer,Result>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPoint(){
        int point = 0;
        for(Result result: results.values()){
            point += result.totalPoints();
        }
        return point;
    }
    
    public Result getResult(int round){
        return this.results.get(round);
    }
    
    public void jump(int round){
        results.put(round, new Result());
    }
    
    public String allJumps(){
        String str = "";
        for(Result r : results.values()){
            str = str+r.getLength()+" m, ";
        }
        return str;
    }

    @Override
    public int compareTo(Participant o) {
        return this.getPoint() - o.getPoint();
    }
    
    
}
