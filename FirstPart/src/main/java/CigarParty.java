public class CigarParty {

    public static void main(String[] args) {
        System.out.println(cigarParty(5, false));
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) return cigars >= 40;
        else return cigars >= 40 && cigars <= 60;
    }
}
