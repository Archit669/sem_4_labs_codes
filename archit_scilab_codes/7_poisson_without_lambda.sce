disp("archit , 72 CSE-B")
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

Mean = sum(fx)/sum(f);
lambda = Mean;

disp("Mean is ");
disp(Mean);

disp("lambdaT is ");
disp(lambda);

disp("expected frequencies are: ");

p=[];
p(1) = (%e^(-lambda) * lambda^x(1)) / factorial(x(1));
efx=[];
N = sum(f);
efx(1) = N*p(1);
disp(efx(1));

for idx = 2:n
    efx(idx) = (lambda/(x(idx-1) + 1))*efx(idx-1);
    disp(efx(idx));
end
