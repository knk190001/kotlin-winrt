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

@ABIMarker(ContactRemovedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.Provider.ContactRemovedEventArgs;{6f354338-3302-4d13-ad8d-adcc0ff9e47c})")
@WinRTByReference(brClass = ContactRemovedEventArgs.ByReference::class)
public class ContactRemovedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactRemovedEventArgs.WithDefault, IWinRTObject {
  private val __1960439696_Interface: IContactRemovedEventArgs.WithDefault by lazy {
    as_1960439696()
  }


  public override val __1960439696_Ptr: JNAPointer? by lazy {
    __1960439696_Interface.__1960439696_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1960439696_Interface)

  private fun as_1960439696(): IContactRemovedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactRemovedEventArgs.ABI.makeIContactRemovedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactRemovedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactRemovedEventArgs.ABI.makeIContactRemovedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactRemovedEventArgs> {
    public override fun getValue() = ContactRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContactRemovedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactRemovedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactRemovedEventArgs {
      val address = segment.toRawLongValue()
      return ContactRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContactRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
