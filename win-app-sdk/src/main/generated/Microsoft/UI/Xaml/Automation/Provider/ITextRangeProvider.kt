package Microsoft.UI.Xaml.Automation.Provider

import Microsoft.UI.Xaml.Automation.Text.TextPatternRangeEndpoint
import Microsoft.UI.Xaml.Automation.Text.TextUnit
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.OutArray
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextRangeProvider.ABI::class)
@Signature("{84210361-6ce2-5084-bf3b-28afa6e9851f}")
@Guid("842103616ce25084bf3b28afa6e9851f")
@WinRTInterface("842103616ce25084bf3b28afa6e9851f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextRangeProvider.ByReference::class)
public interface ITextRangeProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Clone(): ITextRangeProvider?

  @InterfaceMethod(1)
  public fun Compare(textRangeProvider: ITextRangeProvider?): Boolean

  @InterfaceMethod(2)
  public fun CompareEndpoints(
    endpoint: TextPatternRangeEndpoint?,
    textRangeProvider: ITextRangeProvider?,
    targetEndpoint: TextPatternRangeEndpoint?
  ): Int

  @InterfaceMethod(3)
  public fun ExpandToEnclosingUnit(unit: TextUnit?): Unit

  @InterfaceMethod(4)
  public fun FindAttribute(
    attributeId: Int,
    value: IUnknown?,
    backward: Boolean
  ): ITextRangeProvider?

  @InterfaceMethod(5)
  public fun FindText(
    text: String?,
    backward: Boolean,
    ignoreCase: Boolean
  ): ITextRangeProvider?

  @InterfaceMethod(6)
  public fun GetAttributeValue(attributeId: Int): IUnknown?

  @InterfaceMethod(7)
  public fun GetBoundingRectangles(returnValue: OutArray<Double>): Unit

  @InterfaceMethod(8)
  public fun GetEnclosingElement(): IRawElementProviderSimple?

  @InterfaceMethod(9)
  public fun GetText(maxLength: Int): String?

  @InterfaceMethod(10)
  public fun Move(unit: TextUnit?, count: Int): Int

  @InterfaceMethod(11)
  public fun MoveEndpointByUnit(
    endpoint: TextPatternRangeEndpoint?,
    unit: TextUnit?,
    count: Int
  ): Int

  @InterfaceMethod(12)
  public fun MoveEndpointByRange(
    endpoint: TextPatternRangeEndpoint?,
    textRangeProvider: ITextRangeProvider?,
    targetEndpoint: TextPatternRangeEndpoint?
  ): Unit

  @InterfaceMethod(13)
  public fun Select(): Unit

  @InterfaceMethod(14)
  public fun AddToSelection(): Unit

  @InterfaceMethod(15)
  public fun RemoveFromSelection(): Unit

  @InterfaceMethod(16)
  public fun ScrollIntoView(alignToTop: Boolean): Unit

  @InterfaceMethod(17)
  public fun GetChildren(): Array<IRawElementProviderSimple?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextRangeProvider> {
    public override fun getValue() = ABI.makeITextRangeProvider(pointer.getPointer(0))

    public fun setValue(value: ITextRangeProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextRangeProvider {
    public val __1680236340_Ptr: Pointer?

    public val _1680236340_VtblPtr: Pointer?
      get() = __1680236340_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Clone(): ITextRangeProvider? {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRangeProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Compare(textRangeProvider: ITextRangeProvider?): Boolean {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, marshalToNative(textRangeProvider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun CompareEndpoints(
      endpoint: TextPatternRangeEndpoint?,
      textRangeProvider: ITextRangeProvider?,
      targetEndpoint: TextPatternRangeEndpoint?
    ): Int {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, marshalToNative(endpoint),
          marshalToNative(textRangeProvider), marshalToNative(targetEndpoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun ExpandToEnclosingUnit(unit: TextUnit?): Unit {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, marshalToNative(unit),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun FindAttribute(
      attributeId: Int,
      value: IUnknown?,
      backward: Boolean
    ): ITextRangeProvider? {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, attributeId, marshalToNative(value), backward,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRangeProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun FindText(
      text: String?,
      backward: Boolean,
      ignoreCase: Boolean
    ): ITextRangeProvider? {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRangeProvider>()
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, marshalToNative(text), backward, ignoreCase,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRangeProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetAttributeValue(attributeId: Int): IUnknown? {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, attributeId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetBoundingRectangles(returnValue: OutArray<Double>): Unit {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr,
          returnValue.size,marshalToNative(returnValue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun GetEnclosingElement(): IRawElementProviderSimple? {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRawElementProviderSimple>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetText(maxLength: Int): String? {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, maxLength, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun Move(unit: TextUnit?, count: Int): Int {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, marshalToNative(unit), count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun MoveEndpointByUnit(
      endpoint: TextPatternRangeEndpoint?,
      unit: TextUnit?,
      count: Int
    ): Int {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, marshalToNative(endpoint),
          marshalToNative(unit), count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun MoveEndpointByRange(
      endpoint: TextPatternRangeEndpoint?,
      textRangeProvider: ITextRangeProvider?,
      targetEndpoint: TextPatternRangeEndpoint?
    ): Unit {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, marshalToNative(endpoint),
          marshalToNative(textRangeProvider), marshalToNative(targetEndpoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun Select(): Unit {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun AddToSelection(): Unit {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun RemoveFromSelection(): Unit {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun ScrollIntoView(alignToTop: Boolean): Unit {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr, alignToTop,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun GetChildren(): Array<IRawElementProviderSimple?>? {
      val fnPtr = _1680236340_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1680236340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class ITextRangeProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1680236340_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextRangeProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("842103616ce25084bf3b28afa6e9851f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextRangeProvider(ptr: Pointer?): WithDefault = ITextRangeProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextRangeProvider {
      val address = segment.toRawLongValue()
      return makeITextRangeProvider(Pointer(address))
    }

    public override fun toNative(obj: ITextRangeProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1680236340_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextRangeProvider): Array<ITextRangeProvider?> =
        (elements as
        Array<ITextRangeProvider?>).castToImpl<ITextRangeProvider,ITextRangeProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextRangeProvider?> =
        arrayOfNulls<ITextRangeProvider_Impl>(size) as Array<ITextRangeProvider?>
  }
}
