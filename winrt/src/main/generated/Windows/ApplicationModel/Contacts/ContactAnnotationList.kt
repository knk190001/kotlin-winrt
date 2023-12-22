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

@ABIMarker(ContactAnnotationList.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactAnnotationList;{92a486aa-5c88-45b9-aad0-461888e68d8a})")
@WinRTByReference(brClass = ContactAnnotationList.ByReference::class)
public class ContactAnnotationList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactAnnotationList.WithDefault, IWinRTObject {
  private val __242466625_Interface: IContactAnnotationList.WithDefault by lazy {
    as_242466625()
  }


  public override val __242466625_Ptr: JNAPointer? by lazy {
    __242466625_Interface.__242466625_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__242466625_Interface)

  private fun as_242466625(): IContactAnnotationList.WithDefault {
    if(pointer == NULL) {
      return(IContactAnnotationList.ABI.makeIContactAnnotationList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactAnnotationList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactAnnotationList.ABI.makeIContactAnnotationList(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactAnnotationList> {
    public override fun getValue() = ContactAnnotationList(pointer.getPointer(0))

    public fun setValue(value: ContactAnnotationList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactAnnotationList, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactAnnotationList {
      val address = segment.toRawLongValue()
      return ContactAnnotationList(Pointer(address))
    }

    public override fun toNative(obj: ContactAnnotationList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
