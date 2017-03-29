package com.uci.compiler.common.Stm;

import com.uci.compiler.common.exp.ExpList;

/**
 * Created by junm5 on 3/29/17.
 */
public class PrintStm extends Stm {
    public ExpList exps;

    public PrintStm(ExpList exps) {
        this.exps = exps;
    }
}
