import { Component, OnInit } from '@angular/core';
import { Subscriber, Observable, Subject, BehaviorSubject, merge } from 'rxjs';
import { CardsService } from '../cards.service';
import { CardInterface } from '../interface/card.interface';
import { NgForm, FormGroup, FormControl, Validators } from '@angular/forms';
import { switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {


  constructor(private cardsService: CardsService) { }

  // N'importe quel type mais en tableau
  cards$: Observable<CardInterface[]>;
  info$: Observable<{ classes: string[], sets: string[] }>;
  searchForm$: Subject<string>;
  filterForm$: BehaviorSubject<{ set: string, classe: string }>;
  query: string;

  filterForm = new FormGroup({
    set: new FormControl('Basic', [Validators.required]),
    classe: new FormControl('Druid', [Validators.required]),
  });



  ngOnInit() {
    // affichage en console.log()
    // this.cardsService.getCards('Basic').subscribe(
    //   cards$ => {
    //     console.log(cards$);
    //   });

    // this.cards$ = this.cardsService.getCards('Basic');
    this.searchForm$ = new Subject();
    this.filterForm$ = new BehaviorSubject({
      set: this.filterForm.get('set').value,
      classe: this.filterForm.get('classe').value
    });

    this.cards$ = merge(
      this.searchForm$.pipe(
        switchMap(query => {
          return this.cardsService.search(query);
        })
      ),
      this.filterForm$.pipe(
        switchMap(query => {
          return this.cardsService.getCards(query.set, query.classe);
        })
      )
    );
    this.info$ = this.cardsService.info();
  }

  submit(monForm: NgForm) {
    console.log('Le formulaire : ', monForm);
    if (monForm.valid) {
      // this.cards$ = this.cardsService.search(this.query).subscribe(t => console.log('rr ' + t));

      // this.cards$ = this.cardsService.search(this.query);
      this.searchForm$.next(this.query);
    }
  }

  filter() {
    if (this.filterForm.valid) {
      this.filterForm$.next(this.filterForm.getRawValue());
    }
  }


}



