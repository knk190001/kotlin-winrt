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

@ABIMarker(PhoneCallHistoryStore.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneCallHistoryStore;{2f907db8-b40e-422b-8545-cb1910a61c52})")
@WinRTByReference(brClass = PhoneCallHistoryStore.ByReference::class)
public class PhoneCallHistoryStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallHistoryStore.WithDefault, IWinRTObject {
  private val __1832409083_Interface: IPhoneCallHistoryStore.WithDefault by lazy {
    as_1832409083()
  }


  public override val __1832409083_Ptr: JNAPointer? by lazy {
    __1832409083_Interface.__1832409083_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1832409083_Interface)

  private fun as_1832409083(): IPhoneCallHistoryStore.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallHistoryStore.ABI.makeIPhoneCallHistoryStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallHistoryStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallHistoryStore.ABI.makeIPhoneCallHistoryStore(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallHistoryStore> {
    public override fun getValue() = PhoneCallHistoryStore(pointer.getPointer(0))

    public fun setValue(value: PhoneCallHistoryStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallHistoryStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneCallHistoryStore {
      val address = segment.toRawLongValue()
      return PhoneCallHistoryStore(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallHistoryStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
