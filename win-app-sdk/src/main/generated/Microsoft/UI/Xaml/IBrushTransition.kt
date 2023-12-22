package Microsoft.UI.Xaml

import Windows.Foundation.TimeSpan
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

@ABIMarker(IBrushTransition.ABI::class)
@Signature("{a996a7ba-4567-5963-a112-76e3c0000204}")
@Guid("a996a7ba45675963a11276e3c0000204")
@WinRTInterface("a996a7ba45675963a11276e3c0000204")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBrushTransition.ByReference::class)
public interface IBrushTransition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_Duration(value: TimeSpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBrushTransition> {
    public override fun getValue() = ABI.makeIBrushTransition(pointer.getPointer(0))

    public fun setValue(value: IBrushTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBrushTransition {
    public val __1817546488_Ptr: Pointer?

    public val _1817546488_VtblPtr: Pointer?
      get() = __1817546488_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _1817546488_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1817546488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Duration(value: TimeSpan?): Unit {
      val fnPtr = _1817546488_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1817546488_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBrushTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1817546488_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBrushTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a996a7ba45675963a11276e3c0000204")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBrushTransition(ptr: Pointer?): WithDefault = IBrushTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBrushTransition {
      val address = segment.toRawLongValue()
      return makeIBrushTransition(Pointer(address))
    }

    public override fun toNative(obj: IBrushTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1817546488_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBrushTransition): Array<IBrushTransition?> = (elements as
        Array<IBrushTransition?>).castToImpl<IBrushTransition,IBrushTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBrushTransition?> =
        arrayOfNulls<IBrushTransition_Impl>(size) as Array<IBrushTransition?>
  }
}
