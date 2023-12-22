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

@ABIMarker(EmailManagerForUser.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailManagerForUser;{f773de9f-3ca5-4b0f-90c1-156e40174ce5})")
@WinRTByReference(brClass = EmailManagerForUser.ByReference::class)
public class EmailManagerForUser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailManagerForUser.WithDefault, IWinRTObject {
  private val __1736291444_Interface: IEmailManagerForUser.WithDefault by lazy {
    as_1736291444()
  }


  public override val __1736291444_Ptr: JNAPointer? by lazy {
    __1736291444_Interface.__1736291444_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1736291444_Interface)

  private fun as_1736291444(): IEmailManagerForUser.WithDefault {
    if(pointer == NULL) {
      return(IEmailManagerForUser.ABI.makeIEmailManagerForUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailManagerForUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailManagerForUser.ABI.makeIEmailManagerForUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailManagerForUser> {
    public override fun getValue() = EmailManagerForUser(pointer.getPointer(0))

    public fun setValue(value: EmailManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailManagerForUser, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailManagerForUser {
      val address = segment.toRawLongValue()
      return EmailManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: EmailManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
