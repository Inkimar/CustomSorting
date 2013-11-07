/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testordering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ingimar
 */
public class TestOrdering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Car> carList = new LinkedList<Car>();

        carList.add(new Car("Ford Figo", "Silver"));
        carList.add(new Car("Santro", "Blue"));
        carList.add(new Car("Honda Jazz", "Magenta"));
        carList.add(new Car("Indigo V2", "Red"));
        carList.add(new Car("Suzuki Jazz", "Magenta"));

        System.out.println("1 - without sorting - \n");
        for (Car carSort : carList) {
            System.out.println("carsort is " + carSort.getName() + " - " + carSort.getColor());
        }
        
        final List sortOrder = Arrays.asList("Red" ,"Viol","Magenta", "Silver","Blue");
        
        Collections.sort(carList, new ColorComparator(sortOrder));

        System.out.println("2 - sorting cars accordning to sortOrder-list - \n");
        for (Car carSort : carList) {
            System.out.println("carsort is " + carSort.getName() + " - " + carSort.getColor());
        }
    }
}
