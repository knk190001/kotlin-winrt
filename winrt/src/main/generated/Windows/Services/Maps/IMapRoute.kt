package Windows.Services.Maps

import Windows.Devices.Geolocation.GeoboundingBox
import Windows.Devices.Geolocation.Geopath
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.TimeSpan
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapRoute.ABI::class)
@Signature("{fb07b732-584d-4583-9c60-641fea274349}")
@Guid("fb07b732584d45839c60641fea274349")
@WinRTInterface("fb07b732584d45839c60641fea274349")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRoute.ByReference::class)
public interface IMapRoute : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BoundingBox(): GeoboundingBox?

  @InterfaceMethod(1)
  public fun get_LengthInMeters(): Double

  @InterfaceMethod(2)
  public fun get_EstimatedDuration(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_Path(): Geopath?

  @InterfaceMethod(4)
  public fun get_Legs(): IVectorView<MapRouteLeg?>?

  @InterfaceMethod(5)
  public fun get_IsTrafficBased(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapRoute> {
    public override fun getValue() = ABI.makeIMapRoute(pointer.getPointer(0))

    public fun setValue(value: IMapRoute_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRoute {
    public val __48427174_Ptr: Pointer?

    public val _48427174_VtblPtr: Pointer?
      get() = __48427174_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BoundingBox(): GeoboundingBox? {
      val fnPtr = _48427174_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeoboundingBox>()
      val hr = fn.invokeHR(arrayOf(__48427174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeoboundingBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LengthInMeters(): Double {
      val fnPtr = _48427174_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__48427174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_EstimatedDuration(): TimeSpan? {
      val fnPtr = _48427174_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__48427174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Path(): Geopath? {
      val fnPtr = _48427174_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopath>()
      val hr = fn.invokeHR(arrayOf(__48427174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Legs(): IVectorView<MapRouteLeg?>? {
      val fnPtr = _48427174_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MapRouteLeg?>>()
      val hr = fn.invokeHR(arrayOf(__48427174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MapRouteLeg?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsTrafficBased(): Boolean {
      val fnPtr = _48427174_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__48427174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMapRoute_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __48427174_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRoute, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb07b732584d45839c60641fea274349")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRoute(ptr: Pointer?): WithDefault = IMapRoute_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRoute {
      val address = segment.toRawLongValue()
      return makeIMapRoute(Pointer(address))
    }

    public override fun toNative(obj: IMapRoute): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__48427174_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRoute): Array<IMapRoute?> = (elements as
        Array<IMapRoute?>).castToImpl<IMapRoute,IMapRoute_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRoute?> = arrayOfNulls<IMapRoute_Impl>(size)
        as Array<IMapRoute?>
  }
}
