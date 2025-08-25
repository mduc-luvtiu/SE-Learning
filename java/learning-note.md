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
- Có thể chia theo tầng phức tạp:
    - Kiểu đơn giản: primitive
    - Kiểu phức tạp: complex

### 2. Biến
- Biến là vùng RAM được đặt tên, chiếm 1 số byte tuỳ loại dữ liệu, thông tin mà nó chứa.
- Biến là cách đặt tên cho 1 đại lượng / giá trị - đơn / phức.
- Mọi con số, ký tự xuất hiện trong code được gọi là literal value.
- `0xFA`: Hệ 16 HEX, `076`: 0 đứng đầu mặc định là hệ 8 OCT. 
> Tip bật gợi ý trong VS Code: `Ctrl + Space`

## III. Hàm 
- Chia theo kiểu `return` thì có hai loại:
    - Hàm trả giá trị: `int`, `float`,...
    - Hàm không trả giá trị: `void`
- Chia theo kiểu đầu vào thì cũng có hai loại: 
    - Hàm nhận đầu vào
    - Hàm không nhận đầu vào
- Một trường hợp đặc biệt khi hai hàm trùng tên:
    - Báo lỗi nếu 2 hàm giống luôn cả thứ tự data type của các biến 
    - Nếu data type của đầu vào khác nhau, gọi là OVERLOAD / OVERLOADING. 

## IV. Object và Class 
### 1. Object
- Là một vật thể (trong đó có nhiều thuộc tính riêng của nó), có thể đếm, mô tả, phân biệt với các object khác. 

### 2. Class 
- Là 1 cách đại diện cho một nhóm các đối tượng theo 1 tiêu chí nào đó. 
- Khi có nhiều đối tượng, gom nhóm thành các class. 
- OOP là một kỹ thuật giúp lưu trữ, quản lý, xử lý các đối tượng.
    - Xây dựng khuôn mẫu (template) cho nhóm object, khi muốn tạo một đối tượng chỉ cần điền thông số cho khuôn mẫu.

### 3. Thành phần:
- Khuôn : template
- Đúc - tạo object : `constructor()` 
    - HÀM TẠO RA OBJECT. Là một hàm đặc điệt, không có giá trị trả về (không có `void` luôn). 
    - Hàm này nằm trong và có tên giống y chang class. 
    - Chỉ được gọi duy nhất một lần khi khởi tạo object
    - Có thể dùng `this.` để gọi lại các biến trong class: `this.name` 
- Xem sản phẩm : `getInfo()` 
    - METHOD giúp chỉ chia sẻ thông tin khi được hỏi. 
    - Vì các thông tin ở `private` do đó cần method để lấy dữ liệu giúp đảm bảo an toàn. 
- Chỉnh sửa sản phẩm : `setInfo()` 
    - METHOD giúp thay đổi info của object

## V. Tính chất trong OOP
### 1. Tính đóng gói - Encapsulation 
- Tính đóng gói của thông tin, hành động.
- Hàm và biến phải đi kèm với nhau và đại diện, mô tả cho một object, thực thể. 
- Các class đại diện cho sự đóng gói thông tin để mô tả cho một nhóm object, và mỗi object lại được đại diện bởi thông tin của nó trong class đó. 
- Hiển thị các thông tin cần thiết ra ngoài (`public`), không cho truy cập các thông tin bảo mật (`private`)

### 2. 

## VI. Lưu trữ Object trong RAM
