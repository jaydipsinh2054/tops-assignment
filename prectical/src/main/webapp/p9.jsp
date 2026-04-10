<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Servlet Form Example</title>
</head>
<body>
    <h1>Java Servlet Form Example</h1>
    <form action="FormServlet" method="post">
        <label for="name">Enter your name:</label><br>
        <input type="text" id="name" name="name" required><br><br>

        <label for="email">Enter your email:</label><br>
        <input type="email" id="email" name="email" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
