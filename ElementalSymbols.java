import java.util.Scanner;
public class ElementalSymbols {
    // http://redd.it/z6o4k
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the string.");
        String input = in.nextLine().toLowerCase();
        String[] elements = {"Ac","Ag","Al","Am","Ar","As","At","Au",
        "B","Ba","Be","Bh","Bi","Bk","Br","C","Ca","Cd","Ce","Cf","Cl",
        "Cm","Cn","Co","Cr","Cs","Cu","Db","Ds","Dy","Er","Es","Eu","F",
        "Fe","Fl","Fm","Fr","Ga","Gd","Ge","H","He","Hf","Hg","Ho","Hs",
        "I","In","Ir","K","Kr","La","Li","Lr","Lu","Lv","Md","Mg","Mn",
        "Mo","Mt","N","Na","Nb","Nd","Ne","Ni","No","Np","O","Os","P",
        "Pa","Pb","Pd","Pm","Po","Pr","Pt","Pu","Ra","Rb","Re","Rf",
        "Rg","Rh","Rn","Ru","S","Sb","Sc","Se","Sg","Si","Sm","Sn","Sr",
        "Ta","Tb","Tc","Te","Th","Ti","Tl","Tm","U","Uuo","Uup","Uus",
        "Uut","V","W","Xe","Y","Yb","Zn","Zr"};
        int i, numElements = elements.length;
        for( i=0;i<numElements;i++ ){
            if( input.contains(elements[i].toLowerCase()) ){
                highlight(input, elements[i]);
            }
        }
    }
    public static void highlight( String text, String highlighter){
        int l = highlighter.length();
        int begin = text.indexOf(highlighter.toLowerCase());
        String highlighted = text.substring(0,begin)+"["+highlighter+"]"
                             +text.substring(begin+l);
        System.out.println(highlighted);
    }
}
