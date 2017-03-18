package Parcial2.ejercicio2;

import ejercicio1.Package;

import java.lang.*;
import java.util.Comparator;

/**
 * Created by agustin on 11/11/16.
 */
public class OrdenarPedidosPorPeso implements Comparator<java.lang.Package> {

    @Override
    public int compare(java.lang.Package order1, java.lang.Package order2) {
        if(order1.getWeightOfPackage() == order2.getWeightOfPackage()){
            return 0;
        }
        else if(order1.getWeightOfPackage() > order2.getWeightOfPackage()){
            return 1;
        }
        else
            return -1;
    }
}
