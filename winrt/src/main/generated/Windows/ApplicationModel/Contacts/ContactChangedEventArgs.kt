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

@ABIMarker(ContactChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactChangedEventArgs;{525e7fd1-73f3-4b7d-a918-580be4366121})")
@WinRTByReference(brClass = ContactChangedEventArgs.ByReference::class)
public class ContactChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactChangedEventArgs.WithDefault, IWinRTObject {
  private val __2002133993_Interface: IContactChangedEventArgs.WithDefault by lazy {
    as_2002133993()
  }


  public override val __2002133993_Ptr: JNAPointer? by lazy {
    __2002133993_Interface.__2002133993_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2002133993_Interface)

  private fun as_2002133993(): IContactChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactChangedEventArgs.ABI.makeIContactChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactChangedEventArgs.ABI.makeIContactChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactChangedEventArgs> {
    public override fun getValue() = ContactChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContactChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactChangedEventArgs {
      val address = segment.toRawLongValue()
      return ContactChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContactChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
