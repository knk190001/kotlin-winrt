package Windows.Phone.PersonalInformation.Provisioning

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MessagePartnerProvisioningManager.ABI::class)
@WinRTByReference(brClass = MessagePartnerProvisioningManager.ByReference::class)
public class MessagePartnerProvisioningManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MessagePartnerProvisioningManager> {
    public override fun getValue() = MessagePartnerProvisioningManager(pointer.getPointer(0))

    public fun setValue(value: MessagePartnerProvisioningManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MessagePartnerProvisioningManager, MemoryAddress> {
    public val IMessagePartnerProvisioningManagerStatics_Instance:
        IMessagePartnerProvisioningManagerStatics by lazy {
      createIMessagePartnerProvisioningManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMessagePartnerProvisioningManagerStatics():
        IMessagePartnerProvisioningManagerStatics {
      val refiid = Guid.REFIID(IMessagePartnerProvisioningManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.PersonalInformation.Provisioning.MessagePartnerProvisioningManager".toHandle(),refiid,interfacePtr)
      val result =
          IMessagePartnerProvisioningManagerStatics.ABI.makeIMessagePartnerProvisioningManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MessagePartnerProvisioningManager {
      val address = segment.toRawLongValue()
      return MessagePartnerProvisioningManager(Pointer(address))
    }

    public override fun toNative(obj: MessagePartnerProvisioningManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ImportSmsToSystemAsync(
      incoming: Boolean,
      read: Boolean,
      body: String,
      sender: String,
      recipients: IVectorView<String?>,
      deliveryTime: DateTime
    ) = ABI.IMessagePartnerProvisioningManagerStatics_Instance.ImportSmsToSystemAsync(incoming,
        read, body, sender, recipients, deliveryTime)

    public fun ImportMmsToSystemAsync(
      incoming: Boolean,
      read: Boolean,
      subject: String,
      sender: String,
      recipients: IVectorView<String?>,
      deliveryTime: DateTime,
      attachments: IVectorView<IMapView<String?, IUnknown?>?>
    ) = ABI.IMessagePartnerProvisioningManagerStatics_Instance.ImportMmsToSystemAsync(incoming,
        read, subject, sender, recipients, deliveryTime, attachments)
  }
}
