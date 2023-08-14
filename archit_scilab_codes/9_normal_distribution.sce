// Set the mean and standard deviation for the normal distribution
mu = input("Enter mu = ");
sigma = input("Enter sigma = ");
// Set the rate parameter for the exponential distribution
lambda = 0.5;

// Define the range of values to plot
x = linspace(-5, 5, 100);

// Calculate the normal and exponential distributions for the given parameters and range of values
y_normal = 1/(sigma*sqrt(2*%pi))*exp(-0.5*((x-mu)/sigma).^2);
y_exponential = lambda*exp(-lambda*x);

// Create a new figure and plot the normal and exponential distributions
clf;
subplot(2, 1, 1);
plot(x, y_normal, '-b');
title('Normal Distribution');
xlabel('x');
ylabel('Probability Density');
subplot(2, 1, 2);

x = linspace(0, 5, 100);
plot(x, y_exponential, '-r');
title('Exponential Distribution');
xlabel('x');
ylabel('Probability Density');
