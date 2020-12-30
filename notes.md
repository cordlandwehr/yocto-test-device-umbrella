## Build Image

MACHINE=raspberrypi4 . ./setup-environment build

## Flash Image
* sudo bmaptool copy --bmap qt-develop-image-raspberrypi4.wic.bmap qt-develop-image-raspberrypi4.wic.bz2 /dev/sdd
* sudo bmaptool copy --bmap kde-demo-image-raspberrypi4.wic.bmap kde-demo-image-raspberrypi4.wic.bz2 /dev/sdd
