package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IExponentialEase.ABI::class)
@Signature("{4d289262-e832-5fbc-a98b-87a6ecb3b6cc}")
@Guid("4d289262e8325fbca98b87a6ecb3b6cc")
@WinRTInterface("4d289262e8325fbca98b87a6ecb3b6cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExponentialEase.ByReference::class)
public interface IExponentialEase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Exponent(): Double

  @InterfaceMethod(1)
  public fun put_Exponent(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExponentialEase> {
    public override fun getValue() = ABI.makeIExponentialEase(pointer.getPointer(0))

    public fun setValue(value: IExponentialEase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExponentialEase {
    public val __484397944_Ptr: Pointer?

    public val _484397944_VtblPtr: Pointer?
      get() = __484397944_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Exponent(): Double {
      val fnPtr = _484397944_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__484397944_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Exponent(value: Double): Unit {
      val fnPtr = _484397944_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__484397944_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExponentialEase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __484397944_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExponentialEase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d289262e8325fbca98b87a6ecb3b6cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExponentialEase(ptr: Pointer?): WithDefault = IExponentialEase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExponentialEase {
      val address = segment.toRawLongValue()
      return makeIExponentialEase(Pointer(address))
    }

    public override fun toNative(obj: IExponentialEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__484397944_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExponentialEase): Array<IExponentialEase?> = (elements as
        Array<IExponentialEase?>).castToImpl<IExponentialEase,IExponentialEase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExponentialEase?> =
        arrayOfNulls<IExponentialEase_Impl>(size) as Array<IExponentialEase?>
  }
}
