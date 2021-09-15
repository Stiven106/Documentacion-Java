package functionalLambdas;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import functionalLambdas.models.Usuario;

public class LambdaPredicate {
public static void main(String[] args) {
    
    /*Predicate: evalua una expresion booleana*/

    Predicate<Integer> test = num -> num > 10;
    boolean r = test.test(7);

    /* Evaluar que el argumento ingresado sea igual a un valor previamente definido */
    Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
    System.out.println(t2.test("ROLE_ADMIN"));/* esto es true */

    /* Evaluar que 2 argumentos sean iguales, en este caso Strings */
    BiPredicate<String,String> t3 = (a,b) -> a.equals(b);
    BiPredicate<String,String> t3Simplificado = String::equals;
    System.out.println(t3Simplificado.test("andres", "andres")); /* True, son iguales */

    /* Evaluar que un numero sea mayor que otro */
    BiPredicate<Integer,Integer> t4 = (i,j) -> j > i;
    boolean r2 = t4.test(5, 10);/* i= 5, j=10. Si j es mayor que i, entonces true */
    System.out.println(r2);/* Imprime true debido a que la condicion es verdadera */

    /* Evaluar que los nombres sean iguales de 2 usuarios */
    Usuario a = new Usuario();
    Usuario b = new Usuario();
    a.setNombre("maria");
    b.setNombre("cata");
    BiPredicate<Usuario, Usuario> t5 = (ua, ub) -> ua.getNombre().equals(ub);
    System.out.println(t5.test(a, b));/* los nombres son distintos, por tanto, false */
    
}


}
