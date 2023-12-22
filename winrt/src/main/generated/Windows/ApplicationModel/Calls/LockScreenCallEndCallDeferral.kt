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

@ABIMarker(LockScreenCallEndCallDeferral.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.LockScreenCallEndCallDeferral;{2dd7ed0d-98ed-4041-9632-50ff812b773f})")
@WinRTByReference(brClass = LockScreenCallEndCallDeferral.ByReference::class)
public class LockScreenCallEndCallDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILockScreenCallEndCallDeferral.WithDefault, IWinRTObject {
  private val __1013632655_Interface: ILockScreenCallEndCallDeferral.WithDefault by lazy {
    as_1013632655()
  }


  public override val __1013632655_Ptr: JNAPointer? by lazy {
    __1013632655_Interface.__1013632655_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1013632655_Interface)

  private fun as_1013632655(): ILockScreenCallEndCallDeferral.WithDefault {
    if(pointer == NULL) {
      return(ILockScreenCallEndCallDeferral.ABI.makeILockScreenCallEndCallDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILockScreenCallEndCallDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILockScreenCallEndCallDeferral.ABI.makeILockScreenCallEndCallDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LockScreenCallEndCallDeferral> {
    public override fun getValue() = LockScreenCallEndCallDeferral(pointer.getPointer(0))

    public fun setValue(value: LockScreenCallEndCallDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LockScreenCallEndCallDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LockScreenCallEndCallDeferral {
      val address = segment.toRawLongValue()
      return LockScreenCallEndCallDeferral(Pointer(address))
    }

    public override fun toNative(obj: LockScreenCallEndCallDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
