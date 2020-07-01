//Objective is to see how many complete staircase rows can be completed using 'n' coins.

let n = 5


//O(n) solution that iterates over n until it can't go over the newest staircase length.

let staircase = 1
let count = 0

while (n >= staircase) {
    n -= staircase 
    staircase++
    count++
}

return count 


//O(logn) solution that uses binary search and math to find the highest number of staircases.

let low = 0
let high = n  

while (low <= high) {
    let mid = left + (right - left) / 2
    let curr = (mid * (mid + 1)) / 2

    if (curr == n) {
        return mid
    }
    
    if (curr > n) {
        high = mid - 1
    } else {
        low = mid + 1
    }
}

return right