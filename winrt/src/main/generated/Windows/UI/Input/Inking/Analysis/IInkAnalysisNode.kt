package Windows.UI.Input.Inking.Analysis

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Point
import Windows.Foundation.Rect
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkAnalysisNode.ABI::class)
@Signature("{30831f05-5f64-4a2c-ba37-4f4887879574}")
@Guid("30831f055f644a2cba374f4887879574")
@WinRTInterface("30831f055f644a2cba374f4887879574")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkAnalysisNode.ByReference::class)
public interface IInkAnalysisNode : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Kind(): InkAnalysisNodeKind?

  @InterfaceMethod(2)
  public fun get_BoundingRect(): Rect?

  @InterfaceMethod(3)
  public fun get_RotatedBoundingRect(): IVectorView<Point?>?

  @InterfaceMethod(4)
  public fun get_Children(): IVectorView<IInkAnalysisNode?>?

  @InterfaceMethod(5)
  public fun get_Parent(): IInkAnalysisNode?

  @InterfaceMethod(6)
  public fun GetStrokeIds(): IVectorView<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkAnalysisNode> {
    public override fun getValue() = ABI.makeIInkAnalysisNode(pointer.getPointer(0))

    public fun setValue(value: IInkAnalysisNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkAnalysisNode {
    public val __323983914_Ptr: Pointer?

    public val _323983914_VtblPtr: Pointer?
      get() = __323983914_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _323983914_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__323983914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): InkAnalysisNodeKind? {
      val fnPtr = _323983914_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkAnalysisNodeKind>()
      val hr = fn.invokeHR(arrayOf(__323983914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkAnalysisNodeKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BoundingRect(): Rect? {
      val fnPtr = _323983914_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__323983914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RotatedBoundingRect(): IVectorView<Point?>? {
      val fnPtr = _323983914_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Point?>>()
      val hr = fn.invokeHR(arrayOf(__323983914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Point?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Children(): IVectorView<IInkAnalysisNode?>? {
      val fnPtr = _323983914_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IInkAnalysisNode?>>()
      val hr = fn.invokeHR(arrayOf(__323983914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IInkAnalysisNode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Parent(): IInkAnalysisNode? {
      val fnPtr = _323983914_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInkAnalysisNode>()
      val hr = fn.invokeHR(arrayOf(__323983914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInkAnalysisNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetStrokeIds(): IVectorView<WinDef.UINT>? {
      val fnPtr = _323983914_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__323983914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IInkAnalysisNode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __323983914_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkAnalysisNode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30831f055f644a2cba374f4887879574")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkAnalysisNode(ptr: Pointer?): WithDefault = IInkAnalysisNode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkAnalysisNode {
      val address = segment.toRawLongValue()
      return makeIInkAnalysisNode(Pointer(address))
    }

    public override fun toNative(obj: IInkAnalysisNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__323983914_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkAnalysisNode): Array<IInkAnalysisNode?> = (elements as
        Array<IInkAnalysisNode?>).castToImpl<IInkAnalysisNode,IInkAnalysisNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkAnalysisNode?> =
        arrayOfNulls<IInkAnalysisNode_Impl>(size) as Array<IInkAnalysisNode?>
  }
}
