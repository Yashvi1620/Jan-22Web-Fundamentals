function fizzbuzz(){
    let num=prompt("Enter tne number");
    num=parseInt(num);
    (num ===NaN)
    document.write("Enter a valid number");
    for(let i=1;i<=num;i++){
        if(i%3===0 && i%5===0){
            document.write("fizzbuzz" );
             document.write("<br/>")
            
        }
        else if(i%3===0){
            document.write("fizz" );
            document.write("<br/>")
        }
        else if(i%5===0){
            document.write("buzz" );
            document.write("<br/>")
        }
        else{
            document.write(i );
            document.write("<br/>")
        }
        
    }
    
    
}
