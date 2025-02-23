import { Component, OnInit, inject  } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { UserservService } from '../services/userserv.service';
import { FormsModule} from '@angular/forms';
import * as CryptoJS from 'crypto-js';

@Component({
  selector: 'app-home',
  imports: [FormsModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent implements OnInit{
      username:string ='';
      name:string ='';
      surname:string ='';
      password:string ='';
      Idnumber:string ='';

      Idnameplace:string='';
      passwordplace:string='***********';
      usernameplace:string='';
      surnameplace:string='';
      nameplace:string='';

      userService = inject(UserservService)
      router = inject(Router);
      
      sessionuser: string|null='';

      ngOnInit(){
        this.sessionuser = sessionStorage.getItem('username');
          this.userService.getUser(this.sessionuser as string).subscribe({
            next: (response)=>{
              
                this.usernameplace = response.username;
                this.nameplace = response.name;  
                this.surnameplace = response.userSurname;
                this.Idnameplace = response.userId;
              
              
            }, 
            error: (err) => {
              console.error('Failed to fetch user details', err);
              this.router.navigate(['/login']); 
            }
          })
      }
      update(){
      
      }  
      logout(){
         sessionStorage.clear();
         this.router.navigate(["/Login"]) ;
      }
      
}
