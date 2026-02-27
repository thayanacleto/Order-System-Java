package application;

import entities.Order;

public class Program {
    public static void main(String[] args) {
        Order pedido = new Order("Thay");

        System.out.println("Status: " + pedido.getStatus());
        System.out.println("Total: " + pedido.getTotal());



    try {
        pedido.addItem(50);
        System.out.println("Total depois do item 50: " + pedido.getTotal());

        pedido.addItem(100);
        System.out.println("Total depois do item 100: " + pedido.getTotal());

        pedido.addItem(-10);

    } catch(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    try {
        pedido.pay();
        System.out.println("Status depois do pagamento: " + pedido.getStatus());
        
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }


    try {
        pedido.cancel();
        System.out.println("Status depois do cancelamento: " + pedido.getStatus());
        
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    








    }

    
    
}
