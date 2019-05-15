import java.util.*;

class DoubleCalc {
      public static void main(String[] args) throws InvalidNum {
          System.out.println(args[0] instanceof String);
          String num1 = args[0];
          if(args.length < 2) {
              throw new InvalidNum("なんでやねん！！！！！！！");
          }

      }
}
