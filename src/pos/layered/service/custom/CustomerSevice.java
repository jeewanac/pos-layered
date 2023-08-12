/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.service.custom;

import pos.layered.dto.CustomerDto;
import pos.layered.service.SuperService;

/**
 *
 * @author HP
 */
public interface CustomerSevice extends SuperService{
    String addCustomer(CustomerDto customerDto)throws Exception;
}
