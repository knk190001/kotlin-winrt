package Windows.ApplicationModel.AppService

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

@ABIMarker(AppServiceDeferral.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppService.AppServiceDeferral;{7e1b5322-eab0-4248-ae04-fdf93838e472})")
@WinRTByReference(brClass = AppServiceDeferral.ByReference::class)
public class AppServiceDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppServiceDeferral.WithDefault, IWinRTObject {
  private val __1341551958_Interface: IAppServiceDeferral.WithDefault by lazy {
    as_1341551958()
  }


  public override val __1341551958_Ptr: JNAPointer? by lazy {
    __1341551958_Interface.__1341551958_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1341551958_Interface)

  private fun as_1341551958(): IAppServiceDeferral.WithDefault {
    if(pointer == NULL) {
      return(IAppServiceDeferral.ABI.makeIAppServiceDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppServiceDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppServiceDeferral.ABI.makeIAppServiceDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppServiceDeferral> {
    public override fun getValue() = AppServiceDeferral(pointer.getPointer(0))

    public fun setValue(value: AppServiceDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppServiceDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppServiceDeferral {
      val address = segment.toRawLongValue()
      return AppServiceDeferral(Pointer(address))
    }

    public override fun toNative(obj: AppServiceDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
