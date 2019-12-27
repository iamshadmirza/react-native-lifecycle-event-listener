# react-native-lifecycle-event-listener

## Getting started

`$ npm install react-native-lifecycle-event-listener --save`

### Mostly automatic installation

`$ react-native link react-native-lifecycle-event-listener`

## Usage

```javascript
import LifecycleEventListener from 'react-native-lifecycle-event-listener';

LifecycleEventListener.addEventListener('onResume', () => {
  console.log('App Resumed');
});
LifecycleEventListener.addEventListener('onPause', () => {
  console.log('App Paused');
});
LifecycleEventListener.addEventListener('onDestroy', () => {
  console.log('App Destroyed');
});
```
