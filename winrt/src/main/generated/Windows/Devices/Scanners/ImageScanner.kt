package Windows.Devices.Scanners

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ImageScanner.ABI::class)
@Signature("rc(Windows.Devices.Scanners.ImageScanner;{53a88f78-5298-48a0-8da3-8087519665e0})")
@WinRTByReference(brClass = ImageScanner.ByReference::class)
public class ImageScanner(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IImageScanner.WithDefault, IWinRTObject {
  private val __689742309_Interface: IImageScanner.WithDefault by lazy {
    as_689742309()
  }


  public override val __689742309_Ptr: JNAPointer? by lazy {
    __689742309_Interface.__689742309_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__689742309_Interface)

  private fun as_689742309(): IImageScanner.WithDefault {
    if(pointer == NULL) {
      return(IImageScanner.ABI.makeIImageScanner(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageScanner>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageScanner.ABI.makeIImageScanner(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ImageScanner> {
    public override fun getValue() = ImageScanner(pointer.getPointer(0))

    public fun setValue(value: ImageScanner): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageScanner, MemoryAddress> {
    public val IImageScannerStatics_Instance: IImageScannerStatics by lazy {
      createIImageScannerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIImageScannerStatics(): IImageScannerStatics {
      val refiid = Guid.REFIID(IImageScannerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Scanners.ImageScanner".toHandle(),refiid,interfacePtr)
      val result = IImageScannerStatics.ABI.makeIImageScannerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ImageScanner {
      val address = segment.toRawLongValue()
      return ImageScanner(Pointer(address))
    }

    public override fun toNative(obj: ImageScanner): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIdAsync(deviceId: String) =
        ABI.IImageScannerStatics_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector() = ABI.IImageScannerStatics_Instance.GetDeviceSelector()
  }
}
