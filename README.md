
# react-native-open-pdf

Open a pdf file or url that resolves to one using android native app
**ONLY FOR ANDROID**

For a similar behaviour for ios, I recommend [react-native-inappbrowser-reborn](https://github.com/proyecto26/react-native-inappbrowser)

## Getting started

`$ npm install react-native-open-pdf --save`

## Usage

### Open a local file

```javascript
import OpenPdf from 'react-native-open-pdf';

const path = 'http://www.math.hawaii.edu/~pavel/gcd.pdf';
OpenPdf.open(path);
```

## API

### `open(path: string, options?: Object): Promise<void>`

Parameter | Type | Description
--------- | ---- | -----------
**path** | string | The absolute path where the file is stored or an url pointing to a pdf file
**options** (optional) | Object | Some options to customize the behaviour. See below.

#### Options

Parameter | Type | Description
--------- | ---- | -----------
**chooserTitle** (optional) | string | Default to "Open with"
