public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return this.title;
    }

    public void setTiltle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else
            this.length = 0;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        if (cost > 0) {
            this.cost = cost;
        } else
            this.cost = 0.0f;
    }

    // Các phương thức khởi tạo
    // Đặc điểm của constructor:
    // ++ tên trùng với tên lớp
    // ++ không có kiểu trả về, không có void
    // ++ xây dựng nhiều constructor giúp khởi tạo
    // ++ đối tượng từ lớp theo nhiều cách khác nhau

    public DigitalVideoDisc() {
        this.title = "";
        this.category = "";
        this.director = "";
        this.length = 0;
        this.cost = 0.0f;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public DigitalVideoDisc(String title, String category, String director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public void printInfo() {
        System.out.println("------------DVD Information------------");
        System.out.println("Title is: " + this.title);
        System.out.println("Category is: " + this.category);
        System.out.println("Director is: " + this.director);
        System.out.println("Length is: " + this.length);
        System.out.println("Cost is: " + this.cost);
    }
}
