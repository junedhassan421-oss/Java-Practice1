package _14_Oops;
class  Sqr{
        int side;
        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }

    }
 public class CWH38 {
    /*static class  Sqr{
        int side;
        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }

    }*/
    public static void main(String[] args) {
        Sqr  sq = new Sqr();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
