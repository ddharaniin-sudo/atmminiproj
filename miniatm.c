#include <stdio.h>
int main() {
    int ch;
    float bal = 3000.0; // initial balance
    float a;
    while (1) {
        printf("\n\tATM\t\n");
        printf("Check Balance\n");
        printf("Deposit Money\n");
        printf("Withdraw Money\n");
        printf("Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &ch);
        switch (ch) {
            case 1:
                printf("Your balance is: %.2f\n", bal);
                break;
            case 2:
                printf("amount to deposit: ");
                scanf("%f", &a);
                if (a > 0) {
                    bal += a;
                    printf("Deposited New balance: %.2f\n", bal);
                } else {
                    printf("Invalid deposit amount.\n");
                }
                break;
            case 3:
                printf("amount to withdraw: ");
                scanf("%f", &a);
                if (a > 0 && a <= bal) {
                    bal -= a;
                    printf("Withdrawal New balance: %.2f\n", bal);
                } else {
                    printf("Invalid withdrawal amount.\n");
                }
                break;
            case 4:
                printf("Thank you\n");
                return 0;
            default:
                printf("Invalid choice.\n");
        }
    }
}
