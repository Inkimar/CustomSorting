/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testordering;

import java.util.Comparator;
import java.util.List;

 class ColorComparator implements Comparator<Car>
 {
     private List<String> sortOrder;
     public ColorComparator (List<String> sortOrder){
         this.sortOrder = sortOrder;
     }

     public int compare(Car c1, Car c2)
     {
             String a1 = c1.getColor();
             String a2 = c2.getColor();

             return sortOrder.indexOf(a1) - sortOrder.indexOf(a2);
     }
 }
