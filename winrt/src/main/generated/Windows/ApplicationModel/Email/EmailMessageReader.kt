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

@ABIMarker(EmailMessageReader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMessageReader;{2f4abe9f-6213-4a85-a3b0-f92d1a839d19})")
@WinRTByReference(brClass = EmailMessageReader.ByReference::class)
public class EmailMessageReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMessageReader.WithDefault, IWinRTObject {
  private val __1314953403_Interface: IEmailMessageReader.WithDefault by lazy {
    as_1314953403()
  }


  public override val __1314953403_Ptr: JNAPointer? by lazy {
    __1314953403_Interface.__1314953403_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1314953403_Interface)

  private fun as_1314953403(): IEmailMessageReader.WithDefault {
    if(pointer == NULL) {
      return(IEmailMessageReader.ABI.makeIEmailMessageReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMessageReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMessageReader.ABI.makeIEmailMessageReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMessageReader> {
    public override fun getValue() = EmailMessageReader(pointer.getPointer(0))

    public fun setValue(value: EmailMessageReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMessageReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMessageReader {
      val address = segment.toRawLongValue()
      return EmailMessageReader(Pointer(address))
    }

    public override fun toNative(obj: EmailMessageReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
