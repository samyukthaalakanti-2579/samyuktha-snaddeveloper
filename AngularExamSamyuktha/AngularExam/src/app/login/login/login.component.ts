import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs/internal/Subscription';
import { AuthserviceService } from 'src/app/service/authservice.service';
import { Ilogin } from '../login-model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginData = {} as Ilogin;
  subscription!: Subscription;
  returnUrl!: string | null;
  
  constructor(
    private authenticationService: AuthserviceService,
    private router: Router,
    private activatedRoute: ActivatedRoute
  ) { }

  ngOnInit(): void {
  }
  public login(f: NgForm) {
    this.subscription = this.authenticationService
      .loginpost('Accounts/LoginUser', this.loginData)
      .subscribe({
        next: (data: any) => {
          if (data.statusCode == 200 && data.data != null) {
            console.log(data);
            localStorage.setItem('token', data.data);

            this.router.navigate(['/dashboard']);
          } else {
            console.log(data.message);
          }
        },
        error: (reason) => console.log(reason),
      });
  }

}
