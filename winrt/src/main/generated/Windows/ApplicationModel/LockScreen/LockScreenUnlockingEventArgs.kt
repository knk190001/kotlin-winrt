package Windows.ApplicationModel.LockScreen

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

@ABIMarker(LockScreenUnlockingEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.LockScreen.LockScreenUnlockingEventArgs;{44e6c007-75fb-4abb-9f8b-824748900c71})")
@WinRTByReference(brClass = LockScreenUnlockingEventArgs.ByReference::class)
public class LockScreenUnlockingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILockScreenUnlockingEventArgs.WithDefault, IWinRTObject {
  private val __1040855368_Interface: ILockScreenUnlockingEventArgs.WithDefault by lazy {
    as_1040855368()
  }


  public override val __1040855368_Ptr: JNAPointer? by lazy {
    __1040855368_Interface.__1040855368_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1040855368_Interface)

  private fun as_1040855368(): ILockScreenUnlockingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILockScreenUnlockingEventArgs.ABI.makeILockScreenUnlockingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILockScreenUnlockingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILockScreenUnlockingEventArgs.ABI.makeILockScreenUnlockingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LockScreenUnlockingEventArgs> {
    public override fun getValue() = LockScreenUnlockingEventArgs(pointer.getPointer(0))

    public fun setValue(value: LockScreenUnlockingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LockScreenUnlockingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LockScreenUnlockingEventArgs {
      val address = segment.toRawLongValue()
      return LockScreenUnlockingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LockScreenUnlockingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
