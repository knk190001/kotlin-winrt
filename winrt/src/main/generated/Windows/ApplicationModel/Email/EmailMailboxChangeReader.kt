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

@ABIMarker(EmailMailboxChangeReader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMailboxChangeReader;{bdbd0ebb-c53d-4331-97be-be75a2146a75})")
@WinRTByReference(brClass = EmailMailboxChangeReader.ByReference::class)
public class EmailMailboxChangeReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxChangeReader.WithDefault, IWinRTObject {
  private val __579692226_Interface: IEmailMailboxChangeReader.WithDefault by lazy {
    as_579692226()
  }


  public override val __579692226_Ptr: JNAPointer? by lazy {
    __579692226_Interface.__579692226_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__579692226_Interface)

  private fun as_579692226(): IEmailMailboxChangeReader.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxChangeReader.ABI.makeIEmailMailboxChangeReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxChangeReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxChangeReader.ABI.makeIEmailMailboxChangeReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxChangeReader> {
    public override fun getValue() = EmailMailboxChangeReader(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxChangeReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxChangeReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxChangeReader {
      val address = segment.toRawLongValue()
      return EmailMailboxChangeReader(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxChangeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
