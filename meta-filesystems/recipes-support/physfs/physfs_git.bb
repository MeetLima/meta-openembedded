SUMMARY = "PhysicsFS is a library to provide abstract access to various archives"
HOMEAPAGE = "http://icculus.org/physfs"
LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5d94e3eaaa10b00ca803ba35a3e87cde"
DEPENDS = "readline zlib"

inherit cmake

SRC_URI = " \
    git://github.com/SuperTux/physfs.git \
    file://0001-fix-build-with-gcc-6.patch \
"
SRCREV = "f3b45a94d0b7c0a85469b1e60fefd8383b6719ba"
S = "${WORKDIR}/git"
PV = "2.0.3+git${SRCPV}"
