<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>

Please fill out the form:

<body>

<form method="post" action="/postAccountForm">
  <label>Amount:</label><br>
  <input type="number" steps="0.01" id="amount" name="amount" placeholder="100.00"><br>

  <label for="action">Choose an Action</label>
  <select name="action" id="action">
    <option value="deposit">Deposit</option>
    <option value="withdraw">Withdraw</option>
  </select>

  <input type="submit" value="Submit">
</form>


</body>

</html>