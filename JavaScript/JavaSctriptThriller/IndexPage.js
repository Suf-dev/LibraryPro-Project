
function getBook(){
    document.querySelector("form.input").addEventListener("submit",function(e) {
        e.preventDefault();
        // let x = document.querySelector("form.input").elements;
        // let sn = document.getElementById("sname").value;
        // console.log("->"+sn)
        // let sname = x["sname"].value;
        // let author = x["author"].value;
        // let date = x["date"].value;
        // let isbn = x["isbn"].value;
    
        // console.log(sname);
        // console.log(author);
        // console.log(date);
        // console.log(isbn);
        
    
        // const data = {
        //     "sname": sname,
        //     "author": author,
        //     "date": date,
        //     "isbn": isbn
        // }
        let bookid=document.getElementById("bookid").value;
    
        fetch(`http://localhost:9001/showbyid/${bookid}`, {
            method: "GET",
            mode: "cors",
            headers: {
                "Content-Type": "application/json",
            },
           // body: JSON.stringify(data)
        }).then(response => response.json())
    .then(function (data) {
            //response.json().function(data)
            // console.log(data.sname)
            let myDiv = document.getElementById("book");
            myDiv.innerHTML="";
           
            let tname = document.createElement("span")
            let author = document.createElement("span")
            let date = document.createElement("span")
            let isbn = document.createElement("span")
           
            tname.className = "alert alert-dark col-md-8";
            tname.innerText= `Title : ${(tname.innerHTML= data.tname)}`;
            
            author.className = "alert alert-dark col-md-8";
            author.innerText= `Author : ${(author.innerHTML= data.author)}`;

            date.className = "alert alert-dark col-md-8";
            date.innerText= `Published : ${(date.innerHTML= data.date)}`;

            isbn.className = "alert alert-dark col-md-8";
            isbn.innerText= `ISBN : ${(isbn.innerHTML= data.isbn)}`;



            myDiv.appendChild(tname);
            myDiv.appendChild(author);
            myDiv.appendChild(date);
            myDiv.appendChild(isbn);


        
           
                
    
               
               
               
               
               
               
               
               
                // console.log( (document.querySelector("form.input").innerHTML = data.sname));
                // let para = document.createElement("P"); // Create a <p> element
                // para;
                // para.className = "alert alert-dark col-md-8";
                // para.innerText = `The drink is : ${(document.getElementById("drinks").innerHTML = data.drinkName)} \n The cost is:  ${(document.getElementById("drinks"
                
                // ).innerHTML = data.prodcost)} \n  The stock is: ${(document.getElementById(
                //   "drinks"
                // ).innerHTML = data.stock)}  \n  The completed status is : ${(document.getElementById(
                //   "drinks"
                // ).innerHTML = data.completed)}`; // Insert text
                // let myDiv = document.getElementById("drinks");
                // let nw = myDiv.appendChild(para);
                // console.log("you entered a record");
                
                
                // let para = document.createElement("P"); // Create a <p> element
                
                // para.className = "alert alert-danger col-md-8";
                // para.innerHTML= "Recorded inserted";
    
                // let myDiv = document.getElementById("book");


                // myDiv.appendChild(para);
    
            //     card.classList = "card my-3";
            //     cardBody.classList = "card-body";
            
            //     if (i >= 0) {
            //         name.innerText = `Book: ${data.results[i].sname}`;
            //     } else {
                
            //     // console.log(data.results[i]);
            //     cardBody.appendChild(sname);
            //     cardBody.appendChild(author);
            //     cardBody.appendChild(date);
            //     cardBody.appendChild(isbn);
            //     card.appendChild(cardBody);
            //     return card;
            //   };
    
        }).catch(function(error) {
            console.log("failed to fetch request", error);
        })
        });
    }