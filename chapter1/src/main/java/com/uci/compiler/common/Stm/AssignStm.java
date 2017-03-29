package com.uci.compiler.common.Stm;

import com.uci.compiler.common.exp.Exp;

/**
 * Created by junm5 on 3/29/17.
 */
public class AssignStm extends Stm{
    public String id;
    public Exp exp;

    public AssignStm(String id, Exp exp) {
        this.id = id;
        this.exp = exp;
    }
}
