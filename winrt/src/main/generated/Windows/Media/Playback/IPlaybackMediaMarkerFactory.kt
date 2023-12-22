package Windows.Media.Playback

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlaybackMediaMarkerFactory.ABI::class)
@Signature("{8c530a78-e0ae-4e1a-a8c8-e23f982a937b}")
@Guid("8c530a78e0ae4e1aa8c8e23f982a937b")
@WinRTInterface("8c530a78e0ae4e1aa8c8e23f982a937b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaybackMediaMarkerFactory.ByReference::class)
public interface IPlaybackMediaMarkerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromTime(value: TimeSpan?): PlaybackMediaMarker?

  @InterfaceMethod(1)
  public fun Create(
    value: TimeSpan?,
    mediaMarketType: String?,
    text: String?
  ): PlaybackMediaMarker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaybackMediaMarkerFactory> {
    public override fun getValue() = ABI.makeIPlaybackMediaMarkerFactory(pointer.getPointer(0))

    public fun setValue(value: IPlaybackMediaMarkerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaybackMediaMarkerFactory {
    public val __1088731264_Ptr: Pointer?

    public val _1088731264_VtblPtr: Pointer?
      get() = __1088731264_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromTime(value: TimeSpan?): PlaybackMediaMarker? {
      val fnPtr = _1088731264_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaybackMediaMarker>()
      val hr = fn.invokeHR(arrayOf(__1088731264_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaybackMediaMarker>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(
      value: TimeSpan?,
      mediaMarketType: String?,
      text: String?
    ): PlaybackMediaMarker? {
      val fnPtr = _1088731264_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaybackMediaMarker>()
      val hr = fn.invokeHR(arrayOf(__1088731264_Ptr, marshalToNative(value),
          marshalToNative(mediaMarketType), marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaybackMediaMarker>(result.getValue())
      return resultValue
    }
  }

  public class IPlaybackMediaMarkerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1088731264_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaybackMediaMarkerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c530a78e0ae4e1aa8c8e23f982a937b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaybackMediaMarkerFactory(ptr: Pointer?): WithDefault =
        IPlaybackMediaMarkerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaybackMediaMarkerFactory {
      val address = segment.toRawLongValue()
      return makeIPlaybackMediaMarkerFactory(Pointer(address))
    }

    public override fun toNative(obj: IPlaybackMediaMarkerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1088731264_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaybackMediaMarkerFactory):
        Array<IPlaybackMediaMarkerFactory?> = (elements as
        Array<IPlaybackMediaMarkerFactory?>).castToImpl<IPlaybackMediaMarkerFactory,IPlaybackMediaMarkerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaybackMediaMarkerFactory?> =
        arrayOfNulls<IPlaybackMediaMarkerFactory_Impl>(size) as Array<IPlaybackMediaMarkerFactory?>
  }
}
