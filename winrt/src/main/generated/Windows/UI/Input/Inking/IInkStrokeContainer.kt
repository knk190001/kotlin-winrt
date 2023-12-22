package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncActionWithProgress
import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
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

@ABIMarker(IInkStrokeContainer.ABI::class)
@Signature("{22accbc6-faa9-4f14-b68c-f6cee670ae16}")
@Guid("22accbc6faa94f14b68cf6cee670ae16")
@WinRTInterface("22accbc6faa94f14b68cf6cee670ae16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStrokeContainer.ByReference::class)
public interface IInkStrokeContainer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BoundingRect(): Rect?

  @InterfaceMethod(1)
  public fun AddStroke(stroke: InkStroke?): Unit

  @InterfaceMethod(2)
  public fun DeleteSelected(): Rect?

  @InterfaceMethod(3)
  public fun MoveSelected(translation: Point?): Rect?

  @InterfaceMethod(4)
  public fun SelectWithPolyLine(polyline: IIterable<Point?>?): Rect?

  @InterfaceMethod(5)
  public fun SelectWithLine(from: Point?, to: Point?): Rect?

  @InterfaceMethod(6)
  public fun CopySelectedToClipboard(): Unit

  @InterfaceMethod(7)
  public fun PasteFromClipboard(position: Point?): Rect?

  @InterfaceMethod(8)
  public fun CanPasteFromClipboard(): Boolean

  @InterfaceMethod(9)
  public fun LoadAsync(inputStream: IInputStream?): IAsyncActionWithProgress<WinDef.ULONG>?

  @InterfaceMethod(10)
  public fun SaveAsync(outputStream: IOutputStream?): IAsyncOperationWithProgress<WinDef.UINT,
      WinDef.UINT>?

  @InterfaceMethod(11)
  public fun UpdateRecognitionResults(recognitionResults: IVectorView<InkRecognitionResult?>?): Unit

  @InterfaceMethod(12)
  public fun GetStrokes(): IVectorView<InkStroke?>?

  @InterfaceMethod(13)
  public fun GetRecognitionResults(): IVectorView<InkRecognitionResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkStrokeContainer> {
    public override fun getValue() = ABI.makeIInkStrokeContainer(pointer.getPointer(0))

    public fun setValue(value: IInkStrokeContainer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStrokeContainer {
    public val __241300611_Ptr: Pointer?

    public val _241300611_VtblPtr: Pointer?
      get() = __241300611_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BoundingRect(): Rect? {
      val fnPtr = _241300611_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddStroke(stroke: InkStroke?): Unit {
      val fnPtr = _241300611_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr, marshalToNative(stroke),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun DeleteSelected(): Rect? {
      val fnPtr = _241300611_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun MoveSelected(translation: Point?): Rect? {
      val fnPtr = _241300611_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr, marshalToNative(translation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SelectWithPolyLine(polyline: IIterable<Point?>?): Rect? {
      val fnPtr = _241300611_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr, marshalToNative(polyline), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SelectWithLine(from: Point?, to: Point?): Rect? {
      val fnPtr = _241300611_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr, marshalToNative(from), marshalToNative(to),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CopySelectedToClipboard(): Unit {
      val fnPtr = _241300611_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun PasteFromClipboard(position: Point?): Rect? {
      val fnPtr = _241300611_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr, marshalToNative(position), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CanPasteFromClipboard(): Boolean {
      val fnPtr = _241300611_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun LoadAsync(inputStream: IInputStream?):
        IAsyncActionWithProgress<WinDef.ULONG>? {
      val fnPtr = _241300611_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncActionWithProgress<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr, marshalToNative(inputStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncActionWithProgress<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun SaveAsync(outputStream: IOutputStream?):
        IAsyncOperationWithProgress<WinDef.UINT, WinDef.UINT>? {
      val fnPtr = _241300611_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<WinDef.UINT, WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr, marshalToNative(outputStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<WinDef.UINT,
          WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override
        fun UpdateRecognitionResults(recognitionResults: IVectorView<InkRecognitionResult?>?):
        Unit {
      val fnPtr = _241300611_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr, marshalToNative(recognitionResults),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun GetStrokes(): IVectorView<InkStroke?>? {
      val fnPtr = _241300611_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<InkStroke?>>()
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<InkStroke?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetRecognitionResults(): IVectorView<InkRecognitionResult?>? {
      val fnPtr = _241300611_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<InkRecognitionResult?>>()
      val hr = fn.invokeHR(arrayOf(__241300611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<InkRecognitionResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IInkStrokeContainer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __241300611_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStrokeContainer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22accbc6faa94f14b68cf6cee670ae16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStrokeContainer(ptr: Pointer?): WithDefault = IInkStrokeContainer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStrokeContainer {
      val address = segment.toRawLongValue()
      return makeIInkStrokeContainer(Pointer(address))
    }

    public override fun toNative(obj: IInkStrokeContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__241300611_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStrokeContainer): Array<IInkStrokeContainer?> =
        (elements as
        Array<IInkStrokeContainer?>).castToImpl<IInkStrokeContainer,IInkStrokeContainer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStrokeContainer?> =
        arrayOfNulls<IInkStrokeContainer_Impl>(size) as Array<IInkStrokeContainer?>
  }
}
