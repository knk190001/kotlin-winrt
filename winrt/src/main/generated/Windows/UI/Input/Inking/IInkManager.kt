package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Rect
import Windows.UI.Input.Inking.IInkStrokeContainer.ABI.IID
import Windows.UI.Input.PointerPoint
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IInkManager.ABI::class)
@Signature("{4744737d-671b-4163-9c95-4e8d7a035fe1}")
@Guid("4744737d671b41639c954e8d7a035fe1")
@WinRTInterface("4744737d671b41639c954e8d7a035fe1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkManager.ByReference::class)
public interface IInkManager : NativeMapped, IWinRTInterface, IInkStrokeContainer,
    IInkRecognizerContainer {
  @InterfaceMethod(0)
  public fun get_Mode(): InkManipulationMode?

  @InterfaceMethod(1)
  public fun put_Mode(value: InkManipulationMode?): Unit

  @InterfaceMethod(2)
  public fun ProcessPointerDown(pointerPoint: PointerPoint?): Unit

  @InterfaceMethod(3)
  public fun ProcessPointerUpdate(pointerPoint: PointerPoint?): IUnknown?

  @InterfaceMethod(4)
  public fun ProcessPointerUp(pointerPoint: PointerPoint?): Rect?

  @InterfaceMethod(5)
  public fun SetDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes?): Unit

  @InterfaceMethod(6)
  public fun RecognizeAsync(recognitionTarget: InkRecognitionTarget?):
      IAsyncOperation<IVectorView<InkRecognitionResult?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkManager> {
    public override fun getValue() = ABI.makeIInkManager(pointer.getPointer(0))

    public fun setValue(value: IInkManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkManager, IInkStrokeContainer.WithDefault,
      IInkRecognizerContainer.WithDefault {
    public val __80296449_Ptr: Pointer?

    public val _80296449_VtblPtr: Pointer?
      get() = __80296449_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): InkManipulationMode? {
      val fnPtr = _80296449_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkManipulationMode>()
      val hr = fn.invokeHR(arrayOf(__80296449_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkManipulationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mode(value: InkManipulationMode?): Unit {
      val fnPtr = _80296449_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__80296449_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ProcessPointerDown(pointerPoint: PointerPoint?): Unit {
      val fnPtr = _80296449_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__80296449_Ptr, marshalToNative(pointerPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun ProcessPointerUpdate(pointerPoint: PointerPoint?): IUnknown? {
      val fnPtr = _80296449_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__80296449_Ptr, marshalToNative(pointerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ProcessPointerUp(pointerPoint: PointerPoint?): Rect? {
      val fnPtr = _80296449_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__80296449_Ptr, marshalToNative(pointerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes?):
        Unit {
      val fnPtr = _80296449_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__80296449_Ptr, marshalToNative(drawingAttributes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun RecognizeAsync(recognitionTarget: InkRecognitionTarget?):
        IAsyncOperation<IVectorView<InkRecognitionResult?>?>? {
      val fnPtr = _80296449_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<InkRecognitionResult?>?>>()
      val hr = fn.invokeHR(arrayOf(__80296449_Ptr, marshalToNative(recognitionTarget), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<InkRecognitionResult?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IInkManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInkStrokeContainer,
      IInkRecognizerContainer {
    public override val __241300611_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_80296449_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __783661167_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IInkRecognizerContainer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_80296449_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __80296449_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4744737d671b41639c954e8d7a035fe1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkManager(ptr: Pointer?): WithDefault = IInkManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkManager {
      val address = segment.toRawLongValue()
      return makeIInkManager(Pointer(address))
    }

    public override fun toNative(obj: IInkManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__80296449_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkManager): Array<IInkManager?> = (elements as
        Array<IInkManager?>).castToImpl<IInkManager,IInkManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkManager?> =
        arrayOfNulls<IInkManager_Impl>(size) as Array<IInkManager?>
  }
}
