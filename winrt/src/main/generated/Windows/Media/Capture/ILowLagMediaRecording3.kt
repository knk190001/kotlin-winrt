package Windows.Media.Capture

import Windows.Foundation.IAsyncOperation
import Windows.Media.Devices.MediaCapturePauseBehavior
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

@ABIMarker(ILowLagMediaRecording3.ABI::class)
@Signature("{5c33ab12-48f7-47da-b41e-90880a5fe0ec}")
@Guid("5c33ab1248f747dab41e90880a5fe0ec")
@WinRTInterface("5c33ab1248f747dab41e90880a5fe0ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILowLagMediaRecording3.ByReference::class)
public interface ILowLagMediaRecording3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PauseWithResultAsync(behavior: MediaCapturePauseBehavior?):
      IAsyncOperation<MediaCapturePauseResult?>?

  @InterfaceMethod(1)
  public fun StopWithResultAsync(): IAsyncOperation<MediaCaptureStopResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILowLagMediaRecording3> {
    public override fun getValue() = ABI.makeILowLagMediaRecording3(pointer.getPointer(0))

    public fun setValue(value: ILowLagMediaRecording3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILowLagMediaRecording3 {
    public val __731831024_Ptr: Pointer?

    public val _731831024_VtblPtr: Pointer?
      get() = __731831024_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PauseWithResultAsync(behavior: MediaCapturePauseBehavior?):
        IAsyncOperation<MediaCapturePauseResult?>? {
      val fnPtr = _731831024_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaCapturePauseResult?>>()
      val hr = fn.invokeHR(arrayOf(__731831024_Ptr, marshalToNative(behavior), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MediaCapturePauseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StopWithResultAsync(): IAsyncOperation<MediaCaptureStopResult?>? {
      val fnPtr = _731831024_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaCaptureStopResult?>>()
      val hr = fn.invokeHR(arrayOf(__731831024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MediaCaptureStopResult?>>(result.getValue())
      return resultValue
    }
  }

  public class ILowLagMediaRecording3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __731831024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILowLagMediaRecording3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c33ab1248f747dab41e90880a5fe0ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILowLagMediaRecording3(ptr: Pointer?): WithDefault =
        ILowLagMediaRecording3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILowLagMediaRecording3 {
      val address = segment.toRawLongValue()
      return makeILowLagMediaRecording3(Pointer(address))
    }

    public override fun toNative(obj: ILowLagMediaRecording3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__731831024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILowLagMediaRecording3): Array<ILowLagMediaRecording3?> =
        (elements as
        Array<ILowLagMediaRecording3?>).castToImpl<ILowLagMediaRecording3,ILowLagMediaRecording3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILowLagMediaRecording3?> =
        arrayOfNulls<ILowLagMediaRecording3_Impl>(size) as Array<ILowLagMediaRecording3?>
  }
}
