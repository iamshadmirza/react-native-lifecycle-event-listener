import { NativeModules, NativeEventEmitter } from 'react-native';

const { LifecycleEventListener } = NativeModules;

const EventEmitter = new NativeEventEmitter(LifecycleEventListener);

export default EventEmitter;
