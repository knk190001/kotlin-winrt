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

@ABIMarker(ContactGroup.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactGroup;{59bdeb01-9e9a-475d-bfe5-a37b806d852c})")
@WinRTByReference(brClass = ContactGroup.ByReference::class)
public class ContactGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactGroup.WithDefault, IWinRTObject {
  private val __1324328661_Interface: IContactGroup.WithDefault by lazy {
    as_1324328661()
  }


  public override val __1324328661_Ptr: JNAPointer? by lazy {
    __1324328661_Interface.__1324328661_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1324328661_Interface)

  private fun as_1324328661(): IContactGroup.WithDefault {
    if(pointer == NULL) {
      return(IContactGroup.ABI.makeIContactGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactGroup.ABI.makeIContactGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactGroup> {
    public override fun getValue() = ContactGroup(pointer.getPointer(0))

    public fun setValue(value: ContactGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactGroup, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactGroup {
      val address = segment.toRawLongValue()
      return ContactGroup(Pointer(address))
    }

    public override fun toNative(obj: ContactGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
