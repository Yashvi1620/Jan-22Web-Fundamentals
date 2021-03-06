const addBtn = document.getElementById("add");

const notes = JSON.parse(localStorage.getItem("notes"));

if(notes){
  notes.forEach((note) =>{
    addNewNote(note);
  });
}

addBtn.addEventListener("click", () =>{
  addNewNote();
});

function addNewNote(text = ""){
  const note = document.createElement("div");
  note.classList.add("note");

  note.innerHTML = `
    <div class="notes">
      <div class="tools">
        <button class="delete"><i class="fas fa-trash-alt"></i></button>
      </div>
      <div class="main ${text ? "" : "hidden"}"></div>
      <textarea class="${text ? "hidden" : ""}"></textarea>
    </div>
  `;

  
  const deleteBtn = note.querySelector(".delete");

  const main = note.querySelector(".main");
  const textArea = note.querySelector("textarea");

  textArea.value = text;
  main.innerHTML = marked(text);

  
  deleteBtn.addEventListener("click", () =>{
    note.remove();

    
  });

  textArea.addEventListener("input", (e) =>{
    const { value } = e.target;
    main.innerHTML = marked(value);

  
  });

  document.body.appendChild(note);
}

