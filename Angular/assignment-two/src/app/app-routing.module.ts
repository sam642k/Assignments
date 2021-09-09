import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdvertisementFormComponent } from './advertisement-form/advertisement-form.component';
import { AdvertisementTableComponent } from './advertisement-table/advertisement-table.component';
import { EditProductComponent } from './edit-product/edit-product.component';

const routes: Routes = [
  {path: '', redirectTo:'advertisements', pathMatch:'full'},
  {path: 'advertisement-form', component: AdvertisementFormComponent},
  {path: 'advertisements', component: AdvertisementTableComponent},
  {path: 'edit-product/:id', component: EditProductComponent},
  {path: '**', component:AdvertisementTableComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponents=[AdvertisementFormComponent, AdvertisementTableComponent, EditProductComponent];