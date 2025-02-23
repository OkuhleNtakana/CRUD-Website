import { Component, inject } from '@angular/core';
import { Router,RouterLink } from '@angular/router';
import { UserservService } from '../services/userserv.service';
import { FormsModule} from '@angular/forms';
import * as CryptoJS from 'crypto-js';

@Component({
  selector: 'app-register',
  imports: [RouterLink,FormsModule],
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})


export class RegisterComponent {
      username:string ='';
      Firstname:string ='';
      surname:string ='';
      password:string ='';
      Idnumber:string ='';

      idNumberplace:string='';
      passwordplace:string='';

      userService = inject(UserservService)
      router = inject(Router);

      isPasswordValid(password: string): boolean {
        return password.length >= 6;
      }
    
      
      isIdNumberValid(id: string): boolean {
        const regex = /^\d{13}$/; 
        return regex.test(id);
      }
    

      Register(){
        if (!this.isPasswordValid(this.password)) {
          this.password='';
          this.passwordplace="Password must be at least 6 characters long."
          return;
        }
    
        if (!this.isIdNumberValid(this.Idnumber)) {
          this.Idnumber='';
          this.idNumberplace="Please enter a valid South African ID number.";
          return;
        }
    

        const hashedPassword = CryptoJS.SHA256(this.password).toString(CryptoJS.enc.Base64);
        const user = {
          username: this.username,
          name: this.Firstname,
          userSurname: this.surname,
          userPassword: hashedPassword,
          userId: this.Idnumber,
          userActive:true
        }
        this.userService.PostUser(user).subscribe({
          next: (response) =>{
            console.log(response.message);
            this.router.navigate(['/Login']);
          },
          error: (err)=>{
            console.error('Registration failed', err);
          }
        })
      }
}
