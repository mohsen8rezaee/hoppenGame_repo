public class RandomNums {


    public static int getRandomNumber(int min, int max) {
        return (int)((Math.random() * (max - min)) + min);
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++){
//            System.out.println(getRandomNumber(1,4));
//        }
//    }


}
