package Windows.Devices.Scanners

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ImageScannerFeederConfiguration.ABI::class)
@Signature("rc(Windows.Devices.Scanners.ImageScannerFeederConfiguration;{ae275d11-dadf-4010-bf10-cca5c83dcbb0})")
@WinRTByReference(brClass = ImageScannerFeederConfiguration.ByReference::class)
public class ImageScannerFeederConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IImageScannerFormatConfiguration.WithDefault,
    IImageScannerSourceConfiguration.WithDefault, IImageScannerFeederConfiguration.WithDefault,
    IWinRTObject {
  private val __787293148_Interface: IImageScannerFormatConfiguration.WithDefault by lazy {
    as_787293148()
  }


  private val __340313728_Interface: IImageScannerSourceConfiguration.WithDefault by lazy {
    as_340313728()
  }


  private val __1068430896_Interface: IImageScannerFeederConfiguration.WithDefault by lazy {
    as_1068430896()
  }


  public override val __787293148_Ptr: JNAPointer? by lazy {
    __787293148_Interface.__787293148_Ptr
  }


  public override val __340313728_Ptr: JNAPointer? by lazy {
    __340313728_Interface.__340313728_Ptr
  }


  public override val __1068430896_Ptr: JNAPointer? by lazy {
    __1068430896_Interface.__1068430896_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__787293148_Interface, __340313728_Interface, __1068430896_Interface)

  private fun as_787293148(): IImageScannerFormatConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IImageScannerFormatConfiguration.ABI.makeIImageScannerFormatConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageScannerFormatConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageScannerFormatConfiguration.ABI.makeIImageScannerFormatConfiguration(ref.value))
  }

  private fun as_340313728(): IImageScannerSourceConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IImageScannerSourceConfiguration.ABI.makeIImageScannerSourceConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageScannerSourceConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageScannerSourceConfiguration.ABI.makeIImageScannerSourceConfiguration(ref.value))
  }

  private fun as_1068430896(): IImageScannerFeederConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IImageScannerFeederConfiguration.ABI.makeIImageScannerFeederConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageScannerFeederConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageScannerFeederConfiguration.ABI.makeIImageScannerFeederConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ImageScannerFeederConfiguration> {
    public override fun getValue() = ImageScannerFeederConfiguration(pointer.getPointer(0))

    public fun setValue(value: ImageScannerFeederConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageScannerFeederConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ImageScannerFeederConfiguration {
      val address = segment.toRawLongValue()
      return ImageScannerFeederConfiguration(Pointer(address))
    }

    public override fun toNative(obj: ImageScannerFeederConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
