<h1>📚 Library Management System Rest API</h1>

<h2>📖 Description</h2>
<p>Library API is a backend application designed to manage the <strong>Author</strong>, <strong>Publisher</strong>, and <strong>Book</strong> entities of a library. The application allows <strong>CRUD operations</strong> (Create, Read, Update, Delete) on these entities using a **REST API** architecture.

Additionally, it implements **soft delete** instead of permanently deleting records, following best industry practices to maintain data integrity.
</p>

<h2>🚀 Features</h2>
<ul></ul>
<li><strong>Author Management</strong>: Create, read, update, and delete authors.</li>
<li><strong>Publisher Management</strong>: Create, read, update, and delete publishers.</li>
<li><strong>Book Management</strong>: Create, read, update, and delete books.</li>
<li><strong>Soft Delete</strong>: Records are not physically deleted from the database but marked as inactive (`publisherActive` and `bookActive`), allowing for safer and reversible data handling.</li>
<li><strong>Database Connection</strong>: The application is connected to a relational database (MySQL), verified using tools like **Workbench**.</li>
<li><strong>REST API</strong>: Communication between the frontend and backend is done through a REST API that exposes HTTP methods for interacting with the entities.</li>
<li><strong>Postman Testing</strong>: The API functionality has been thoroughly tested using **Postman**, ensuring all endpoints work correctly as expected.</li>
</ul>

<h2> 💻 Endpoints</h2>

### 1. Authors (Autores)

- **GET /localhost:8080/autor/listar**: Get all authors.
- **POST /localhost:8080/autor/crear**: Create a new author.
- **PATCH /localhost:8080/autor/modificar**: Update an existing author.
- **PATCH (SOFT DELETE) /localhost:8080/autor/eliminar/{id}**: Soft delete an author.

### 2. Publishers (Editoriales)

- **GET /localhost:8080/editorial/listar**: Get all publishers.
- **POST /localhost:8080/editorial/crear**: Create a new publisher.
- **PATCH /localhost:8080/editorial/modificar**: Update an existing publisher.
- **PATCH (SOFT DELETE)  /localhost:8080/editorial/eliminar/{id}**: Soft delete a publisher.

### 3. Books (Libros)

- **GET /localhost:8080/libro/listar**: Get all books.
- **POST /localhost:8080/libro/crear**: Create a new book.
- **PATCH /localhost:8080/libro/modificar**: Update an existing book.
- **PATCH (SOFT DELETE) /localhost:8080/libro/eliminar/{id}**: Soft delete a book.


<h2>🛠️ Technologies Used</h2>
<ul>
  <li><strong>Java</strong>: Main programming language.</li>
  <li><strong>Spring Boot</strong>: Framework used to develop the REST API.</li>
  <li><strong>JPA (Java Persistence API)</strong>: For interaction with the database.</li>
  <li><strong>MySQL</strong>: Database management system.</li>
  <li><strong>Postman</strong></li>
</ul>

 <h3>⚡ Installation & Setup</h3>
    <h4>🔹 1. Clone the Repository</h4>
    <pre><code>git clone https://github.com/andreaeba/library-api-rest.git
cd library-api-rest</code></pre>

<h4>🔹 2. Set up the Database</h4>
    <p>Create the database in MySQL:</p>
    <pre><code>CREATE DATABASE libreriaapibbdd;</code></pre>
    <p>Then, configure the <code>application.properties</code> file with your MySQL credentials.</p>

<h4>🔹 3. Run the Project</h4>
    <pre><code>mvn spring-boot:run</code></pre>
    <p>Access the app at: <a href="http://localhost:8080">http://localhost:8080</a></p>


<h2>Testing</h2>

The application has been tested using Postman, ensuring that all CRUD methods work correctly, including the soft delete implementation. Each endpoint for Authors, Publishers, and Books has been verified using this tool.

<h3>🤝 Contributing</h3>
    <p>Contributions are welcome! Feel free to fork, improve the code, and open a pull request.</p>

<h3>📩 Contact</h3>
    <p>If you have any questions or suggestions, feel free to contact me on <a href="https://www.linkedin.com/in/andrea-bermudez-alvarez/" target="_blank">LinkedIn</a>.</p>
