import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit {

  private user=0;
  private admin=0;
  public isAdmin: any;
  restuarants=[
    {id:1, name: "Spice6", menuId:1},
    {id:2, name: "Imperial", menuId:2}
  ]

  constructor(private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe((params: ParamMap) =>{
      this.user= parseInt(params.get('user') || "0");
    })
    this.route.paramMap.subscribe((params: ParamMap) =>{
      this.admin= parseInt(params.get('admin') || "0");
    })
    this.isAdmin=this.admin?true:false;
  }

  onSelect(id: any){
    if(this.user==1){
      this.router.navigate(['/menu', id, {user:this.user}])
    }
    else if(this.admin==1){
      this.router.navigate(['/menu', id, {admin:this.admin}])
    }
    else
      this.router.navigate(['/menu', id]);
  }

}
