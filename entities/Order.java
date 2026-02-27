 package entities;

import enums.Status;

public class Order {
    private String customerName; 
    private Double total; 
    private Status status;


    public Order (){

    }

    public Order(String customerName) {
        this.customerName = customerName;
        this.status = Status.PENDING;
        this.total = 0.0;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public void addItem(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }

        else {
            this.total += price;
        }


    }

    public void pay(){
        
        if (total <= 0 ){
            throw  new IllegalArgumentException("O pedido não pode ser pago com o total 0");
        }

        else {
            this.status = Status.PAID;
        }
    }

    public void cancel() {
       if (status != Status.PENDING) {
            throw  new IllegalArgumentException("Pedido já foi pago ou cancelado");
        }
        else {
            this.status = Status.CANCELED;
        }

    }

 }