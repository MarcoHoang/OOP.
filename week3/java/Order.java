public class Order {
    // Khai bao 1 hằng số: số lượng sản phẩm tối đa cho đơn hàng
    public static final int MAX_NUMBER_ORDERED = 10;
    // Khai báo 1 mảng các đối tượng DVD
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    // Khai báo thuộc tính chứa số lượng sản phẩm hiện có trong đơn hàng
    private int qtyOrdered = 0;

    // Các phương thức getter setter

    public int getQtyOrdered() {
        return this.qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        if (qtyOrdered >= 0) {
            this.qtyOrdered = qtyOrdered;
        }
    }

    // Phương thức thêm một đối tượng DVD vào đơn hàng
    // Chính là thêm một đối tượn tượng DVD vào mảng
    // ==> phải kiểm tra xem mảng đã bị đầy chưa
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered == MAX_NUMBER_ORDERED) {
            System.out.println("The order is almost full");
        } else {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Order successed");
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
}
