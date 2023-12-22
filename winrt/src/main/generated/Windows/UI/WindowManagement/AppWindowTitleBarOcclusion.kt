package Windows.UI.WindowManagement

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

@ABIMarker(AppWindowTitleBarOcclusion.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.AppWindowTitleBarOcclusion;{fea3cffd-2ccf-5fc3-aeae-f843876bf37e})")
@WinRTByReference(brClass = AppWindowTitleBarOcclusion.ByReference::class)
public class AppWindowTitleBarOcclusion(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindowTitleBarOcclusion.WithDefault, IWinRTObject {
  private val __584072920_Interface: IAppWindowTitleBarOcclusion.WithDefault by lazy {
    as_584072920()
  }


  public override val __584072920_Ptr: JNAPointer? by lazy {
    __584072920_Interface.__584072920_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__584072920_Interface)

  private fun as_584072920(): IAppWindowTitleBarOcclusion.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowTitleBarOcclusion.ABI.makeIAppWindowTitleBarOcclusion(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowTitleBarOcclusion>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowTitleBarOcclusion.ABI.makeIAppWindowTitleBarOcclusion(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppWindowTitleBarOcclusion> {
    public override fun getValue() = AppWindowTitleBarOcclusion(pointer.getPointer(0))

    public fun setValue(value: AppWindowTitleBarOcclusion): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindowTitleBarOcclusion, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppWindowTitleBarOcclusion {
      val address = segment.toRawLongValue()
      return AppWindowTitleBarOcclusion(Pointer(address))
    }

    public override fun toNative(obj: AppWindowTitleBarOcclusion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
