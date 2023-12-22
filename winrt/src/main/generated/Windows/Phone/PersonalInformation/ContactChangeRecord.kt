package Windows.Phone.PersonalInformation

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

@ABIMarker(ContactChangeRecord.ABI::class)
@Signature("rc(Windows.Phone.PersonalInformation.ContactChangeRecord;{b9d3f78f-513b-4742-be00-cc5c5c236b04})")
@WinRTByReference(brClass = ContactChangeRecord.ByReference::class)
public class ContactChangeRecord(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactChangeRecord.WithDefault, IWinRTObject {
  private val __1135212263_Interface: IContactChangeRecord.WithDefault by lazy {
    as_1135212263()
  }


  public override val __1135212263_Ptr: JNAPointer? by lazy {
    __1135212263_Interface.__1135212263_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1135212263_Interface)

  private fun as_1135212263(): IContactChangeRecord.WithDefault {
    if(pointer == NULL) {
      return(IContactChangeRecord.ABI.makeIContactChangeRecord(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactChangeRecord>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactChangeRecord.ABI.makeIContactChangeRecord(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactChangeRecord> {
    public override fun getValue() = ContactChangeRecord(pointer.getPointer(0))

    public fun setValue(value: ContactChangeRecord): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactChangeRecord, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactChangeRecord {
      val address = segment.toRawLongValue()
      return ContactChangeRecord(Pointer(address))
    }

    public override fun toNative(obj: ContactChangeRecord): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
