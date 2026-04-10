<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Servlet Form Example</title>
</head>
<body>
    <h1>Java Servlet Example</h1>
    <form action="UserServlet" method="post">
        <label for="username">Enter your name:</label><br>
        <input type="text" id="username" name="username" required><br><br>

        <label for="email">Enter your email:</label><br>
        <input type="email" id="email" name="email" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
