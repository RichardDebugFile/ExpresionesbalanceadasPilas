public class Pila {
    private Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void push(char dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;
    }

    public char pop() {
        if (estaVacia()) {
            throw new RuntimeException("Pila vacía");
        }
        char dato = tope.dato;
        tope = tope.siguiente;
        return dato;
    }

    public char peek() {
        if (estaVacia()) {
            throw new RuntimeException("Pila vacía");
        }
        return tope.dato;
    }
}
