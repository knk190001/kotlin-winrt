package Windows.UI.Input.Inking.Analysis

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Point
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkAnalysisInkDrawing.ABI::class)
@Signature("{6a85ed1f-1fe4-4e15-898c-8e112377e021}")
@Guid("6a85ed1f1fe44e15898c8e112377e021")
@WinRTInterface("6a85ed1f1fe44e15898c8e112377e021")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkAnalysisInkDrawing.ByReference::class)
public interface IInkAnalysisInkDrawing : NativeMapped, IWinRTInterface, IInkAnalysisNode {
  @InterfaceMethod(0)
  public fun get_DrawingKind(): InkAnalysisDrawingKind?

  @InterfaceMethod(1)
  public fun get_Center(): Point?

  @InterfaceMethod(2)
  public fun get_Points(): IVectorView<Point?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkAnalysisInkDrawing> {
    public override fun getValue() = ABI.makeIInkAnalysisInkDrawing(pointer.getPointer(0))

    public fun setValue(value: IInkAnalysisInkDrawing_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkAnalysisInkDrawing, IInkAnalysisNode.WithDefault {
    public val __711208492_Ptr: Pointer?

    public val _711208492_VtblPtr: Pointer?
      get() = __711208492_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DrawingKind(): InkAnalysisDrawingKind? {
      val fnPtr = _711208492_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkAnalysisDrawingKind>()
      val hr = fn.invokeHR(arrayOf(__711208492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkAnalysisDrawingKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Center(): Point? {
      val fnPtr = _711208492_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__711208492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Points(): IVectorView<Point?>? {
      val fnPtr = _711208492_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Point?>>()
      val hr = fn.invokeHR(arrayOf(__711208492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Point?>>(result.getValue())
      return resultValue
    }
  }

  public class IInkAnalysisInkDrawing_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInkAnalysisNode {
    public override val __323983914_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_711208492_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __711208492_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkAnalysisInkDrawing, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a85ed1f1fe44e15898c8e112377e021")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkAnalysisInkDrawing(ptr: Pointer?): WithDefault =
        IInkAnalysisInkDrawing_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkAnalysisInkDrawing {
      val address = segment.toRawLongValue()
      return makeIInkAnalysisInkDrawing(Pointer(address))
    }

    public override fun toNative(obj: IInkAnalysisInkDrawing): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__711208492_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkAnalysisInkDrawing): Array<IInkAnalysisInkDrawing?> =
        (elements as
        Array<IInkAnalysisInkDrawing?>).castToImpl<IInkAnalysisInkDrawing,IInkAnalysisInkDrawing_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkAnalysisInkDrawing?> =
        arrayOfNulls<IInkAnalysisInkDrawing_Impl>(size) as Array<IInkAnalysisInkDrawing?>
  }
}
