package Windows.UI.Xaml.Media

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

@ABIMarker(IScaleTransform.ABI::class)
@Signature("{ed67f18d-936e-43ab-929a-e9cd0a511e52}")
@Guid("ed67f18d936e43ab929ae9cd0a511e52")
@WinRTInterface("ed67f18d936e43ab929ae9cd0a511e52")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScaleTransform.ByReference::class)
public interface IScaleTransform : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterX(): Double

  @InterfaceMethod(1)
  public fun put_CenterX(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_CenterY(): Double

  @InterfaceMethod(3)
  public fun put_CenterY(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_ScaleX(): Double

  @InterfaceMethod(5)
  public fun put_ScaleX(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_ScaleY(): Double

  @InterfaceMethod(7)
  public fun put_ScaleY(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScaleTransform> {
    public override fun getValue() = ABI.makeIScaleTransform(pointer.getPointer(0))

    public fun setValue(value: IScaleTransform_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScaleTransform {
    public val __703447490_Ptr: Pointer?

    public val _703447490_VtblPtr: Pointer?
      get() = __703447490_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterX(): Double {
      val fnPtr = _703447490_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__703447490_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CenterX(value: Double): Unit {
      val fnPtr = _703447490_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__703447490_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CenterY(): Double {
      val fnPtr = _703447490_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__703447490_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CenterY(value: Double): Unit {
      val fnPtr = _703447490_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__703447490_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ScaleX(): Double {
      val fnPtr = _703447490_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__703447490_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ScaleX(value: Double): Unit {
      val fnPtr = _703447490_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__703447490_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ScaleY(): Double {
      val fnPtr = _703447490_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__703447490_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_ScaleY(value: Double): Unit {
      val fnPtr = _703447490_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__703447490_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScaleTransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __703447490_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScaleTransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed67f18d936e43ab929ae9cd0a511e52")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScaleTransform(ptr: Pointer?): WithDefault = IScaleTransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScaleTransform {
      val address = segment.toRawLongValue()
      return makeIScaleTransform(Pointer(address))
    }

    public override fun toNative(obj: IScaleTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__703447490_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScaleTransform): Array<IScaleTransform?> = (elements as
        Array<IScaleTransform?>).castToImpl<IScaleTransform,IScaleTransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScaleTransform?> =
        arrayOfNulls<IScaleTransform_Impl>(size) as Array<IScaleTransform?>
  }
}
