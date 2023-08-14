disp("Archit Jain, CSE-B, 72");

times=input("enter the n ");

disp("enter the value of x: ");
for i = 1 : times
    x(i) = input(' ');
end

sum1=0;
sum2=0;

x=0;

disp("enter the value of f")
for i=1:times
    f(i)=input('');
    fx(i)=f(i)*x;
    sum1=sum1+f(i);
    sum2=sum1+fx(i);
    x=x+1;
end

p=input("enter p");
q=1-p;

power1=(q)^(times-1);

P(1)=power1;
F(1)=sum1*P(1);
sum3=F(1);
disp("Expected Frequencies")
disp(F(1));
h=1;
z=0;
while(h<times)
    F(h+1)=(((times-1)-z)*p*F(h))/(q*(z+1));
    disp(F(h+1));
    sum3=sum3+F(h+1);
    h=h+1;
    z=z+1;
end
disp("sum of the expected frequencies is: ");
disp(sum3);