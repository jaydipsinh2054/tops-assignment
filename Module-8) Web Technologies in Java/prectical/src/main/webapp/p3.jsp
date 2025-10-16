<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Margin and Padding Lab Exercise</title>
    <style>
        /* Container with padding */
        .padded-box {
            padding: 20px; /* Padding inside the div */
            background-color: #d1e7dd;
            border: 2px solid #0f5132;
            margin-bottom: 20px;
        }

        /* Box with margin */
        .margined-box {
            margin: 30px; /* Margin outside the element */
            background-color: #f8d7da;
            border: 2px solid #842029;
            padding: 10px;
        }

        /* Comparing different margin and padding */
        .comparison-container {
            display: flex;
            gap: 20px;
            margin-top: 40px;
        }

        .box {
            background-color: #cff4fc;
            border: 2px solid #055160;
            padding: 10px;
            text-align: center;
            width: 100px;
            height: 100px;
        }

        .box-large-padding {
            padding: 30px;
        }

        .box-large-margin {
            margin: 30px;
        }
    </style>
</head>
<body>

    <h1>Margin and Padding Demonstration</h1>

    <!-- Padding applied to a div -->
    <div class="padded-box">
        This div has <strong>padding of 20px</strong>. Content inside moves away from the border.
    </div>

    <!-- Margin applied to an element -->
    <div class="margined-box">
        This div has <strong>margin of 30px</strong>. The space outside the border separates it from other elements.
    </div>

    <!-- Comparing different margin and padding -->
    <h2>Comparison of Margin and Padding</h2>
    <div class="comparison-container">
        <div class="box">Normal</div>
        <div class="box box-large-padding">Large Padding</div>
        <div class="box box-large-margin">Large Margin</div>
    </div>

    <p>Notice how padding increases the space <em>inside</em> the box, while margin increases the space <em>outside</em> the box.</p>

</body>
</html>
