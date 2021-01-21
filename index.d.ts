interface RNOpenPdfOptions {
  chooserTitle: string;
}

export function open(
  path: string,
  options?: RNOpenPdfOptions
): Promise<void>;
