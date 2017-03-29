package com.uci.compiler.common.exp;

import com.uci.compiler.common.Stm.Stm;

/**
 * Created by junm5 on 3/29/17.
 */
public class EseqExp extends Exp {
    public Stm stm;
    public Exp exp;

    public EseqExp(Stm stm, Exp exp) {
        this.stm = stm;
        this.exp = exp;
    }
}
