package Windows.Services.Maps

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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapRouteManeuver2.ABI::class)
@Signature("{5d7bcd9c-7c9b-41df-838b-eae21e4b05a9}")
@Guid("5d7bcd9c7c9b41df838beae21e4b05a9")
@WinRTInterface("5d7bcd9c7c9b41df838beae21e4b05a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteManeuver2.ByReference::class)
public interface IMapRouteManeuver2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartHeading(): Double

  @InterfaceMethod(1)
  public fun get_EndHeading(): Double

  @InterfaceMethod(2)
  public fun get_StreetName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRouteManeuver2> {
    public override fun getValue() = ABI.makeIMapRouteManeuver2(pointer.getPointer(0))

    public fun setValue(value: IMapRouteManeuver2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteManeuver2 {
    public val __97243455_Ptr: Pointer?

    public val _97243455_VtblPtr: Pointer?
      get() = __97243455_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartHeading(): Double {
      val fnPtr = _97243455_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__97243455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_EndHeading(): Double {
      val fnPtr = _97243455_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__97243455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_StreetName(): String? {
      val fnPtr = _97243455_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__97243455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteManeuver2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __97243455_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteManeuver2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d7bcd9c7c9b41df838beae21e4b05a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteManeuver2(ptr: Pointer?): WithDefault = IMapRouteManeuver2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteManeuver2 {
      val address = segment.toRawLongValue()
      return makeIMapRouteManeuver2(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteManeuver2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__97243455_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteManeuver2): Array<IMapRouteManeuver2?> =
        (elements as
        Array<IMapRouteManeuver2?>).castToImpl<IMapRouteManeuver2,IMapRouteManeuver2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteManeuver2?> =
        arrayOfNulls<IMapRouteManeuver2_Impl>(size) as Array<IMapRouteManeuver2?>
  }
}
