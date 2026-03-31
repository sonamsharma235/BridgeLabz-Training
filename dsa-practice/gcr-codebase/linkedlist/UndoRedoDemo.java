class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
    }
}

class TextEditor {
    private TextState head, tail, current;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add new state
    void addState(String text) {
        TextState newNode = new TextState(text);

        // Remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        // Limit history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo
    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // Redo
    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    // Display current state
    void displayCurrent() {
        if (current != null)
            System.out.println("Current Text: " + current.content);
        else
            System.out.println("Editor empty.");
    }
}

public class UndoRedoDemo {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.displayCurrent();

        editor.undo();
        editor.displayCurrent();

        editor.undo();
        editor.displayCurrent();

        editor.redo();
        editor.displayCurrent();

        editor.addState("Hello Java");
        editor.displayCurrent();
    }
}
