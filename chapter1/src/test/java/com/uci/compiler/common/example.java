package com.uci.compiler.common;

import com.uci.compiler.common.Stm.AssignStm;
import com.uci.compiler.common.Stm.CompoundStm;
import com.uci.compiler.common.Stm.PrintStm;
import com.uci.compiler.common.Stm.Stm;
import com.uci.compiler.common.exp.*;
import org.junit.Test;

/**
 * Created by junm5 on 3/29/17.
 */
public class example {
    @Test
    public void should_build_a_representaion_tree() throws Exception {
        // a = 5 + 3
        Exp opExp = new OpExp(new NumExp(5), OpExp.Plus, new NumExp(3));
        Stm prob = new AssignStm("a", opExp);

        //(a, a-1)
        PairExpList pairExpList = new PairExpList(new IdExp("a"), new LastExpList(new OpExp(new IdExp("a"), OpExp.Minus, new NumExp(1))));

        //b = (print(a, a-1), 10 * a)
        AssignStm stm1 = new AssignStm("b", new EseqExp(new PrintStm(pairExpList), new OpExp(new NumExp(10), OpExp.Times, new IdExp("a"))));

        //print b
        CompoundStm b = new CompoundStm(stm1, new PrintStm(new LastExpList(new IdExp("b"))));
        CompoundStm finalExp = new CompoundStm(prob, b);

    }

}
