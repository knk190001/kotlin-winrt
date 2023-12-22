package Microsoft.UI.Xaml.Automation.Provider

import Microsoft.UI.Xaml.Automation.Provider.ITextProvider.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ITextEditProvider.ABI::class)
@Signature("{7f09bbe8-bea7-5dd3-ba6b-28dbb402fad4}")
@Guid("7f09bbe8bea75dd3ba6b28dbb402fad4")
@WinRTInterface("7f09bbe8bea75dd3ba6b28dbb402fad4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextEditProvider.ByReference::class)
public interface ITextEditProvider : NativeMapped, IWinRTInterface, ITextProvider {
  @InterfaceMethod(0)
  public fun GetActiveComposition(): ITextRangeProvider?

  @InterfaceMethod(1)
  public fun GetConversionTarget(): ITextRangeProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextEditProvider> {
    public override fun getValue() = ABI.makeITextEditProvider(pointer.getPointer(0))

    public fun setValue(value: ITextEditProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextEditProvider, ITextProvider.WithDefault {
    public val __149016459_Ptr: Pointer?

    public val _149016459_VtblPtr: Pointer?
      get() = __149016459_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetActiveComposition(): ITextRangeProvider? {
      val fnPtr = _149016459_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__149016459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRangeProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetConversionTarget(): ITextRangeProvider? {
      val fnPtr = _149016459_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__149016459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRangeProvider>(result.getValue())
      return resultValue
    }
  }

  public class ITextEditProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ITextProvider {
    public override val __360269131_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_149016459_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __149016459_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextEditProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f09bbe8bea75dd3ba6b28dbb402fad4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextEditProvider(ptr: Pointer?): WithDefault = ITextEditProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextEditProvider {
      val address = segment.toRawLongValue()
      return makeITextEditProvider(Pointer(address))
    }

    public override fun toNative(obj: ITextEditProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__149016459_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextEditProvider): Array<ITextEditProvider?> = (elements
        as Array<ITextEditProvider?>).castToImpl<ITextEditProvider,ITextEditProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextEditProvider?> =
        arrayOfNulls<ITextEditProvider_Impl>(size) as Array<ITextEditProvider?>
  }
}
