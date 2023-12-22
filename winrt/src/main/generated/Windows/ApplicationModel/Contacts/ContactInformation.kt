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

@ABIMarker(ContactInformation.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactInformation;{275eb6d4-6a2e-4278-a914-e460d5f088f6})")
@WinRTByReference(brClass = ContactInformation.ByReference::class)
public class ContactInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactInformation.WithDefault, IWinRTObject {
  private val __1856251608_Interface: IContactInformation.WithDefault by lazy {
    as_1856251608()
  }


  public override val __1856251608_Ptr: JNAPointer? by lazy {
    __1856251608_Interface.__1856251608_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1856251608_Interface)

  private fun as_1856251608(): IContactInformation.WithDefault {
    if(pointer == NULL) {
      return(IContactInformation.ABI.makeIContactInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactInformation.ABI.makeIContactInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactInformation> {
    public override fun getValue() = ContactInformation(pointer.getPointer(0))

    public fun setValue(value: ContactInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactInformation {
      val address = segment.toRawLongValue()
      return ContactInformation(Pointer(address))
    }

    public override fun toNative(obj: ContactInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
