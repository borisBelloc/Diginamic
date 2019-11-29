import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

// TODO: fix URL des boutons card.cardId

const routes: Routes = [
  {
  path: '',
  redirectTo: 'cards',
  pathMatch: 'full'
  },
  {
    path: '',
    loadChildren: './catalog/catalog.module#CatalogModule'
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
