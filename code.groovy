#include <stdio.h>

int isLuckyNumber(int number) {
    int lastDigit = number % 10;  // Lấy chữ số cuối cùng
    while (number > 0) {
        int currentDigit = number % 10;
        if (currentDigit != lastDigit) {
            return 0;  // Nếu có chữ số khác biệt thì không phải số hay
        }
        number /= 10;  // Chuyển sang chữ số tiếp theo
    }
    return 1;  // Nếu tất cả các chữ số đều giống nhau thì là số hay
}

int main() {
    int num;
    
    // Nhập vào số
    printf("Nhap vao so: ");
    scanf("%d", &num);
    
    // Kiểm tra số hay hay không
    if (isLuckyNumber(num)) {
        printf("%d la so hay.\n", num);
    } else {
        printf("%d khong phai la so hay.\n", num);
    }
    
    return 0;
}
