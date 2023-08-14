function total_cost = bruteForceAssignment(cost_matrix)
    n = size(cost_matrix, 1);
    assignments = perms(1:n); // Generate all permutations of assignments
    
    min_cost = %inf;
    optimal_assignment = [];
    
    for i = 1:size(assignments, 1)
        assignment = assignments(i, :);
        current_cost = 0;
        
        for j = 1:n
            current_cost = current_cost + cost_matrix(j, assignment(j));
        end
        
        if current_cost < min_cost
            min_cost = current_cost;
            optimal_assignment = assignment;
        end
    end
    
    total_cost = min_cost;
    disp("Optimal Assignments are:");
    disp(optimal_assignment);
    disp("total cost is: ");
    disp(total_cost);
end

// Example usage
disp("Name : Archit Jain");
disp("Class : BTech CSE-B")
disp("Roll No - 72")
cost_matrix = [17, 25, 31; 10, 25, 16; 12, 14, 11];
bruteForceAssignment(cost_matrix);
