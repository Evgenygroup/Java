# include <stdio.h>
int main(){
	 int date;
	 int month;
	 int year;
	 int leap_year;
	 int flag;
	 char more;

do {

	do {  printf ("please enter  day in DD.MM.YYYY format \n");

	 printf ("please insert date\n");
	 fflush(stdout);
	 scanf ("%d", &date);
	 while (date<1 || date >31){
			 printf(" You have entered the wrong date. Please try again\n");
			 fflush(stdout);
			 scanf ("%d", &date);
	 	 }
	 printf ("please insert month\n");
	 fflush(stdout);
	 scanf ("%d", &month);
	 while (month<1 || month >12){
		 	 printf(" You have entered the wrong month. Please try again\n");
		 	 fflush(stdout);
		 	 scanf ("%d", &month);
	 }

	 printf ("please enter year\n");
				 fflush(stdout);
		 	 	 scanf ("%d", &year);
		 	 	 while (year<1 ){
		 		 	 printf(" You have entered the wrong year. Please try again\n");
		 		 	 fflush(stdout);
		 		 	 scanf ("%d", &month);

		 		 }
		 	    leap_year = year%4;


		 	 flag=0;
		 	 if ((month==2&&date==29&&leap_year!=0 )||month==2 &&date==30 ||month==2&&date==31 || month==4&&date==31 || month==6&&date==31 ||
	       month==9&&date==31 || month==11&&date==31){
	 		 printf(" You have entered the wrong data. Please try again\n");
	 		 flag =1;
	 	 	 }
}
while (flag);




printf ("you have entered %d.%d.%d\n", date,month,year);
fflush(stdout);
		fflush(stdin);
printf ("Do you want to enter another date? If yes press Y, if not press any other button\n");
fflush(stdout);
	 scanf ("%c", &more);}
	 while ( more == 'Y' || more == 'y');

printf ("Thank you, Bye-bye\n");

return 0;
}



