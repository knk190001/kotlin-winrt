package Windows.Phone.Notification.Management

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

@ABIMarker(EmailAccountInfo.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.EmailAccountInfo;{dfbc02ab-bda0-4568-927e-b2ede35818a1})")
@WinRTByReference(brClass = EmailAccountInfo.ByReference::class)
public class EmailAccountInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailAccountInfo.WithDefault, IWinRTObject {
  private val __1884992717_Interface: IEmailAccountInfo.WithDefault by lazy {
    as_1884992717()
  }


  public override val __1884992717_Ptr: JNAPointer? by lazy {
    __1884992717_Interface.__1884992717_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1884992717_Interface)

  private fun as_1884992717(): IEmailAccountInfo.WithDefault {
    if(pointer == NULL) {
      return(IEmailAccountInfo.ABI.makeIEmailAccountInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailAccountInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailAccountInfo.ABI.makeIEmailAccountInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailAccountInfo> {
    public override fun getValue() = EmailAccountInfo(pointer.getPointer(0))

    public fun setValue(value: EmailAccountInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailAccountInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailAccountInfo {
      val address = segment.toRawLongValue()
      return EmailAccountInfo(Pointer(address))
    }

    public override fun toNative(obj: EmailAccountInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
