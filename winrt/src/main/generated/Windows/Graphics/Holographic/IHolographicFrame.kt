package Windows.Graphics.Holographic

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.TimeSpan
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

@ABIMarker(IHolographicFrame.ABI::class)
@Signature("{c6988eb6-a8b9-3054-a6eb-d624b6536375}")
@Guid("c6988eb6a8b93054a6ebd624b6536375")
@WinRTInterface("c6988eb6a8b93054a6ebd624b6536375")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicFrame.ByReference::class)
public interface IHolographicFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AddedCameras(): IVectorView<HolographicCamera?>?

  @InterfaceMethod(1)
  public fun get_RemovedCameras(): IVectorView<HolographicCamera?>?

  @InterfaceMethod(2)
  public fun GetRenderingParameters(cameraPose: HolographicCameraPose?):
      HolographicCameraRenderingParameters?

  @InterfaceMethod(3)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_CurrentPrediction(): HolographicFramePrediction?

  @InterfaceMethod(5)
  public fun UpdateCurrentPrediction(): Unit

  @InterfaceMethod(6)
  public fun PresentUsingCurrentPrediction(): HolographicFramePresentResult?

  @InterfaceMethod(7)
  public fun PresentUsingCurrentPrediction(waitBehavior: HolographicFramePresentWaitBehavior?):
      HolographicFramePresentResult?

  @InterfaceMethod(8)
  public fun WaitForFrameToFinish(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicFrame> {
    public override fun getValue() = ABI.makeIHolographicFrame(pointer.getPointer(0))

    public fun setValue(value: IHolographicFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicFrame {
    public val __1927308722_Ptr: Pointer?

    public val _1927308722_VtblPtr: Pointer?
      get() = __1927308722_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AddedCameras(): IVectorView<HolographicCamera?>? {
      val fnPtr = _1927308722_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HolographicCamera?>>()
      val hr = fn.invokeHR(arrayOf(__1927308722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HolographicCamera?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RemovedCameras(): IVectorView<HolographicCamera?>? {
      val fnPtr = _1927308722_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HolographicCamera?>>()
      val hr = fn.invokeHR(arrayOf(__1927308722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HolographicCamera?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetRenderingParameters(cameraPose: HolographicCameraPose?):
        HolographicCameraRenderingParameters? {
      val fnPtr = _1927308722_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicCameraRenderingParameters>()
      val hr = fn.invokeHR(arrayOf(__1927308722_Ptr, marshalToNative(cameraPose), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicCameraRenderingParameters>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _1927308722_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1927308722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CurrentPrediction(): HolographicFramePrediction? {
      val fnPtr = _1927308722_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicFramePrediction>()
      val hr = fn.invokeHR(arrayOf(__1927308722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicFramePrediction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun UpdateCurrentPrediction(): Unit {
      val fnPtr = _1927308722_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1927308722_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun PresentUsingCurrentPrediction(): HolographicFramePresentResult? {
      val fnPtr = _1927308722_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicFramePresentResult>()
      val hr = fn.invokeHR(arrayOf(__1927308722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicFramePresentResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override
        fun PresentUsingCurrentPrediction(waitBehavior: HolographicFramePresentWaitBehavior?):
        HolographicFramePresentResult? {
      val fnPtr = _1927308722_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicFramePresentResult>()
      val hr = fn.invokeHR(arrayOf(__1927308722_Ptr, marshalToNative(waitBehavior), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicFramePresentResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun WaitForFrameToFinish(): Unit {
      val fnPtr = _1927308722_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1927308722_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1927308722_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6988eb6a8b93054a6ebd624b6536375")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicFrame(ptr: Pointer?): WithDefault = IHolographicFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicFrame {
      val address = segment.toRawLongValue()
      return makeIHolographicFrame(Pointer(address))
    }

    public override fun toNative(obj: IHolographicFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1927308722_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicFrame): Array<IHolographicFrame?> = (elements
        as Array<IHolographicFrame?>).castToImpl<IHolographicFrame,IHolographicFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicFrame?> =
        arrayOfNulls<IHolographicFrame_Impl>(size) as Array<IHolographicFrame?>
  }
}
