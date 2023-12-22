package Windows.UI.Xaml.Controls.Maps

import Windows.Services.Maps.MapRoute
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMapRouteViewFactory.ABI::class)
@Signature("{f083addf-0066-4628-82fe-ea78c23cec1e}")
@Guid("f083addf0066462882feea78c23cec1e")
@WinRTInterface("f083addf0066462882feea78c23cec1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteViewFactory.ByReference::class)
public interface IMapRouteViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithMapRoute(
    route: MapRoute?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): MapRouteView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRouteViewFactory> {
    public override fun getValue() = ABI.makeIMapRouteViewFactory(pointer.getPointer(0))

    public fun setValue(value: IMapRouteViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteViewFactory {
    public val __2106183385_Ptr: Pointer?

    public val _2106183385_VtblPtr: Pointer?
      get() = __2106183385_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithMapRoute(
      route: MapRoute?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): MapRouteView? {
      val fnPtr = _2106183385_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapRouteView>()
      val hr = fn.invokeHR(arrayOf(__2106183385_Ptr, marshalToNative(route),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapRouteView>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2106183385_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f083addf0066462882feea78c23cec1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteViewFactory(ptr: Pointer?): WithDefault = IMapRouteViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteViewFactory {
      val address = segment.toRawLongValue()
      return makeIMapRouteViewFactory(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2106183385_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteViewFactory): Array<IMapRouteViewFactory?> =
        (elements as
        Array<IMapRouteViewFactory?>).castToImpl<IMapRouteViewFactory,IMapRouteViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteViewFactory?> =
        arrayOfNulls<IMapRouteViewFactory_Impl>(size) as Array<IMapRouteViewFactory?>
  }
}
