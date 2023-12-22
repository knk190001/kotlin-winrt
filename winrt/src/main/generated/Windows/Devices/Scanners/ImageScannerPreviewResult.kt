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

@ABIMarker(ImageScannerPreviewResult.ABI::class)
@Signature("rc(Windows.Devices.Scanners.ImageScannerPreviewResult;{08b7fe8e-8891-441d-be9c-176fa109c8bb})")
@WinRTByReference(brClass = ImageScannerPreviewResult.ByReference::class)
public class ImageScannerPreviewResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IImageScannerPreviewResult.WithDefault, IWinRTObject {
  private val __925661098_Interface: IImageScannerPreviewResult.WithDefault by lazy {
    as_925661098()
  }


  public override val __925661098_Ptr: JNAPointer? by lazy {
    __925661098_Interface.__925661098_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__925661098_Interface)

  private fun as_925661098(): IImageScannerPreviewResult.WithDefault {
    if(pointer == NULL) {
      return(IImageScannerPreviewResult.ABI.makeIImageScannerPreviewResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageScannerPreviewResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageScannerPreviewResult.ABI.makeIImageScannerPreviewResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ImageScannerPreviewResult> {
    public override fun getValue() = ImageScannerPreviewResult(pointer.getPointer(0))

    public fun setValue(value: ImageScannerPreviewResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageScannerPreviewResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ImageScannerPreviewResult {
      val address = segment.toRawLongValue()
      return ImageScannerPreviewResult(Pointer(address))
    }

    public override fun toNative(obj: ImageScannerPreviewResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
