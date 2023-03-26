import java.util.ArrayList;

public class Ingredient {
    String ingredient;
    Integer qty;
    Integer minQty;
    Integer maxQty;

    // สูตรของอาหาร
    Ingredient(String ingre){
        this.ingredient = ingre;
    }

    // input ที่ใส่มา
    Ingredient(ArrayList<String> food){
        for(String a : food){
        // this.ingredient.add
        }
    }

    public String getIngredient() {
        return ingredient;
    }
}
