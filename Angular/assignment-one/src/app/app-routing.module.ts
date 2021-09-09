import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { MenuComponent } from './menu/menu.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {path: '', redirectTo:'user', pathMatch:'full'},
  {path: 'admin', component: AdminComponent},
  {path: 'menu', component: MenuComponent},
  {path: 'restaurant', component: RestaurantComponent},
  {path: 'menu/:id', component: MenuComponent},  
  {path: 'user', component: UserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[AdminComponent, MenuComponent, RestaurantComponent, UserComponent];
