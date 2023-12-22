package Windows.UI.Input.Inking.Analysis

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
import Windows.UI.Input.Inking.InkStroke
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkAnalyzer.ABI::class)
@Signature("{f12b8f95-0866-4dc5-8c77-f88614dfe38c}")
@Guid("f12b8f9508664dc58c77f88614dfe38c")
@WinRTInterface("f12b8f9508664dc58c77f88614dfe38c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkAnalyzer.ByReference::class)
public interface IInkAnalyzer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnalysisRoot(): InkAnalysisRoot?

  @InterfaceMethod(1)
  public fun get_IsAnalyzing(): Boolean

  @InterfaceMethod(2)
  public fun AddDataForStroke(stroke: InkStroke?): Unit

  @InterfaceMethod(3)
  public fun AddDataForStrokes(strokes: IIterable<InkStroke?>?): Unit

  @InterfaceMethod(4)
  public fun ClearDataForAllStrokes(): Unit

  @InterfaceMethod(5)
  public fun RemoveDataForStroke(strokeId: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun RemoveDataForStrokes(strokeIds: IIterable<WinDef.UINT>?): Unit

  @InterfaceMethod(7)
  public fun ReplaceDataForStroke(stroke: InkStroke?): Unit

  @InterfaceMethod(8)
  public fun SetStrokeDataKind(strokeId: WinDef.UINT, strokeKind: InkAnalysisStrokeKind?): Unit

  @InterfaceMethod(9)
  public fun AnalyzeAsync(): IAsyncOperation<InkAnalysisResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkAnalyzer> {
    public override fun getValue() = ABI.makeIInkAnalyzer(pointer.getPointer(0))

    public fun setValue(value: IInkAnalyzer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkAnalyzer {
    public val __1938380670_Ptr: Pointer?

    public val _1938380670_VtblPtr: Pointer?
      get() = __1938380670_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnalysisRoot(): InkAnalysisRoot? {
      val fnPtr = _1938380670_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkAnalysisRoot>()
      val hr = fn.invokeHR(arrayOf(__1938380670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkAnalysisRoot>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsAnalyzing(): Boolean {
      val fnPtr = _1938380670_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1938380670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun AddDataForStroke(stroke: InkStroke?): Unit {
      val fnPtr = _1938380670_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1938380670_Ptr, marshalToNative(stroke),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun AddDataForStrokes(strokes: IIterable<InkStroke?>?): Unit {
      val fnPtr = _1938380670_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1938380670_Ptr, marshalToNative(strokes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun ClearDataForAllStrokes(): Unit {
      val fnPtr = _1938380670_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1938380670_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun RemoveDataForStroke(strokeId: WinDef.UINT): Unit {
      val fnPtr = _1938380670_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1938380670_Ptr, strokeId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun RemoveDataForStrokes(strokeIds: IIterable<WinDef.UINT>?): Unit {
      val fnPtr = _1938380670_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1938380670_Ptr, marshalToNative(strokeIds),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun ReplaceDataForStroke(stroke: InkStroke?): Unit {
      val fnPtr = _1938380670_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1938380670_Ptr, marshalToNative(stroke),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun SetStrokeDataKind(strokeId: WinDef.UINT,
        strokeKind: InkAnalysisStrokeKind?): Unit {
      val fnPtr = _1938380670_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1938380670_Ptr, strokeId, marshalToNative(strokeKind),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun AnalyzeAsync(): IAsyncOperation<InkAnalysisResult?>? {
      val fnPtr = _1938380670_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<InkAnalysisResult?>>()
      val hr = fn.invokeHR(arrayOf(__1938380670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<InkAnalysisResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IInkAnalyzer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1938380670_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkAnalyzer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f12b8f9508664dc58c77f88614dfe38c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkAnalyzer(ptr: Pointer?): WithDefault = IInkAnalyzer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkAnalyzer {
      val address = segment.toRawLongValue()
      return makeIInkAnalyzer(Pointer(address))
    }

    public override fun toNative(obj: IInkAnalyzer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1938380670_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkAnalyzer): Array<IInkAnalyzer?> = (elements as
        Array<IInkAnalyzer?>).castToImpl<IInkAnalyzer,IInkAnalyzer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkAnalyzer?> =
        arrayOfNulls<IInkAnalyzer_Impl>(size) as Array<IInkAnalyzer?>
  }
}
