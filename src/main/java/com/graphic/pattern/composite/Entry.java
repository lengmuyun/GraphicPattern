package com.graphic.pattern.composite;

import java.util.Stack;

public abstract class Entry {

    protected Directory parent;

    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

    public String getFullName() {
        Entry entry = this;
        Stack<String> nameStack = getNameStack(entry);
        return getFullName(nameStack);
    }

    private String getFullName(Stack<String> nameStack) {
        StringBuilder sb = new StringBuilder();
        while (!nameStack.isEmpty()) {
            String name = nameStack.pop();
            sb.append("/" + name);
        }
        return sb.toString();
    }

    private Stack<String> getNameStack(Entry entry) {
        Stack<String> entryName = new Stack<>();
        entryName.push(getName());
        while (entry.parent != null) {
            entryName.push(entry.parent.getName());
            entry = entry.parent;
        }
        return entryName;
    }

}
