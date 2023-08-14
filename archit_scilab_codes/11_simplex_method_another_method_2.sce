clc()
disp("Enter your Name:Archit Jain");
disp("Roll number:07220802721");
disp("Class : CSE-B");
disp("Aim: To solve Linear programing problem  using Simplex method");

p = input("Enter the number of variables in the objective function: ");
q = input("Enter the number of constraint equations: ");

a = zeros(1, p);
b = zeros(q, p);
c = zeros(1, q);
d = zeros(1, q);

disp("Enter coefficients of the objective function:");
for i = 1:p
    a(i) = input("");
end

m = input("Enter 1 to minimize or 2 to maximize: ");

disp("Please enter constraint equations:");
for i = 1:q
    disp(["Enter equation ", string(i)]);
    for j = 1:p
        disp(["Enter coefficient ", string(j)]);
        b(i, j) = input("");
        if j == p
            disp("Enter 1 for <=, 2 for >=:");
            c(i) = input("");
            disp("Enter constant:");
            d(i) = input("");
        end
    end
end

disp("\n\nEquations you entered are:\n");

if m == 1
    disp("MIN");
else
    disp("MAX");
end

for i = 1:p
    disp([string(a(i)), "x", string(i), " + "]);
end

disp("\nConstraint equations are:");

for i = 1:q
    for j = 1:p
        disp([string(b(i, j)), "x", string(j), " + "]);
        if j == p
            if c(i) == 1
                disp("<= ", string(d(i)));
            else
                disp(">= ", string(d(i)));
            end
        end
    end
    disp("");
end

// Displaying the simplex table
disp("\n\n====================SIMPLEX TABLE IS=======================\n");

disp("     CJ  |");

for i = 1:p-1
    disp(["   ", string(a(i))]);
end

for i = 1:q-1
    disp(["   0s", string(i)]);
end

disp("---------------------------------------------------------");

disp("BV    Cb     Xb  |");

for i = 1:p
    disp(["   x", string(i)]);
end

for i = 1:q
    disp(["   s", string(i)]);
end

disp("    Min Xb/x");
disp("---------------------------------------------------------");

// for i = 1:p
//     disp("[ s", string(i), "     0     ", string(d(i)), "   |   ", string(b(i, :)), "    ", eye(1, q)(:, i)', '] ');
// end

// disp("---------------------------------------------------------");

disp("           ZJ-CJ |");

for i = 1:p
    disp(["  -", string(a(i))]);
end

for j = 1:q
    disp("    0");
end

