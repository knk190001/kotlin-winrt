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

@ABIMarker(ContactPanelClosingEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactPanelClosingEventArgs;{222174d3-cf4b-46d7-b739-6edc16110bfb})")
@WinRTByReference(brClass = ContactPanelClosingEventArgs.ByReference::class)
public class ContactPanelClosingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactPanelClosingEventArgs.WithDefault, IWinRTObject {
  private val __860657102_Interface: IContactPanelClosingEventArgs.WithDefault by lazy {
    as_860657102()
  }


  public override val __860657102_Ptr: JNAPointer? by lazy {
    __860657102_Interface.__860657102_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__860657102_Interface)

  private fun as_860657102(): IContactPanelClosingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactPanelClosingEventArgs.ABI.makeIContactPanelClosingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactPanelClosingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactPanelClosingEventArgs.ABI.makeIContactPanelClosingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactPanelClosingEventArgs> {
    public override fun getValue() = ContactPanelClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContactPanelClosingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactPanelClosingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactPanelClosingEventArgs {
      val address = segment.toRawLongValue()
      return ContactPanelClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContactPanelClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
