package Windows.ApplicationModel.Contacts.Provider

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

@ABIMarker(ContactPickerUI.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.Provider.ContactPickerUI;{e2cc1366-cf66-43c4-a96a-a5a112db4746})")
@WinRTByReference(brClass = ContactPickerUI.ByReference::class)
public class ContactPickerUI(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactPickerUI.WithDefault, IContactPickerUI2.WithDefault, IWinRTObject {
  private val __1315328539_Interface: IContactPickerUI.WithDefault by lazy {
    as_1315328539()
  }


  private val __2120479095_Interface: IContactPickerUI2.WithDefault by lazy {
    as_2120479095()
  }


  public override val __1315328539_Ptr: JNAPointer? by lazy {
    __1315328539_Interface.__1315328539_Ptr
  }


  public override val __2120479095_Ptr: JNAPointer? by lazy {
    __2120479095_Interface.__2120479095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1315328539_Interface, __2120479095_Interface)

  private fun as_1315328539(): IContactPickerUI.WithDefault {
    if(pointer == NULL) {
      return(IContactPickerUI.ABI.makeIContactPickerUI(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactPickerUI>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactPickerUI.ABI.makeIContactPickerUI(ref.value))
  }

  private fun as_2120479095(): IContactPickerUI2.WithDefault {
    if(pointer == NULL) {
      return(IContactPickerUI2.ABI.makeIContactPickerUI2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactPickerUI2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactPickerUI2.ABI.makeIContactPickerUI2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactPickerUI> {
    public override fun getValue() = ContactPickerUI(pointer.getPointer(0))

    public fun setValue(value: ContactPickerUI): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactPickerUI, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactPickerUI {
      val address = segment.toRawLongValue()
      return ContactPickerUI(Pointer(address))
    }

    public override fun toNative(obj: ContactPickerUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
