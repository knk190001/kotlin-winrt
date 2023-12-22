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

@ABIMarker(ContactChange.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactChange;{951d4b10-6a59-4720-a4e1-363d98c135d5})")
@WinRTByReference(brClass = ContactChange.ByReference::class)
public class ContactChange(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactChange.WithDefault, IWinRTObject {
  private val __1771308676_Interface: IContactChange.WithDefault by lazy {
    as_1771308676()
  }


  public override val __1771308676_Ptr: JNAPointer? by lazy {
    __1771308676_Interface.__1771308676_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1771308676_Interface)

  private fun as_1771308676(): IContactChange.WithDefault {
    if(pointer == NULL) {
      return(IContactChange.ABI.makeIContactChange(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactChange>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactChange.ABI.makeIContactChange(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactChange>
      {
    public override fun getValue() = ContactChange(pointer.getPointer(0))

    public fun setValue(value: ContactChange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactChange, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactChange {
      val address = segment.toRawLongValue()
      return ContactChange(Pointer(address))
    }

    public override fun toNative(obj: ContactChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
