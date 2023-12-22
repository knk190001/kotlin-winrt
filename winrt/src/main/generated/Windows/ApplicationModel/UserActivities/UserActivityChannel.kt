package Windows.ApplicationModel.UserActivities

import Windows.Security.Credentials.WebAccount
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(UserActivityChannel.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserActivities.UserActivityChannel;{bac0f8b8-a0e4-483b-b948-9cbabd06070c})")
@WinRTByReference(brClass = UserActivityChannel.ByReference::class)
public class UserActivityChannel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserActivityChannel.WithDefault, IUserActivityChannel2.WithDefault,
    IWinRTObject {
  private val __313919746_Interface: IUserActivityChannel.WithDefault by lazy {
    as_313919746()
  }


  private val __1141577584_Interface: IUserActivityChannel2.WithDefault by lazy {
    as_1141577584()
  }


  public override val __313919746_Ptr: JNAPointer? by lazy {
    __313919746_Interface.__313919746_Ptr
  }


  public override val __1141577584_Ptr: JNAPointer? by lazy {
    __1141577584_Interface.__1141577584_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__313919746_Interface, __1141577584_Interface)

  private fun as_313919746(): IUserActivityChannel.WithDefault {
    if(pointer == NULL) {
      return(IUserActivityChannel.ABI.makeIUserActivityChannel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivityChannel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivityChannel.ABI.makeIUserActivityChannel(ref.value))
  }

  private fun as_1141577584(): IUserActivityChannel2.WithDefault {
    if(pointer == NULL) {
      return(IUserActivityChannel2.ABI.makeIUserActivityChannel2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivityChannel2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivityChannel2.ABI.makeIUserActivityChannel2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserActivityChannel> {
    public override fun getValue() = UserActivityChannel(pointer.getPointer(0))

    public fun setValue(value: UserActivityChannel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserActivityChannel, MemoryAddress> {
    public val IUserActivityChannelStatics_Instance: IUserActivityChannelStatics by lazy {
      createIUserActivityChannelStatics()
    }


    public val IUserActivityChannelStatics3_Instance: IUserActivityChannelStatics3 by lazy {
      createIUserActivityChannelStatics3()
    }


    public val IUserActivityChannelStatics2_Instance: IUserActivityChannelStatics2 by lazy {
      createIUserActivityChannelStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserActivityChannelStatics(): IUserActivityChannelStatics {
      val refiid = Guid.REFIID(IUserActivityChannelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserActivities.UserActivityChannel".toHandle(),refiid,interfacePtr)
      val result =
          IUserActivityChannelStatics.ABI.makeIUserActivityChannelStatics(interfacePtr.value)
      return result
    }

    public fun createIUserActivityChannelStatics3(): IUserActivityChannelStatics3 {
      val refiid = Guid.REFIID(IUserActivityChannelStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserActivities.UserActivityChannel".toHandle(),refiid,interfacePtr)
      val result =
          IUserActivityChannelStatics3.ABI.makeIUserActivityChannelStatics3(interfacePtr.value)
      return result
    }

    public fun createIUserActivityChannelStatics2(): IUserActivityChannelStatics2 {
      val refiid = Guid.REFIID(IUserActivityChannelStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserActivities.UserActivityChannel".toHandle(),refiid,interfacePtr)
      val result =
          IUserActivityChannelStatics2.ABI.makeIUserActivityChannelStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserActivityChannel {
      val address = segment.toRawLongValue()
      return UserActivityChannel(Pointer(address))
    }

    public override fun toNative(obj: UserActivityChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IUserActivityChannelStatics_Instance.GetDefault()

    public fun GetForUser(user: User) = ABI.IUserActivityChannelStatics3_Instance.GetForUser(user)

    public fun DisableAutoSessionCreation() =
        ABI.IUserActivityChannelStatics2_Instance.DisableAutoSessionCreation()

    public fun TryGetForWebAccount(account: WebAccount) =
        ABI.IUserActivityChannelStatics2_Instance.TryGetForWebAccount(account)
  }
}
