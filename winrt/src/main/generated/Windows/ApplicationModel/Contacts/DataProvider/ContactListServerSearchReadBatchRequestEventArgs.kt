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

@ABIMarker(ContactListServerSearchReadBatchRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.DataProvider.ContactListServerSearchReadBatchRequestEventArgs;{1a27e87b-69d7-4e4e-8042-861cba61471e})")
@WinRTByReference(brClass = ContactListServerSearchReadBatchRequestEventArgs.ByReference::class)
public class ContactListServerSearchReadBatchRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactListServerSearchReadBatchRequestEventArgs.WithDefault, IWinRTObject {
  private val __353719872_Interface: IContactListServerSearchReadBatchRequestEventArgs.WithDefault
      by lazy {
    as_353719872()
  }


  public override val __353719872_Ptr: JNAPointer? by lazy {
    __353719872_Interface.__353719872_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__353719872_Interface)

  private fun as_353719872(): IContactListServerSearchReadBatchRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactListServerSearchReadBatchRequestEventArgs.ABI.makeIContactListServerSearchReadBatchRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactListServerSearchReadBatchRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactListServerSearchReadBatchRequestEventArgs.ABI.makeIContactListServerSearchReadBatchRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactListServerSearchReadBatchRequestEventArgs> {
    public override fun getValue() =
        ContactListServerSearchReadBatchRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContactListServerSearchReadBatchRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactListServerSearchReadBatchRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ContactListServerSearchReadBatchRequestEventArgs {
      val address = segment.toRawLongValue()
      return ContactListServerSearchReadBatchRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContactListServerSearchReadBatchRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
