package com.company;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FoodItem Apple = new FoodItem();
        FoodItem Apple2 = new FoodItem("Apple2");
        GenericItem Pen = new GenericItem();
        GenericItem Pineapple = new GenericItem();

        Apple.name = "Apple";
        Pen.name = "Pen";
        Pineapple.name = "Pineapple";

        Apple.price = 2.5f;
        Pen.price = 3f;
        Pineapple.price = 4f;

        Apple.category = FoodItem.Category.FOOD;
        Pen.category = GenericItem.Category.GENERAL;
        Pineapple.category = GenericItem.Category.FOOD;

        Apple.dateOfIncome = new Date();

        Apple.expires = 14;

        GenericItem New = new GenericItem("New", 5f, GenericItem.Category.GENERAL);

        Apple.printAll();
        Apple2.printAll();
        Pen.printAll();
        Pineapple.printAll();
        New.printAll();
        // 2 часть:
        Integer intArr[] = {10, 20, 15};
        Float floatArr[] = new Float[5];
        for (int i = 0; i < 5; i++) {
            floatArr[i] = (float) 3.14 * i;
        }

        WorkArray insWorkArrayInt = new WorkArray(intArr);
        WorkArray insWorkArrayFloat = new WorkArray(floatArr);
        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());
        //3 часть:
        String line = "Конфеты 'Mask' ;45;120";
        String itm_fld[] = line.split(";");
        FoodItem Candy = new FoodItem(itm_fld[0], Float.parseFloat(itm_fld[1]), Short.parseShort(itm_fld[2]));
        Candy.printAll();
    }
}
