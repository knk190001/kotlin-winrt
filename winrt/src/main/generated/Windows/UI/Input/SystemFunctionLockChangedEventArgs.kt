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

@ABIMarker(SystemFunctionLockChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.SystemFunctionLockChangedEventArgs;{cd040608-fcf9-585c-beab-f1d2eaf364ab})")
@WinRTByReference(brClass = SystemFunctionLockChangedEventArgs.ByReference::class)
public class SystemFunctionLockChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemFunctionLockChangedEventArgs.WithDefault, IWinRTObject {
  private val __2126687069_Interface: ISystemFunctionLockChangedEventArgs.WithDefault by lazy {
    as_2126687069()
  }


  public override val __2126687069_Ptr: JNAPointer? by lazy {
    __2126687069_Interface.__2126687069_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2126687069_Interface)

  private fun as_2126687069(): ISystemFunctionLockChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISystemFunctionLockChangedEventArgs.ABI.makeISystemFunctionLockChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemFunctionLockChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemFunctionLockChangedEventArgs.ABI.makeISystemFunctionLockChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemFunctionLockChangedEventArgs> {
    public override fun getValue() = SystemFunctionLockChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SystemFunctionLockChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemFunctionLockChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemFunctionLockChangedEventArgs {
      val address = segment.toRawLongValue()
      return SystemFunctionLockChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SystemFunctionLockChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
