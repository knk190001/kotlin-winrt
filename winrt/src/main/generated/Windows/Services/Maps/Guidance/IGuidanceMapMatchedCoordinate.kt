package Windows.Services.Maps.Guidance

import Windows.Devices.Geolocation.Geopoint
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

@ABIMarker(IGuidanceMapMatchedCoordinate.ABI::class)
@Signature("{b7acb168-2912-4a99-aff1-798609b981fe}")
@Guid("b7acb16829124a99aff1798609b981fe")
@WinRTInterface("b7acb16829124a99aff1798609b981fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceMapMatchedCoordinate.ByReference::class)
public interface IGuidanceMapMatchedCoordinate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Location(): Geopoint?

  @InterfaceMethod(1)
  public fun get_CurrentHeading(): Double

  @InterfaceMethod(2)
  public fun get_CurrentSpeed(): Double

  @InterfaceMethod(3)
  public fun get_IsOnStreet(): Boolean

  @InterfaceMethod(4)
  public fun get_Road(): GuidanceRoadSegment?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceMapMatchedCoordinate> {
    public override fun getValue() = ABI.makeIGuidanceMapMatchedCoordinate(pointer.getPointer(0))

    public fun setValue(value: IGuidanceMapMatchedCoordinate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceMapMatchedCoordinate {
    public val __1266895127_Ptr: Pointer?

    public val _1266895127_VtblPtr: Pointer?
      get() = __1266895127_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _1266895127_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1266895127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CurrentHeading(): Double {
      val fnPtr = _1266895127_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1266895127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CurrentSpeed(): Double {
      val fnPtr = _1266895127_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1266895127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsOnStreet(): Boolean {
      val fnPtr = _1266895127_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1266895127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Road(): GuidanceRoadSegment? {
      val fnPtr = _1266895127_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceRoadSegment>()
      val hr = fn.invokeHR(arrayOf(__1266895127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceRoadSegment>(result.getValue())
      return resultValue
    }
  }

  public class IGuidanceMapMatchedCoordinate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1266895127_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceMapMatchedCoordinate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7acb16829124a99aff1798609b981fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceMapMatchedCoordinate(ptr: Pointer?): WithDefault =
        IGuidanceMapMatchedCoordinate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceMapMatchedCoordinate {
      val address = segment.toRawLongValue()
      return makeIGuidanceMapMatchedCoordinate(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceMapMatchedCoordinate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1266895127_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceMapMatchedCoordinate):
        Array<IGuidanceMapMatchedCoordinate?> = (elements as
        Array<IGuidanceMapMatchedCoordinate?>).castToImpl<IGuidanceMapMatchedCoordinate,IGuidanceMapMatchedCoordinate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceMapMatchedCoordinate?> =
        arrayOfNulls<IGuidanceMapMatchedCoordinate_Impl>(size) as
        Array<IGuidanceMapMatchedCoordinate?>
  }
}
