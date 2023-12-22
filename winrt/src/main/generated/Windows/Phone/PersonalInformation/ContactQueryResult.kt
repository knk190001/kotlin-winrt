package Windows.Phone.PersonalInformation

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

@ABIMarker(ContactQueryResult.ABI::class)
@Signature("rc(Windows.Phone.PersonalInformation.ContactQueryResult;{c03db722-ecdb-4700-857e-3e786426b04b})")
@WinRTByReference(brClass = ContactQueryResult.ByReference::class)
public class ContactQueryResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactQueryResult.WithDefault, IWinRTObject {
  private val __1019541261_Interface: IContactQueryResult.WithDefault by lazy {
    as_1019541261()
  }


  public override val __1019541261_Ptr: JNAPointer? by lazy {
    __1019541261_Interface.__1019541261_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1019541261_Interface)

  private fun as_1019541261(): IContactQueryResult.WithDefault {
    if(pointer == NULL) {
      return(IContactQueryResult.ABI.makeIContactQueryResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactQueryResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactQueryResult.ABI.makeIContactQueryResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactQueryResult> {
    public override fun getValue() = ContactQueryResult(pointer.getPointer(0))

    public fun setValue(value: ContactQueryResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactQueryResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactQueryResult {
      val address = segment.toRawLongValue()
      return ContactQueryResult(Pointer(address))
    }

    public override fun toNative(obj: ContactQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
