package ProgramacionIII.final1908;

public class Ejercicio1 {
    class Node<T>{
        private T info;
        private int key;
        private Node<T>left, right;

        public Node(T info, int key) {
            this.info = info;
            this.key = key;
            this.right = null;
            this.left = null;
        }
    }
}
