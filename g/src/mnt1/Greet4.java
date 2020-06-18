package mnt1;

import core.app.mnt.Greet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Greet4 {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Greet.print(); //exports & requires

        Greet.class.getDeclaredMethods();

        Method m = Greet.class.getDeclaredMethod("get"); //get is private
        m.setAccessible(true); //opens
        m.invoke(new Greet());

    }
}
