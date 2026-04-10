<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HttpServlet GET and POST Example</title>
</head>
<body>
    <h1>HttpServlet Example</h1>

    <!-- Form using POST -->
    <form action="MyHttpServlet" method="post">
        <label for="username">Enter your name:</label><br>
        <input type="text" id="username" name="username" required><br><br>

        <label for="email">Enter your email:</label><br>
        <input type="email" id="email" name="email" required><br><br>

        <input type="submit" value="Submit (POST)">
    </form>

    <br>

    <!-- Link using GET -->
    <a href="MyHttpServlet?username=Guest&email=guest@example.com">Click here for GET request</a>
</body>
</html>
