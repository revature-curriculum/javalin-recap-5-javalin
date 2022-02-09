import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.Account;


public class Main {

  static Account account = new Account("Ramon", 100.0f);

  public static void main(String[] args) {

    Javalin app = Javalin.create().start(4100);
      
    app.get("/", ctx -> ctx.render("index.jte", Collections.singletonMap("account", account)));

    app.get("/accountForm", getAformHandler);

    app.post("/postAccountForm", postAformHandler);

  }

  public static Handler getAformHandler = ctx -> {

    ctx.render("accountForm.jte");

  };

  public static Handler postAformHandler = ctx -> {

    float amount = Float.parseFloat(ctx.formParam("amount"));

    String action = ctx.formParam("action");

    if(action.equals("deposit")){
      account.deposit(amount);
      ctx.render("accountSuccess.jte");
    } 
    else {
      if (account.getAmount() < amount) {
        ctx.render("accountError.jte");
      } else {
        account.withdraw(amount);
        ctx.render("accountSuccess.jte");
      }
    }

  };
}
