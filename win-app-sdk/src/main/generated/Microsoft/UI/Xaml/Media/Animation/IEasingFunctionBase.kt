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

@ABIMarker(IEasingFunctionBase.ABI::class)
@Signature("{4fab519a-a93d-5d28-af18-84532bd32efe}")
@Guid("4fab519aa93d5d28af1884532bd32efe")
@WinRTInterface("4fab519aa93d5d28af1884532bd32efe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEasingFunctionBase.ByReference::class)
public interface IEasingFunctionBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EasingMode(): EasingMode?

  @InterfaceMethod(1)
  public fun put_EasingMode(value: EasingMode?): Unit

  @InterfaceMethod(2)
  public fun Ease(normalizedTime: Double): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEasingFunctionBase> {
    public override fun getValue() = ABI.makeIEasingFunctionBase(pointer.getPointer(0))

    public fun setValue(value: IEasingFunctionBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEasingFunctionBase {
    public val __639250639_Ptr: Pointer?

    public val _639250639_VtblPtr: Pointer?
      get() = __639250639_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EasingMode(): EasingMode? {
      val fnPtr = _639250639_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasingMode>()
      val hr = fn.invokeHR(arrayOf(__639250639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EasingMode(value: EasingMode?): Unit {
      val fnPtr = _639250639_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__639250639_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Ease(normalizedTime: Double): Double {
      val fnPtr = _639250639_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__639250639_Ptr, normalizedTime, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IEasingFunctionBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __639250639_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEasingFunctionBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4fab519aa93d5d28af1884532bd32efe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEasingFunctionBase(ptr: Pointer?): WithDefault = IEasingFunctionBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEasingFunctionBase {
      val address = segment.toRawLongValue()
      return makeIEasingFunctionBase(Pointer(address))
    }

    public override fun toNative(obj: IEasingFunctionBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__639250639_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEasingFunctionBase): Array<IEasingFunctionBase?> =
        (elements as
        Array<IEasingFunctionBase?>).castToImpl<IEasingFunctionBase,IEasingFunctionBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEasingFunctionBase?> =
        arrayOfNulls<IEasingFunctionBase_Impl>(size) as Array<IEasingFunctionBase?>
  }
}
