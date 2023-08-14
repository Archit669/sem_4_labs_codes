clc;

printf("\nName : Archit Jain");
printf("\nClass :CSE-B ");
printf("\nRoll No. :72 ")
printf("\nEnrolment No. : 07220802721");
printf("\nGroup :01 ");
printf("\nTopic : Assignment Problem\n\n");

t = zeros(10, 10);
T = zeros(10, 10);
n = 0;

m=input("How many Machines  do you have: ");
n = input("How many Jobs do you have  ");

printf("Enter cost of: ");
for i = 1:m
    for j = 1:n
        printf("Machine %d, Job %d : ", i, j);
        t(i, j) = input(" ");
        T(i, j) = t(i, j);
    end
end

printf("\n***Data Entered is*** :");
printf("\t\t");
for i = 1:m
    printf("Job %d\t", i);
end

for i = 1:m
    printf("\n\tMachine %d\t\t", i);
    for j = 1:n
        printf("%d\t", t(i, j));
    end
end

minimum = [1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000];
for i = 1:m
    for j = 1:n
        if t(i, j) <= minimum(i)
            minimum(i) = t(i, j);
        end
    end
end
printf(" ");

for i = 1:m
    for j = 1:n
        t(i, j) = t(i, j) - minimum(i);
    end
end

printf("\n\n***Data after Row Minimumimum Decrement is****\n\t\t");
printf("\t\t");
for i = 1:m
    printf("Job %d\t", i);
end

for i = 1:m
    printf("\n\tMachine %d\t\t", i);
    for j = 1:n
        printf("%d\t", t(i, j));
    end
end

zerr = [1000, 1000, 1000, 1000, 1000, 1000];
zerc = [1000, 1000, 1000, 1000, 1000, 1000];

for i = 1:m
    for j = 1:n
        if t(i, j) == 0
            zerr(i) = 0;
            zerc(j) = 0;
        end
    end
end

f = 0;
y = 0;
for i = 1:n
    if zerr(i) ~= 0
        f = 1;
    end
end

for i = 1:m
    if zerc(i) ~= 0
        y = 1;
    end
end

if f == 1 || y == 1 then
mn = [1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000];

for j = 1:m
    for i = 1:n
        if t(i, j) <= mn(j)
            mn(j) = t(i, j);
        end
    end
end

for j = 1:n
    for i = 1:n
        t(i, j) = t(i, j) - mn(j);
    end
end

printf("\n\n***Data after Column Minimumimum Decrement is***\n");
printf("\t\t\t\t");
for i = 1:m
    printf("Job %d\t", i);
end

for i = 1:m
    printf("\n\tMachine %d\t\t", i);
    for j = 1:n
        printf("%d\t", t(i, j));
    end
end
end

printf("\n\n\n***Final Job Assignment is***");
min_cost = 0;
for i = 1:m
    for j = 1:n
        if t(i, j) == 0 then
            printf("\nAssign Job %d to Machine %d", j, i);
            min_cost = min_cost + T(i, j);
            for z = 1:n
                if z ~= i then
                    if t(z, j) == 0 then
                        t(z, j) = 1000;
                    end
                end
            end
        for l = 1:m
            if l ~= j then
                if t(i, l) == 0 then
                    t(i, l) = 1000;
                end
            end
        end
    end
end
end
printf("\n\nMinimum Cost = Rs. %d", min_cost);
printf("\n\n");
