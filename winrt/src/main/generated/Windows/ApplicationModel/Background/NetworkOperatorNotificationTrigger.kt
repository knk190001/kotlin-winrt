package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.INetworkOperatorNotificationTriggerFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NetworkOperatorNotificationTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.NetworkOperatorNotificationTrigger;{90089cc6-63cd-480c-95d1-6e6aef801e4a})")
@WinRTByReference(brClass = NetworkOperatorNotificationTrigger.ByReference::class)
public class NetworkOperatorNotificationTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkOperatorNotificationTrigger.WithDefault,
    IBackgroundTrigger.WithDefault, IWinRTObject {
  private val __1265972652_Interface: INetworkOperatorNotificationTrigger.WithDefault by lazy {
    as_1265972652()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __1265972652_Ptr: JNAPointer? by lazy {
    __1265972652_Interface.__1265972652_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1265972652_Interface, __54213927_Interface)

  public constructor(networkAccountId: String) : this(ABI.activate(networkAccountId))

  private fun as_1265972652(): INetworkOperatorNotificationTrigger.WithDefault {
    if(pointer == NULL) {
      return(INetworkOperatorNotificationTrigger.ABI.makeINetworkOperatorNotificationTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkOperatorNotificationTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkOperatorNotificationTrigger.ABI.makeINetworkOperatorNotificationTrigger(ref.value))
  }

  private fun as_54213927(): IBackgroundTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NetworkOperatorNotificationTrigger> {
    public override fun getValue() = NetworkOperatorNotificationTrigger(pointer.getPointer(0))

    public fun setValue(value: NetworkOperatorNotificationTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkOperatorNotificationTrigger, MemoryAddress> {
    public val INetworkOperatorNotificationTriggerFactory_Instance:
        INetworkOperatorNotificationTriggerFactory by lazy {
      createINetworkOperatorNotificationTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINetworkOperatorNotificationTriggerFactory():
        INetworkOperatorNotificationTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.NetworkOperatorNotificationTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INetworkOperatorNotificationTriggerFactory.ABI.makeINetworkOperatorNotificationTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(networkAccountId: String): JNAPointer? =
        INetworkOperatorNotificationTriggerFactory_Instance.Create(networkAccountId)?.pointer

    public override fun fromNative(segment: MemoryAddress): NetworkOperatorNotificationTrigger {
      val address = segment.toRawLongValue()
      return NetworkOperatorNotificationTrigger(Pointer(address))
    }

    public override fun toNative(obj: NetworkOperatorNotificationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
