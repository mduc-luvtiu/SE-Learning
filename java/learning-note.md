# NOTE HỌC JAVA CÙNG MAI ĐỨC
## I. Cài đặt môi trường
Cài theo thứ tự: 
- Java Development Kit (JDK) tại link: [Java Download - Oracle](https://www.oracle.com/java/technologies/downloads/?er=221886)
    - Chọn hệ điều hành (windows), bản x64 Installer. 
    - Tiến hành chạy dưới quyền admin, nhớ copy đường dẫn lưu thư mục. 
- IntelliJ (IDE) bản Community.
- Visual Studio Code (Code Editor), cải bộ Extensions cho Java. 
- Config trong file setting.json để code bằng VS Code: 
~~~
"java.configuration.runtimes": [
    {
    "name": "JavaSE-1.8",
    "path": "/path/to/jdk-8",
    },
]
~~~
- Tạo dự án: `Ctrl + Shift + P`, sau đó: `Create Java Project`
**Chạy Java trên Terminal:**
- Build: `javac ` + [Tên file.java]. VD: `javac App.java`
- Run: `java ` + [Tên file]. VD: `java App`

***

## II. Kiểu dữ liệu, biến

### 1. Kiểu dữ liệu
- Các kiểu dữ liệu chính
    - Kiểu số: 
        - `int` : Số nguyên - 4 byte. 
        - `long` : số nguyên - 8 byte. (Xài thêm hậu tố `L` : 30000L)
        - `float` : số thực - 4 byte (thêm hậu tố `F`: 3.1F)
        - `double` : số thực - 8 byte
    - Kiểu chữ: 
        - `char` : ký tự - 2 byte - định dạng Unicode 
        - `String` : chuỗi ký tự (chuỗi các ký tự)
    - Kiểu logic:
        - `boolean` : 2 giá trị `true` và `false`

### 2. Biến
- Biến là vùng RAM được đặt tên, chiếm 1 số byte tuỳ loại dữ liệu, thông tin mà nó chứa.
- Biến là cách đặt tên cho 1 đại lượng / giá trị - đơn / phức.
- Mọi con số, ký tự xuất hiện trong code được gọi là literal value.
- `0xFA`: Hệ 16 HEX, `076`: 0 đứng đầu mặc định là hệ 8 OCT. 
> Tip bật gợi ý trong VS Code: `Ctrl + Space`
