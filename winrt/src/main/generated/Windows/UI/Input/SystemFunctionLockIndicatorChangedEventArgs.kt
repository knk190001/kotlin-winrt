package Windows.UI.Input

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

@ABIMarker(SystemFunctionLockIndicatorChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.SystemFunctionLockIndicatorChangedEventArgs;{b212b94e-7a6f-58ae-b304-bae61d0371b9})")
@WinRTByReference(brClass = SystemFunctionLockIndicatorChangedEventArgs.ByReference::class)
public class SystemFunctionLockIndicatorChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemFunctionLockIndicatorChangedEventArgs.WithDefault, IWinRTObject {
  private val __1091051538_Interface: ISystemFunctionLockIndicatorChangedEventArgs.WithDefault by
      lazy {
    as_1091051538()
  }


  public override val __1091051538_Ptr: JNAPointer? by lazy {
    __1091051538_Interface.__1091051538_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1091051538_Interface)

  private fun as_1091051538(): ISystemFunctionLockIndicatorChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISystemFunctionLockIndicatorChangedEventArgs.ABI.makeISystemFunctionLockIndicatorChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemFunctionLockIndicatorChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemFunctionLockIndicatorChangedEventArgs.ABI.makeISystemFunctionLockIndicatorChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemFunctionLockIndicatorChangedEventArgs> {
    public override fun getValue() =
        SystemFunctionLockIndicatorChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SystemFunctionLockIndicatorChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemFunctionLockIndicatorChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SystemFunctionLockIndicatorChangedEventArgs {
      val address = segment.toRawLongValue()
      return SystemFunctionLockIndicatorChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SystemFunctionLockIndicatorChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
