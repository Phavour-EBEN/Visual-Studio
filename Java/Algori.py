print("----------The Euclidean Algorithm----------\n")
f1 = input("Enter your first number: ")

f2 = input("Enter your second number: ")

# while f1==0 or f2==0:
f1 = abs(f1)
f2= abs(f2)

gcd = 1
k = 2
while k<=f1 and k<=f2:
    if f1%k==0 and f2%k==0:
        gcd = k
    k=k+1
print(gcd)
