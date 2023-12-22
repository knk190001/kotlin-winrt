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

@ABIMarker(IMediaCapturePauseResult.ABI::class)
@Signature("{aec47ca3-4477-4b04-a06f-2c1c5182fe9d}")
@Guid("aec47ca344774b04a06f2c1c5182fe9d")
@WinRTInterface("aec47ca344774b04a06f2c1c5182fe9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCapturePauseResult.ByReference::class)
public interface IMediaCapturePauseResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LastFrame(): VideoFrame?

  @InterfaceMethod(1)
  public fun get_RecordDuration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCapturePauseResult> {
    public override fun getValue() = ABI.makeIMediaCapturePauseResult(pointer.getPointer(0))

    public fun setValue(value: IMediaCapturePauseResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCapturePauseResult {
    public val __1576601273_Ptr: Pointer?

    public val _1576601273_VtblPtr: Pointer?
      get() = __1576601273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LastFrame(): VideoFrame? {
      val fnPtr = _1576601273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__1576601273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RecordDuration(): TimeSpan? {
      val fnPtr = _1576601273_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1576601273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCapturePauseResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1576601273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCapturePauseResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aec47ca344774b04a06f2c1c5182fe9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCapturePauseResult(ptr: Pointer?): WithDefault =
        IMediaCapturePauseResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCapturePauseResult {
      val address = segment.toRawLongValue()
      return makeIMediaCapturePauseResult(Pointer(address))
    }

    public override fun toNative(obj: IMediaCapturePauseResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1576601273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCapturePauseResult):
        Array<IMediaCapturePauseResult?> = (elements as
        Array<IMediaCapturePauseResult?>).castToImpl<IMediaCapturePauseResult,IMediaCapturePauseResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCapturePauseResult?> =
        arrayOfNulls<IMediaCapturePauseResult_Impl>(size) as Array<IMediaCapturePauseResult?>
  }
}
