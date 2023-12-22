package Windows.Media.Capture

import Windows.Foundation.TimeSpan
import Windows.Media.VideoFrame
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

@ABIMarker(IMediaCaptureStopResult.ABI::class)
@Signature("{f9db6a2a-a092-4ad1-97d4-f201f9d082db}")
@Guid("f9db6a2aa0924ad197d4f201f9d082db")
@WinRTInterface("f9db6a2aa0924ad197d4f201f9d082db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureStopResult.ByReference::class)
public interface IMediaCaptureStopResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LastFrame(): VideoFrame?

  @InterfaceMethod(1)
  public fun get_RecordDuration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureStopResult> {
    public override fun getValue() = ABI.makeIMediaCaptureStopResult(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureStopResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureStopResult {
    public val __34112263_Ptr: Pointer?

    public val _34112263_VtblPtr: Pointer?
      get() = __34112263_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LastFrame(): VideoFrame? {
      val fnPtr = _34112263_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__34112263_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RecordDuration(): TimeSpan? {
      val fnPtr = _34112263_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__34112263_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureStopResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __34112263_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureStopResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f9db6a2aa0924ad197d4f201f9d082db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureStopResult(ptr: Pointer?): WithDefault =
        IMediaCaptureStopResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureStopResult {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureStopResult(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureStopResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__34112263_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureStopResult): Array<IMediaCaptureStopResult?>
        = (elements as
        Array<IMediaCaptureStopResult?>).castToImpl<IMediaCaptureStopResult,IMediaCaptureStopResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureStopResult?> =
        arrayOfNulls<IMediaCaptureStopResult_Impl>(size) as Array<IMediaCaptureStopResult?>
  }
}
