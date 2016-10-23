/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamandeggs.ws;

import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author stefan
 */
@WebService(serviceName = "Cleaner")
public class Cleaner {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "washDishes")
    public boolean washDishes(@WebParam(name = "numberOfDishes") int numberOfDishes) {
        System.out.println("Washing dishes: " + numberOfDishes);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ventilateAir")
    public boolean ventilateAir(@WebParam(name = "secondsToVentilate") int secondsToVentilate) {
        System.out.println("Ventilating air, seconds: " + secondsToVentilate);
        return true;
    }
}
