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

    public final Type type;
    public final String c;
    public final String value;

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
        DO,
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
        PERIOD,
        EOF
    }

    public Token(Type t, String c) {
        this.type = t;
        this.c = c;
        this.value = null;
    }

    public Token(Type t, String c, String v) {
        this.type = t;
        this.c = c;
        this.value = v;
    }

}
