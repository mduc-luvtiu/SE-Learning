# NOTE HỌC JAVA CÙNG MAI ĐỨC - Source: giáo.làng
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
- Biến là cách đặt tên cho 1 giá trị đơn giản (primitive) hoặc phức tạp (composite - complex - object)
    - Biến PRIMITIVE lưu giá trị ngay trong vùng nhớ được cấp (on/off của transistor sẽ biểu diễn giá trị cần lưu trữ)
    - Biến object trỏ thành vào cùng RAM dược tạo new. 
- Mọi con số, ký tự xuất hiện trong code được gọi là literal value.
- `0xFA`: Hệ 16 HEX, `076`: 0 đứng đầu mặc định là hệ 8 OCT. 
> Tip bật gợi ý trong VS Code: `Ctrl + Space`
> Làm đẹp code: `Alt Shift + F`

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
- `new` dùng để cấp vùng nhớ mới trong RAM (vùng nhớ object - vùng nhớ Encapsulation), nơi đây chứa toàn bộ thông tin của object bao gồm đặc điểm và hành vi được clone từ Khuôn-Class. Toán tử `new ...()` trả về địa chỉ vùng nhớ object new vừa tạo, và gửi địa chỉ này cho biến object/con trỏ giữ dùm. 

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

### 4. Static 
#### 4.1. Định nghĩa, đặc điểm
- Dữ liệu ăn theo thằng cuối cùng
- Vùng nhớ dùng chung cho tất cả các object (lưu tại class static zone), không nên xài riêng cho các object
- Dữ liệu được thay đổi theo cập nhật cuối cùng 
- Không sử dụng `static` cho những thứ của riêng từng object
- `static` chỉ chơi với `static` (chỉ gọi được biến `static` trong hàm `static`)
- `non-static` chơi được với cả hai loại
- Xài hàm `static` chuẩn nhất là gọi bằng class. VD: `Student.sayHi()`
- Do đó có 2 loại dấu chấm: 
    - Chấm trực tiếp qua tên class: dùng STATIC 
    - Chấm qua con đường new, đang chơi với NON-STATIC, dùng riêng cho từng object 

#### 4.2. 

## V. Xử lý code trong Java
### 1. Nhập dữ liệu từ bàn phím 
#### 1.1. Lạc trôi chữ
- Hiện tượng lạc trôi chữ: khi nhập số xong đến chuỗi (nhập số xong thì bị skip một lầm nextLine()). 
    - Khi nhập dữ liệu từ bàn phím, dữ liệu được lưu tạm thời trên buffer.
    - `nextLine()` lấy hết dữ liệu trên hàng, nhận tín hiệu khi người dùng enter.
    - Khi nhập số, để đọc sử dụng `nextInt()`, khi enter thì máy chỉ lấy số nguyên còn lại rác là `\n` nên sẽ bị skip 1 lần. 
- Giải pháp: Xoá bộ đệm trước khi nhập chuỗi:
    - Sử dụng: `sc.nextLine();` -> lấy rác và reset buffer. 
    - Đọc nextLine -> chuỗi số bằng: `yob = Integer.parseInt(sc.nextLine());`

#### 1.2. Try-Catch
- Sử dụng để tránh các tình huống máy không xử lý được (chia cho 0, nhập dữ liệu sai,...). 
- Mặc định (JVM - java virtual machine) giết app nếu có cà chớn xảy ra để đảm bảo an toàn cho app,...
- Try-Catch giúp báo cho JVM đừng dừng app, mà để người dùng tự xử, nhốt các lệnh cà chớn lại, SANDBOX

## VI. Tính chất trong OOP
### 1. Tính đóng gói - Encapsulation 
- Tính đóng gói của thông tin, hành động.
- Hàm và biến phải đi kèm với nhau và đại diện, mô tả cho một object, thực thể. 
- Các class đại diện cho sự đóng gói thông tin để mô tả cho một nhóm object, và mỗi object lại được đại diện bởi thông tin của nó trong class đó. 
- Dữ liệu không được cho phép truy cập trực tiếp từ bên ngoài, phải thông qua các cửa (`getInfo()`, `setInfo()`,...).
- Hàm gắn với đối tượng, class để xử lý những thông tin mà class đó đang chứa - ENCAPSULATION. 

### 2. 

## VII. Lưu trữ Object trong RAM
### 1. Code segment
- Lưu trữ thông tin class 

### 2. Heap segment 
- Lưu trữ thông tin các object
- Khi lệnh tạo mới `new` sẽ đọc tới vùng code segment, sau đó lưu data vào heap segment.
- Object / vùng `new` thì nằm trong heap-segment

### 3. Stack segment
- Lưu trữ thông tin tên object (đây là một con trỏ), nó trỏ tới cùng nhớ heap để lấy thông tin object. 
- Trong bước tạo object, sẽ lưu tên biến vào stack segment
- Biến khai báo trong hàm thì nằm trong stack segment 

## V. Recipe for Cooking a JAVA APP
### 1. Nhận diện, mô tả được các Object
- Nhận diện các Object trong bài toán qua đặc điểm (biến kèm value-data) và hành vi / hành động xử lý trên các đặc điểm đó.
- Ví dụ: đặc điểm **yob** thì có hàm **getAge()**,...

### 2. Nhận diện gom nhóm Object - Class 
- Gom những cụm Object chia sẻ chung các đặc điểm / hành vi nổi bật khác với các nhóm khác. 
- Ví dụ: Nhóm CaSi có đặc điểm nổi bật: baiHits. Nhóm chính là một dạng phân loại còn gọi là Class. 
- Thiết kế Class gồm các đặc điểm (biến chừa chỗ cho value) và hành vi (hàm xử lý các biến)

### 3. Tạo mới project, tạo mới Class
- Bắt buộc đặt ở một `package` nào đó. 

### 4. Tạo khoảng trống chừa chỗ trong class
- Khoảng trống chính là các đặc điểm của object trong tương lai sẽ được tạo ra hay đúc từ class ra. Được gọi là field/instance/variable/property/attribute/state/characteristic. Nên để chúng là **private** 

### 5. Tạo phễu / CONSTRUCTOR 
- Dùng để nhận vật liệu bên ngoài đổ vào các khoảng trống field trong Class để đúc đối tượng mới 
- Có nhiều constructor tương ứng với nhiều cách đúc tượng khác nhau 
- Phễu gọi kèm lệnh `new`, mỗi lần gọi phễu là mỗi lần `new` object được tạo ra. 

### 6. Tạo các hành động **getx(), setx()**
- Cho phép xem/lấy và sửa/cập nhật thông tin - value của đối tượng đã được tạo bằng `new`
- Các hàm này có thẻ gọi đi gọi lại nhiều lần nhưng phải đi kèm theo tên biến object và dấu CHẤM. 

### 7. Tạo hàm `toString()`
- Trả về / show ra hết thông tin đang có sẵn của các field được gán giá trị nằm trong object. 
- Có thể tuỳ chỉnh lại các hàm theo ý thích
- Tuyệt đối không được đổi tên hàm và kiểu trả về 

### 8. Tạo các hàm tự định nghĩa
- Những hàm này dùng để xử lý các thông tin mà object này sở hữu hay được đổ vào
- Nguyên tắc ENCAPSULATION - hàm thuộc về object

### 9. Đúc tượng / tạo object 
- Tại hàm `main()`, khai báo biến obejct thuộc Class vừa tạo. Sử dụng toán tử `new` để tạo vùng nhớ mới chứa thông tin object.
- Ví dụ: `Dog chiHu = new Dog("Chi Hu Hu", 2021, 0.5)`

### 10. Yêu cầu object làm gì đó qua dấu `.`
- Dùng dấu chấm qua biến object để trỏ tới các vùng nhớ được new.
- Sẽ gọi đến các hàm của object muốn tham chiếu. Hành động thuộc về object - ENCAPSULATION 

### 11. Chạy APP 
- Toàn bộ code của APP, gồm Class và các lệnh tạo object `new`, gọi hành động của object qua biến object CHẤM được tải vào vùng CODE segment trong RAM. 
- Lệnh `new ...()` sẽ clone khuôn / class vào vùng RAM HEAP segment để hình thành nên object với đầy đủ data và hàm xử lý data.
- Các lệnh gọi hàm của object sẽ lần lượt chạy để cho ra kết quả xử lý như đã thiết kế và lập trình. 

