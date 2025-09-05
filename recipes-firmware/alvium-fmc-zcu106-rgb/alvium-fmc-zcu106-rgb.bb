SUMMARY = "Alvium bitstream loading"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_dtg_zynqmp_full

SRC_URI = "\
    file://alvium_fmc_zcu106_rgb.xsa \
    file://zcu106-alvium-1port-avt.dtsi \
    "

COMPATIBLE_MACHINE ?= "^$"
COMPATIBLE_MACHINE:zynqmp = "zynqmp"

