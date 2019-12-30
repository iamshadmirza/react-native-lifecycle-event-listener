# react-native-lifecycle-event-listener

## Getting started

`$ npm install react-native-lifecycle-event-listener --save`

### Mostly automatic installation

`$ react-native link react-native-lifecycle-event-listener`

## Usage

```javascript
import LifecycleEventListener from 'react-native-lifecycle-event-listener';

componentDidMount(){
  const listener = LifecycleEventListener.addListener('onDestroy', () => {
    console.log('destroyed'); // "someValue"
    ToastAndroid.show('Destroyed', ToastAndroid.SHORT);
    listener.remove('onDestroy');
  });
}
```
