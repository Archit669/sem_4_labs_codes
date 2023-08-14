n = input("Enter no of entries: ");
x=[];
f =[];
fx=[];

for idx = 1:n 
    x(idx) = idx-1;
end

disp("enter frequencies below: ");
for idx = 1:n
    f(idx) = input("-> ");
    fx(idx) = x(idx) * f(idx);
end

lamda = input("Enter value of lamda: ");

Mean = sum(fx)/sum(f);

p=[];
p(1) = (%e^(-lamda) * lamda^x(1)) / factorial(x(1));
efx=[];
N = sum(f);
efx(1) = N*p(1);
disp(efx(1));

for idx = 2:n
    efx(idx) = (lamda/(x(idx-1) + 1))*efx(idx-1);
    disp(efx(idx));
end