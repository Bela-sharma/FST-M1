input = [1,2,3,4,5]
num = int(input[4])   #We add one lower value because code iterates to +1
sum = 0
for value in range(1, num + 1):
    sum = sum + value
print(sum)