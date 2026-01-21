list1 = [10, 20, 23, 11, 17]
list2 = [13, 43, 24, 36, 12]

#print the lists	
print("First List ", list1)
print("Second List ", list2)

#Thrird List should contail results	
thirdList = []

# Iterate through first list to get odd elements
for num in list1:
    if (num % 2 != 0):
        thirdList.append(num)
        
# Iterate through first list to get even elements
for num in list2:
    if (num % 2 == 0):
        thirdList.append(num)
 
# Print result
print("result List is:")
print(thirdList)