package Windows.UI.Input.Inking.Analysis

import Windows.UI.Input.Inking.Analysis.IInkAnalysisNode.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkAnalysisParagraph.ABI::class)
@Signature("{d9ad045c-0cd1-4dd4-a68b-eb1f12b3d727}")
@Guid("d9ad045c0cd14dd4a68beb1f12b3d727")
@WinRTInterface("d9ad045c0cd14dd4a68beb1f12b3d727")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkAnalysisParagraph.ByReference::class)
public interface IInkAnalysisParagraph : NativeMapped, IWinRTInterface, IInkAnalysisNode {
  @InterfaceMethod(0)
  public fun get_RecognizedText(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkAnalysisParagraph> {
    public override fun getValue() = ABI.makeIInkAnalysisParagraph(pointer.getPointer(0))

    public fun setValue(value: IInkAnalysisParagraph_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkAnalysisParagraph, IInkAnalysisNode.WithDefault {
    public val __1513040358_Ptr: Pointer?

    public val _1513040358_VtblPtr: Pointer?
      get() = __1513040358_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RecognizedText(): String? {
      val fnPtr = _1513040358_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1513040358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IInkAnalysisParagraph_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInkAnalysisNode {
    public override val __323983914_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1513040358_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1513040358_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkAnalysisParagraph, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d9ad045c0cd14dd4a68beb1f12b3d727")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkAnalysisParagraph(ptr: Pointer?): WithDefault =
        IInkAnalysisParagraph_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkAnalysisParagraph {
      val address = segment.toRawLongValue()
      return makeIInkAnalysisParagraph(Pointer(address))
    }

    public override fun toNative(obj: IInkAnalysisParagraph): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1513040358_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkAnalysisParagraph): Array<IInkAnalysisParagraph?> =
        (elements as
        Array<IInkAnalysisParagraph?>).castToImpl<IInkAnalysisParagraph,IInkAnalysisParagraph_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkAnalysisParagraph?> =
        arrayOfNulls<IInkAnalysisParagraph_Impl>(size) as Array<IInkAnalysisParagraph?>
  }
}
