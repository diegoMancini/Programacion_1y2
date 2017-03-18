package Parcial2.ejercicio1;

/**
 * Created by agustin on 11/11/16.
 */
public class Package {

    private Product product;
    private int dniOfClient;
    private int codigoPostalOfClient;

    public Package(Product product, int dniOfClient, int codigoPostalOfClient) {
        this.product = product;
        this.dniOfClient = dniOfClient;
        this.codigoPostalOfClient = codigoPostalOfClient;
    }

    public Product getProduct() {
        return product;
    }

    public double getWeightOfPackage(){
        return product.getWeight() + 0.3;
    }

    public int getDniOfClient() {
        return dniOfClient;
    }

    public int getCodigoPostalOfClient() {
        return codigoPostalOfClient;
    }
}
