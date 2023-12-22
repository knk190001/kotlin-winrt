package Windows.ApplicationModel.Calls

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

@ABIMarker(LockScreenCallEndRequestedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.LockScreenCallEndRequestedEventArgs;{8190a363-6f27-46e9-aeb6-c0ae83e47dc7})")
@WinRTByReference(brClass = LockScreenCallEndRequestedEventArgs.ByReference::class)
public class LockScreenCallEndRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILockScreenCallEndRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1067376047_Interface: ILockScreenCallEndRequestedEventArgs.WithDefault by lazy {
    as_1067376047()
  }


  public override val __1067376047_Ptr: JNAPointer? by lazy {
    __1067376047_Interface.__1067376047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1067376047_Interface)

  private fun as_1067376047(): ILockScreenCallEndRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILockScreenCallEndRequestedEventArgs.ABI.makeILockScreenCallEndRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILockScreenCallEndRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILockScreenCallEndRequestedEventArgs.ABI.makeILockScreenCallEndRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LockScreenCallEndRequestedEventArgs> {
    public override fun getValue() = LockScreenCallEndRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: LockScreenCallEndRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LockScreenCallEndRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LockScreenCallEndRequestedEventArgs {
      val address = segment.toRawLongValue()
      return LockScreenCallEndRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LockScreenCallEndRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
