import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs/internal/Subscription';
import { AuthenticationService } from 'src/app/service/authentication.service';
import { ILogin } from './login-model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginObj = {} as ILogin;
  subscription!: Subscription;
  returnUrl!: string | null;

  
  constructor(private _authenticationService: AuthenticationService,
    private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.returnUrl = this.activatedRoute.snapshot.queryParamMap.get("returnUrl");
  }
  public login (f:NgForm)
  {
    this.subscription = this._authenticationService.postData("Accounts/LoginUser", this.loginObj).subscribe({
      next: (data:any) => {
        if (data.statusCode == 200 && data.data != null) {
          console.log(data);
          localStorage.setItem("token", data.data);
          if (this.returnUrl)
            this.router.navigate([this.returnUrl]);
          else
            this.router.navigate(["/admin/employee"]);
        }
        else {
          console.log(data.message);
        }
    },
    error: reason => {
      console.log(reason);
    }

   });

 }
 ngOnDestroy(): void {
  if (this.subscription)
    this.subscription.unsubscribe();
}

}
