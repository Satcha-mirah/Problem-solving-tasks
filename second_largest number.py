if __name__ == '__main__':
    num_str = input("Kindly Enter your numbers please!: ")
    num_str = num_str.replace(',', '')
    num_list = [int(num) for num in num_str.split()]
    num_list.sort(reverse=True)
    second_largest = num_list[1]
    print("The second largest number is:", second_largest)
