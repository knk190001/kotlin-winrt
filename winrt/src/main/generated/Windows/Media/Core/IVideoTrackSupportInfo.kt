package Windows.Media.Core

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

@ABIMarker(IVideoTrackSupportInfo.ABI::class)
@Signature("{4bb534a0-fc5f-450d-8ff0-778d590486de}")
@Guid("4bb534a0fc5f450d8ff0778d590486de")
@WinRTInterface("4bb534a0fc5f450d8ff0778d590486de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoTrackSupportInfo.ByReference::class)
public interface IVideoTrackSupportInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DecoderStatus(): MediaDecoderStatus?

  @InterfaceMethod(1)
  public fun get_MediaSourceStatus(): MediaSourceStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoTrackSupportInfo> {
    public override fun getValue() = ABI.makeIVideoTrackSupportInfo(pointer.getPointer(0))

    public fun setValue(value: IVideoTrackSupportInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoTrackSupportInfo {
    public val __1837328968_Ptr: Pointer?

    public val _1837328968_VtblPtr: Pointer?
      get() = __1837328968_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DecoderStatus(): MediaDecoderStatus? {
      val fnPtr = _1837328968_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDecoderStatus>()
      val hr = fn.invokeHR(arrayOf(__1837328968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDecoderStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MediaSourceStatus(): MediaSourceStatus? {
      val fnPtr = _1837328968_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSourceStatus>()
      val hr = fn.invokeHR(arrayOf(__1837328968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSourceStatus>(result.getValue())
      return resultValue
    }
  }

  public class IVideoTrackSupportInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1837328968_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoTrackSupportInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4bb534a0fc5f450d8ff0778d590486de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoTrackSupportInfo(ptr: Pointer?): WithDefault =
        IVideoTrackSupportInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoTrackSupportInfo {
      val address = segment.toRawLongValue()
      return makeIVideoTrackSupportInfo(Pointer(address))
    }

    public override fun toNative(obj: IVideoTrackSupportInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1837328968_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoTrackSupportInfo): Array<IVideoTrackSupportInfo?> =
        (elements as
        Array<IVideoTrackSupportInfo?>).castToImpl<IVideoTrackSupportInfo,IVideoTrackSupportInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoTrackSupportInfo?> =
        arrayOfNulls<IVideoTrackSupportInfo_Impl>(size) as Array<IVideoTrackSupportInfo?>
  }
}
