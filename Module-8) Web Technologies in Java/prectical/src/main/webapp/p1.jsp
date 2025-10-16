<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lab Exercise Webpage</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        nav a {
            margin-right: 15px;
            text-decoration: none;
            color: blue;
        }
        nav a:hover {
            text-decoration: underline;
        }
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 8px;
        }
        table {
            margin-top: 20px;
            width: 50%;
        }
        img {
            width: 150px;
            height: auto;
        }
        form {
            margin-top: 20px;
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-top: 10px;
        }
    </style>
</head>
<body>

    <!-- Navigation Menu with Anchor Tags -->
    <nav>
        <a href="#home">Home</a>
        <a href="#form-section">Form</a>
        <a href="#table-section">User Data</a>
        <a href="#lists-section">Lists</a>
        <a href="#images-section">Images</a>
    </nav>

    <h1 id="home">Welcome to the Lab Exercise Webpage</h1>
    <p>This webpage demonstrates navigation, forms, tables, lists, and images.</p>

    <!-- Form with Input Fields, Labels, and Submit Button -->
    <section id="form-section">
        <h2>Registration Form</h2>
        <form action="#" method="post">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="age">Age:</label>
            <input type="number" id="age" name="age" min="0" max="120">

            <label for="gender">Gender:</label>
            <select id="gender" name="gender">
                <option value="">Select</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select>

            <br><br>
            <button type="submit">Submit</button>
        </form>
    </section>

    <!-- Table Displaying User Data -->
    <section id="table-section">
        <h2>User Data Table</h2>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Age</th>
                    <th>Gender</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>John Doe</td>
                    <td>john@example.com</td>
                    <td>28</td>
                    <td>Male</td>
                </tr>
                <tr>
                    <td>Jane Smith</td>
                    <td>jane@example.com</td>
                    <td>32</td>
                    <td>Female</td>
                </tr>
            </tbody>
        </table>
    </section>

    <!-- Images with Alt Text -->
    <section id="images-section">
        <h2>Images</h2>
        <img src=".\img\p1.jpg" alt="Placeholder Image 1">
        <img src=".\img\p1.jpg" alt="Placeholder Image 2">
    </section>

    <!-- Ordered and Unordered Lists -->
    <section id="lists-section">
        <h2>Lists</h2>

        <h3>Unordered List</h3>
        <ul>
            <li>HTML</li>
            <li>CSS</li>
            <li>JavaScript</li>
        </ul>

        <h3>Ordered List</h3>
        <ol>
            <li>Plan the webpage structure</li>
            <li>Create the HTML elements</li>
            <li>Style with CSS</li>
            <li>Test and Debug</li>
        </ol>
    </section>

</body>
</html>
