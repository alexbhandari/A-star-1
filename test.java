package AStar;
import AStar.*;
import java.util.ArrayList;

public class test {

   public static void main(String[] args) {
      GoalNode2D goalNode = new GoalNode2D(10, 10);
      ISearchNode initialNode = new SearchAndAvoidNode2D(0, 0, null, goalNode);
      ArrayList<ISearchNode> path = new AStar().shortestPath(initialNode, goalNode);
      for (int i = 0; i < path.size(); i++) {
         System.out.println("Element number " + i + " is " + path.get(i));
      }
   }

}
