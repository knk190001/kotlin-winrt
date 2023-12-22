package Windows.Media.Playback

import Windows.Media.SystemMediaTransportControls
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

@ABIMarker(IMediaPlayer2.ABI::class)
@Signature("{3c841218-2123-4fc5-9082-2f883f77bdf5}")
@Guid("3c84121821234fc590822f883f77bdf5")
@WinRTInterface("3c84121821234fc590822f883f77bdf5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayer2.ByReference::class)
public interface IMediaPlayer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SystemMediaTransportControls(): SystemMediaTransportControls?

  @InterfaceMethod(1)
  public fun get_AudioCategory(): MediaPlayerAudioCategory?

  @InterfaceMethod(2)
  public fun put_AudioCategory(value: MediaPlayerAudioCategory?): Unit

  @InterfaceMethod(3)
  public fun get_AudioDeviceType(): MediaPlayerAudioDeviceType?

  @InterfaceMethod(4)
  public fun put_AudioDeviceType(value: MediaPlayerAudioDeviceType?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaPlayer2>
      {
    public override fun getValue() = ABI.makeIMediaPlayer2(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayer2 {
    public val __1314081338_Ptr: Pointer?

    public val _1314081338_VtblPtr: Pointer?
      get() = __1314081338_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SystemMediaTransportControls(): SystemMediaTransportControls? {
      val fnPtr = _1314081338_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemMediaTransportControls>()
      val hr = fn.invokeHR(arrayOf(__1314081338_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemMediaTransportControls>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AudioCategory(): MediaPlayerAudioCategory? {
      val fnPtr = _1314081338_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayerAudioCategory>()
      val hr = fn.invokeHR(arrayOf(__1314081338_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayerAudioCategory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_AudioCategory(value: MediaPlayerAudioCategory?): Unit {
      val fnPtr = _1314081338_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081338_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AudioDeviceType(): MediaPlayerAudioDeviceType? {
      val fnPtr = _1314081338_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayerAudioDeviceType>()
      val hr = fn.invokeHR(arrayOf(__1314081338_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayerAudioDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_AudioDeviceType(value: MediaPlayerAudioDeviceType?): Unit {
      val fnPtr = _1314081338_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081338_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlayer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314081338_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c84121821234fc590822f883f77bdf5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayer2(ptr: Pointer?): WithDefault = IMediaPlayer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayer2 {
      val address = segment.toRawLongValue()
      return makeIMediaPlayer2(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314081338_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayer2): Array<IMediaPlayer2?> = (elements as
        Array<IMediaPlayer2?>).castToImpl<IMediaPlayer2,IMediaPlayer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayer2?> =
        arrayOfNulls<IMediaPlayer2_Impl>(size) as Array<IMediaPlayer2?>
  }
}
