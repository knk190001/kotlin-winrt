package Windows.UI.Xaml.Shapes

import Windows.UI.Composition.CompositionBrush
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

@ABIMarker(IShape2.ABI::class)
@Signature("{97248dba-49f2-49a4-a5dd-164df824db14}")
@Guid("97248dba49f249a4a5dd164df824db14")
@WinRTInterface("97248dba49f249a4a5dd164df824db14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShape2.ByReference::class)
public interface IShape2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAlphaMask(): CompositionBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IShape2> {
    public override fun getValue() = ABI.makeIShape2(pointer.getPointer(0))

    public fun setValue(value: IShape2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShape2 {
    public val __1913386927_Ptr: Pointer?

    public val _1913386927_VtblPtr: Pointer?
      get() = __1913386927_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAlphaMask(): CompositionBrush? {
      val fnPtr = _1913386927_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__1913386927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }
  }

  public class IShape2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1913386927_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShape2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97248dba49f249a4a5dd164df824db14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShape2(ptr: Pointer?): WithDefault = IShape2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShape2 {
      val address = segment.toRawLongValue()
      return makeIShape2(Pointer(address))
    }

    public override fun toNative(obj: IShape2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1913386927_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShape2): Array<IShape2?> = (elements as
        Array<IShape2?>).castToImpl<IShape2,IShape2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShape2?> = arrayOfNulls<IShape2_Impl>(size) as
        Array<IShape2?>
  }
}
