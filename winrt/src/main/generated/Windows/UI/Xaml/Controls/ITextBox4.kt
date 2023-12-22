package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ITextBox4.ABI::class)
@Signature("{b5f1a675-cce1-45af-aef9-c4787bbb5e30}")
@Guid("b5f1a675cce145afaef9c4787bbb5e30")
@WinRTInterface("b5f1a675cce145afaef9c4787bbb5e30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBox4.ByReference::class)
public interface ITextBox4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetLinguisticAlternativesAsync(): IAsyncOperation<IVectorView<String?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextBox4> {
    public override fun getValue() = ABI.makeITextBox4(pointer.getPointer(0))

    public fun setValue(value: ITextBox4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBox4 {
    public val __1492904270_Ptr: Pointer?

    public val _1492904270_VtblPtr: Pointer?
      get() = __1492904270_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetLinguisticAlternativesAsync(): IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _1492904270_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__1492904270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ITextBox4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1492904270_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBox4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5f1a675cce145afaef9c4787bbb5e30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBox4(ptr: Pointer?): WithDefault = ITextBox4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBox4 {
      val address = segment.toRawLongValue()
      return makeITextBox4(Pointer(address))
    }

    public override fun toNative(obj: ITextBox4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1492904270_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBox4): Array<ITextBox4?> = (elements as
        Array<ITextBox4?>).castToImpl<ITextBox4,ITextBox4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBox4?> = arrayOfNulls<ITextBox4_Impl>(size)
        as Array<ITextBox4?>
  }
}
