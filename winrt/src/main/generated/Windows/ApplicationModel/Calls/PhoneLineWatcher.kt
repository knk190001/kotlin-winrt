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

@ABIMarker(PhoneLineWatcher.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneLineWatcher;{8a45cd0a-6323-44e0-a6f6-9f21f64dc90a})")
@WinRTByReference(brClass = PhoneLineWatcher.ByReference::class)
public class PhoneLineWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneLineWatcher.WithDefault, IWinRTObject {
  private val __438894424_Interface: IPhoneLineWatcher.WithDefault by lazy {
    as_438894424()
  }


  public override val __438894424_Ptr: JNAPointer? by lazy {
    __438894424_Interface.__438894424_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__438894424_Interface)

  private fun as_438894424(): IPhoneLineWatcher.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLineWatcher.ABI.makeIPhoneLineWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLineWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLineWatcher.ABI.makeIPhoneLineWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneLineWatcher> {
    public override fun getValue() = PhoneLineWatcher(pointer.getPointer(0))

    public fun setValue(value: PhoneLineWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneLineWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneLineWatcher {
      val address = segment.toRawLongValue()
      return PhoneLineWatcher(Pointer(address))
    }

    public override fun toNative(obj: PhoneLineWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
