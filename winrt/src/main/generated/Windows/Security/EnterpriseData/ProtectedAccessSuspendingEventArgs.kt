package Windows.Security.EnterpriseData

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

@ABIMarker(ProtectedAccessSuspendingEventArgs.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.ProtectedAccessSuspendingEventArgs;{75a193e0-a344-429f-b975-04fc1f88c185})")
@WinRTByReference(brClass = ProtectedAccessSuspendingEventArgs.ByReference::class)
public class ProtectedAccessSuspendingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProtectedAccessSuspendingEventArgs.WithDefault, IWinRTObject {
  private val __187387430_Interface: IProtectedAccessSuspendingEventArgs.WithDefault by lazy {
    as_187387430()
  }


  public override val __187387430_Ptr: JNAPointer? by lazy {
    __187387430_Interface.__187387430_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__187387430_Interface)

  private fun as_187387430(): IProtectedAccessSuspendingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IProtectedAccessSuspendingEventArgs.ABI.makeIProtectedAccessSuspendingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProtectedAccessSuspendingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProtectedAccessSuspendingEventArgs.ABI.makeIProtectedAccessSuspendingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProtectedAccessSuspendingEventArgs> {
    public override fun getValue() = ProtectedAccessSuspendingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ProtectedAccessSuspendingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProtectedAccessSuspendingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProtectedAccessSuspendingEventArgs {
      val address = segment.toRawLongValue()
      return ProtectedAccessSuspendingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ProtectedAccessSuspendingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
