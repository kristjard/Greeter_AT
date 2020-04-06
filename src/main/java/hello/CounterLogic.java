package hello;


public class CounterLogic{

    static String string = GetInput.getInput();

    public static String charDetector()
    {
        String vastus1 = "" + "only letters";
        String vastus2 = "numbers";
        String vastus3 = "special characters";
        String vastus4 = "We are on a strictly first name basis here, only one name per person allowed. If you really" +
                " can't go a frickin day with out using all of your names, then string them together with a goddamned" +
                " underscore!!!";
        String vastus = "";

        int i = 0;
        boolean only_ltrs = false;
        boolean also_nrs = false;
        boolean also_specials = false;
        boolean spacebar = false;
        for(i=0; i < string.length(); i++){

            if (string.charAt(i) >= 65 && string.charAt(i) <= 90
                    || string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                only_ltrs = true;

            }
            else if (string.charAt(i)==32){
                spacebar = true;
            }
            else if (string.charAt(i) >= 48 && string.charAt(i) <= 57) {
                also_nrs = true;
                only_ltrs = false;
            }
            else {
                also_specials = true;
                only_ltrs = false;

            }


        }

        if(only_ltrs &&! spacebar &&! also_nrs &&! also_specials){
            vastus = vastus1;
        }
        else if(also_nrs &&! also_specials &&! spacebar){
            vastus = vastus2;
        }
        else if(also_nrs && also_specials &&! spacebar){
            vastus = vastus3 + " and " + vastus2;
        }
        else if(spacebar){
            vastus = vastus4;
        }
        else{
            vastus = vastus3;
        }
        return vastus;
    }
    public static int charCounter(){
        int j =0;
        int count=0;
        for(j=0; j< string.length(); j++){
            if (string.charAt(j) != ' '){
                count++;
            }
        }return count;
    }





}
