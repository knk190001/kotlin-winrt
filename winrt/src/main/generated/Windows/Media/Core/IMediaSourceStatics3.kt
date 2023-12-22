package Windows.Media.Core

import Windows.Media.Capture.Frames.MediaFrameSource
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

@ABIMarker(IMediaSourceStatics3.ABI::class)
@Signature("{453a30d6-2bea-4122-9f73-eace04526e35}")
@Guid("453a30d62bea41229f73eace04526e35")
@WinRTInterface("453a30d62bea41229f73eace04526e35")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSourceStatics3.ByReference::class)
public interface IMediaSourceStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromMediaFrameSource(frameSource: MediaFrameSource?): MediaSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaSourceStatics3> {
    public override fun getValue() = ABI.makeIMediaSourceStatics3(pointer.getPointer(0))

    public fun setValue(value: IMediaSourceStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSourceStatics3 {
    public val __106552920_Ptr: Pointer?

    public val _106552920_VtblPtr: Pointer?
      get() = __106552920_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromMediaFrameSource(frameSource: MediaFrameSource?): MediaSource? {
      val fnPtr = _106552920_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__106552920_Ptr, marshalToNative(frameSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }
  }

  public class IMediaSourceStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __106552920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSourceStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("453a30d62bea41229f73eace04526e35")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSourceStatics3(ptr: Pointer?): WithDefault = IMediaSourceStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaSourceStatics3 {
      val address = segment.toRawLongValue()
      return makeIMediaSourceStatics3(Pointer(address))
    }

    public override fun toNative(obj: IMediaSourceStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__106552920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSourceStatics3): Array<IMediaSourceStatics3?> =
        (elements as
        Array<IMediaSourceStatics3?>).castToImpl<IMediaSourceStatics3,IMediaSourceStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSourceStatics3?> =
        arrayOfNulls<IMediaSourceStatics3_Impl>(size) as Array<IMediaSourceStatics3?>
  }
}
