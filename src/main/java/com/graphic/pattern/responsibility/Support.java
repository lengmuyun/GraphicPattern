package com.graphic.pattern.responsibility;

public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public final void loopSupport(Trouble trouble) {
        Support support = this;
        while (support != null && !support.resolve(trouble)) {
            if (support.next != null) {
                support = support.next;
            } else {
                fail(trouble);
                support = null;
            }
        }
        if (support != null) support.done(trouble);
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);
}
