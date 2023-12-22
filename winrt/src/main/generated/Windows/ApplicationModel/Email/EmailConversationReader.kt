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

@ABIMarker(EmailConversationReader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailConversationReader;{b4630f82-2875-44c8-9b8c-85beb3a3c653})")
@WinRTByReference(brClass = EmailConversationReader.ByReference::class)
public class EmailConversationReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailConversationReader.WithDefault, IWinRTObject {
  private val __773982101_Interface: IEmailConversationReader.WithDefault by lazy {
    as_773982101()
  }


  public override val __773982101_Ptr: JNAPointer? by lazy {
    __773982101_Interface.__773982101_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__773982101_Interface)

  private fun as_773982101(): IEmailConversationReader.WithDefault {
    if(pointer == NULL) {
      return(IEmailConversationReader.ABI.makeIEmailConversationReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailConversationReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailConversationReader.ABI.makeIEmailConversationReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailConversationReader> {
    public override fun getValue() = EmailConversationReader(pointer.getPointer(0))

    public fun setValue(value: EmailConversationReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailConversationReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailConversationReader {
      val address = segment.toRawLongValue()
      return EmailConversationReader(Pointer(address))
    }

    public override fun toNative(obj: EmailConversationReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
