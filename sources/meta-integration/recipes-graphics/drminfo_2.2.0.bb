SUMMARY = "Small utility to dump info about DRM devices"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=32fd56d355bd6a61017655d8da26b67c"
HOMEPAGE = "https://drmdb.emersion.fr/"

inherit meson

DEPENDS += " \
    json-c \
    libdrm \
    pciutils \
"

SRC_URI = " \
    git://github.com/ascent12/drm_info.git;nobranch=1;protocol=https \
"

SRCREV = "3907336a4107aa1cadf9032e5508b4d626ad2c99"
S = "${WORKDIR}/git"
