package Windows.UI.Xaml.Automation.Provider

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

@ABIMarker(ITextChildProvider.ABI::class)
@Signature("{1133c336-a89b-4130-9be6-55e33334f557}")
@Guid("1133c336a89b41309be655e33334f557")
@WinRTInterface("1133c336a89b41309be655e33334f557")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextChildProvider.ByReference::class)
public interface ITextChildProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextContainer(): IRawElementProviderSimple?

  @InterfaceMethod(1)
  public fun get_TextRange(): ITextRangeProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextChildProvider> {
    public override fun getValue() = ABI.makeITextChildProvider(pointer.getPointer(0))

    public fun setValue(value: ITextChildProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextChildProvider {
    public val __2122594536_Ptr: Pointer?

    public val _2122594536_VtblPtr: Pointer?
      get() = __2122594536_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextContainer(): IRawElementProviderSimple? {
      val fnPtr = _2122594536_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__2122594536_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRawElementProviderSimple>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TextRange(): ITextRangeProvider? {
      val fnPtr = _2122594536_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__2122594536_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRangeProvider>(result.getValue())
      return resultValue
    }
  }

  public class ITextChildProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2122594536_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextChildProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1133c336a89b41309be655e33334f557")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextChildProvider(ptr: Pointer?): WithDefault = ITextChildProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextChildProvider {
      val address = segment.toRawLongValue()
      return makeITextChildProvider(Pointer(address))
    }

    public override fun toNative(obj: ITextChildProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2122594536_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextChildProvider): Array<ITextChildProvider?> =
        (elements as
        Array<ITextChildProvider?>).castToImpl<ITextChildProvider,ITextChildProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextChildProvider?> =
        arrayOfNulls<ITextChildProvider_Impl>(size) as Array<ITextChildProvider?>
  }
}
