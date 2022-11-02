import Foundation

var words = [String]()

while let line = readLine() {
    words.append(line)
}

func bubbleSort (arr: [String]) -> [String] {
    var array = arr
    for _ in 0..<array.count - 1 {
        for j in 0..<array.count - 1 {
            if (array[j] > array[j+1]) {
                let temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
            }
        }
    }
    return array
}

print(bubbleSort(arr: words))
