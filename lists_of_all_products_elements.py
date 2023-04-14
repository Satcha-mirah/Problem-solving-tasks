def multiply_all_except_self(nums):
    n = len(nums)
    left_products = [1] * n
    right_products = [1] * n
    for i in range(1, n):
        left_products[i] = left_products[i - 1] * nums[i - 1]

    for i in range(n - 2, -1, -1):
        right_products[i] = right_products[i + 1] * nums[i + 1]

    result = [left_products[i] * right_products[i] for i in range(n)]

    return result


if __name__ == '__main__':
    nums = [1, 2, 3, 4, 5]
    result = multiply_all_except_self(nums)
    print(result)
