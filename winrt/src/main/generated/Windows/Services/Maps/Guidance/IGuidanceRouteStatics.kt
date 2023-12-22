package Windows.Services.Maps.Guidance

import Windows.Services.Maps.MapRoute
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGuidanceRouteStatics.ABI::class)
@Signature("{f56d926a-55ed-49c1-b09c-4b8223b50db3}")
@Guid("f56d926a55ed49c1b09c4b8223b50db3")
@WinRTInterface("f56d926a55ed49c1b09c4b8223b50db3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceRouteStatics.ByReference::class)
public interface IGuidanceRouteStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CanCreateFromMapRoute(mapRoute: MapRoute?): Boolean

  @InterfaceMethod(1)
  public fun TryCreateFromMapRoute(mapRoute: MapRoute?): GuidanceRoute?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceRouteStatics> {
    public override fun getValue() = ABI.makeIGuidanceRouteStatics(pointer.getPointer(0))

    public fun setValue(value: IGuidanceRouteStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceRouteStatics {
    public val __126040685_Ptr: Pointer?

    public val _126040685_VtblPtr: Pointer?
      get() = __126040685_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CanCreateFromMapRoute(mapRoute: MapRoute?): Boolean {
      val fnPtr = _126040685_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__126040685_Ptr, marshalToNative(mapRoute), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TryCreateFromMapRoute(mapRoute: MapRoute?): GuidanceRoute? {
      val fnPtr = _126040685_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceRoute>()
      val hr = fn.invokeHR(arrayOf(__126040685_Ptr, marshalToNative(mapRoute), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceRoute>(result.getValue())
      return resultValue
    }
  }

  public class IGuidanceRouteStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __126040685_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceRouteStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f56d926a55ed49c1b09c4b8223b50db3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceRouteStatics(ptr: Pointer?): WithDefault =
        IGuidanceRouteStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceRouteStatics {
      val address = segment.toRawLongValue()
      return makeIGuidanceRouteStatics(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceRouteStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__126040685_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceRouteStatics): Array<IGuidanceRouteStatics?> =
        (elements as
        Array<IGuidanceRouteStatics?>).castToImpl<IGuidanceRouteStatics,IGuidanceRouteStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceRouteStatics?> =
        arrayOfNulls<IGuidanceRouteStatics_Impl>(size) as Array<IGuidanceRouteStatics?>
  }
}
