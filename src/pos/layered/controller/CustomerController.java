/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import java.util.ArrayList;
import pos.layered.dto.CustomerDto;
import pos.layered.service.ServiceFactory;
import pos.layered.service.custom.CustomerSevice;


/**
 *
 * @author HP
 */
public class CustomerController {
    CustomerSevice customerService = (CustomerSevice) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String addCustomer(CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
        
    }

    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        return customerService.getAllCustomer();
    }

    public String updateCustomer(CustomerDto CustomerDto) throws Exception {
        return customerService.updateCustomer(CustomerDto);
    }

    public String deleteCustomer(String id) throws Exception {
        return customerService.deleteCustomer(id);
    }

    public CustomerDto getCustomer(String custID) throws Exception {
        return customerService.getCustomer(custID);
    }
    
}
