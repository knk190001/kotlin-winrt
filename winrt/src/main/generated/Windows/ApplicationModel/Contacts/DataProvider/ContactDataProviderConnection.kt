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

@ABIMarker(ContactDataProviderConnection.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.DataProvider.ContactDataProviderConnection;{1a398a52-8c9d-4d6f-a4e0-111e9a125a30})")
@WinRTByReference(brClass = ContactDataProviderConnection.ByReference::class)
public class ContactDataProviderConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactDataProviderConnection.WithDefault,
    IContactDataProviderConnection2.WithDefault, IWinRTObject {
  private val __93780860_Interface: IContactDataProviderConnection.WithDefault by lazy {
    as_93780860()
  }


  private val __1387760586_Interface: IContactDataProviderConnection2.WithDefault by lazy {
    as_1387760586()
  }


  public override val __93780860_Ptr: JNAPointer? by lazy {
    __93780860_Interface.__93780860_Ptr
  }


  public override val __1387760586_Ptr: JNAPointer? by lazy {
    __1387760586_Interface.__1387760586_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__93780860_Interface, __1387760586_Interface)

  private fun as_93780860(): IContactDataProviderConnection.WithDefault {
    if(pointer == NULL) {
      return(IContactDataProviderConnection.ABI.makeIContactDataProviderConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactDataProviderConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactDataProviderConnection.ABI.makeIContactDataProviderConnection(ref.value))
  }

  private fun as_1387760586(): IContactDataProviderConnection2.WithDefault {
    if(pointer == NULL) {
      return(IContactDataProviderConnection2.ABI.makeIContactDataProviderConnection2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactDataProviderConnection2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactDataProviderConnection2.ABI.makeIContactDataProviderConnection2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactDataProviderConnection> {
    public override fun getValue() = ContactDataProviderConnection(pointer.getPointer(0))

    public fun setValue(value: ContactDataProviderConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactDataProviderConnection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactDataProviderConnection {
      val address = segment.toRawLongValue()
      return ContactDataProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: ContactDataProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
