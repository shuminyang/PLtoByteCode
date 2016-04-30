/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pltobytecode;

/**
 *
 * @author Shu
 */
public class Token {

    public final Type t;
    public final String c;
    public final String v;
    int type;

    public static enum Type {

        PROGRAM,
        ID,
        SC,
        BEGIN,
        END,
        PROCEDURE,
        VAR,
        COMMA,
        ATTR_OP,
        CALL,
        PRINT,
        WHILE,
        IF,
        THEN,
        ELSE,
        SUB_OP,
        SUM_OP,
        DIV_OP,
        MULT_OP,
        L_PAR,
        R_PAR,
        INT,
        OR,
        AND,
        NOT,
        EQ,
        HT,
        LT,
        HET,
        LET,
        DIFF,
        EOF
    }

    public Token(Type t, String c) {
        this.t = t;
        this.c = c;
        this.v = null;
    }

    public Token(Type t, String c, String v) {
        this.t = t;
        this.c = c;
        this.v = v;
    }

}
