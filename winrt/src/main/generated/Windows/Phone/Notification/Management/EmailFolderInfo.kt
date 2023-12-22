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

@ABIMarker(EmailFolderInfo.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.EmailFolderInfo;{c207150e-e237-46d6-90e6-4f529eeac1e2})")
@WinRTByReference(brClass = EmailFolderInfo.ByReference::class)
public class EmailFolderInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailFolderInfo.WithDefault, IWinRTObject {
  private val __1005620138_Interface: IEmailFolderInfo.WithDefault by lazy {
    as_1005620138()
  }


  public override val __1005620138_Ptr: JNAPointer? by lazy {
    __1005620138_Interface.__1005620138_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1005620138_Interface)

  private fun as_1005620138(): IEmailFolderInfo.WithDefault {
    if(pointer == NULL) {
      return(IEmailFolderInfo.ABI.makeIEmailFolderInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailFolderInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailFolderInfo.ABI.makeIEmailFolderInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailFolderInfo> {
    public override fun getValue() = EmailFolderInfo(pointer.getPointer(0))

    public fun setValue(value: EmailFolderInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailFolderInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailFolderInfo {
      val address = segment.toRawLongValue()
      return EmailFolderInfo(Pointer(address))
    }

    public override fun toNative(obj: EmailFolderInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
