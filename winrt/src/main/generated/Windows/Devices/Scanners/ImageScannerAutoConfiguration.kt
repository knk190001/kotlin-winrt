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

@ABIMarker(ImageScannerAutoConfiguration.ABI::class)
@Signature("rc(Windows.Devices.Scanners.ImageScannerAutoConfiguration;{ae275d11-dadf-4010-bf10-cca5c83dcbb0})")
@WinRTByReference(brClass = ImageScannerAutoConfiguration.ByReference::class)
public class ImageScannerAutoConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IImageScannerFormatConfiguration.WithDefault, IWinRTObject {
  private val __787293148_Interface: IImageScannerFormatConfiguration.WithDefault by lazy {
    as_787293148()
  }


  public override val __787293148_Ptr: JNAPointer? by lazy {
    __787293148_Interface.__787293148_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__787293148_Interface)

  private fun as_787293148(): IImageScannerFormatConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IImageScannerFormatConfiguration.ABI.makeIImageScannerFormatConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageScannerFormatConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageScannerFormatConfiguration.ABI.makeIImageScannerFormatConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ImageScannerAutoConfiguration> {
    public override fun getValue() = ImageScannerAutoConfiguration(pointer.getPointer(0))

    public fun setValue(value: ImageScannerAutoConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageScannerAutoConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ImageScannerAutoConfiguration {
      val address = segment.toRawLongValue()
      return ImageScannerAutoConfiguration(Pointer(address))
    }

    public override fun toNative(obj: ImageScannerAutoConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
