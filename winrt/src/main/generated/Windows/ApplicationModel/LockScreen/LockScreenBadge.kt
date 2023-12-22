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

@ABIMarker(LockScreenBadge.ABI::class)
@Signature("rc(Windows.ApplicationModel.LockScreen.LockScreenBadge;{e95105d9-2bff-4db0-9b4f-3824778b9c9a})")
@WinRTByReference(brClass = LockScreenBadge.ByReference::class)
public class LockScreenBadge(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILockScreenBadge.WithDefault, IWinRTObject {
  private val __1430450340_Interface: ILockScreenBadge.WithDefault by lazy {
    as_1430450340()
  }


  public override val __1430450340_Ptr: JNAPointer? by lazy {
    __1430450340_Interface.__1430450340_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1430450340_Interface)

  private fun as_1430450340(): ILockScreenBadge.WithDefault {
    if(pointer == NULL) {
      return(ILockScreenBadge.ABI.makeILockScreenBadge(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILockScreenBadge>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILockScreenBadge.ABI.makeILockScreenBadge(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LockScreenBadge> {
    public override fun getValue() = LockScreenBadge(pointer.getPointer(0))

    public fun setValue(value: LockScreenBadge): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LockScreenBadge, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LockScreenBadge {
      val address = segment.toRawLongValue()
      return LockScreenBadge(Pointer(address))
    }

    public override fun toNative(obj: LockScreenBadge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
