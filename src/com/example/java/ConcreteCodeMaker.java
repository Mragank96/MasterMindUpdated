package com.example.java;

public class ConcreteCodeMaker implements CodeMaker {
    private final String ans1;
    String ans2;
    String ans3;
    String ans4;
    //Colour colour;

    public ConcreteCodeMaker(String ans1, String ans2, String ans3, String ans4) {
        //public ConcreteCodeMaker(String ans1, String ans2, String ans3, String ans4, Colour colour)
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
      //  this.colour = colour;
    }

    @Override
    public void update(String a, String b, String c, String d){
   // public void update(){
        if(a.equalsIgnoreCase(this.ans1) && this.ans2.equalsIgnoreCase(b)  && this.ans3.equalsIgnoreCase(c) && this.ans4.equalsIgnoreCase(d)){
            System.out.println("It's Matching");
        }
        else{

                System.out.println("not matching and binary value is");
                String[] input = new String[4];

                input[0] = a;
                input[1] = b;
                input[2] = c;
                input[3] = d;

                String[] ans = new String[4];
                ans[0] = this.ans1;
                ans[1] = this.ans2;
                ans[2] = this.ans3;
                ans[3] = this.ans4;


                for (int i = 0; i < 4; i++) {
                    if (input[i].equalsIgnoreCase(ans[i])) {
                        System.out.println("1");
                    } else {
                        for (int j = 0; j < 4; j++) {
                            if (input[i].equalsIgnoreCase(ans[j + 1])) {
                                System.out.println("0");
                                j++;
                            }
                        }

                    }
                }

            System.out.println("Sorry your chances are over");
        }
    }
}
