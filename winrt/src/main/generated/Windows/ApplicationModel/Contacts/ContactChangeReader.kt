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

@ABIMarker(ContactChangeReader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactChangeReader;{217319fa-2d0c-42e0-a9da-3ecd56a78a47})")
@WinRTByReference(brClass = ContactChangeReader.ByReference::class)
public class ContactChangeReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactChangeReader.WithDefault, IWinRTObject {
  private val __676878439_Interface: IContactChangeReader.WithDefault by lazy {
    as_676878439()
  }


  public override val __676878439_Ptr: JNAPointer? by lazy {
    __676878439_Interface.__676878439_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__676878439_Interface)

  private fun as_676878439(): IContactChangeReader.WithDefault {
    if(pointer == NULL) {
      return(IContactChangeReader.ABI.makeIContactChangeReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactChangeReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactChangeReader.ABI.makeIContactChangeReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactChangeReader> {
    public override fun getValue() = ContactChangeReader(pointer.getPointer(0))

    public fun setValue(value: ContactChangeReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactChangeReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactChangeReader {
      val address = segment.toRawLongValue()
      return ContactChangeReader(Pointer(address))
    }

    public override fun toNative(obj: ContactChangeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
