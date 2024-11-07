public class Balanceador {

    public static String verificarBalanceo(String expresion) {
        Pila pila = new Pila();

        if (expresion.isEmpty()) {
            return "No ingresaste ninguna expresion";
        }

        for (int j = 0; j < expresion.length(); j++) {
            char e = expresion.charAt(j);
            if (e != '(' && e != ')' && e != '{' && e != '}' && e != '[' && e != ']') {
                return "No ingresaste una expresion valida";
            }
        }
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

                if (c == '(' || c == '{' || c == '[') {
                    pila.push(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (pila.estaVacia()) {
                        return "No balanceada";
                    }
                    char tope = pila.pop();

                    if ((c == ')' && tope != '(') ||
                            (c == '}' && tope != '{') ||
                            (c == ']' && tope != '[')) {
                        return "No balanceada";
                    }
                }
        }
        return pila.estaVacia() ? "Balanceada" : "No balanceada";
    }
}

