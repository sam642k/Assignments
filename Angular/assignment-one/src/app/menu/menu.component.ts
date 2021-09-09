import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  public id=0;
  public sub=false;
  public user: any;
  public admin: any;
  public isUser: any;
  public isAdmin: any;
  public selectedMenu: any;
  spice6={id: 1,
    menu:[ {id: 1, name: "mandi", price:500, count:0}, {id: 2, name: "khabsa", price:480, count:0}]
  };

  Imperial={id: 2,
    menu: [{id: 1, name: "Biriyani", price:250, count:0}, {id: 2, name: "Noodles", price:200, count:0}]
  };

  menus=[this.spice6, this.Imperial];

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe((params: ParamMap) =>{
      this.id= parseInt(params.get('id') || "");
      this.user= parseInt(params.get('user') || "");
      this.admin= parseInt(params.get('admin') || "");
      this.isUser=this.user?true:false;
      this.isAdmin=this.admin?true:false;
      console.log(this.id+"  "+this.user+" "+this.isUser+" "+this.admin+" "+this.isAdmin);
      for(let menu of this.menus){
        if(menu.id==this.id)
          this.selectedMenu=menu.menu;
      }
    })
  }

  add(item: any){
    for(let item_ of this.selectedMenu){
      if(item_.name==item.name)
        item_.count+=1;
    }
  }

  submit(){
    this.sub=true;
  }
}
