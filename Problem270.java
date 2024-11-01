import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    int id;
    int importance;
    List<Integer> subordinates;
}

public class Problem270 {
    Map<Integer, Employee> eMap;
    public int getImportance(List<Employee> employees, int id) {
        eMap = new HashMap<>();
        for(Employee e : employees){
            eMap.put(e.id, e);
        }

        return dfs(id);
    }

    public int dfs(int id){
        Employee employee = eMap.get(id);
        int ans = employee.importance;
        for(Integer it : employee.subordinates){
            ans += dfs(it);
        }

        return ans;
    }
}