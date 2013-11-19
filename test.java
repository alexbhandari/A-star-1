import AStar.Types;
import AStar.AStar;
import AStar.TypeMap;
import AStar.FieldMap;
import AStar.GoalNode2D;
import AStar.ISearchNode;
import AStar.SearchAndAvoidNode2D;
import java.util.ArrayList;

public class test {

   public static void main(String[] args) {
      TypeMap map = new FieldMap((int)(12 * 30.48),(int)(12 * 30.48));
      map.set(3,3,Types.OBSTACLE);
      GoalNode2D goalNode = new GoalNode2D(10, 10);
      ISearchNode initialNode = new SearchAndAvoidNode2D(map, 0, 0, null, goalNode);
      ArrayList<ISearchNode> path = new AStar().shortestPath(initialNode, goalNode);
      for (int i = 0; i < path.size(); i++) {
         System.out.println("Element number " + i + " is " + path.get(i));
      }
   }

}
