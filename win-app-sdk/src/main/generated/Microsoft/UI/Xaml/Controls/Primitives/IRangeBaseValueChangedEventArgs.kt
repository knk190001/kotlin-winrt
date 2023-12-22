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

@ABIMarker(IRangeBaseValueChangedEventArgs.ABI::class)
@Signature("{b0181692-9578-51c7-9d1c-adfcf8945aa9}")
@Guid("b0181692957851c79d1cadfcf8945aa9")
@WinRTInterface("b0181692957851c79d1cadfcf8945aa9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRangeBaseValueChangedEventArgs.ByReference::class)
public interface IRangeBaseValueChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldValue(): Double

  @InterfaceMethod(1)
  public fun get_NewValue(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRangeBaseValueChangedEventArgs> {
    public override fun getValue() = ABI.makeIRangeBaseValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRangeBaseValueChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRangeBaseValueChangedEventArgs {
    public val __2109685079_Ptr: Pointer?

    public val _2109685079_VtblPtr: Pointer?
      get() = __2109685079_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldValue(): Double {
      val fnPtr = _2109685079_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2109685079_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_NewValue(): Double {
      val fnPtr = _2109685079_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2109685079_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IRangeBaseValueChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2109685079_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRangeBaseValueChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0181692957851c79d1cadfcf8945aa9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRangeBaseValueChangedEventArgs(ptr: Pointer?): WithDefault =
        IRangeBaseValueChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRangeBaseValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRangeBaseValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRangeBaseValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2109685079_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRangeBaseValueChangedEventArgs):
        Array<IRangeBaseValueChangedEventArgs?> = (elements as
        Array<IRangeBaseValueChangedEventArgs?>).castToImpl<IRangeBaseValueChangedEventArgs,IRangeBaseValueChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRangeBaseValueChangedEventArgs?> =
        arrayOfNulls<IRangeBaseValueChangedEventArgs_Impl>(size) as
        Array<IRangeBaseValueChangedEventArgs?>
  }
}
