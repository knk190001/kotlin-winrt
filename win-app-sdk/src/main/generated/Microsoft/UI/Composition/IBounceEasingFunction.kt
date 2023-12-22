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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBounceEasingFunction.ABI::class)
@Signature("{fa11f3c0-697b-562f-af46-c6af666b6ec4}")
@Guid("fa11f3c0697b562faf46c6af666b6ec4")
@WinRTInterface("fa11f3c0697b562faf46c6af666b6ec4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBounceEasingFunction.ByReference::class)
public interface IBounceEasingFunction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): CompositionEasingFunctionMode?

  @InterfaceMethod(1)
  public fun get_Bounces(): Int

  @InterfaceMethod(2)
  public fun get_Bounciness(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBounceEasingFunction> {
    public override fun getValue() = ABI.makeIBounceEasingFunction(pointer.getPointer(0))

    public fun setValue(value: IBounceEasingFunction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBounceEasingFunction {
    public val __267989092_Ptr: Pointer?

    public val _267989092_VtblPtr: Pointer?
      get() = __267989092_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): CompositionEasingFunctionMode? {
      val fnPtr = _267989092_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEasingFunctionMode>()
      val hr = fn.invokeHR(arrayOf(__267989092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEasingFunctionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Bounces(): Int {
      val fnPtr = _267989092_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__267989092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Bounciness(): Float {
      val fnPtr = _267989092_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__267989092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IBounceEasingFunction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __267989092_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBounceEasingFunction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa11f3c0697b562faf46c6af666b6ec4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBounceEasingFunction(ptr: Pointer?): WithDefault =
        IBounceEasingFunction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBounceEasingFunction {
      val address = segment.toRawLongValue()
      return makeIBounceEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: IBounceEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__267989092_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBounceEasingFunction): Array<IBounceEasingFunction?> =
        (elements as
        Array<IBounceEasingFunction?>).castToImpl<IBounceEasingFunction,IBounceEasingFunction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBounceEasingFunction?> =
        arrayOfNulls<IBounceEasingFunction_Impl>(size) as Array<IBounceEasingFunction?>
  }
}
