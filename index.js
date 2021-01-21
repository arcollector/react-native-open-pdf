import { NativeModules } from 'react-native';

const { RNOpenPdf } = NativeModules;

function open(
  path,
  options = { chooserTitle: 'Open with' }
) {
  return RNOpenPdf.open(normalize(path), options);
}

function normalize(path) {
  const filePrefix = "file://";
  if (path.startsWith(filePrefix)) {
    path = path.substring(filePrefix.length);
    try {
      path = decodeURI(path);
    } catch (e) {}
  }
  return path;
}

export default { open };
