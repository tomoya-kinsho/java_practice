class Product {
    int price;

    void showPrice() {
        System.out.println("価格" + price + "円");
    }

    Product(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Product product1 = new BookProduct("raira", "tomya_company", 2000);
        product1.showPrice();

        BookProduct product2 = (BookProduct) product1;
        product2.showPrice();

    }
}


class BookProduct extends Product {
    String title;
    String company;

    void showBook() {
        System.out.println(this.title);
        System.out.println(this.company);
        System.out.println(this.price);
    }

    // 親と同じメソッドを定義している。（メソッドのオーバーライドをしている）
//    オーバーライドは、参照型変数に依存しないので、newで作られたインスタンスの実体の方のメソッドが呼び出される。
    void showPrice() {
        System.out.println("本の本体価格は、" + price + "円でございます。");
    }

    BookProduct(String title, String company, int price) {
        super(price);
        this.title = title;
        this.company = company;
    }
}
