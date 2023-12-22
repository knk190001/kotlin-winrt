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

@ABIMarker(EmailStore.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailStore;{f803226e-9137-4f8b-a470-279ac3058eb6})")
@WinRTByReference(brClass = EmailStore.ByReference::class)
public class EmailStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailStore.WithDefault, IWinRTObject {
  private val __2058860676_Interface: IEmailStore.WithDefault by lazy {
    as_2058860676()
  }


  public override val __2058860676_Ptr: JNAPointer? by lazy {
    __2058860676_Interface.__2058860676_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2058860676_Interface)

  private fun as_2058860676(): IEmailStore.WithDefault {
    if(pointer == NULL) {
      return(IEmailStore.ABI.makeIEmailStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailStore.ABI.makeIEmailStore(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<EmailStore> {
    public override fun getValue() = EmailStore(pointer.getPointer(0))

    public fun setValue(value: EmailStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailStore {
      val address = segment.toRawLongValue()
      return EmailStore(Pointer(address))
    }

    public override fun toNative(obj: EmailStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
