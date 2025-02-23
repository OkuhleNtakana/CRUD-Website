import { Component, OnInit, inject  } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { UserservService } from '../services/userserv.service';
import { FormsModule} from '@angular/forms';
import * as CryptoJS from 'crypto-js';

@Component({
  selector: 'app-login',
  imports: [RouterLink,FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})

export class LoginComponent {
  username: string = '';
  usernameplace: string='';
  password: string = '';

  userService = inject(UserservService); 
  router = inject(Router);

  login() {
    const hashedPassword = CryptoJS.SHA256(this.password).toString(CryptoJS.enc.Base64);
    this.userService.Login(this.username, hashedPassword).subscribe({
      next: (response) => {
        if(response===true){
          sessionStorage.setItem('username', this.username);
          this.router.navigate(["/home"]) ;
        }else{
          this.username ='';
          this.usernameplace = "Incorrect Credentials";
          this.password='';
        }
      },
      error: (err) => {
        console.error('Login failed', err);
      }
    });
  }
    
}
