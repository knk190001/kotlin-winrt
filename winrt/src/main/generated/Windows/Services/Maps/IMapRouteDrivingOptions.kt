package Windows.Services.Maps

import Windows.Foundation.IReference
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapRouteDrivingOptions.ABI::class)
@Signature("{6815364d-c6dc-4697-a452-b18f8f0b67a1}")
@Guid("6815364dc6dc4697a452b18f8f0b67a1")
@WinRTInterface("6815364dc6dc4697a452b18f8f0b67a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteDrivingOptions.ByReference::class)
public interface IMapRouteDrivingOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxAlternateRouteCount(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_MaxAlternateRouteCount(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_InitialHeading(): IReference<Double>?

  @InterfaceMethod(3)
  public fun put_InitialHeading(value: IReference<Double>?): Unit

  @InterfaceMethod(4)
  public fun get_RouteOptimization(): MapRouteOptimization?

  @InterfaceMethod(5)
  public fun put_RouteOptimization(value: MapRouteOptimization?): Unit

  @InterfaceMethod(6)
  public fun get_RouteRestrictions(): MapRouteRestrictions?

  @InterfaceMethod(7)
  public fun put_RouteRestrictions(value: MapRouteRestrictions?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRouteDrivingOptions> {
    public override fun getValue() = ABI.makeIMapRouteDrivingOptions(pointer.getPointer(0))

    public fun setValue(value: IMapRouteDrivingOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteDrivingOptions {
    public val __2094851375_Ptr: Pointer?

    public val _2094851375_VtblPtr: Pointer?
      get() = __2094851375_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxAlternateRouteCount(): WinDef.UINT {
      val fnPtr = _2094851375_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2094851375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MaxAlternateRouteCount(value: WinDef.UINT): Unit {
      val fnPtr = _2094851375_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2094851375_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_InitialHeading(): IReference<Double>? {
      val fnPtr = _2094851375_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__2094851375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_InitialHeading(value: IReference<Double>?): Unit {
      val fnPtr = _2094851375_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2094851375_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RouteOptimization(): MapRouteOptimization? {
      val fnPtr = _2094851375_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapRouteOptimization>()
      val hr = fn.invokeHR(arrayOf(__2094851375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapRouteOptimization>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_RouteOptimization(value: MapRouteOptimization?): Unit {
      val fnPtr = _2094851375_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2094851375_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RouteRestrictions(): MapRouteRestrictions? {
      val fnPtr = _2094851375_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapRouteRestrictions>()
      val hr = fn.invokeHR(arrayOf(__2094851375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapRouteRestrictions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_RouteRestrictions(value: MapRouteRestrictions?): Unit {
      val fnPtr = _2094851375_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2094851375_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapRouteDrivingOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2094851375_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteDrivingOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6815364dc6dc4697a452b18f8f0b67a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteDrivingOptions(ptr: Pointer?): WithDefault =
        IMapRouteDrivingOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteDrivingOptions {
      val address = segment.toRawLongValue()
      return makeIMapRouteDrivingOptions(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteDrivingOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2094851375_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteDrivingOptions): Array<IMapRouteDrivingOptions?>
        = (elements as
        Array<IMapRouteDrivingOptions?>).castToImpl<IMapRouteDrivingOptions,IMapRouteDrivingOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteDrivingOptions?> =
        arrayOfNulls<IMapRouteDrivingOptions_Impl>(size) as Array<IMapRouteDrivingOptions?>
  }
}
