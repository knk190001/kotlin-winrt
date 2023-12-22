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

@ABIMarker(SystemFunctionButtonEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.SystemFunctionButtonEventArgs;{4833896f-80d1-5dd6-92a7-62a508ffef5a})")
@WinRTByReference(brClass = SystemFunctionButtonEventArgs.ByReference::class)
public class SystemFunctionButtonEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemFunctionButtonEventArgs.WithDefault, IWinRTObject {
  private val __1553575088_Interface: ISystemFunctionButtonEventArgs.WithDefault by lazy {
    as_1553575088()
  }


  public override val __1553575088_Ptr: JNAPointer? by lazy {
    __1553575088_Interface.__1553575088_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1553575088_Interface)

  private fun as_1553575088(): ISystemFunctionButtonEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISystemFunctionButtonEventArgs.ABI.makeISystemFunctionButtonEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemFunctionButtonEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemFunctionButtonEventArgs.ABI.makeISystemFunctionButtonEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemFunctionButtonEventArgs> {
    public override fun getValue() = SystemFunctionButtonEventArgs(pointer.getPointer(0))

    public fun setValue(value: SystemFunctionButtonEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemFunctionButtonEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemFunctionButtonEventArgs {
      val address = segment.toRawLongValue()
      return SystemFunctionButtonEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SystemFunctionButtonEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
