<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CSS Lab Exercise</title>

    <!-- Internal CSS -->
    <style>
        h2 {
            color: darkgreen;
            text-align: center;
            font-family: 'Arial', sans-serif;
        }

        p {
            font-size: 16px;
            line-height: 1.5;
        }
    </style>

    <!-- Linking External CSS -->
    <link rel="stylesheet" href="styles.css">
</head>
<body>

    <h1 style="color: blue; text-align: center;">Welcome to CSS Lab Exercise</h1>
    <!-- Inline CSS applied above -->

    <h2>This heading is styled using internal CSS</h2>

    <p class="external-style">This paragraph is styled using external CSS.</p>
    <p class="external-style">External CSS allows you to style multiple elements consistently.</p>

</body>
</html>
