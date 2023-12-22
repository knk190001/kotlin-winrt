package Windows.UI.Composition

import Windows.Foundation.Numerics.Vector2
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

@ABIMarker(ICubicBezierEasingFunction.ABI::class)
@Signature("{32350666-c1e8-44f9-96b8-c98acf0ae698}")
@Guid("32350666c1e844f996b8c98acf0ae698")
@WinRTInterface("32350666c1e844f996b8c98acf0ae698")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICubicBezierEasingFunction.ByReference::class)
public interface ICubicBezierEasingFunction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ControlPoint1(): Vector2?

  @InterfaceMethod(1)
  public fun get_ControlPoint2(): Vector2?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICubicBezierEasingFunction> {
    public override fun getValue() = ABI.makeICubicBezierEasingFunction(pointer.getPointer(0))

    public fun setValue(value: ICubicBezierEasingFunction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICubicBezierEasingFunction {
    public val __571128158_Ptr: Pointer?

    public val _571128158_VtblPtr: Pointer?
      get() = __571128158_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ControlPoint1(): Vector2? {
      val fnPtr = _571128158_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__571128158_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ControlPoint2(): Vector2? {
      val fnPtr = _571128158_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__571128158_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }
  }

  public class ICubicBezierEasingFunction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __571128158_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICubicBezierEasingFunction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("32350666c1e844f996b8c98acf0ae698")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICubicBezierEasingFunction(ptr: Pointer?): WithDefault =
        ICubicBezierEasingFunction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICubicBezierEasingFunction {
      val address = segment.toRawLongValue()
      return makeICubicBezierEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: ICubicBezierEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__571128158_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICubicBezierEasingFunction):
        Array<ICubicBezierEasingFunction?> = (elements as
        Array<ICubicBezierEasingFunction?>).castToImpl<ICubicBezierEasingFunction,ICubicBezierEasingFunction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICubicBezierEasingFunction?> =
        arrayOfNulls<ICubicBezierEasingFunction_Impl>(size) as Array<ICubicBezierEasingFunction?>
  }
}
