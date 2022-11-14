func factorial(n: Int) -> Int {
    
    print("Calculating factorial(\(n))...")
    
    if(n <= 1){
        print("Terminal case, returning 1.")
        return 1
        
    }
    else{
        let result = n * (factorial(n: n-1))
        print("Non-terminal case, returning \(result).")
        return result
    }
}

            
print("The final result is: \(factorial(n:n)).")
