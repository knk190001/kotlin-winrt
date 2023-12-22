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

@ABIMarker(ContactDataProviderTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.DataProvider.ContactDataProviderTriggerDetails;{527104be-3c62-43c8-9ae7-db531685cd99})")
@WinRTByReference(brClass = ContactDataProviderTriggerDetails.ByReference::class)
public class ContactDataProviderTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactDataProviderTriggerDetails.WithDefault, IWinRTObject {
  private val __1082381064_Interface: IContactDataProviderTriggerDetails.WithDefault by lazy {
    as_1082381064()
  }


  public override val __1082381064_Ptr: JNAPointer? by lazy {
    __1082381064_Interface.__1082381064_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1082381064_Interface)

  private fun as_1082381064(): IContactDataProviderTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IContactDataProviderTriggerDetails.ABI.makeIContactDataProviderTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactDataProviderTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactDataProviderTriggerDetails.ABI.makeIContactDataProviderTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactDataProviderTriggerDetails> {
    public override fun getValue() = ContactDataProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ContactDataProviderTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactDataProviderTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactDataProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return ContactDataProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ContactDataProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
