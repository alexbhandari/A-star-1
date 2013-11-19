public interface TypeMap {

   public Types getType(int x, int y);

   public boolean isStyrofoam(int x, int y);

   public boolean isObstacle(int x, int y);

   public boolean isEmpty(int x, int y);

   public void set(int x, int y, Types type);

}
