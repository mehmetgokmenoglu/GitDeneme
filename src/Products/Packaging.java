package Products;
import PrintPack.Print;

public class Packaging extends Print {
    private double productSize;
    private double productWeight;
    private int sizeMultiplier;
    private int weightMultiplier;
    private String productSensitivity;

    public Packaging(double productSize, double productWeight, String productSensitivity) {
        this.productSize = productSize;
        this.productWeight = productWeight;
        this.productSensitivity = productSensitivity;
    }

    public void productSizeControl(){
        if(productSize > 0 && productSize <= 30){
            sizeMultiplier = 1;
        }
        else if(productSize > 30 && productSize <= 50){
            sizeMultiplier = 2;
        }
        else if(productSize > 50 && productSize <= 100){
            sizeMultiplier = 3;
        }
        else if(productSize > 100 && productSize <= 200){
            sizeMultiplier = 4;
        }
    }

    public void productWeightControl(){
        if(productWeight > 0 && productWeight <= 1){
            weightMultiplier = 1;
        }
        else if(productWeight > 1 && productWeight <= 5){
            weightMultiplier = 2;
        }
        else if(productWeight > 5 && productWeight <= 25){
            weightMultiplier = 3;
        }
        else if(productWeight > 25){
            weightMultiplier = 4;
        }
    }

    public double packageCostCalculator(){
        return 2 * sizeMultiplier + 1.5 * weightMultiplier;
    }

    @Override
    public void printInfo() {
        productSizeControl();
        productWeightControl();
        System.out.println("Product Size: " + productSize + " inches");
        System.out.println("Product Weight: " + productWeight + " kilograms");
        System.out.println("Package Multipliers: " + "Size Multiplier: " + sizeMultiplier + " Weight Multiplier: " +weightMultiplier);
        System.out.println("Product Sensitivity: " + productSensitivity);
        System.out.println("Package Cost: " + packageCostCalculator());
    }
}
