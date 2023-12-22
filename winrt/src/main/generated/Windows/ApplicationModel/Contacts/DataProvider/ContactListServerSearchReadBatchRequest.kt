package Windows.ApplicationModel.Contacts.DataProvider

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

@ABIMarker(ContactListServerSearchReadBatchRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.DataProvider.ContactListServerSearchReadBatchRequest;{ba776a97-4030-4925-9fb4-143b295e653b})")
@WinRTByReference(brClass = ContactListServerSearchReadBatchRequest.ByReference::class)
public class ContactListServerSearchReadBatchRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactListServerSearchReadBatchRequest.WithDefault, IWinRTObject {
  private val __2129883625_Interface: IContactListServerSearchReadBatchRequest.WithDefault by lazy {
    as_2129883625()
  }


  public override val __2129883625_Ptr: JNAPointer? by lazy {
    __2129883625_Interface.__2129883625_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2129883625_Interface)

  private fun as_2129883625(): IContactListServerSearchReadBatchRequest.WithDefault {
    if(pointer == NULL) {
      return(IContactListServerSearchReadBatchRequest.ABI.makeIContactListServerSearchReadBatchRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactListServerSearchReadBatchRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactListServerSearchReadBatchRequest.ABI.makeIContactListServerSearchReadBatchRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactListServerSearchReadBatchRequest> {
    public override fun getValue() = ContactListServerSearchReadBatchRequest(pointer.getPointer(0))

    public fun setValue(value: ContactListServerSearchReadBatchRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactListServerSearchReadBatchRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ContactListServerSearchReadBatchRequest {
      val address = segment.toRawLongValue()
      return ContactListServerSearchReadBatchRequest(Pointer(address))
    }

    public override fun toNative(obj: ContactListServerSearchReadBatchRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
