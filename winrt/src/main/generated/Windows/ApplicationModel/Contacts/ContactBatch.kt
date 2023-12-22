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

@ABIMarker(ContactBatch.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactBatch;{35d1972d-bfce-46bb-93f8-a5b06ec5e201})")
@WinRTByReference(brClass = ContactBatch.ByReference::class)
public class ContactBatch(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactBatch.WithDefault, IWinRTObject {
  private val __1329448474_Interface: IContactBatch.WithDefault by lazy {
    as_1329448474()
  }


  public override val __1329448474_Ptr: JNAPointer? by lazy {
    __1329448474_Interface.__1329448474_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1329448474_Interface)

  private fun as_1329448474(): IContactBatch.WithDefault {
    if(pointer == NULL) {
      return(IContactBatch.ABI.makeIContactBatch(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactBatch>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactBatch.ABI.makeIContactBatch(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactBatch> {
    public override fun getValue() = ContactBatch(pointer.getPointer(0))

    public fun setValue(value: ContactBatch): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactBatch, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactBatch {
      val address = segment.toRawLongValue()
      return ContactBatch(Pointer(address))
    }

    public override fun toNative(obj: ContactBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
