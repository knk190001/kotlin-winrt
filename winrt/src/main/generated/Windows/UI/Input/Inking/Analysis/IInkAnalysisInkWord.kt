package Windows.UI.Input.Inking.Analysis

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IInkAnalysisInkWord.ABI::class)
@Signature("{4bd228ad-83af-4034-8f3b-f8687dfff436}")
@Guid("4bd228ad83af40348f3bf8687dfff436")
@WinRTInterface("4bd228ad83af40348f3bf8687dfff436")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkAnalysisInkWord.ByReference::class)
public interface IInkAnalysisInkWord : NativeMapped, IWinRTInterface, IInkAnalysisNode {
  @InterfaceMethod(0)
  public fun get_RecognizedText(): String?

  @InterfaceMethod(1)
  public fun get_TextAlternates(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkAnalysisInkWord> {
    public override fun getValue() = ABI.makeIInkAnalysisInkWord(pointer.getPointer(0))

    public fun setValue(value: IInkAnalysisInkWord_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkAnalysisInkWord, IInkAnalysisNode.WithDefault {
    public val __1178290244_Ptr: Pointer?

    public val _1178290244_VtblPtr: Pointer?
      get() = __1178290244_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RecognizedText(): String? {
      val fnPtr = _1178290244_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1178290244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TextAlternates(): IVectorView<String?>? {
      val fnPtr = _1178290244_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1178290244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IInkAnalysisInkWord_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInkAnalysisNode {
    public override val __323983914_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1178290244_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1178290244_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkAnalysisInkWord, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4bd228ad83af40348f3bf8687dfff436")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkAnalysisInkWord(ptr: Pointer?): WithDefault = IInkAnalysisInkWord_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkAnalysisInkWord {
      val address = segment.toRawLongValue()
      return makeIInkAnalysisInkWord(Pointer(address))
    }

    public override fun toNative(obj: IInkAnalysisInkWord): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1178290244_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkAnalysisInkWord): Array<IInkAnalysisInkWord?> =
        (elements as
        Array<IInkAnalysisInkWord?>).castToImpl<IInkAnalysisInkWord,IInkAnalysisInkWord_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkAnalysisInkWord?> =
        arrayOfNulls<IInkAnalysisInkWord_Impl>(size) as Array<IInkAnalysisInkWord?>
  }
}
