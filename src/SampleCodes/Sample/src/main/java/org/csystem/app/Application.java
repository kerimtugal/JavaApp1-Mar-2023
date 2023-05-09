/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import com.karandev.util.console.Console;

class Application {
    public static void run(String [] args)
    {
        Sample.foo(10L, 10L); //error: uygun (applicable) metot yok
    }
}

class Sample {
    public static void foo(long a, int...b)//#1
    {
        Console.writeLine("foo, long, int...");
    }

    public static void foo(int a, long...b) //#2
    {
        Console.writeLine("foo, int, long...");
    }
}