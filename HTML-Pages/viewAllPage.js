
function getBook(){
    fetch('http://localhost:9001/viewAll')
    .then(
      function(response) {
        if (response.status !== 200) { 
          console.log('Looks like there was a problem. Status Code: ' +
            response.status);
          return;
        }
    
        // Examine the text in the response
        response.json().then(function(data) {
          console.log(data);
          for (let i = 0; i < data.length; i++) {
            document.querySelector("#view").innerHTML = data[i].sid;
            console.log(
              (document.querySelector("#view").innerHTML = data[i].sname)
            );
            console.log(
              (document.querySelector("#view").innerHTML = data[i].author)
            );
            console.log(
              (document.querySelector("#view").innerHTML = data[i].date)
            );
            console.log(
              (document.querySelector("#view").innerHTML = data[i].isbn)
            );
    
            let para = document.createElement("P"); // Create a <p> element
            para;
            para.className = "alert alert-dark col-md-8";
            para.innerText = `Book id : ${(document.querySelector(
              "#view"
             ).innerHTML = data[i].sid)} \n Title :  ${(document.querySelector(
              "#view"
             ).innerHTML = data[i].sname)} \n  Author : ${(document.querySelector(
              "#view"
             ).innerHTML = data[i].author)}  \n  Publication date : ${(document.querySelector(
              "#view"
             ).innerHTML = data[i].date)}  \n  ISBN : ${(document.querySelector(
               "#view"
             ).innerHTML = data[i].isbn)}`;
               // Insert text
            let myDiv = document.getElementById("book");
            myDiv.appendChild(para);
          }
        });
      }
    )
    .catch(function(err) {
      console.log('Fetch Error :-S', err);
    });
    }