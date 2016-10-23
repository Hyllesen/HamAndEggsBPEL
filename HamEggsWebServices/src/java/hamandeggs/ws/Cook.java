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
@WebService(serviceName = "Cook")
public class Cook {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "breakEgg")
    public boolean breakEgg(@WebParam(name = "numberOfEggs") int numberOfEggs) {
        for (int i = 0; i < numberOfEggs; i++) {
            System.out.println("Breaking egg:" + i);
        } 
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bake")
    public boolean bake(@WebParam(name = "seconds") int seconds) {
        System.out.println("Ventilating seconds:" + seconds);
        return true;
    }
}
