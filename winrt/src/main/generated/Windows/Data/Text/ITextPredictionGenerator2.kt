package Windows.Data.Text

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.UI.Text.Core.CoreTextInputScope
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ITextPredictionGenerator2.ABI::class)
@Signature("{b84723b8-2c77-486a-900a-a3453eedc15d}")
@Guid("b84723b82c77486a900aa3453eedc15d")
@WinRTInterface("b84723b82c77486a900aa3453eedc15d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextPredictionGenerator2.ByReference::class)
public interface ITextPredictionGenerator2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCandidatesAsync(
    input: String?,
    maxCandidates: WinDef.UINT,
    predictionOptions: TextPredictionOptions?,
    previousStrings: IIterable<String?>?
  ): IAsyncOperation<IVectorView<String?>?>?

  @InterfaceMethod(1)
  public fun GetNextWordCandidatesAsync(maxCandidates: WinDef.UINT,
      previousStrings: IIterable<String?>?): IAsyncOperation<IVectorView<String?>?>?

  @InterfaceMethod(2)
  public fun get_InputScope(): CoreTextInputScope?

  @InterfaceMethod(3)
  public fun put_InputScope(value: CoreTextInputScope?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextPredictionGenerator2> {
    public override fun getValue() = ABI.makeITextPredictionGenerator2(pointer.getPointer(0))

    public fun setValue(value: ITextPredictionGenerator2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextPredictionGenerator2 {
    public val __580459650_Ptr: Pointer?

    public val _580459650_VtblPtr: Pointer?
      get() = __580459650_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCandidatesAsync(
      input: String?,
      maxCandidates: WinDef.UINT,
      predictionOptions: TextPredictionOptions?,
      previousStrings: IIterable<String?>?
    ): IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _580459650_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__580459650_Ptr, marshalToNative(input), maxCandidates,
          marshalToNative(predictionOptions), marshalToNative(previousStrings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetNextWordCandidatesAsync(maxCandidates: WinDef.UINT,
        previousStrings: IIterable<String?>?): IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _580459650_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__580459650_Ptr, maxCandidates, marshalToNative(previousStrings),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_InputScope(): CoreTextInputScope? {
      val fnPtr = _580459650_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextInputScope>()
      val hr = fn.invokeHR(arrayOf(__580459650_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextInputScope>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_InputScope(value: CoreTextInputScope?): Unit {
      val fnPtr = _580459650_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__580459650_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextPredictionGenerator2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __580459650_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextPredictionGenerator2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b84723b82c77486a900aa3453eedc15d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextPredictionGenerator2(ptr: Pointer?): WithDefault =
        ITextPredictionGenerator2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextPredictionGenerator2 {
      val address = segment.toRawLongValue()
      return makeITextPredictionGenerator2(Pointer(address))
    }

    public override fun toNative(obj: ITextPredictionGenerator2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__580459650_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextPredictionGenerator2):
        Array<ITextPredictionGenerator2?> = (elements as
        Array<ITextPredictionGenerator2?>).castToImpl<ITextPredictionGenerator2,ITextPredictionGenerator2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextPredictionGenerator2?> =
        arrayOfNulls<ITextPredictionGenerator2_Impl>(size) as Array<ITextPredictionGenerator2?>
  }
}
