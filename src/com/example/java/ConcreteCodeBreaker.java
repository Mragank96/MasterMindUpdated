package com.example.java;

public class ConcreteCodeBreaker implements CodeBreaker {
   /*String check1;
   String check2;
   String check3;
   String check4;*/
    CodeMaker codeMaker;
   // Colour colour;

    //public ConcreteCodeBreaker(String check1, String check2, String check3, String check4, CodeMaker codeMaker) {
    public ConcreteCodeBreaker(CodeMaker codeMaker){

        /*this.check1 = check1;
        this.check2 = check2;
        this.check3 = check3;
        this.check4 = check4;
*/        this.codeMaker = codeMaker;
    //this.colour = colour;
    }




    @Override
    public void OneChance(String a, String b, String c, String d, CodeMaker codeMaker) {
        codeMaker.update(a,b,c,d);

    }
}

