<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pseudo-classes Lab Exercise</title>
    <style>
        /* Navigation Menu */
        nav {
            background-color: #333;
            padding: 10px;
        }

        nav a {
            color: white;
            text-decoration: none;
            margin-right: 20px;
            font-weight: bold;
            transition: color 0.3s ease;
        }

        /* Pseudo-class: hover */
        nav a:hover {
            color: #ffcc00; /* Link color changes on hover */
        }

        /* Form styling */
        form {
            margin-top: 30px;
        }

        input[type="text"], input[type="email"], input[type="password"] {
            padding: 8px;
            width: 250px;
            margin-bottom: 15px;
            border: 2px solid #ccc;
            border-radius: 4px;
            transition: border-color 0.3s, box-shadow 0.3s;
        }

        /* Pseudo-class: focus */
        input[type="text"]:focus, 
        input[type="email"]:focus, 
        input[type="password"]:focus {
            border-color: #007bff;
            box-shadow: 0 0 5px #007bff;
            outline: none;
        }

        button {
            padding: 8px 16px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #0056b3;
        }

    </style>
</head>
<body>

    <!-- Navigation Menu -->
    <nav>
        <a href="#home">Home</a>
        <a href="#about">About</a>
        <a href="#contact">Contact</a>
        <a href="#services">Services</a>
    </nav>

    <h1>Pseudo-classes Example</h1>
    <p>Hover over the navigation links to see the color change.</p>

    <!-- Form to demonstrate :focus pseudo-class -->
    <form>
        <label for="name">Full Name:</label><br>
        <input type="text" id="name" name="name" placeholder="Enter your name"><br>

        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" placeholder="Enter your email"><br>

        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" placeholder="Enter your password"><br>

        <button type="submit">Submit</button>
    </form>

</body>
</html>
