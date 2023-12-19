package com.employee.employee.service;


import com.employee.employee.DTO.CustomerDTO;
import com.employee.employee.DTO.CustomerSaveDTO;
import com.employee.employee.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomer();

    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);
}
