package ch7.Ex;

class Exercise7_23 {
    static double sumArea(Shape[] arr){
        double PI = 3.141592;
        double total = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] instanceof Circle){
                Circle c = (Circle) arr[i];
                double wide = PI * c.r * c.r;
                total += wide;
            }
            if(arr[i] instanceof Rectangle){
                Rectangle r = (Rectangle) arr[i];
                double wide = r.height * r.width;
                total += wide;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합:"+sumArea(arr));
    }
}
