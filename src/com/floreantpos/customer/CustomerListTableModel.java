package com.floreantpos.customer;

import com.floreantpos.model.Customer;
import java.util.List;

public class CustomerListTableModel {

    public CustomerListTableModel(){

    }

    public CustomerListTableModel(List<Customer> customers){}


    public Object getValueAt(int rowIndex, int columnIndex){
        if (rowIndex == 0 && columnIndex == 0){
            return null;
        }
        return null;
    }



}
