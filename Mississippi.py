if __name__ == '__main__':
    string = "Mississippi"

    count_s = 0
    count_i = 0

    for char in string:
        if char == 's':
            count_s += 1
        elif char == 'i':
            count_i += 1

    print("Number of occurrences of 's':", count_s)
    print("Number of occurrences of 'i':", count_i)
