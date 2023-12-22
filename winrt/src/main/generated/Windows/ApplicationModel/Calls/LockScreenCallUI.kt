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

@ABIMarker(LockScreenCallUI.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.LockScreenCallUI;{c596fd8d-73c9-4a14-b021-ec1c50a3b727})")
@WinRTByReference(brClass = LockScreenCallUI.ByReference::class)
public class LockScreenCallUI(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILockScreenCallUI.WithDefault, IWinRTObject {
  private val __1772404807_Interface: ILockScreenCallUI.WithDefault by lazy {
    as_1772404807()
  }


  public override val __1772404807_Ptr: JNAPointer? by lazy {
    __1772404807_Interface.__1772404807_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1772404807_Interface)

  private fun as_1772404807(): ILockScreenCallUI.WithDefault {
    if(pointer == NULL) {
      return(ILockScreenCallUI.ABI.makeILockScreenCallUI(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILockScreenCallUI>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILockScreenCallUI.ABI.makeILockScreenCallUI(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LockScreenCallUI> {
    public override fun getValue() = LockScreenCallUI(pointer.getPointer(0))

    public fun setValue(value: LockScreenCallUI): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LockScreenCallUI, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LockScreenCallUI {
      val address = segment.toRawLongValue()
      return LockScreenCallUI(Pointer(address))
    }

    public override fun toNative(obj: LockScreenCallUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
