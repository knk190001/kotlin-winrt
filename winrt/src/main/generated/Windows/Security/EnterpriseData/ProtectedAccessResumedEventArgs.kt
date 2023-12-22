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

@ABIMarker(ProtectedAccessResumedEventArgs.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.ProtectedAccessResumedEventArgs;{ac4dca59-5d80-4e95-8c5f-8539450eebe0})")
@WinRTByReference(brClass = ProtectedAccessResumedEventArgs.ByReference::class)
public class ProtectedAccessResumedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProtectedAccessResumedEventArgs.WithDefault, IWinRTObject {
  private val __1069355095_Interface: IProtectedAccessResumedEventArgs.WithDefault by lazy {
    as_1069355095()
  }


  public override val __1069355095_Ptr: JNAPointer? by lazy {
    __1069355095_Interface.__1069355095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1069355095_Interface)

  private fun as_1069355095(): IProtectedAccessResumedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IProtectedAccessResumedEventArgs.ABI.makeIProtectedAccessResumedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProtectedAccessResumedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProtectedAccessResumedEventArgs.ABI.makeIProtectedAccessResumedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProtectedAccessResumedEventArgs> {
    public override fun getValue() = ProtectedAccessResumedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ProtectedAccessResumedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProtectedAccessResumedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProtectedAccessResumedEventArgs {
      val address = segment.toRawLongValue()
      return ProtectedAccessResumedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ProtectedAccessResumedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
