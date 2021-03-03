(function binarySearch() {
    var numbers = [1,9,23,24,38,41,45,49,50,51,66,963,1024,2222,3564,8888];
    var low = 0;
    var high = numbers.length - 1;
    var value = 66;

    var mid = 0;
    var guess = 0;
    
    while(low <= high) {
        mid = Math.floor((low + high) / 2);
        guess = numbers[mid];
        
        if(guess == value) {
            return mid;
        }
        else if(guess < value) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }        
    }

    return -1;
})();