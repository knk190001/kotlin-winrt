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

@ABIMarker(IInkAnalysisLine.ABI::class)
@Signature("{a06d048d-2b8d-4754-ad5a-d0871193a956}")
@Guid("a06d048d2b8d4754ad5ad0871193a956")
@WinRTInterface("a06d048d2b8d4754ad5ad0871193a956")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkAnalysisLine.ByReference::class)
public interface IInkAnalysisLine : NativeMapped, IWinRTInterface, IInkAnalysisNode {
  @InterfaceMethod(0)
  public fun get_RecognizedText(): String?

  @InterfaceMethod(1)
  public fun get_IndentLevel(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkAnalysisLine> {
    public override fun getValue() = ABI.makeIInkAnalysisLine(pointer.getPointer(0))

    public fun setValue(value: IInkAnalysisLine_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkAnalysisLine, IInkAnalysisNode.WithDefault {
    public val __324048952_Ptr: Pointer?

    public val _324048952_VtblPtr: Pointer?
      get() = __324048952_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RecognizedText(): String? {
      val fnPtr = _324048952_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__324048952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IndentLevel(): Int {
      val fnPtr = _324048952_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__324048952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IInkAnalysisLine_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInkAnalysisNode {
    public override val __323983914_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_324048952_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __324048952_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkAnalysisLine, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a06d048d2b8d4754ad5ad0871193a956")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkAnalysisLine(ptr: Pointer?): WithDefault = IInkAnalysisLine_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkAnalysisLine {
      val address = segment.toRawLongValue()
      return makeIInkAnalysisLine(Pointer(address))
    }

    public override fun toNative(obj: IInkAnalysisLine): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__324048952_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkAnalysisLine): Array<IInkAnalysisLine?> = (elements as
        Array<IInkAnalysisLine?>).castToImpl<IInkAnalysisLine,IInkAnalysisLine_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkAnalysisLine?> =
        arrayOfNulls<IInkAnalysisLine_Impl>(size) as Array<IInkAnalysisLine?>
  }
}
