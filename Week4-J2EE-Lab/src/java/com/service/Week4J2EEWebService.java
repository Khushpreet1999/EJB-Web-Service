/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.example.Week4Local;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author khushpreetkaurgulati
 */
@WebService(serviceName = "Week4J2EEWebService")
public class Week4J2EEWebService {

    @EJB
    private Week4Local ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "calculate")
    public double calculate(@WebParam(name = "a") double a) {
        return ejbRef.calculate(a);
    }
    
}
