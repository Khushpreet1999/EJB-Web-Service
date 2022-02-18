package com.example;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Stateless;

/**
 *
 * @author khushpreetkaurgulati
 */
@Stateless
public class Week4 implements Week4Local {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
@Lock(LockType.READ)

public double calculate(double a)
{
double result = (a-32) / 1.8;

return result;
}
}
