package com.uci.compiler.common.exp;

/**
 * Created by junm5 on 3/29/17.
 */
public class PairExpList extends ExpList {
    public Exp head;
    public ExpList tail;

    public PairExpList(Exp head, ExpList tail) {
        this.head = head;
        this.tail = tail;
    }
}
