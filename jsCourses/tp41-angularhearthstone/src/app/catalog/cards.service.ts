import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, forkJoin } from 'rxjs';
import { CardInterface } from './interface/card.interface';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CardsService {

  constructor(private http: HttpClient) { }


  get endpoint() {
    return 'https://omgvamp-hearthstone-v1.p.rapidapi.com/';
  }

  get httpOptions(): { headers: HttpHeaders } {
    const headers = new HttpHeaders()
      .set('x-rapidapi-host', 'omgvamp-hearthstone-v1.p.rapidapi.com')
      .set('x-rapidapi-key', 'd99e92cde6mshffcf37544a876bep14eb15jsn1c1928e0dec3');
    return { headers };
  }

  getCards(setName: string, className: string): Observable<CardInterface[]> {
    return forkJoin([
      this.set(setName),
      this.classes(className),
    ]).pipe(
      map(([setsCards, classesCards]) => {
        return this.intersectionCards(setsCards, classesCards);
      })
    );
  }

  getCardById(id: string): Observable<CardInterface> {
    return this.http.get(
      `${this.endpoint}cards/${id}`,
      this.httpOptions).pipe(
        map((card: CardInterface[]) => card[0])
      );
  }

  search(name): Observable<CardInterface[]> {
    return this.http.get(
      `${this.endpoint}cards/search/${name}`,
      this.httpOptions).pipe(
      map((cards: CardInterface[]) => cards)
    );
  }

  private set(name): Observable<CardInterface[]> {
    return this.http.get(`${this.endpoint}cards/sets/${name}`,
    this.httpOptions).pipe(
        map((cards: CardInterface[]) => cards)
      );
  }

  info(): Observable<{ classes: string[], sets: string[] }> {
    return this.http.get(
      `${this.endpoint}info`,
      this.httpOptions).pipe(
      map((cards: { classes: string[], sets: string[] }) => cards)
    );
  }


  private classes(name): Observable<CardInterface[]> {
    return this.http.get(
      `${this.endpoint}cards/classes/${name}`,
      this.httpOptions).pipe(
      map((cards: CardInterface[]) => cards)
    );
  }

  private intersectionCards(arrayCard1, arrayCard2) {
    return arrayCard1.filter(card1 => {
      return arrayCard2.find((card2) => {
        return card2.cardId === card1.cardId;
      });
    });
  }


}


