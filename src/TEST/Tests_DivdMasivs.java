package TEST;

import javax.swing.JOptionPane;

public class Tests_DivdMasivs {

    public static void main(String[] args) {
    	String[][] jaut = {
                {"Kas ir divdimensiju masīvs?", 
                 "Masīvs, kuram ir divi indeksi", 
                 "Masīvs, kuram ir tikai viens indekss", 
                 "Masīvs, kurš sastāv no trīsdimensiju masīviem", 
                 "Masīvs, kuram nav indeksu"},
                 
                {"Kā tiek identificēts divdimensiju masīva elements?", 
                 "Norādot tikai rindu numuru", 
                 "Norādot tikai kolonnas numuru", 
                 "Norādot rindu un kolonnas numuru", 
                 "Izmantojot viena indeksa vērtību"},
                 
                {"Kā var vizualizēt divdimensiju masīvu?", 
                 "Kā vienkāršu skaitļu sarakstu", 
                 "Kā tabulu ar rindu un kolonnu numuriem", 
                 "Kā koda fragmentu bez indeksiem", 
                 "Kā viena dimensijas masīvu"},
                 
                {"Kāda sintakse tiek izmantota divdimensiju masīva definēšanai?", 
                 "int masivs[] = new int[10];",
                 "int masivs[][] = new int[5][5];",
                 "int masivs = {1,2,3};",
                 "String masivs = \"Divdimensiju\";"},
                 
                {"Kas ir divdimensiju masīva pirmā indeksa nozīme?", 
                 "Nosaka kolonnu skaitu", 
                 "Nosaka datu tipu", 
                 "Nosaka rindu skaitu", 
                 "Nosaka masīva nosaukumu"},
                 
                {"Kas ir divdimensiju masīva otrā indeksa nozīme?", 
                 "Nosaka rindu skaitu", 
                 "Nosaka kolonnu skaitu", 
                 "Nosaka masīva tipu", 
                 "Nosaka masīva garumu"},
                 
                {"Kā var pārstaigāt visus elementus divdimensiju masīvā?", 
                 "Izmantojot divus for ciklus", 
                 "Izmantojot while ciklu", 
                 "Izmantojot do-while ciklu", 
                 "Izmantojot for each ciklu"},
                 
                {"Kā var noteikt divdimensiju masīva rindu skaitu?", 
                 "masivs.length", 
                 "masivs[0].length", 
                 "masivs.size()", 
                 "masivs.dimension()"},
                 
                {"Kāda ir noklusējuma vērtība divdimensiju masīva elementiem,\nja tas ir deklarēts kā int[][]?", 
                 "null", 
                 "1", 
                 "-", 
                 "0"},
                 
                {"Kā var piešķirt vērtību konkrētam divdimensiju masīva elementam?", 
                 "masivs[1][2] = 5;",
                 "masivs[1,2] = 5;",
                 "masivs[1.2] = 5;",
                 "masivs[1->2] = 5;"}
                 
            };

    	int[] parAtb =  {0, 2, 1, 1, 2, 1, 0, 0, 3, 0};
    	int par = 0;

        for (int i = 0; i < jaut.length; i++) {
            String options  = "";
            for (int j = 1; j <= 4; j++) {
             
            	options += j + ") " + jaut[i][j] +  "\n";
            }
            
            String input = JOptionPane.showInputDialog(
                jaut[i][0]  + "\n" + options + "\nTava atbilde (1-4):"
            );

            if (input == null) {
                System.exit(0);
            }

            
            int atb = -1;
            try {
                atb = Integer.parseInt(input);
                
            } catch (NumberFormatException e)  {
                JOptionPane.showMessageDialog(null,  "Ievadi skaitli no 1 līdz 4!");
                i--;
                continue;
            }

            if (atb >= 1 && atb <= 4) {
                if (atb - 1 == parAtb[i]) {
                    JOptionPane.showMessageDialog(null, "Pareizi!");
                    par++;
                } else {
                    JOptionPane.showMessageDialog(null, "Nepareizi!");
                }
                
            } else {
            	
                JOptionPane.showMessageDialog(null,  "Ievadi skaitli no 1 līdz 4!");
                i--;
            }
            
        }

        double procent =  (par / (double) jaut.length) * 100;
        
        JOptionPane.showMessageDialog(null,   "Pareizas atbildes: " + par + " no " + jaut.length + 
                                      "\nKopējais rezultāts: " + procent  + "%");
    }
}