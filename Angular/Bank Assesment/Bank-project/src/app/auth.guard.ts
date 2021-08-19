import { BanksService } from 'src/app/banks.service';
import { UserService } from 'src/app/user.service';
import { Injectable } from '@angular/core';
import  {ActivatedRoute, ActivatedRouteSnapshot, CanActivate,Router, RouterStateSnapshot, UrlTree} from '@angular/router';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  constructor(private router:Router,private authService:UserService, private route :ActivatedRoute,private service:BanksService){

  }
  canActivate():boolean{
    if(localStorage.getItem('status')=="1"){
      return true;
    }else{
      this.router.navigate(['/login'],{relativeTo:this.route})
      return false;
    }
  }
  
}
function r(r: any) {
  throw new Error('Function not implemented.');
}

