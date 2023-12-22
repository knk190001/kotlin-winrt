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

@ABIMarker(EmailMailboxCapabilities.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMailboxCapabilities;{eedec3a6-89db-4305-82c4-439e0a33da11})")
@WinRTByReference(brClass = EmailMailboxCapabilities.ByReference::class)
public class EmailMailboxCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxCapabilities.WithDefault, IEmailMailboxCapabilities2.WithDefault,
    IEmailMailboxCapabilities3.WithDefault, IWinRTObject {
  private val __772627995_Interface: IEmailMailboxCapabilities.WithDefault by lazy {
    as_772627995()
  }


  private val __1818335981_Interface: IEmailMailboxCapabilities2.WithDefault by lazy {
    as_1818335981()
  }


  private val __1818335982_Interface: IEmailMailboxCapabilities3.WithDefault by lazy {
    as_1818335982()
  }


  public override val __772627995_Ptr: JNAPointer? by lazy {
    __772627995_Interface.__772627995_Ptr
  }


  public override val __1818335981_Ptr: JNAPointer? by lazy {
    __1818335981_Interface.__1818335981_Ptr
  }


  public override val __1818335982_Ptr: JNAPointer? by lazy {
    __1818335982_Interface.__1818335982_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__772627995_Interface, __1818335981_Interface, __1818335982_Interface)

  private fun as_772627995(): IEmailMailboxCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxCapabilities.ABI.makeIEmailMailboxCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxCapabilities.ABI.makeIEmailMailboxCapabilities(ref.value))
  }

  private fun as_1818335981(): IEmailMailboxCapabilities2.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxCapabilities2.ABI.makeIEmailMailboxCapabilities2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxCapabilities2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxCapabilities2.ABI.makeIEmailMailboxCapabilities2(ref.value))
  }

  private fun as_1818335982(): IEmailMailboxCapabilities3.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxCapabilities3.ABI.makeIEmailMailboxCapabilities3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxCapabilities3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxCapabilities3.ABI.makeIEmailMailboxCapabilities3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxCapabilities> {
    public override fun getValue() = EmailMailboxCapabilities(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxCapabilities {
      val address = segment.toRawLongValue()
      return EmailMailboxCapabilities(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
