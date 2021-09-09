import { Pipe, PipeTransform } from '@angular/core';
import { AdvertisementModel } from './advertisement-model';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(advs: AdvertisementModel[], term: string) {
    if (!term || !advs) {
      return advs;
    }

    return advs.filter(adv =>
      adv.name.toLocaleLowerCase().includes(term.toLocaleLowerCase()) ||
      adv.title.toLocaleLowerCase().includes(term.toLocaleLowerCase())
    );
  }

}