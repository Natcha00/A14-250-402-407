import java.util.ArrayList;

public class Cooking {

    public String cook(ArrayList<Ingredient> ingredientsInput){
        //สูตรอาหารที่มี

        // CAKE
        ArrayList<Ingredient> cakeIngredient = new ArrayList<>();
        cakeIngredient.add(new Ingredient("FLOUR")); // 999 คือ ไม่จำกัด
        cakeIngredient.add(new Ingredient("EGG"));
        cakeIngredient.add(new Ingredient("MILK"));
        cakeIngredient.add(new Ingredient("SUGAR"));
        cakeIngredient.add(new Ingredient("BUTTER"));

        // OMELET
        ArrayList<Ingredient> omeletIngredient = new ArrayList<>();
        omeletIngredient.add(new Ingredient("EGG"));
        omeletIngredient.add(new Ingredient("BUTTER"));
        omeletIngredient.add(new Ingredient("RICE"));

        // FIREDRICE
        ArrayList<Ingredient> firedRiceIngredients = new ArrayList<>();
        firedRiceIngredients.add(new Ingredient("RICE"));
        firedRiceIngredients.add(new Ingredient("EGG"));
        firedRiceIngredients.add(new Ingredient("MEAT"));
        firedRiceIngredients.add(new Ingredient("LETTUCE"));

        // SANDWICH
        ArrayList<Ingredient> sandwichIngredients = new ArrayList<>();
        sandwichIngredients.add(new Ingredient("BREAD"));
        sandwichIngredients.add(new Ingredient("LETTUCE"));
        sandwichIngredients.add(new Ingredient("MEAT"));

        // STEAK
        ArrayList<Ingredient> steakIngredients = new ArrayList<>();
        steakIngredients.add(new Ingredient("MEAT"));
        steakIngredients.add(new Ingredient("BUTTER"));

        // เช็คว่า วัตถุดิบที่ใส่เข้ามาถูกต้องหรือไม่ เทียบกับที่สูตรอาหารมี
        if(checkRecipe(ingredientsInput,cakeIngredient)){
            return "Cake";
        }
        if(checkRecipe(ingredientsInput,omeletIngredient)){
            return "Omelet";
        }
        if(checkRecipe(ingredientsInput,firedRiceIngredients)){
            return "FiredRice";
        }
        if(checkRecipe(ingredientsInput,sandwichIngredients)){
            return "Sandwich";
        }
        if(checkRecipe(ingredientsInput,steakIngredients)){
            return "Steak";
        }

        return "FAILED";
    }

    public boolean checkRecipe(ArrayList<Ingredient> ingredientsInput, ArrayList<Ingredient> ingredientsRecipe){
        Boolean isComplete = true;
        ArrayList<String> RecipeList = new ArrayList<>();
        for(Ingredient ingredient:ingredientsRecipe){
            RecipeList.add(ingredient.getIngredient());
        }
        for (Ingredient ingreInput:ingredientsInput){
            for(Ingredient ingreRecipe:ingredientsRecipe){
                if(ingreInput.getIngredient().equals(ingreRecipe.getIngredient())){
                    // int maxQty = ingreRecipe.getMaxQty();
                    // int minQty = ingreRecipe.getMinQty();
                    // int qty = ingreInput.getQty();
                    // System.out.println(maxQty);
                    // System.out.println(minQty);
                    // System.out.println(ingreInput.getIngredient());
                //     if(qty<minQty || qty>= maxQty){
                //         isComplete = false;
                //     }
                // }else{
                    if(!RecipeList.contains(ingreInput.getIngredient())){
                        isComplete = false;
                    }
                }
            }
            
        }
        return isComplete;
    }
}
