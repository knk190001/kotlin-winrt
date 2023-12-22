package Microsoft.UI.Xaml.Automation.Provider

import Microsoft.UI.Xaml.Automation.SupportedTextSelection
import Windows.Foundation.Point
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

@ABIMarker(ITextProvider.ABI::class)
@Signature("{37e7dce6-fe7a-56a7-a47a-9462872c67ef}")
@Guid("37e7dce6fe7a56a7a47a9462872c67ef")
@WinRTInterface("37e7dce6fe7a56a7a47a9462872c67ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextProvider.ByReference::class)
public interface ITextProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DocumentRange(): ITextRangeProvider?

  @InterfaceMethod(1)
  public fun get_SupportedTextSelection(): SupportedTextSelection?

  @InterfaceMethod(2)
  public fun GetSelection(): Array<ITextRangeProvider?>?

  @InterfaceMethod(3)
  public fun GetVisibleRanges(): Array<ITextRangeProvider?>?

  @InterfaceMethod(4)
  public fun RangeFromChild(childElement: IRawElementProviderSimple?): ITextRangeProvider?

  @InterfaceMethod(5)
  public fun RangeFromPoint(screenLocation: Point?): ITextRangeProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextProvider>
      {
    public override fun getValue() = ABI.makeITextProvider(pointer.getPointer(0))

    public fun setValue(value: ITextProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextProvider {
    public val __360269131_Ptr: Pointer?

    public val _360269131_VtblPtr: Pointer?
      get() = __360269131_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DocumentRange(): ITextRangeProvider? {
      val fnPtr = _360269131_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__360269131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRangeProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedTextSelection(): SupportedTextSelection? {
      val fnPtr = _360269131_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SupportedTextSelection>()
      val hr = fn.invokeHR(arrayOf(__360269131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SupportedTextSelection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetSelection(): Array<ITextRangeProvider?>? {
      val fnPtr = _360269131_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__360269131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetVisibleRanges(): Array<ITextRangeProvider?>? {
      val fnPtr = _360269131_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__360269131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RangeFromChild(childElement: IRawElementProviderSimple?):
        ITextRangeProvider? {
      val fnPtr = _360269131_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__360269131_Ptr, marshalToNative(childElement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRangeProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RangeFromPoint(screenLocation: Point?): ITextRangeProvider? {
      val fnPtr = _360269131_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__360269131_Ptr, marshalToNative(screenLocation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRangeProvider>(result.getValue())
      return resultValue
    }
  }

  public class ITextProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __360269131_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("37e7dce6fe7a56a7a47a9462872c67ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextProvider(ptr: Pointer?): WithDefault = ITextProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextProvider {
      val address = segment.toRawLongValue()
      return makeITextProvider(Pointer(address))
    }

    public override fun toNative(obj: ITextProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__360269131_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextProvider): Array<ITextProvider?> = (elements as
        Array<ITextProvider?>).castToImpl<ITextProvider,ITextProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextProvider?> =
        arrayOfNulls<ITextProvider_Impl>(size) as Array<ITextProvider?>
  }
}
