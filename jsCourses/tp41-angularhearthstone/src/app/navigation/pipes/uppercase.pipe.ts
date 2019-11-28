import { Pipe, PipeTransform } from '@angular/core';
import { log } from 'util';

@Pipe({
  name: 'uppercase'
})
export class UppercasePipe implements PipeTransform {

  // transform(value: any, ...args: any[]): any {
  transform(value: string, ...args: any[]): string {
    console.log('Inside PIPE')
    return value.toUpperCase();
  }

}
