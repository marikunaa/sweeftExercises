import java.util.HashMap;
public class Exercise6<T> {

        private class Node {
            T data;
            Node prev;
            Node next;

            Node(T data) {
                this.data = data;
            }
        }

        HashMap<T, Node> elementMap;
        private Node head;
        private Node tail;

        public Exercise6() {
            elementMap = new HashMap<>();
            head = new Node(null); // Dummy head node
            tail = new Node(null); // Dummy tail node
            head.next = tail;
            tail.prev = head;
        }

        public void add(T element) {
            if (!elementMap.containsKey(element)) {
                Node newNode = new Node(element);
                elementMap.put(element, newNode);
                addToEnd(newNode);
            }
        }

        public boolean delete(T element) {
            Node nodeToDelete = elementMap.get(element);
            if (nodeToDelete != null) {
                removeNode(nodeToDelete);
                elementMap.remove(element);
                return true;
            }
            return false;
        }

        public T getRandom() {
            if (elementMap.isEmpty()) {
                throw new IllegalStateException("The data structure is empty.");
            }

            int randomIndex = (int) (Math.random() * elementMap.size());
            Node currentNode = head.next;
            for (int i = 0; i < randomIndex; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }

        public int size() {
            return elementMap.size();
        }

        public boolean isEmpty() {
            return elementMap.isEmpty();
        }

        private void addToEnd(Node node) {
            Node lastNode = tail.prev;
            lastNode.next = node;
            node.prev = lastNode;
            node.next = tail;
            tail.prev = node;
        }

        private void removeNode(Node node) {
            Node prevNode = node.prev;
            Node nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }


    }


