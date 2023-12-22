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

@ABIMarker(PhoneCallStore.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneCallStore;{5f610748-18a6-4173-86d1-28be9dc62dba})")
@WinRTByReference(brClass = PhoneCallStore.ByReference::class)
public class PhoneCallStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallStore.WithDefault, IWinRTObject {
  private val __1156580013_Interface: IPhoneCallStore.WithDefault by lazy {
    as_1156580013()
  }


  public override val __1156580013_Ptr: JNAPointer? by lazy {
    __1156580013_Interface.__1156580013_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1156580013_Interface)

  private fun as_1156580013(): IPhoneCallStore.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallStore.ABI.makeIPhoneCallStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallStore.ABI.makeIPhoneCallStore(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PhoneCallStore>
      {
    public override fun getValue() = PhoneCallStore(pointer.getPointer(0))

    public fun setValue(value: PhoneCallStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneCallStore {
      val address = segment.toRawLongValue()
      return PhoneCallStore(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
