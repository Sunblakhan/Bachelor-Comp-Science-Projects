#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	float A, C, B, D, E, F, G, H, I, J;
	printf("Enter the number of shares that Joe purchased=");
	scanf("%f", &A);
	/* numberofsharesjoepurchased= A*/
	printf("Enter the amount per share when purchased=");
	scanf("%f", &B);
	/*amountpersharewhenpurchased=B*/
	printf("Enter the number of shares that Joe sold=");
	scanf("%f", &C);
	/*numberofsharesjoesold=C*/
	printf("Enter the amount per share when sold=");
	scanf("%f", &D);
	/* amountpersharewhensold= D*/
	printf("Enter the commission percentage of stockbroker=");
	scanf("%f", &E);
	/* commissionpercentagewhenpurchased= E*/
	printf("\namount of money Joe paid for the total stock= %f", F=A*B);
	/* amountofmoneyJoepaidforthetotalstock=F*/
	printf("\nAmount that Joe paid his stockbroker on stock purchased time= %f", G= F* E /100 );
	/* AmountthatJoepaidhisstockbrokeronstockpurchasedtime = G*/
	printf("\namount of money Joe got for total stock when sold= %f", H= C* D);
	/* amountofmoneyJoegotfortotalstockwhensold= H*/
	printf("\nAmount that Joe paid his stockbroker on stock sold time= %f", I= H * E /100);
	/* AmountthatJoepaidhisstockbrokeronstocksoldtime= I*/
	printf("\nAmount of money joe had left with= %f",J= H-F-G-I);
	/* Amountofmoneyjoehadleftwith= J*/
	if(J > 0)
	printf("\nJoe made Profit");
	else
	printf("\nJoe made Loss");
	
	
	return 0;
}
