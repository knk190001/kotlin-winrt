package Windows.ApplicationModel.Email

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

@ABIMarker(EmailItemCounts.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailItemCounts;{5bd13321-fec8-4bab-83ba-0baf3c1f6cbd})")
@WinRTByReference(brClass = EmailItemCounts.ByReference::class)
public class EmailItemCounts(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailItemCounts.WithDefault, IWinRTObject {
  private val __1383466884_Interface: IEmailItemCounts.WithDefault by lazy {
    as_1383466884()
  }


  public override val __1383466884_Ptr: JNAPointer? by lazy {
    __1383466884_Interface.__1383466884_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1383466884_Interface)

  private fun as_1383466884(): IEmailItemCounts.WithDefault {
    if(pointer == NULL) {
      return(IEmailItemCounts.ABI.makeIEmailItemCounts(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailItemCounts>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailItemCounts.ABI.makeIEmailItemCounts(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailItemCounts> {
    public override fun getValue() = EmailItemCounts(pointer.getPointer(0))

    public fun setValue(value: EmailItemCounts): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailItemCounts, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailItemCounts {
      val address = segment.toRawLongValue()
      return EmailItemCounts(Pointer(address))
    }

    public override fun toNative(obj: EmailItemCounts): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
