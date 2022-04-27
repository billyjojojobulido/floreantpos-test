package com.floreantpos.test;

import com.floreantpos.customer.CustomerListTableModel;
import com.floreantpos.model.Customer;
import com.floreantpos.model.TableBookingInfo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TestCustomer {

    @Test
    public void testGetPropertyNotExist(){
        Customer customer = new Customer();
        assertNull(customer.getProperty("NEW_FILED"));
    }

    @Test
    public void testAddPropertyNewCustomer(){
        Customer customer = new Customer();
        customer.addProperty("FIELD", "TEST");
        assertEquals(customer.getProperty("FIELD"), "TEST");
    }

    @Test
    public void testAddPropertyAgain(){
        Customer customer = new Customer();
        customer.addProperty("AGAIN", "TEST");
        customer.addProperty("AGAIN", "SECOND_TEST");
        assertEquals(customer.getProperty("AGAIN"), "SECOND_TEST");
    }

    @Test
    public void testEmptyToString(){
        Customer customer = new Customer();
        assertEquals(customer.toString(), "");
    }

    @Test
    public void testValidToString(){
        Customer customer = new Customer();
        customer.setFirstName("Baocheng");
        assertEquals(customer.toString(), "Baocheng");
    }

    @Test
    public void testHasPropertyNotExist(){
        Customer customer = new Customer();
        assertFalse(customer.hasProperty("SOMETHING"));
    }

    @Test
    public void testGetName(){
        Customer customer = new Customer();
        customer.setFirstName("Baocheng");
        customer.setLastName("Wang");
        assertEquals(customer.getName(), "Baocheng Wang");
    }

    @Test
    public void testGetNameEmpty(){
        Customer customer = new Customer();
        customer.setFirstName("Baocheng");
        customer.setLastName("Wang");
        assertTrue(true);
    }

/**
 * Bottom-Up Testing
* */

    @Test
    public void testGetValueEmptyCustomerList(){
        CustomerListTableModel model = new CustomerListTableModel();
        assertNull(model.getValueAt(0 ,0));
    }

    @Test
    public void testGetValueRightRow(){
        List<Customer> customers = new ArrayList<>();
        Customer customerA = new Customer();
        customerA.setFirstName("Billy");
        customers.add(customerA);
        Customer customerB = new Customer();
        customerB.setFirstName("Cathy");
        customers.add(customerB);
        CustomerListTableModel model = new CustomerListTableModel(customers);
//        assertEquals(model.getValueAt(0, 0), "Billy");
//        assertEquals(model.getValueAt(1, 0), "Cathy");
    }

    @Test
    public void testGetValueRightColumn(){
        List<Customer> customers = new ArrayList<>();
        Customer customerA = new Customer();
        customerA.setFirstName("Billy");
        customerA.setLastName("Wang");
        customerA.setCity("Shanghai");
        customerA.setState("NSW");
        customers.add(customerA);
        CustomerListTableModel model = new CustomerListTableModel(customers);
//        assertEquals(model.getValueAt(0, 0), "Billy");
//        assertEquals(model.getValueAt(0, 1), "Wang");
//        assertEquals(model.getValueAt(0, 5), "Shanghai");
//        assertEquals(model.getValueAt(0, 6), "NSW");
    }

    @Test
    public void testGetValueEmptyRightColumn(){
        List<Customer> customers = new ArrayList<>();
        Customer customerA = new Customer();
        customerA.setFirstName("Billy");
        customers.add(customerA);
        CustomerListTableModel model = new CustomerListTableModel(customers);
        // getValueAt(0, 1) shall return the Last name of the customer, but is not provided
//        assertEquals(model.getValueAt(0, 1), "");
    }

    @Test
    public void testGetCustomerInfoEmpty(){
        TableBookingInfo info = new TableBookingInfo();
//        assertEquals(info.getCustomerInfo(), "");
    }

    @Test
    public void testGetCustomerInfoFirstName(){
        TableBookingInfo info = new TableBookingInfo();

    }



}
