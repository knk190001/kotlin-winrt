package Windows.ApplicationModel.Email.DataProvider

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

@ABIMarker(EmailDataProviderConnection.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailDataProviderConnection;{3b9c9dc7-37b2-4bf0-ae30-7b644a1c96e1})")
@WinRTByReference(brClass = EmailDataProviderConnection.ByReference::class)
public class EmailDataProviderConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailDataProviderConnection.WithDefault, IWinRTObject {
  private val __1600249757_Interface: IEmailDataProviderConnection.WithDefault by lazy {
    as_1600249757()
  }


  public override val __1600249757_Ptr: JNAPointer? by lazy {
    __1600249757_Interface.__1600249757_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1600249757_Interface)

  private fun as_1600249757(): IEmailDataProviderConnection.WithDefault {
    if(pointer == NULL) {
      return(IEmailDataProviderConnection.ABI.makeIEmailDataProviderConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailDataProviderConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailDataProviderConnection.ABI.makeIEmailDataProviderConnection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailDataProviderConnection> {
    public override fun getValue() = EmailDataProviderConnection(pointer.getPointer(0))

    public fun setValue(value: EmailDataProviderConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailDataProviderConnection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailDataProviderConnection {
      val address = segment.toRawLongValue()
      return EmailDataProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: EmailDataProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
