package Windows.Networking.Connectivity

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

@ABIMarker(ConnectivityManager.ABI::class)
@WinRTByReference(brClass = ConnectivityManager.ByReference::class)
public class ConnectivityManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConnectivityManager> {
    public override fun getValue() = ConnectivityManager(pointer.getPointer(0))

    public fun setValue(value: ConnectivityManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConnectivityManager, MemoryAddress> {
    public val IConnectivityManagerStatics_Instance: IConnectivityManagerStatics by lazy {
      createIConnectivityManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIConnectivityManagerStatics(): IConnectivityManagerStatics {
      val refiid = Guid.REFIID(IConnectivityManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Connectivity.ConnectivityManager".toHandle(),refiid,interfacePtr)
      val result =
          IConnectivityManagerStatics.ABI.makeIConnectivityManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ConnectivityManager {
      val address = segment.toRawLongValue()
      return ConnectivityManager(Pointer(address))
    }

    public override fun toNative(obj: ConnectivityManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun AcquireConnectionAsync(cellularApnContext: CellularApnContext) =
        ABI.IConnectivityManagerStatics_Instance.AcquireConnectionAsync(cellularApnContext)

    public fun AddHttpRoutePolicy(routePolicy: RoutePolicy) =
        ABI.IConnectivityManagerStatics_Instance.AddHttpRoutePolicy(routePolicy)

    public fun RemoveHttpRoutePolicy(routePolicy: RoutePolicy) =
        ABI.IConnectivityManagerStatics_Instance.RemoveHttpRoutePolicy(routePolicy)
  }
}
