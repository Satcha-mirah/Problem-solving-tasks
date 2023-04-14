function findFirstUniqueNumber(arr) {
    const count = {};
    for (let i = 0; i < arr.length; i++) {
      const num = arr[i];
      count[num] = (count[num] || 0) + 1;
    }
    for (let i = 0; i < arr.length; i++) {
      const num = arr[i];
      if (count[num] === 1) {
        return num;
      }
    }
    return null;
  }
  
  
  const arr = [9, 2, 3, 2, 6, 6];
  const firstUnique = findFirstUniqueNumber(arr);
  console.log(firstUnique);
  