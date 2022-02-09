@import objects.Account
@param Account account


<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>

  Welcome ${account.getOwner()}.
  Your balance is ${account.getAmount()}.

  <a href="/accountForm">Deposit/Withdraw</a>

</body>
</html>