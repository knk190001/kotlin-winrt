package Windows.ApplicationModel.Contacts

import Windows.Foundation.IClosable
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

@ABIMarker(ContactCardDelayedDataLoader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactCardDelayedDataLoader;{b60af902-1546-434d-869c-6e3520760ef3})")
@WinRTByReference(brClass = ContactCardDelayedDataLoader.ByReference::class)
public class ContactCardDelayedDataLoader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactCardDelayedDataLoader.WithDefault, IClosable.WithDefault, IWinRTObject
    {
  private val __921727195_Interface: IContactCardDelayedDataLoader.WithDefault by lazy {
    as_921727195()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __921727195_Ptr: JNAPointer? by lazy {
    __921727195_Interface.__921727195_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__921727195_Interface, __1260617006_Interface)

  private fun as_921727195(): IContactCardDelayedDataLoader.WithDefault {
    if(pointer == NULL) {
      return(IContactCardDelayedDataLoader.ABI.makeIContactCardDelayedDataLoader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactCardDelayedDataLoader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactCardDelayedDataLoader.ABI.makeIContactCardDelayedDataLoader(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactCardDelayedDataLoader> {
    public override fun getValue() = ContactCardDelayedDataLoader(pointer.getPointer(0))

    public fun setValue(value: ContactCardDelayedDataLoader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactCardDelayedDataLoader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactCardDelayedDataLoader {
      val address = segment.toRawLongValue()
      return ContactCardDelayedDataLoader(Pointer(address))
    }

    public override fun toNative(obj: ContactCardDelayedDataLoader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
