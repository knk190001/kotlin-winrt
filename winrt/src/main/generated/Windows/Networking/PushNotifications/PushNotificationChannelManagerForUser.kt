package Windows.Networking.PushNotifications

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

@ABIMarker(PushNotificationChannelManagerForUser.ABI::class)
@Signature("rc(Windows.Networking.PushNotifications.PushNotificationChannelManagerForUser;{a4c45704-1182-42c7-8890-f563c4890dc4})")
@WinRTByReference(brClass = PushNotificationChannelManagerForUser.ByReference::class)
public class PushNotificationChannelManagerForUser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPushNotificationChannelManagerForUser.WithDefault,
    IPushNotificationChannelManagerForUser2.WithDefault, IWinRTObject {
  private val __576040091_Interface: IPushNotificationChannelManagerForUser.WithDefault by lazy {
    as_576040091()
  }


  private val __677373687_Interface: IPushNotificationChannelManagerForUser2.WithDefault by lazy {
    as_677373687()
  }


  public override val __576040091_Ptr: JNAPointer? by lazy {
    __576040091_Interface.__576040091_Ptr
  }


  public override val __677373687_Ptr: JNAPointer? by lazy {
    __677373687_Interface.__677373687_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__576040091_Interface, __677373687_Interface)

  private fun as_576040091(): IPushNotificationChannelManagerForUser.WithDefault {
    if(pointer == NULL) {
      return(IPushNotificationChannelManagerForUser.ABI.makeIPushNotificationChannelManagerForUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPushNotificationChannelManagerForUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPushNotificationChannelManagerForUser.ABI.makeIPushNotificationChannelManagerForUser(ref.value))
  }

  private fun as_677373687(): IPushNotificationChannelManagerForUser2.WithDefault {
    if(pointer == NULL) {
      return(IPushNotificationChannelManagerForUser2.ABI.makeIPushNotificationChannelManagerForUser2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPushNotificationChannelManagerForUser2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPushNotificationChannelManagerForUser2.ABI.makeIPushNotificationChannelManagerForUser2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PushNotificationChannelManagerForUser> {
    public override fun getValue() = PushNotificationChannelManagerForUser(pointer.getPointer(0))

    public fun setValue(value: PushNotificationChannelManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PushNotificationChannelManagerForUser, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PushNotificationChannelManagerForUser {
      val address = segment.toRawLongValue()
      return PushNotificationChannelManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: PushNotificationChannelManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
