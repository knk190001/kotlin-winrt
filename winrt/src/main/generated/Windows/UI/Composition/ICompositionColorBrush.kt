package Windows.UI.Composition

import Windows.UI.Color
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

@ABIMarker(ICompositionColorBrush.ABI::class)
@Signature("{2b264c5e-bf35-4831-8642-cf70c20fff2f}")
@Guid("2b264c5ebf3548318642cf70c20fff2f")
@WinRTInterface("2b264c5ebf3548318642cf70c20fff2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionColorBrush.ByReference::class)
public interface ICompositionColorBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): Color?

  @InterfaceMethod(1)
  public fun put_Color(value: Color?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionColorBrush> {
    public override fun getValue() = ABI.makeICompositionColorBrush(pointer.getPointer(0))

    public fun setValue(value: ICompositionColorBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionColorBrush {
    public val __838055949_Ptr: Pointer?

    public val _838055949_VtblPtr: Pointer?
      get() = __838055949_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): Color? {
      val fnPtr = _838055949_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__838055949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _838055949_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__838055949_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionColorBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __838055949_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionColorBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b264c5ebf3548318642cf70c20fff2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionColorBrush(ptr: Pointer?): WithDefault =
        ICompositionColorBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionColorBrush {
      val address = segment.toRawLongValue()
      return makeICompositionColorBrush(Pointer(address))
    }

    public override fun toNative(obj: ICompositionColorBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__838055949_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionColorBrush): Array<ICompositionColorBrush?> =
        (elements as
        Array<ICompositionColorBrush?>).castToImpl<ICompositionColorBrush,ICompositionColorBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionColorBrush?> =
        arrayOfNulls<ICompositionColorBrush_Impl>(size) as Array<ICompositionColorBrush?>
  }
}
