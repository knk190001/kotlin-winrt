package Windows.System.Diagnostics.DevicePortal

import Windows.ApplicationModel.AppService.AppServiceConnection
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

@ABIMarker(DevicePortalConnection.ABI::class)
@Signature("rc(Windows.System.Diagnostics.DevicePortal.DevicePortalConnection;{0f447f51-1198-4da1-8d54-bdef393e09b6})")
@WinRTByReference(brClass = DevicePortalConnection.ByReference::class)
public class DevicePortalConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDevicePortalConnection.WithDefault,
    IDevicePortalWebSocketConnection.WithDefault, IWinRTObject {
  private val __1726247759_Interface: IDevicePortalConnection.WithDefault by lazy {
    as_1726247759()
  }


  private val __1847804494_Interface: IDevicePortalWebSocketConnection.WithDefault by lazy {
    as_1847804494()
  }


  public override val __1726247759_Ptr: JNAPointer? by lazy {
    __1726247759_Interface.__1726247759_Ptr
  }


  public override val __1847804494_Ptr: JNAPointer? by lazy {
    __1847804494_Interface.__1847804494_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1726247759_Interface, __1847804494_Interface)

  private fun as_1726247759(): IDevicePortalConnection.WithDefault {
    if(pointer == NULL) {
      return(IDevicePortalConnection.ABI.makeIDevicePortalConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDevicePortalConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDevicePortalConnection.ABI.makeIDevicePortalConnection(ref.value))
  }

  private fun as_1847804494(): IDevicePortalWebSocketConnection.WithDefault {
    if(pointer == NULL) {
      return(IDevicePortalWebSocketConnection.ABI.makeIDevicePortalWebSocketConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDevicePortalWebSocketConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDevicePortalWebSocketConnection.ABI.makeIDevicePortalWebSocketConnection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DevicePortalConnection> {
    public override fun getValue() = DevicePortalConnection(pointer.getPointer(0))

    public fun setValue(value: DevicePortalConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DevicePortalConnection, MemoryAddress> {
    public val IDevicePortalConnectionStatics_Instance: IDevicePortalConnectionStatics by lazy {
      createIDevicePortalConnectionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDevicePortalConnectionStatics(): IDevicePortalConnectionStatics {
      val refiid = Guid.REFIID(IDevicePortalConnectionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Diagnostics.DevicePortal.DevicePortalConnection".toHandle(),refiid,interfacePtr)
      val result =
          IDevicePortalConnectionStatics.ABI.makeIDevicePortalConnectionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DevicePortalConnection {
      val address = segment.toRawLongValue()
      return DevicePortalConnection(Pointer(address))
    }

    public override fun toNative(obj: DevicePortalConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForAppServiceConnection(appServiceConnection: AppServiceConnection) =
        ABI.IDevicePortalConnectionStatics_Instance.GetForAppServiceConnection(appServiceConnection)
  }
}
