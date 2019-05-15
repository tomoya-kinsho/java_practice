abstract class Figure {
    abstract double calcurate_menseki();
}

class Circle extends Figure {
    int hankei;

    Circle(int hankei) {
        this.hankei = hankei;
    }

    double calcurate_menseki() {
        return this.hankei * this.hankei * 3.14;
    }

}

class Triangle extends Figure {
    int tate;

    Triangle(int tate) {
        this.tate = tate;
    }

    double calcurate_menseki() {
        return this.tate * this.tate * 0.5;
    }

}

class Square extends Figure {
    int tate;

    Square(int tate) {
        this.tate = tate;
    }

    double calcurate_menseki() {
        return this.tate * this.tate;
    }
}

class UseFigure {
    public static void main(String[] args) {
        Figure circle = new Circle(22);
        Figure triangle = new Triangle(10);
        Figure square = new Square(30);
        Figure[] array = { circle, triangle, square };
        for (Figure figure : array) {
            System.out.println(figure.calcurate_menseki());
        }
    }
}