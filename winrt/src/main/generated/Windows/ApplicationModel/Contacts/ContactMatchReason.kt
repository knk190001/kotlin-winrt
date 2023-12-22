package Windows.ApplicationModel.Contacts

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

@ABIMarker(ContactMatchReason.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactMatchReason;{bc922504-e7d8-413e-95f4-b75c54c74077})")
@WinRTByReference(brClass = ContactMatchReason.ByReference::class)
public class ContactMatchReason(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactMatchReason.WithDefault, IWinRTObject {
  private val __1489691157_Interface: IContactMatchReason.WithDefault by lazy {
    as_1489691157()
  }


  public override val __1489691157_Ptr: JNAPointer? by lazy {
    __1489691157_Interface.__1489691157_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1489691157_Interface)

  private fun as_1489691157(): IContactMatchReason.WithDefault {
    if(pointer == NULL) {
      return(IContactMatchReason.ABI.makeIContactMatchReason(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactMatchReason>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactMatchReason.ABI.makeIContactMatchReason(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactMatchReason> {
    public override fun getValue() = ContactMatchReason(pointer.getPointer(0))

    public fun setValue(value: ContactMatchReason): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactMatchReason, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactMatchReason {
      val address = segment.toRawLongValue()
      return ContactMatchReason(Pointer(address))
    }

    public override fun toNative(obj: ContactMatchReason): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
