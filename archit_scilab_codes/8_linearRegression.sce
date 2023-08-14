clc;
Sx=0;Sy=0;Sxy=0;Sx2=0;
n = input("Enter number of values : ");
for i = 1:n
    x(i)=i;
    x2(i)=x(i)*x(i);
    Sx=Sx+x(i);
    Sx2 = Sx2+x2(i);
end
disp("Enter value of y:");
for i=1:n
    y(i)=input("Enter y: ");
    Sy=Sy+y(i);
end
for i=1:n
    xy(i)=x(i)*y(i);
    Sxy=Sxy+xy(i);
end
m = ((n*Sxy)-(Sx*Sy))/(n*Sx2-((Sx)^2));
disp("slope is ",m);
b=(Sy-(m*Sx))/n;
disp("Value of c = ",b);
for i=1:n
    yexp(i)=m*x(i)+b;
end

disp("linear equation is : ");
printf("      y = %f x + %f ", m, b);

disp("Expected values of y :");
disp(yexp);
