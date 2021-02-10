
package studentgrades;

//moomal haroon
public class StudentGrades {
     
   
    public static void main(String[] args) {
        
        double[] grade = {10,23,21,24,67,45,89,67,4.5,8.9};
     
        System.out.println(calcAvg(grade));
        System.out.println(calcMax(grade));
      
     
    }

    private static double calcAvg(double[] grade) {
      double result = 0;
      
      for (double g : grade) {
          result += g;
      }
    

        return result / grade.length;
    } 
    
    private static double calcMax(double[] grade){
        double result = 0;
        
        for (double g: grade){
            result = Math.max(result, g);
        }
        
        return result;
    }
    
}

