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

@ABIMarker(ContactQueryTextSearch.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactQueryTextSearch;{f7e3f9cb-a957-439b-a0b7-1c02a1963ff0})")
@WinRTByReference(brClass = ContactQueryTextSearch.ByReference::class)
public class ContactQueryTextSearch(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactQueryTextSearch.WithDefault, IWinRTObject {
  private val __33150921_Interface: IContactQueryTextSearch.WithDefault by lazy {
    as_33150921()
  }


  public override val __33150921_Ptr: JNAPointer? by lazy {
    __33150921_Interface.__33150921_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__33150921_Interface)

  private fun as_33150921(): IContactQueryTextSearch.WithDefault {
    if(pointer == NULL) {
      return(IContactQueryTextSearch.ABI.makeIContactQueryTextSearch(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactQueryTextSearch>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactQueryTextSearch.ABI.makeIContactQueryTextSearch(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactQueryTextSearch> {
    public override fun getValue() = ContactQueryTextSearch(pointer.getPointer(0))

    public fun setValue(value: ContactQueryTextSearch): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactQueryTextSearch, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactQueryTextSearch {
      val address = segment.toRawLongValue()
      return ContactQueryTextSearch(Pointer(address))
    }

    public override fun toNative(obj: ContactQueryTextSearch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
