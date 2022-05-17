public class Order {
    // Khai bao 1 hằng số: số lượng sản phẩm tối đa cho đơn hàng
    public static final int MAX_NUMBER_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    public static int nbOrders = 0;
    // Khai báo 1 mảng các đối tượng DVD
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    // Khai báo thuộc tính chứa số lượng sản phẩm hiện có trong đơn hàng
    private int qtyOrdered = 0;
    MyDate dateOrdered;

    // Các phương thức getter setter

    public int getQtyOrdered() {
        return this.qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        if (qtyOrdered >= 0) {
            this.qtyOrdered = qtyOrdered;
        }
    }

    public Order(){
        if( nbOrders < MAX_LIMITED_ORDERS)
        {
            nbOrders += 1;
            dateOrdered = new MyDate();
        }
        else
        {
            System.out.println("Maxinum limit!");
        }
    }

    public String getDateOrdered(){
        return dateOrdered.getDay() + "-" + dateOrdered.getMonth() + "-" + dateOrdered.getYear();
    }

    // Phương thức thêm một đối tượng DVD vào đơn hàng
    // Chính là thêm một đối tượn tượng DVD vào mảng
    // ==> phải kiểm tra xem mảng đã bị đầy chưa
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (this.qtyOrdered == MAX_NUMBER_ORDERED) {
            System.out.println("Full!");
        } else {
            itemOrdered[this.qtyOrdered] = disc;
            this.qtyOrdered++;
            System.out.println("Success!");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList)
    {
        if(this.qtyOrdered + dvdList.length > MAX_NUMBER_ORDERED) {
            System.out.println("Full!");
        } else {
            for(int i = 0; i < dvdList.length ; i++)
            {
                this.addDigitalVideoDisc(dvdList[i]);
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2 )
    {   
        if(this.qtyOrdered + 2 <= MAX_NUMBER_ORDERED) {
            this.addDigitalVideoDisc(dvd1);
            this.addDigitalVideoDisc(dvd2);
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        DigitalVideoDisc[] discOrderTemp = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
        int index = 0;
        int count = 0;
        if (this.qtyOrdered == 0) {
            System.out.println("Nothing in your order list");
        } else {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemOrdered[i] == disc) {
                    index = i;
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Haven't any item that you want to delete in your order list");
            } else {
                qtyOrdered = qtyOrdered - 1;
                for (int i = index; i < qtyOrdered; i++) {
                    itemOrdered[i] = itemOrdered[i + 1];
                }
                System.out.println("Delete successed");
            }
        }
    }

    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < this.qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }

    public void print(){
        System.out.println("*************************Order*************************");
        System.out.println("Date : " + getDateOrdered());
        System.out.println("Ordered items :");
        for ( int i = 0 ; i < qtyOrdered ; i++)
        {
            System.out.println((i+1) + " DVD - " + itemOrdered[i].getTitle() + " - " + itemOrdered[i].getCategory()
                                + " - " + itemOrdered[i].getDirector() + " - " + itemOrdered[i].getLength() + " - " + itemOrdered[i].getCost());

        }
        System.out.println("Total cost : " + totalCost());
        System.out.println("******************************************************");
    }
}
