package Windows.Networking.Vpn

import Windows.Networking.HostName
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnRouteFactory.ABI::class)
@Signature("{bdeab5ff-45cf-4b99-83fb-db3bc2672b02}")
@Guid("bdeab5ff45cf4b9983fbdb3bc2672b02")
@WinRTInterface("bdeab5ff45cf4b9983fbdb3bc2672b02")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnRouteFactory.ByReference::class)
public interface IVpnRouteFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateVpnRoute(address: HostName?, prefixSize: Byte): VpnRoute?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnRouteFactory> {
    public override fun getValue() = ABI.makeIVpnRouteFactory(pointer.getPointer(0))

    public fun setValue(value: IVpnRouteFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnRouteFactory {
    public val __353091087_Ptr: Pointer?

    public val _353091087_VtblPtr: Pointer?
      get() = __353091087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateVpnRoute(address: HostName?, prefixSize: Byte): VpnRoute? {
      val fnPtr = _353091087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnRoute>()
      val hr = fn.invokeHR(arrayOf(__353091087_Ptr, marshalToNative(address), prefixSize, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnRoute>(result.getValue())
      return resultValue
    }
  }

  public class IVpnRouteFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __353091087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnRouteFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bdeab5ff45cf4b9983fbdb3bc2672b02")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnRouteFactory(ptr: Pointer?): WithDefault = IVpnRouteFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnRouteFactory {
      val address = segment.toRawLongValue()
      return makeIVpnRouteFactory(Pointer(address))
    }

    public override fun toNative(obj: IVpnRouteFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__353091087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnRouteFactory): Array<IVpnRouteFactory?> = (elements as
        Array<IVpnRouteFactory?>).castToImpl<IVpnRouteFactory,IVpnRouteFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnRouteFactory?> =
        arrayOfNulls<IVpnRouteFactory_Impl>(size) as Array<IVpnRouteFactory?>
  }
}
