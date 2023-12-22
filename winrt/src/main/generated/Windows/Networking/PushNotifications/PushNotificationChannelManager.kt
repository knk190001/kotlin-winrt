package Windows.Networking.PushNotifications

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PushNotificationChannelManager.ABI::class)
@WinRTByReference(brClass = PushNotificationChannelManager.ByReference::class)
public class PushNotificationChannelManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PushNotificationChannelManager> {
    public override fun getValue() = PushNotificationChannelManager(pointer.getPointer(0))

    public fun setValue(value: PushNotificationChannelManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PushNotificationChannelManager, MemoryAddress> {
    public val IPushNotificationChannelManagerStatics2_Instance:
        IPushNotificationChannelManagerStatics2 by lazy {
      createIPushNotificationChannelManagerStatics2()
    }


    public val IPushNotificationChannelManagerStatics3_Instance:
        IPushNotificationChannelManagerStatics3 by lazy {
      createIPushNotificationChannelManagerStatics3()
    }


    public val IPushNotificationChannelManagerStatics4_Instance:
        IPushNotificationChannelManagerStatics4 by lazy {
      createIPushNotificationChannelManagerStatics4()
    }


    public val IPushNotificationChannelManagerStatics_Instance:
        IPushNotificationChannelManagerStatics by lazy {
      createIPushNotificationChannelManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPushNotificationChannelManagerStatics2():
        IPushNotificationChannelManagerStatics2 {
      val refiid = Guid.REFIID(IPushNotificationChannelManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.PushNotifications.PushNotificationChannelManager".toHandle(),refiid,interfacePtr)
      val result =
          IPushNotificationChannelManagerStatics2.ABI.makeIPushNotificationChannelManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIPushNotificationChannelManagerStatics3():
        IPushNotificationChannelManagerStatics3 {
      val refiid = Guid.REFIID(IPushNotificationChannelManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.PushNotifications.PushNotificationChannelManager".toHandle(),refiid,interfacePtr)
      val result =
          IPushNotificationChannelManagerStatics3.ABI.makeIPushNotificationChannelManagerStatics3(interfacePtr.value)
      return result
    }

    public fun createIPushNotificationChannelManagerStatics4():
        IPushNotificationChannelManagerStatics4 {
      val refiid = Guid.REFIID(IPushNotificationChannelManagerStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.PushNotifications.PushNotificationChannelManager".toHandle(),refiid,interfacePtr)
      val result =
          IPushNotificationChannelManagerStatics4.ABI.makeIPushNotificationChannelManagerStatics4(interfacePtr.value)
      return result
    }

    public fun createIPushNotificationChannelManagerStatics():
        IPushNotificationChannelManagerStatics {
      val refiid = Guid.REFIID(IPushNotificationChannelManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.PushNotifications.PushNotificationChannelManager".toHandle(),refiid,interfacePtr)
      val result =
          IPushNotificationChannelManagerStatics.ABI.makeIPushNotificationChannelManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PushNotificationChannelManager {
      val address = segment.toRawLongValue()
      return PushNotificationChannelManager(Pointer(address))
    }

    public override fun toNative(obj: PushNotificationChannelManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUser(user: User) =
        ABI.IPushNotificationChannelManagerStatics2_Instance.GetForUser(user)

    public fun GetDefault() = ABI.IPushNotificationChannelManagerStatics3_Instance.GetDefault()

    public fun add_ChannelsRevoked(handler: EventHandler<PushNotificationChannelsRevokedEventArgs?>)
        = ABI.IPushNotificationChannelManagerStatics4_Instance.add_ChannelsRevoked(handler)

    public fun remove_ChannelsRevoked(token: EventRegistrationToken) =
        ABI.IPushNotificationChannelManagerStatics4_Instance.remove_ChannelsRevoked(token)

    public fun CreatePushNotificationChannelForApplicationAsync() =
        ABI.IPushNotificationChannelManagerStatics_Instance.CreatePushNotificationChannelForApplicationAsync()

    public fun CreatePushNotificationChannelForApplicationAsync(applicationId: String) =
        ABI.IPushNotificationChannelManagerStatics_Instance.CreatePushNotificationChannelForApplicationAsync(applicationId)

    public fun CreatePushNotificationChannelForSecondaryTileAsync(tileId: String) =
        ABI.IPushNotificationChannelManagerStatics_Instance.CreatePushNotificationChannelForSecondaryTileAsync(tileId)
  }
}
