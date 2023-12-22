package Windows.UI.ViewManagement

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

@ABIMarker(StatusBarProgressIndicator.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.StatusBarProgressIndicator;{76cb2670-a3d7-49cf-8200-4f3eedca27bb})")
@WinRTByReference(brClass = StatusBarProgressIndicator.ByReference::class)
public class StatusBarProgressIndicator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStatusBarProgressIndicator.WithDefault, IWinRTObject {
  private val __1269480883_Interface: IStatusBarProgressIndicator.WithDefault by lazy {
    as_1269480883()
  }


  public override val __1269480883_Ptr: JNAPointer? by lazy {
    __1269480883_Interface.__1269480883_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1269480883_Interface)

  private fun as_1269480883(): IStatusBarProgressIndicator.WithDefault {
    if(pointer == NULL) {
      return(IStatusBarProgressIndicator.ABI.makeIStatusBarProgressIndicator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStatusBarProgressIndicator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStatusBarProgressIndicator.ABI.makeIStatusBarProgressIndicator(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StatusBarProgressIndicator> {
    public override fun getValue() = StatusBarProgressIndicator(pointer.getPointer(0))

    public fun setValue(value: StatusBarProgressIndicator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StatusBarProgressIndicator, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StatusBarProgressIndicator {
      val address = segment.toRawLongValue()
      return StatusBarProgressIndicator(Pointer(address))
    }

    public override fun toNative(obj: StatusBarProgressIndicator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
