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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextProvider2.ABI::class)
@Signature("{6844f012-c7e6-5763-ba04-5b6db910cd34}")
@Guid("6844f012c7e65763ba045b6db910cd34")
@WinRTInterface("6844f012c7e65763ba045b6db910cd34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextProvider2.ByReference::class)
public interface ITextProvider2 : NativeMapped, IWinRTInterface, ITextProvider {
  @InterfaceMethod(0)
  public fun RangeFromAnnotation(annotationElement: IRawElementProviderSimple?): ITextRangeProvider?

  @InterfaceMethod(1)
  public fun GetCaretRange(isActive: Boolean): ITextRangeProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextProvider2>
      {
    public override fun getValue() = ABI.makeITextProvider2(pointer.getPointer(0))

    public fun setValue(value: ITextProvider2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextProvider2, ITextProvider.WithDefault {
    public val __1716558777_Ptr: Pointer?

    public val _1716558777_VtblPtr: Pointer?
      get() = __1716558777_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RangeFromAnnotation(annotationElement: IRawElementProviderSimple?):
        ITextRangeProvider? {
      val fnPtr = _1716558777_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__1716558777_Ptr, marshalToNative(annotationElement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRangeProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCaretRange(isActive: Boolean): ITextRangeProvider? {
      val fnPtr = _1716558777_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__1716558777_Ptr, isActive, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRangeProvider>(result.getValue())
      return resultValue
    }
  }

  public class ITextProvider2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ITextProvider {
    public override val __360269131_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1716558777_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1716558777_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextProvider2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6844f012c7e65763ba045b6db910cd34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextProvider2(ptr: Pointer?): WithDefault = ITextProvider2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextProvider2 {
      val address = segment.toRawLongValue()
      return makeITextProvider2(Pointer(address))
    }

    public override fun toNative(obj: ITextProvider2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1716558777_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextProvider2): Array<ITextProvider2?> = (elements as
        Array<ITextProvider2?>).castToImpl<ITextProvider2,ITextProvider2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextProvider2?> =
        arrayOfNulls<ITextProvider2_Impl>(size) as Array<ITextProvider2?>
  }
}
