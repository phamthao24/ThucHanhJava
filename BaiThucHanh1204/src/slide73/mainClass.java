package slide73;

import slide73.ToaDo;
public class mainClass {
    public static void main(String[]args){
    // Các thuộc tỉnh x, y này chỉ được truy xuất đến thông qua thể hiện toaDo1 
    ToaDo toaDo1 = new ToaDo();
    toaDo1.x=10;
    toaDo1.y = 20;

    // Các thuộc tỉnh x, ý này chỉ được truy xuất đến thông qua thể hiện toaDo2 
    ToaDo toaDo2 = new ToaDo();
        toaDo2.x = 5;
    toaDo2.y = 6;

    // Thuộc tỉnh thongTin lại được truy xuất đến thông qua lớp ToaDo 
    ToaDo.thongTin = "Lưu tọa độ các hình học";
    }
}