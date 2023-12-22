package Microsoft.UI.Xaml.Controls.Primitives

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRepeatedZoomSnapPoint.ABI::class)
@Signature("{1fa6dbbe-5e11-5d32-873b-c92b1d171538}")
@Guid("1fa6dbbe5e115d32873bc92b1d171538")
@WinRTInterface("1fa6dbbe5e115d32873bc92b1d171538")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepeatedZoomSnapPoint.ByReference::class)
public interface IRepeatedZoomSnapPoint : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Offset(): Double

  @InterfaceMethod(1)
  public fun get_Interval(): Double

  @InterfaceMethod(2)
  public fun get_Start(): Double

  @InterfaceMethod(3)
  public fun get_End(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepeatedZoomSnapPoint> {
    public override fun getValue() = ABI.makeIRepeatedZoomSnapPoint(pointer.getPointer(0))

    public fun setValue(value: IRepeatedZoomSnapPoint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepeatedZoomSnapPoint {
    public val __2024824760_Ptr: Pointer?

    public val _2024824760_VtblPtr: Pointer?
      get() = __2024824760_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Offset(): Double {
      val fnPtr = _2024824760_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2024824760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Interval(): Double {
      val fnPtr = _2024824760_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2024824760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Start(): Double {
      val fnPtr = _2024824760_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2024824760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_End(): Double {
      val fnPtr = _2024824760_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2024824760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IRepeatedZoomSnapPoint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2024824760_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepeatedZoomSnapPoint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1fa6dbbe5e115d32873bc92b1d171538")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepeatedZoomSnapPoint(ptr: Pointer?): WithDefault =
        IRepeatedZoomSnapPoint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepeatedZoomSnapPoint {
      val address = segment.toRawLongValue()
      return makeIRepeatedZoomSnapPoint(Pointer(address))
    }

    public override fun toNative(obj: IRepeatedZoomSnapPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2024824760_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepeatedZoomSnapPoint): Array<IRepeatedZoomSnapPoint?> =
        (elements as
        Array<IRepeatedZoomSnapPoint?>).castToImpl<IRepeatedZoomSnapPoint,IRepeatedZoomSnapPoint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepeatedZoomSnapPoint?> =
        arrayOfNulls<IRepeatedZoomSnapPoint_Impl>(size) as Array<IRepeatedZoomSnapPoint?>
  }
}
