public class Main {
    public static void main(String[] args) {
        boolean rememberMe = false;

        boolean isTheSunShining = false;

        int cowMilkPrice = 12;
        int veganMilkPrice = 14;

        System.out.println(cowMilkPrice == veganMilkPrice);
        System.out.println(cowMilkPrice != veganMilkPrice);
        boolean isCowMilkMoreExpensiveThanVeganMilk = cowMilkPrice > veganMilkPrice;
        System.out.println(isCowMilkMoreExpensiveThanVeganMilk);
        System.out.println(cowMilkPrice < veganMilkPrice);

        System.out.println("hej" == "hej");
        System.out.println("hej" == "hejs®");

        //
        System.out.println("logical operators and");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println("logical operators or");
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);


        System.out.println("real world example");
        boolean isPostPublic = false;
        boolean isFriendOfPostCreator = true;
        boolean canUserComment = isPostPublic || isFriendOfPostCreator;
        System.out.println(canUserComment);

        
    }
}
