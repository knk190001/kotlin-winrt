package Windows.UI.Notifications.Management

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(UserNotificationListener.ABI::class)
@Signature("rc(Windows.UI.Notifications.Management.UserNotificationListener;{62553e41-8a06-4cef-8215-6033a5be4b03})")
@WinRTByReference(brClass = UserNotificationListener.ByReference::class)
public class UserNotificationListener(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserNotificationListener.WithDefault, IWinRTObject {
  private val __117565755_Interface: IUserNotificationListener.WithDefault by lazy {
    as_117565755()
  }


  public override val __117565755_Ptr: JNAPointer? by lazy {
    __117565755_Interface.__117565755_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__117565755_Interface)

  private fun as_117565755(): IUserNotificationListener.WithDefault {
    if(pointer == NULL) {
      return(IUserNotificationListener.ABI.makeIUserNotificationListener(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserNotificationListener>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserNotificationListener.ABI.makeIUserNotificationListener(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserNotificationListener> {
    public override fun getValue() = UserNotificationListener(pointer.getPointer(0))

    public fun setValue(value: UserNotificationListener): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserNotificationListener, MemoryAddress> {
    public val IUserNotificationListenerStatics_Instance: IUserNotificationListenerStatics by lazy {
      createIUserNotificationListenerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserNotificationListenerStatics(): IUserNotificationListenerStatics {
      val refiid = Guid.REFIID(IUserNotificationListenerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.Management.UserNotificationListener".toHandle(),refiid,interfacePtr)
      val result =
          IUserNotificationListenerStatics.ABI.makeIUserNotificationListenerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserNotificationListener {
      val address = segment.toRawLongValue()
      return UserNotificationListener(Pointer(address))
    }

    public override fun toNative(obj: UserNotificationListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.IUserNotificationListenerStatics_Instance.get_Current()
  }
}
