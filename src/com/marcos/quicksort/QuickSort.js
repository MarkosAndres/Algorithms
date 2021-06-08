let numbers = [5,3,7,6,2,9];
let left = 0;
let right = numbers.length - 1;

console.log(quickSort(numbers, left, right));

function quickSort(numbers, left, right) {
    let index;

    if(numbers.length > 1) {
        index = partition(numbers, left, right);
    
        if(left < index-1) {
            quickSort(numbers, left, index - 1);
        }
    
        if(index < right) {
            quickSort(numbers, index, right);
        }
    }
    
    return numbers;
}

function partition(numbers, left, right) {
    let pivot = numbers[Math.floor((left + right) / 2)];
    let l = left;
    var r = right;

    while(l <= r) {
        while(numbers[l] < pivot) {
            l++;
        }

        while(pivot < numbers[r]) {
            r--;
        }

        if(l <= r) {
            swap(numbers, l, r);
            l++
            r--;
        }
    }

    return l;
}

function swap(numbers, l, r) {
    var temp = numbers[l];
    numbers[l] = numbers[r];
    numbers[r] = temp;
}
