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

@ABIMarker(ImageScannerScanResult.ABI::class)
@Signature("rc(Windows.Devices.Scanners.ImageScannerScanResult;{c91624cd-9037-4e48-84c1-ac0975076bc5})")
@WinRTByReference(brClass = ImageScannerScanResult.ByReference::class)
public class ImageScannerScanResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IImageScannerScanResult.WithDefault, IWinRTObject {
  private val __1206026891_Interface: IImageScannerScanResult.WithDefault by lazy {
    as_1206026891()
  }


  public override val __1206026891_Ptr: JNAPointer? by lazy {
    __1206026891_Interface.__1206026891_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1206026891_Interface)

  private fun as_1206026891(): IImageScannerScanResult.WithDefault {
    if(pointer == NULL) {
      return(IImageScannerScanResult.ABI.makeIImageScannerScanResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageScannerScanResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageScannerScanResult.ABI.makeIImageScannerScanResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ImageScannerScanResult> {
    public override fun getValue() = ImageScannerScanResult(pointer.getPointer(0))

    public fun setValue(value: ImageScannerScanResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageScannerScanResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ImageScannerScanResult {
      val address = segment.toRawLongValue()
      return ImageScannerScanResult(Pointer(address))
    }

    public override fun toNative(obj: ImageScannerScanResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
