package Windows.ApplicationModel.Email

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(EmailManager.ABI::class)
@WinRTByReference(brClass = EmailManager.ByReference::class)
public class EmailManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<EmailManager> {
    public override fun getValue() = EmailManager(pointer.getPointer(0))

    public fun setValue(value: EmailManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailManager, MemoryAddress> {
    public val IEmailManagerStatics2_Instance: IEmailManagerStatics2 by lazy {
      createIEmailManagerStatics2()
    }


    public val IEmailManagerStatics_Instance: IEmailManagerStatics by lazy {
      createIEmailManagerStatics()
    }


    public val IEmailManagerStatics3_Instance: IEmailManagerStatics3 by lazy {
      createIEmailManagerStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIEmailManagerStatics2(): IEmailManagerStatics2 {
      val refiid = Guid.REFIID(IEmailManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailManager".toHandle(),refiid,interfacePtr)
      val result = IEmailManagerStatics2.ABI.makeIEmailManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIEmailManagerStatics(): IEmailManagerStatics {
      val refiid = Guid.REFIID(IEmailManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailManager".toHandle(),refiid,interfacePtr)
      val result = IEmailManagerStatics.ABI.makeIEmailManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIEmailManagerStatics3(): IEmailManagerStatics3 {
      val refiid = Guid.REFIID(IEmailManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailManager".toHandle(),refiid,interfacePtr)
      val result = IEmailManagerStatics3.ABI.makeIEmailManagerStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EmailManager {
      val address = segment.toRawLongValue()
      return EmailManager(Pointer(address))
    }

    public override fun toNative(obj: EmailManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestStoreAsync(accessType: EmailStoreAccessType) =
        ABI.IEmailManagerStatics2_Instance.RequestStoreAsync(accessType)

    public fun ShowComposeNewEmailAsync(message: EmailMessage) =
        ABI.IEmailManagerStatics_Instance.ShowComposeNewEmailAsync(message)

    public fun GetForUser(user: User) = ABI.IEmailManagerStatics3_Instance.GetForUser(user)
  }
}
