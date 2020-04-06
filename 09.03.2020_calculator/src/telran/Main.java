package telran;

import static telran.Calculator.*;
import static telran.Dialog.*;

public class Main {

    public static void main(String[] args) {

        double a = getParameter();
        char operation = operationChoice();
        double b = getParameter();
        calculation(a, b, operation);

    }

}
