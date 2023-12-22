package Microsoft.UI.Xaml.Media

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

@ABIMarker(IRotateTransform.ABI::class)
@Signature("{d4686e7c-a374-5cac-8927-0ef07c5b254d}")
@Guid("d4686e7ca3745cac89270ef07c5b254d")
@WinRTInterface("d4686e7ca3745cac89270ef07c5b254d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRotateTransform.ByReference::class)
public interface IRotateTransform : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterX(): Double

  @InterfaceMethod(1)
  public fun put_CenterX(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_CenterY(): Double

  @InterfaceMethod(3)
  public fun put_CenterY(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_Angle(): Double

  @InterfaceMethod(5)
  public fun put_Angle(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRotateTransform> {
    public override fun getValue() = ABI.makeIRotateTransform(pointer.getPointer(0))

    public fun setValue(value: IRotateTransform_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRotateTransform {
    public val __1338768384_Ptr: Pointer?

    public val _1338768384_VtblPtr: Pointer?
      get() = __1338768384_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterX(): Double {
      val fnPtr = _1338768384_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1338768384_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CenterX(value: Double): Unit {
      val fnPtr = _1338768384_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1338768384_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CenterY(): Double {
      val fnPtr = _1338768384_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1338768384_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CenterY(value: Double): Unit {
      val fnPtr = _1338768384_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1338768384_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Angle(): Double {
      val fnPtr = _1338768384_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1338768384_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Angle(value: Double): Unit {
      val fnPtr = _1338768384_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1338768384_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRotateTransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1338768384_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRotateTransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4686e7ca3745cac89270ef07c5b254d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRotateTransform(ptr: Pointer?): WithDefault = IRotateTransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRotateTransform {
      val address = segment.toRawLongValue()
      return makeIRotateTransform(Pointer(address))
    }

    public override fun toNative(obj: IRotateTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1338768384_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRotateTransform): Array<IRotateTransform?> = (elements as
        Array<IRotateTransform?>).castToImpl<IRotateTransform,IRotateTransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRotateTransform?> =
        arrayOfNulls<IRotateTransform_Impl>(size) as Array<IRotateTransform?>
  }
}
