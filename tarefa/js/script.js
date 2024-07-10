const todoForm = document.querySelector("#todo-form");
const todoInput = document.querySelector("#todo-input");
const todoList = document.querySelector("#todo-list");

const cancelEditBtn = document.querySelector("#cancel-edit-btn");


const saveTodo = (text) => {

    const todo = document.createElement("div");
    todo.classList.add("todo");

    const todoTitle = document.createElement("h3");
    todoTitle.innerText = text;
    todo.appendChild(todoTitle);

    const doneBtn = document.createElement("button");
    doneBtn.classList.add("finish-todo");
    doneBtn.innerHTML = '<i class="fa-solid fa-check"></i>'
    todo.appendChild(doneBtn);

    const deleteBtn = document.createElement("button");
    deleteBtn.classList.add("remove-todo");
    deleteBtn.innerHTML = '<i class="fa-solid fa-xmark"></i>'
    todo.appendChild(deleteBtn);

    todoList.appendChild(todo);
    todoInput.value = "";
    todoInput.focus();
}

todoForm.addEventListener("submit", (e) => {

    e.preventDefault();

    var inputValue = todoInput.value;
    console.log(inputValue);
    if (inputValue) {

        saveTodo(inputValue);
    }
})
document.addEventListener("click", (e) => {

    const targetElement = e.target;
    const parentElement = targetElement.closest("div");

    if (targetElement.classList.contains("finish-todo")) {
        parentElement.classList.toggle("done");
    }
    if (targetElement.classList.contains("remove-todo")) {
        parentElement.remove()
        console.log("remove")
    }


})