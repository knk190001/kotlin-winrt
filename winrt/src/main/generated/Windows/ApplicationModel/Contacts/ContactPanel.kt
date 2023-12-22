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

@ABIMarker(ContactPanel.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactPanel;{41bf1265-d2ee-4b97-a80a-7d8d64cca6f5})")
@WinRTByReference(brClass = ContactPanel.ByReference::class)
public class ContactPanel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactPanel.WithDefault, IWinRTObject {
  private val __1316524880_Interface: IContactPanel.WithDefault by lazy {
    as_1316524880()
  }


  public override val __1316524880_Ptr: JNAPointer? by lazy {
    __1316524880_Interface.__1316524880_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1316524880_Interface)

  private fun as_1316524880(): IContactPanel.WithDefault {
    if(pointer == NULL) {
      return(IContactPanel.ABI.makeIContactPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactPanel.ABI.makeIContactPanel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactPanel> {
    public override fun getValue() = ContactPanel(pointer.getPointer(0))

    public fun setValue(value: ContactPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactPanel, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactPanel {
      val address = segment.toRawLongValue()
      return ContactPanel(Pointer(address))
    }

    public override fun toNative(obj: ContactPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
