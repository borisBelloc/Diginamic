import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CardsService } from '../cards.service';
import { switchMap, map, tap, catchError } from 'rxjs/operators';
import { Observable, of } from 'rxjs';
import { CardInterface } from '../interface/card.interface';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.scss']
})
export class DetailsComponent implements OnInit {

  card$: Observable<CardInterface>;

  constructor(
    // Injection
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private cardsService: CardsService
  ) { }

  ngOnInit() {
    // console.log('>>>>>>> INIT');

    // affichage console.log
    // this.cardsService.getCardById('Game_004').subscribe(a => console.log(a));

    this.card$ = this.activatedRoute.params.pipe(
      map(params => params.id),
      switchMap(id => this.cardsService.getCardById(id)),
      tap(card => console.log(card)),
      // Redirige user sur home(page parent) si mauvaise url
      catchError(reason => {
        console.log(reason);
        this.router.navigate(['..']);
        return of(null);
      })
    );

  }
}
