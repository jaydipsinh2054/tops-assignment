<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ID and Class Lab Exercise</title>
    <style>
        /* ID selector for unique styling */
        #unique-heading {
            color: darkblue;
            font-size: 32px;
            text-align: center;
            text-decoration: underline;
        }

        /* Class selector for styling multiple elements */
        .highlight {
            background-color: yellow;
            padding: 10px;
            border-radius: 5px;
            font-weight: bold;
        }
    </style>
</head>
<body>

    <!-- Element with a unique ID -->
    <h1 id="unique-heading">This Heading is Uniquely Styled Using an ID</h1>

    <!-- Multiple elements sharing the same class -->
    <p class="highlight">This paragraph is highlighted using the class "highlight".</p>
    <p class="highlight">Another paragraph with the same class styling.</p>
    <div class="highlight">A div element also shares the same class styling.</div>

</body>
</html>
