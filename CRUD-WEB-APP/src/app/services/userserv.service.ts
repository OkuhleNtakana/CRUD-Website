import { inject, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user.model';


@Injectable({
  providedIn: 'root'
})

export class UserservService {
  private rooturl = 'http://localhost:8080/user';
  http = inject(HttpClient);
  PostUser(user: any){
    return this.http.post<any>(`${this.rooturl}/add`,user);
  }
  getUser(username: string){
    return this.http.get<User>(`${this.rooturl}/getUser/${username}`);
  }
  Login(username: string,password: string){
    return this.http.get<boolean>(`${this.rooturl}/login/${username}/${password}`);
  }
  UpdateUser(user:any){
    return this.http.post(`${this.rooturl}/updateUser`,user);
  }
  DeleteUser(id:  string){
    return this.http.delete(`${this.rooturl}/add/${id}`);
  }
}
