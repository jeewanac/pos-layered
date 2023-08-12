/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import java.util.ArrayList;
import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.CustomerDao;
import pos.layered.dto.CustomerDto;
import pos.layered.entity.CustomerEntity;
import pos.layered.service.custom.CustomerSevice;

/**
 *
 * @author HP
 */
public class CustomerServiceImpl implements CustomerSevice {

    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto dto) throws Exception {

        CustomerEntity ce = new CustomerEntity(dto.getId(),
                dto.getTitle(),
                dto.getName(),
                dto.getDob(),
                dto.getSalary(),
                dto.getAddress(),
                dto.getCity(),
                dto.getProvince(),
                dto.getZip());
        if (customerDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }

    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity ce = new CustomerEntity(dto.getId(),
                dto.getTitle(),
                dto.getName(),
                dto.getDob(),
                dto.getSalary(),
                dto.getAddress(),
                dto.getCity(),
                dto.getProvince(),
                dto.getZip());
        if (customerDao.update(ce)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        if(customerDao.delete(id)){
            return "Successfully Deleted";
        }else{
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
         CustomerEntity ce = customerDao.get(id);
         return  new CustomerDto(ce.getId(),
                ce.getTitle(),
                ce.getName(),
                ce.getDob(),
                ce.getSalary(),
                ce.getAddress(),
                ce.getCity(),
                ce.getProvince(),
                ce.getZip());
                
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        
         ArrayList<CustomerDto> customerDtos = new ArrayList<>();
         ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();
         
         for(CustomerEntity entity : customerEntitys){
            CustomerDto dto = new CustomerDto(entity.getId(), 
                    entity.getTitle(), 
                    entity.getName(),
                    entity.getDob(), 
                    entity.getSalary(), 
                    entity.getAddress(), 
                    entity.getCity(), 
                    entity.getProvince(), 
                    entity.getZip());
            customerDtos.add(dto);
         }
         return customerDtos;
         
    }

}
