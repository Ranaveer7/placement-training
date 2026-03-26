// To-Do List JavaScript Code
const taskInput = document.getElementById('taskInput');
const taskList = document.getElementById('taskList');
const searchInput = document.getElementById('searchInput');
const sortSelect = document.getElementById('sortSelect');
const filterSelect = document.getElementById('filterSelect');
let tasks = JSON.parse(localStorage.getItem('tasks')) || [];

// Function to display tasks
function displayTasks() {
    taskList.innerHTML = '';
    tasks.forEach((task, index) => {
        if (filterSelect.value === 'complete' && !task.completed) return;
        if (filterSelect.value === 'incomplete' && task.completed) return;

        const listItem = document.createElement('li');
        listItem.textContent = task.name;
        listItem.className = task.completed ? 'completed' : '';

        const editButton = document.createElement('button');
        editButton.textContent = 'Edit';
        editButton.onclick = () => editTask(index);
        listItem.appendChild(editButton);

        const deleteButton = document.createElement('button');
        deleteButton.textContent = 'Delete';
        deleteButton.onclick = () => deleteTask(index);
        listItem.appendChild(deleteButton);

        const completeButton = document.createElement('button');
        completeButton.textContent = task.completed ? 'Undo' : 'Complete';
        completeButton.onclick = () => toggleComplete(index);
        listItem.appendChild(completeButton);

        taskList.appendChild(listItem);
    });
}

// Function to add a task
function addTask() {
    const taskName = taskInput.value.trim();
    if (taskName) {
        tasks.push({ name: taskName, completed: false });
        localStorage.setItem('tasks', JSON.stringify(tasks));
        taskInput.value = '';
        displayTasks();
    }
}

// Function to delete a task
function deleteTask(index) {
    tasks.splice(index, 1);
    localStorage.setItem('tasks', JSON.stringify(tasks));
    displayTasks();
}

// Function to edit a task
function editTask(index) {
    const newTaskName = prompt('Edit task:', tasks[index].name);
    if (newTaskName !== null) {
        tasks[index].name = newTaskName.trim();
        localStorage.setItem('tasks', JSON.stringify(tasks));
        displayTasks();
    }
}

// Function to toggle task completion
function toggleComplete(index) {
    tasks[index].completed = !tasks[index].completed;
    localStorage.setItem('tasks', JSON.stringify(tasks));
    displayTasks();
}

// Function to search tasks
searchInput.addEventListener('input', () => {
    const searchTerm = searchInput.value.toLowerCase();
    const filteredTasks = tasks.filter(task => task.name.toLowerCase().includes(searchTerm));
    renderTasks(filteredTasks);
});

// Function to sort tasks
sortSelect.addEventListener('change', () => {
    if (sortSelect.value === 'asc') {
        tasks.sort((a, b) => a.name.localeCompare(b.name));
    } else if (sortSelect.value === 'desc') {
        tasks.sort((a, b) => b.name.localeCompare(a.name));
    }
    localStorage.setItem('tasks', JSON.stringify(tasks));
    displayTasks();
});

// Function to filter tasks
filterSelect.addEventListener('change', displayTasks);

// Initial task display
displayTasks();