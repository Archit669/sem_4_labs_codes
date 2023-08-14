// Objective function coefficients
c = [-2; -3; -4];

// Coefficient matrix of constraints
A = [1, 1, 1; 2, 1, 0; 0, 2, 2];

// Right-hand side values of constraints
b = [6; 8; 10];

// Solve the linear programming problem using linprog function
x = linprog(c, A, b);

// Extract the optimal solution and value
x_optimal = x.x';
fval = x.fval;

// Determine the exit flag
if x.exitflag == 1
    exitflag = 1; // Successful optimization
else
    exitflag = -1; // Infeasible problem
end

// Display the results
disp("Optimal Solution:");
disp(x_optimal);

disp("Optimal Value:");
disp(fval);

if exitflag == -1
    disp("Infeasible problem.");
else
    disp("Successful optimization.");
end