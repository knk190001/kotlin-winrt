package Windows.System.Diagnostics.DevicePortal

import Windows.ApplicationModel.AppService.AppServiceConnection
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

@ABIMarker(IDevicePortalConnectionStatics.ABI::class)
@Signature("{4bbe31e7-e9b9-4645-8fed-a53eea0edbd6}")
@Guid("4bbe31e7e9b946458feda53eea0edbd6")
@WinRTInterface("4bbe31e7e9b946458feda53eea0edbd6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDevicePortalConnectionStatics.ByReference::class)
public interface IDevicePortalConnectionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForAppServiceConnection(appServiceConnection: AppServiceConnection?):
      DevicePortalConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDevicePortalConnectionStatics> {
    public override fun getValue() = ABI.makeIDevicePortalConnectionStatics(pointer.getPointer(0))

    public fun setValue(value: IDevicePortalConnectionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDevicePortalConnectionStatics {
    public val __337407532_Ptr: Pointer?

    public val _337407532_VtblPtr: Pointer?
      get() = __337407532_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForAppServiceConnection(appServiceConnection: AppServiceConnection?):
        DevicePortalConnection? {
      val fnPtr = _337407532_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DevicePortalConnection>()
      val hr = fn.invokeHR(arrayOf(__337407532_Ptr, marshalToNative(appServiceConnection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DevicePortalConnection>(result.getValue())
      return resultValue
    }
  }

  public class IDevicePortalConnectionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __337407532_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDevicePortalConnectionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4bbe31e7e9b946458feda53eea0edbd6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDevicePortalConnectionStatics(ptr: Pointer?): WithDefault =
        IDevicePortalConnectionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDevicePortalConnectionStatics {
      val address = segment.toRawLongValue()
      return makeIDevicePortalConnectionStatics(Pointer(address))
    }

    public override fun toNative(obj: IDevicePortalConnectionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__337407532_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDevicePortalConnectionStatics):
        Array<IDevicePortalConnectionStatics?> = (elements as
        Array<IDevicePortalConnectionStatics?>).castToImpl<IDevicePortalConnectionStatics,IDevicePortalConnectionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDevicePortalConnectionStatics?> =
        arrayOfNulls<IDevicePortalConnectionStatics_Impl>(size) as
        Array<IDevicePortalConnectionStatics?>
  }
}
