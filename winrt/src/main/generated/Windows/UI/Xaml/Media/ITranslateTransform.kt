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

@ABIMarker(ITranslateTransform.ABI::class)
@Signature("{c975905c-3c36-4229-817b-178f64c0e113}")
@Guid("c975905c3c364229817b178f64c0e113")
@WinRTInterface("c975905c3c364229817b178f64c0e113")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITranslateTransform.ByReference::class)
public interface ITranslateTransform : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_X(): Double

  @InterfaceMethod(1)
  public fun put_X(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_Y(): Double

  @InterfaceMethod(3)
  public fun put_Y(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITranslateTransform> {
    public override fun getValue() = ABI.makeITranslateTransform(pointer.getPointer(0))

    public fun setValue(value: ITranslateTransform_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITranslateTransform {
    public val __976601926_Ptr: Pointer?

    public val _976601926_VtblPtr: Pointer?
      get() = __976601926_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_X(): Double {
      val fnPtr = _976601926_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__976601926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_X(value: Double): Unit {
      val fnPtr = _976601926_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__976601926_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Y(): Double {
      val fnPtr = _976601926_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__976601926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Y(value: Double): Unit {
      val fnPtr = _976601926_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__976601926_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITranslateTransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __976601926_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITranslateTransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c975905c3c364229817b178f64c0e113")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITranslateTransform(ptr: Pointer?): WithDefault = ITranslateTransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITranslateTransform {
      val address = segment.toRawLongValue()
      return makeITranslateTransform(Pointer(address))
    }

    public override fun toNative(obj: ITranslateTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__976601926_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITranslateTransform): Array<ITranslateTransform?> =
        (elements as
        Array<ITranslateTransform?>).castToImpl<ITranslateTransform,ITranslateTransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITranslateTransform?> =
        arrayOfNulls<ITranslateTransform_Impl>(size) as Array<ITranslateTransform?>
  }
}
