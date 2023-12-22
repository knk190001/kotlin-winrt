package Windows.Networking.Connectivity

import Windows.Foundation.IAsyncOperation
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConnectivityManagerStatics.ABI::class)
@Signature("{5120d4b1-4fb1-48b0-afc9-42e0092a8164}")
@Guid("5120d4b14fb148b0afc942e0092a8164")
@WinRTInterface("5120d4b14fb148b0afc942e0092a8164")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectivityManagerStatics.ByReference::class)
public interface IConnectivityManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AcquireConnectionAsync(cellularApnContext: CellularApnContext?):
      IAsyncOperation<ConnectionSession?>?

  @InterfaceMethod(1)
  public fun AddHttpRoutePolicy(routePolicy: RoutePolicy?): Unit

  @InterfaceMethod(2)
  public fun RemoveHttpRoutePolicy(routePolicy: RoutePolicy?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectivityManagerStatics> {
    public override fun getValue() = ABI.makeIConnectivityManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IConnectivityManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectivityManagerStatics {
    public val __772926350_Ptr: Pointer?

    public val _772926350_VtblPtr: Pointer?
      get() = __772926350_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AcquireConnectionAsync(cellularApnContext: CellularApnContext?):
        IAsyncOperation<ConnectionSession?>? {
      val fnPtr = _772926350_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ConnectionSession?>>()
      val hr = fn.invokeHR(arrayOf(__772926350_Ptr, marshalToNative(cellularApnContext), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ConnectionSession?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddHttpRoutePolicy(routePolicy: RoutePolicy?): Unit {
      val fnPtr = _772926350_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__772926350_Ptr, marshalToNative(routePolicy),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun RemoveHttpRoutePolicy(routePolicy: RoutePolicy?): Unit {
      val fnPtr = _772926350_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__772926350_Ptr, marshalToNative(routePolicy),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IConnectivityManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __772926350_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectivityManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5120d4b14fb148b0afc942e0092a8164")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectivityManagerStatics(ptr: Pointer?): WithDefault =
        IConnectivityManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectivityManagerStatics {
      val address = segment.toRawLongValue()
      return makeIConnectivityManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IConnectivityManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__772926350_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectivityManagerStatics):
        Array<IConnectivityManagerStatics?> = (elements as
        Array<IConnectivityManagerStatics?>).castToImpl<IConnectivityManagerStatics,IConnectivityManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectivityManagerStatics?> =
        arrayOfNulls<IConnectivityManagerStatics_Impl>(size) as Array<IConnectivityManagerStatics?>
  }
}
