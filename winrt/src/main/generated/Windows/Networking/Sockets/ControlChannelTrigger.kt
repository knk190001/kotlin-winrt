package Windows.Networking.Sockets

import Windows.Foundation.IClosable
import Windows.Networking.Sockets.IControlChannelTriggerFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ControlChannelTrigger.ABI::class)
@Signature("rc(Windows.Networking.Sockets.ControlChannelTrigger;{7d1431a7-ee96-40e8-a199-8703cd969ec3})")
@WinRTByReference(brClass = ControlChannelTrigger.ByReference::class)
public class ControlChannelTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IControlChannelTrigger.WithDefault, IClosable.WithDefault,
    IControlChannelTrigger2.WithDefault, IWinRTObject {
  private val __61844026_Interface: IControlChannelTrigger.WithDefault by lazy {
    as_61844026()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1917164856_Interface: IControlChannelTrigger2.WithDefault by lazy {
    as_1917164856()
  }


  public override val __61844026_Ptr: JNAPointer? by lazy {
    __61844026_Interface.__61844026_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1917164856_Ptr: JNAPointer? by lazy {
    __1917164856_Interface.__1917164856_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__61844026_Interface, __1260617006_Interface, __1917164856_Interface)

  public constructor(channelId: String, serverKeepAliveIntervalInMinutes: WinDef.UINT) :
      this(ABI.activate(channelId, serverKeepAliveIntervalInMinutes))

  public constructor(
    channelId: String,
    serverKeepAliveIntervalInMinutes: WinDef.UINT,
    resourceRequestType: ControlChannelTriggerResourceType
  ) : this(ABI.activate(channelId, serverKeepAliveIntervalInMinutes, resourceRequestType))

  private fun as_61844026(): IControlChannelTrigger.WithDefault {
    if(pointer == NULL) {
      return(IControlChannelTrigger.ABI.makeIControlChannelTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControlChannelTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControlChannelTrigger.ABI.makeIControlChannelTrigger(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_1917164856(): IControlChannelTrigger2.WithDefault {
    if(pointer == NULL) {
      return(IControlChannelTrigger2.ABI.makeIControlChannelTrigger2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControlChannelTrigger2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControlChannelTrigger2.ABI.makeIControlChannelTrigger2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ControlChannelTrigger> {
    public override fun getValue() = ControlChannelTrigger(pointer.getPointer(0))

    public fun setValue(value: ControlChannelTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ControlChannelTrigger, MemoryAddress> {
    public val IControlChannelTriggerFactory_Instance: IControlChannelTriggerFactory by lazy {
      createIControlChannelTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIControlChannelTriggerFactory(): IControlChannelTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Sockets.ControlChannelTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IControlChannelTriggerFactory.ABI.makeIControlChannelTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(channelId: String, serverKeepAliveIntervalInMinutes: WinDef.UINT):
        JNAPointer? = IControlChannelTriggerFactory_Instance.CreateControlChannelTrigger(channelId,
        serverKeepAliveIntervalInMinutes)?.pointer

    public fun activate(
      channelId: String,
      serverKeepAliveIntervalInMinutes: WinDef.UINT,
      resourceRequestType: ControlChannelTriggerResourceType
    ): JNAPointer? = IControlChannelTriggerFactory_Instance.CreateControlChannelTriggerEx(channelId,
        serverKeepAliveIntervalInMinutes, resourceRequestType)?.pointer

    public override fun fromNative(segment: MemoryAddress): ControlChannelTrigger {
      val address = segment.toRawLongValue()
      return ControlChannelTrigger(Pointer(address))
    }

    public override fun toNative(obj: ControlChannelTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
