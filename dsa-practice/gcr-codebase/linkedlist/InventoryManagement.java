class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryLinkedList {
    ItemNode head;

    // Add at beginning
    void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position
    void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove item by ID
    void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed");
        }
    }

    // Update quantity
    void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by ID or Name
    void search(String key) {
        ItemNode temp = head;
        while (temp != null) {
            if (String.valueOf(temp.itemId).equals(key) ||
                temp.itemName.equalsIgnoreCase(key)) {

                System.out.println("Item Found:");
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Calculate total inventory value
    double calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        return total;
    }

    // Display inventory
    void displayAll() {
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    void displayItem(ItemNode item) {
        System.out.println("----------------------");
        System.out.println("ID: " + item.itemId);
        System.out.println("Name: " + item.itemName);
        System.out.println("Quantity: " + item.quantity);
        System.out.println("Price: " + item.price);
    }

    // ================= SORTING (MERGE SORT) =================

    void sortByName(boolean ascending) {
        head = mergeSort(head, "name", ascending);
    }

    void sortByPrice(boolean ascending) {
        head = mergeSort(head, "price", ascending);
    }

    private ItemNode mergeSort(ItemNode node, String key, boolean asc) {
        if (node == null || node.next == null)
            return node;

        ItemNode mid = getMiddle(node);
        ItemNode nextMid = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(node, key, asc);
        ItemNode right = mergeSort(nextMid, key, asc);

        return merge(left, right, key, asc);
    }

    private ItemNode merge(ItemNode a, ItemNode b, String key, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (key.equals("name")) {
            condition = asc ?
                a.itemName.compareToIgnoreCase(b.itemName) <= 0 :
                a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }

        if (condition) {
            a.next = merge(a.next, b, key, asc);
            return a;
        } else {
            b.next = merge(a, b.next, key, asc);
            return b;
        }
    }

    private ItemNode getMiddle(ItemNode node) {
        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
public class InventoryManagement {
    public static void main(String[] args) {
        InventoryLinkedList inv = new InventoryLinkedList();

        inv.addAtEnd(101, "Laptop", 5, 60000);
        inv.addAtEnd(102, "Mouse", 20, 500);
        inv.addAtBeginning(103, "Keyboard", 10, 1500);

        inv.displayAll();

        inv.updateQuantity(102, 25);
        inv.search("Mouse");

        System.out.println("Total Inventory Value: " + inv.calculateTotalValue());

        inv.sortByName(true);
        System.out.println("\nSorted by Name (Ascending):");
        inv.displayAll();

        inv.sortByPrice(false);
        System.out.println("\nSorted by Price (Descending):");
        inv.displayAll();
    }
}

