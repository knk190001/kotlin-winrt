package Windows.Services.Maps

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IMapRouteManeuver3.ABI::class)
@Signature("{a6a138df-0483-4166-85be-b99336c11875}")
@Guid("a6a138df0483416685beb99336c11875")
@WinRTInterface("a6a138df0483416685beb99336c11875")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteManeuver3.ByReference::class)
public interface IMapRouteManeuver3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Warnings(): IVectorView<ManeuverWarning?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRouteManeuver3> {
    public override fun getValue() = ABI.makeIMapRouteManeuver3(pointer.getPointer(0))

    public fun setValue(value: IMapRouteManeuver3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteManeuver3 {
    public val __97243456_Ptr: Pointer?

    public val _97243456_VtblPtr: Pointer?
      get() = __97243456_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Warnings(): IVectorView<ManeuverWarning?>? {
      val fnPtr = _97243456_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ManeuverWarning?>>()
      val hr = fn.invokeHR(arrayOf(__97243456_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ManeuverWarning?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteManeuver3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __97243456_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteManeuver3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6a138df0483416685beb99336c11875")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteManeuver3(ptr: Pointer?): WithDefault = IMapRouteManeuver3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteManeuver3 {
      val address = segment.toRawLongValue()
      return makeIMapRouteManeuver3(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteManeuver3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__97243456_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteManeuver3): Array<IMapRouteManeuver3?> =
        (elements as
        Array<IMapRouteManeuver3?>).castToImpl<IMapRouteManeuver3,IMapRouteManeuver3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteManeuver3?> =
        arrayOfNulls<IMapRouteManeuver3_Impl>(size) as Array<IMapRouteManeuver3?>
  }
}
