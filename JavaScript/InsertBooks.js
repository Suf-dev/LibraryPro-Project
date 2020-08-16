
function getResults(){
    alert("hello");
    document.querySelector("form.input").addEventListener("submit",function(e) {
        e.preventDefault();
        let x = document.querySelector("form.input").elements;
    
        let sname = x["sname"].value;
        let author = x["author"].value;
        let date = x["date"].value;
        let isbn = x["isbn"].value;
    
        console.log(sname);
        console.log(author);
        console.log(date);
        console.log(isbn);
        
    
        const data = {
            "sname": sname,
            "author": author,
            "date": date,
            "isbn": isbn
        }
        fetch("http://localhost:9001/insert", {
            method: "POST",
            mode: "cors",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(data)
        }).then(response => response)
    .then(function (data) {
            console.log("JSON response recieved", data);
            if(data.status ===200){
                
    
                // console.log(
                //     (document.querySelector("form.input").innerHTML = data.sname)
                //     );
                // let para = document.createElement("P"); // Create a <p> element
                // para;
                // para.className = "alert alert-dark col-md-8";
                // para.innerText = `The drink is : ${(document.getElementById(
                //   "drinks"
                // ).innerHTML = data.drinkName)} \n The cost is:  ${(document.getElementById(
                //   "drinks"
                // ).innerHTML = data.prodcost)} \n  The stock is: ${(document.getElementById(
                //   "drinks"
                // ).innerHTML = data.stock)}  \n  The completed status is : ${(document.getElementById(
                //   "drinks"
                // ).innerHTML = data.completed)}`; // Insert text
                // let myDiv = document.getElementById("drinks");
                // let nw = myDiv.appendChild(para);
                // console.log("you entered a record");
                let para = document.createElement("P"); // Create a <p> element
                
                para.className = "alert alert-danger col-md-8";
                para.innerHTML= "Recorded inserted";
    
                let myDiv = document.getElementById("book");
                myDiv.appendChild(para);
    
    
    
    
    
    
                // document.write("Record inserted");
            }
        }).catch(function(error) {
            console.log("failed to fetch request", error);
        })
        });
    }