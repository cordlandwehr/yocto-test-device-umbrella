# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs // kernel-modules is from rpi-hwup-image - needed?
IMAGE_INSTALL_append = " \
    dropbear \
    gdb \
    strace \
    kernel-modules \
    linux-firmware \
    \
    qtbase-plugins \
    qttools-tools \
    qtsvg-plugins \
    qtdeclarative-plugins \
    qtdeclarative-tools \
    qtgraphicaleffects-qmlplugins \
    qtquickcontrols2-qmlplugins \
    qtsvg-qmlplugins \
    qtwayland-plugins \
    qtwayland-qmlplugins \
"
