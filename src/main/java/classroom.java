import java.io.IOException;

public class classroom {
    private java.util.Arrays Arrays;

    public Integer KnowIt(String status) {
        if(status == "Yes I know") return 1;
        else return 0;
    }

    public String WhatKnowIt(String info){
        if(info.length() > 20) return "A lot";
        else return "A little";
    }

    public String HelloNerd(Integer iq){
        if(iq > 120) return "Such a nerd!";
        else return "Hah, noob!";
    }

    public String LemmeCalc(Integer num){
        int res = 100500;
        if(num == 0) return "You think I am dumb?";
        else while(num > 0) res += res / num;
        return "I may be wrong, but the answer is " + res;
    }

    public Integer LMAO(String reply){
        if(reply == "EZ") return 420;
        else return 31;
    }

    public String Details(String[] facts){
        if(Arrays.asList(facts).contains("I am a script kiddie")) return "Nice!";
        else return "Liar!";
    }

    public Integer Wassup(Integer state){
        if(state == 1) return 1;
        else return 100;
    }

    public double ShoppingListPrice(String[] list){
        if(Arrays.asList(list).contains("Chestnut")) return 10e9;
        else return 15;
    }

    public String Mood(Integer voltage){
        if(voltage == 220) return "WOW";
        else return "Meh";
    }

    public void BooBooExecute(String command){
        Runtime run = Runtime. getRuntime();
        try {
            Process pr = run.exec(command);
            pr.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
