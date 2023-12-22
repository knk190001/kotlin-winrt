package Microsoft.UI.Composition

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExpressionAnimation.ABI::class)
@Signature("{7fff5826-1992-56c0-9060-5ade561a4f2d}")
@Guid("7fff5826199256c090605ade561a4f2d")
@WinRTInterface("7fff5826199256c090605ade561a4f2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpressionAnimation.ByReference::class)
public interface IExpressionAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Expression(): String?

  @InterfaceMethod(1)
  public fun put_Expression(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpressionAnimation> {
    public override fun getValue() = ABI.makeIExpressionAnimation(pointer.getPointer(0))

    public fun setValue(value: IExpressionAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpressionAnimation {
    public val __621987053_Ptr: Pointer?

    public val _621987053_VtblPtr: Pointer?
      get() = __621987053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Expression(): String? {
      val fnPtr = _621987053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__621987053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Expression(value: String?): Unit {
      val fnPtr = _621987053_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__621987053_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExpressionAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __621987053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpressionAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7fff5826199256c090605ade561a4f2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpressionAnimation(ptr: Pointer?): WithDefault = IExpressionAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpressionAnimation {
      val address = segment.toRawLongValue()
      return makeIExpressionAnimation(Pointer(address))
    }

    public override fun toNative(obj: IExpressionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__621987053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpressionAnimation): Array<IExpressionAnimation?> =
        (elements as
        Array<IExpressionAnimation?>).castToImpl<IExpressionAnimation,IExpressionAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpressionAnimation?> =
        arrayOfNulls<IExpressionAnimation_Impl>(size) as Array<IExpressionAnimation?>
  }
}
