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

@ABIMarker(ContactChangeTracker.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactChangeTracker;{6e992952-309b-404d-9712-b37bd30278aa})")
@WinRTByReference(brClass = ContactChangeTracker.ByReference::class)
public class ContactChangeTracker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactChangeTracker.WithDefault, IContactChangeTracker2.WithDefault,
    IWinRTObject {
  private val __1655557140_Interface: IContactChangeTracker.WithDefault by lazy {
    as_1655557140()
  }


  private val __217336162_Interface: IContactChangeTracker2.WithDefault by lazy {
    as_217336162()
  }


  public override val __1655557140_Ptr: JNAPointer? by lazy {
    __1655557140_Interface.__1655557140_Ptr
  }


  public override val __217336162_Ptr: JNAPointer? by lazy {
    __217336162_Interface.__217336162_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1655557140_Interface, __217336162_Interface)

  private fun as_1655557140(): IContactChangeTracker.WithDefault {
    if(pointer == NULL) {
      return(IContactChangeTracker.ABI.makeIContactChangeTracker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactChangeTracker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactChangeTracker.ABI.makeIContactChangeTracker(ref.value))
  }

  private fun as_217336162(): IContactChangeTracker2.WithDefault {
    if(pointer == NULL) {
      return(IContactChangeTracker2.ABI.makeIContactChangeTracker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactChangeTracker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactChangeTracker2.ABI.makeIContactChangeTracker2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactChangeTracker> {
    public override fun getValue() = ContactChangeTracker(pointer.getPointer(0))

    public fun setValue(value: ContactChangeTracker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactChangeTracker, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactChangeTracker {
      val address = segment.toRawLongValue()
      return ContactChangeTracker(Pointer(address))
    }

    public override fun toNative(obj: ContactChangeTracker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
