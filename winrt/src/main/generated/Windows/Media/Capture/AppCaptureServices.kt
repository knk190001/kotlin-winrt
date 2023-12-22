package Windows.Media.Capture

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

@ABIMarker(AppCaptureServices.ABI::class)
@Signature("rc(Windows.Media.Capture.AppCaptureServices;{44fec0b5-34f5-4f18-ae8c-b9123abbfc0d})")
@WinRTByReference(brClass = AppCaptureServices.ByReference::class)
public class AppCaptureServices(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppCaptureServices.WithDefault, IWinRTObject {
  private val __655799493_Interface: IAppCaptureServices.WithDefault by lazy {
    as_655799493()
  }


  public override val __655799493_Ptr: JNAPointer? by lazy {
    __655799493_Interface.__655799493_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__655799493_Interface)

  private fun as_655799493(): IAppCaptureServices.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureServices.ABI.makeIAppCaptureServices(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureServices>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureServices.ABI.makeIAppCaptureServices(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppCaptureServices> {
    public override fun getValue() = AppCaptureServices(pointer.getPointer(0))

    public fun setValue(value: AppCaptureServices): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppCaptureServices, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppCaptureServices {
      val address = segment.toRawLongValue()
      return AppCaptureServices(Pointer(address))
    }

    public override fun toNative(obj: AppCaptureServices): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
