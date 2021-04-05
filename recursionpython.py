houses = ["Eric's house", "Kenny's house", "Kyle's house", "Stan's house"]

def deliver_presents_iteratively():
    for house in houses:
        print("Delivering presents to", house)

def factorial_recursive(n):
    # Base case: 1! = 1
    if n == 1:
        return 1

    # Recursive case: n! = n * (n-1)!
    else:
        return n * factorial_recursive(n-1) 

if __name__ == '__main__':
      deliver_presents_iteratively() 
      while True:
       
       data = int(input(" -> "))
       print(factorial_recursive(data))
