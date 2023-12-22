package Windows.UI.Xaml.Controls

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

@ABIMarker(ITextBlock4.ABI::class)
@Signature("{b014f270-9808-4adc-b452-60cda54100c1}")
@Guid("b014f27098084adcb45260cda54100c1")
@WinRTInterface("b014f27098084adcb45260cda54100c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBlock4.ByReference::class)
public interface ITextBlock4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAlphaMask(): CompositionBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextBlock4> {
    public override fun getValue() = ABI.makeITextBlock4(pointer.getPointer(0))

    public fun setValue(value: ITextBlock4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBlock4 {
    public val __164916752_Ptr: Pointer?

    public val _164916752_VtblPtr: Pointer?
      get() = __164916752_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAlphaMask(): CompositionBrush? {
      val fnPtr = _164916752_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__164916752_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }
  }

  public class ITextBlock4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __164916752_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBlock4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b014f27098084adcb45260cda54100c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBlock4(ptr: Pointer?): WithDefault = ITextBlock4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBlock4 {
      val address = segment.toRawLongValue()
      return makeITextBlock4(Pointer(address))
    }

    public override fun toNative(obj: ITextBlock4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__164916752_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBlock4): Array<ITextBlock4?> = (elements as
        Array<ITextBlock4?>).castToImpl<ITextBlock4,ITextBlock4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBlock4?> =
        arrayOfNulls<ITextBlock4_Impl>(size) as Array<ITextBlock4?>
  }
}
