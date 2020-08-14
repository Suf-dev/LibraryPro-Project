
function getBook(){
    fetch('https://localhost:8003/insertRecord')
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
            document.querySelector("#input").innerHTML = data[i].regno;
            console.log(
              (document.querySelector("#input").innerHTML = data[i].name)
            );
            console.log(
              (document.querySelector("#input").innerHTML = data[i].address)
            );
            console.log(
              (document.querySelector("#input").innerHTML =
              data[i].completed)
            );
            console.log(
              (document.querySelector("#input").innerHTML =
              data[i].completed)
            );
    
            let para = document.createElement("P"); // Create a <p> element
            para;
            para.className = "alert alert-dark col-md-8";
            para.innerText = `The User id is : ${(document.querySelector(
              "#input"
            ).innerHTML = data[i].regno)} \n The User id is :  ${(document.querySelector(
              "#input"
            ).innerHTML = data[i].name)} \n  The title is : ${(document.querySelector(
              "#input"
            ).innerHTML = data[i].address)}  \n  The completed status is : ${(document.querySelector(
              "#input"
            ).innerHTML = data[i].completed)}`; // Insert text
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