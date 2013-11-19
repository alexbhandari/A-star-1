public class testMap {

   public static void main(String[] args) {
      TypeMap map = new FieldMap((int)30.48*12,(int)30.48*12);
      System.out.println(map.isEmpty(0,0));
      System.out.println(map.getType(0,0));
      map.set(0,0,Types.STYROFOAM);
      System.out.println(map.isStyrofoam(0,0));
   }

}
