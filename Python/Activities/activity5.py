"""
number = 5
#number = int(input("number:"))
for i in range (1,11):
    print(number,' x ', i, ' = ', number*i)




def multiplication_table(num):
    #Prints the multiplication table of a given number from 1 to 10.
    #print(f"\nMultiplication Table for {num}:")
    for i in range(1, 11):
        print(f"{num} x {i} = {num * i}")

multiplication_table(int(input("number")))

"""

user_input = int(input("number"))

def multiplication_table(number):

    for i in range(1, 11): # Loop from 1 to 10
    
     print(f"{number} x {i} = {number * i}")

multiplication_table(user_input)
