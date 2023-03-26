import java.util.ArrayList;
import java.util.Arrays;
public class MM {
   public static ArrayList<Ingredient> inputIngredient = new ArrayList<>();
   
   public MM(ArrayList<String> food) {
        //ส่งชื่อวัตถุดิบ 
        for(String aa : food){
         System.out.println(food);
      }

      
        //ส่งวัตถุดิบไปทำอาหาร
        Cooking cooking = new Cooking();
        String result = cooking.cook(inputIngredient);
        System.out.println(result);

        // display ตามผลลัพธ์ที่ได้จากการทำอาหาร
        new Foodframe(result);
   }
}