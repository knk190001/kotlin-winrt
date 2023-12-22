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

@ABIMarker(IInkAnalysisRoot.ABI::class)
@Signature("{3fb6a3c4-2fde-4061-8502-a90f32545b84}")
@Guid("3fb6a3c42fde40618502a90f32545b84")
@WinRTInterface("3fb6a3c42fde40618502a90f32545b84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkAnalysisRoot.ByReference::class)
public interface IInkAnalysisRoot : NativeMapped, IWinRTInterface, IInkAnalysisNode {
  @InterfaceMethod(0)
  public fun get_RecognizedText(): String?

  @InterfaceMethod(1)
  public fun FindNodes(nodeKind: InkAnalysisNodeKind?): IVectorView<IInkAnalysisNode?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkAnalysisRoot> {
    public override fun getValue() = ABI.makeIInkAnalysisRoot(pointer.getPointer(0))

    public fun setValue(value: IInkAnalysisRoot_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkAnalysisRoot, IInkAnalysisNode.WithDefault {
    public val __323864394_Ptr: Pointer?

    public val _323864394_VtblPtr: Pointer?
      get() = __323864394_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RecognizedText(): String? {
      val fnPtr = _323864394_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__323864394_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindNodes(nodeKind: InkAnalysisNodeKind?): IVectorView<IInkAnalysisNode?>? {
      val fnPtr = _323864394_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IInkAnalysisNode?>>()
      val hr = fn.invokeHR(arrayOf(__323864394_Ptr, marshalToNative(nodeKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IInkAnalysisNode?>>(result.getValue())
      return resultValue
    }
  }

  public class IInkAnalysisRoot_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInkAnalysisNode {
    public override val __323983914_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_323864394_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __323864394_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkAnalysisRoot, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fb6a3c42fde40618502a90f32545b84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkAnalysisRoot(ptr: Pointer?): WithDefault = IInkAnalysisRoot_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkAnalysisRoot {
      val address = segment.toRawLongValue()
      return makeIInkAnalysisRoot(Pointer(address))
    }

    public override fun toNative(obj: IInkAnalysisRoot): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__323864394_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkAnalysisRoot): Array<IInkAnalysisRoot?> = (elements as
        Array<IInkAnalysisRoot?>).castToImpl<IInkAnalysisRoot,IInkAnalysisRoot_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkAnalysisRoot?> =
        arrayOfNulls<IInkAnalysisRoot_Impl>(size) as Array<IInkAnalysisRoot?>
  }
}
