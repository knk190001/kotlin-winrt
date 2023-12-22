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

@ABIMarker(AppWindowPlacement.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.AppWindowPlacement;{03dc815e-e7a9-5857-9c03-7d670594410e})")
@WinRTByReference(brClass = AppWindowPlacement.ByReference::class)
public class AppWindowPlacement(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindowPlacement.WithDefault, IWinRTObject {
  private val __356611877_Interface: IAppWindowPlacement.WithDefault by lazy {
    as_356611877()
  }


  public override val __356611877_Ptr: JNAPointer? by lazy {
    __356611877_Interface.__356611877_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__356611877_Interface)

  private fun as_356611877(): IAppWindowPlacement.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowPlacement.ABI.makeIAppWindowPlacement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowPlacement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowPlacement.ABI.makeIAppWindowPlacement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppWindowPlacement> {
    public override fun getValue() = AppWindowPlacement(pointer.getPointer(0))

    public fun setValue(value: AppWindowPlacement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindowPlacement, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppWindowPlacement {
      val address = segment.toRawLongValue()
      return AppWindowPlacement(Pointer(address))
    }

    public override fun toNative(obj: AppWindowPlacement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
