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

@ABIMarker(ContactReader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactReader;{d397e42e-1488-42f2-bf64-253f4884bfed})")
@WinRTByReference(brClass = ContactReader.ByReference::class)
public class ContactReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactReader.WithDefault, IWinRTObject {
  private val __2097001577_Interface: IContactReader.WithDefault by lazy {
    as_2097001577()
  }


  public override val __2097001577_Ptr: JNAPointer? by lazy {
    __2097001577_Interface.__2097001577_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2097001577_Interface)

  private fun as_2097001577(): IContactReader.WithDefault {
    if(pointer == NULL) {
      return(IContactReader.ABI.makeIContactReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactReader.ABI.makeIContactReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactReader>
      {
    public override fun getValue() = ContactReader(pointer.getPointer(0))

    public fun setValue(value: ContactReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactReader {
      val address = segment.toRawLongValue()
      return ContactReader(Pointer(address))
    }

    public override fun toNative(obj: ContactReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
