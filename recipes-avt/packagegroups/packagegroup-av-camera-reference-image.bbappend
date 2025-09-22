REFERENCE_IMAGE_PACKAGES:append = " \
    fpga-manager-script \
    avt-bitstream-loader \
"

REFERENCE_IMAGE_PACKAGES:append:kria = " \
    alvium-kria-kv260-yuv \
    alvium-kria-kv260-raw8 \
    alvium-kria-kv260-rgb \
"

REFERENCE_IMAGE_PACKAGES:append:zcu106-zynqmp = " \
    alvium-fmc-zcu106-yuv \
    alvium-fmc-zcu106-raw8 \
    alvium-fmc-zcu106-rgb \
"

MALI_KERNEL_MODULE = "${@bb.utils.contains('DISTRO_FEATURES', 'libmali', '', 'kernel-module-lima', d)}"
REFERENCE_IMAGE_PACKAGES:append = " ${@bb.utils.contains('MACHINE_FEATURES', 'mali400', ' ${MALI_KERNEL_MODULE}', '', d)} "
