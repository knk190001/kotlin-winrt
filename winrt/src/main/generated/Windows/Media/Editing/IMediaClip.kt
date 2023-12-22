package Windows.Media.Editing

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.TimeSpan
import Windows.Media.Effects.IAudioEffectDefinition
import Windows.Media.Effects.IVideoEffectDefinition
import Windows.Media.MediaProperties.VideoEncodingProperties
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaClip.ABI::class)
@Signature("{53f25366-5fba-3ea4-8693-24761811140a}")
@Guid("53f253665fba3ea4869324761811140a")
@WinRTInterface("53f253665fba3ea4869324761811140a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaClip.ByReference::class)
public interface IMediaClip : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TrimTimeFromStart(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_TrimTimeFromStart(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_TrimTimeFromEnd(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_TrimTimeFromEnd(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_OriginalDuration(): TimeSpan?

  @InterfaceMethod(5)
  public fun get_TrimmedDuration(): TimeSpan?

  @InterfaceMethod(6)
  public fun get_UserData(): IMap<String?, String?>?

  @InterfaceMethod(7)
  public fun Clone(): MediaClip?

  @InterfaceMethod(8)
  public fun get_StartTimeInComposition(): TimeSpan?

  @InterfaceMethod(9)
  public fun get_EndTimeInComposition(): TimeSpan?

  @InterfaceMethod(10)
  public fun get_EmbeddedAudioTracks(): IVectorView<EmbeddedAudioTrack?>?

  @InterfaceMethod(11)
  public fun get_SelectedEmbeddedAudioTrackIndex(): WinDef.UINT

  @InterfaceMethod(12)
  public fun put_SelectedEmbeddedAudioTrackIndex(value: WinDef.UINT): Unit

  @InterfaceMethod(13)
  public fun put_Volume(value: Double): Unit

  @InterfaceMethod(14)
  public fun get_Volume(): Double

  @InterfaceMethod(15)
  public fun GetVideoEncodingProperties(): VideoEncodingProperties?

  @InterfaceMethod(16)
  public fun get_AudioEffectDefinitions(): IVector<IAudioEffectDefinition?>?

  @InterfaceMethod(17)
  public fun get_VideoEffectDefinitions(): IVector<IVideoEffectDefinition?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaClip> {
    public override fun getValue() = ABI.makeIMediaClip(pointer.getPointer(0))

    public fun setValue(value: IMediaClip_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaClip {
    public val __588491698_Ptr: Pointer?

    public val _588491698_VtblPtr: Pointer?
      get() = __588491698_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TrimTimeFromStart(): TimeSpan? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TrimTimeFromStart(value: TimeSpan?): Unit {
      val fnPtr = _588491698_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TrimTimeFromEnd(): TimeSpan? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TrimTimeFromEnd(value: TimeSpan?): Unit {
      val fnPtr = _588491698_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OriginalDuration(): TimeSpan? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_TrimmedDuration(): TimeSpan? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_UserData(): IMap<String?, String?>? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun Clone(): MediaClip? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaClip>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaClip>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_StartTimeInComposition(): TimeSpan? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_EndTimeInComposition(): TimeSpan? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_EmbeddedAudioTracks(): IVectorView<EmbeddedAudioTrack?>? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<EmbeddedAudioTrack?>>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<EmbeddedAudioTrack?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_SelectedEmbeddedAudioTrackIndex(): WinDef.UINT {
      val fnPtr = _588491698_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_SelectedEmbeddedAudioTrackIndex(value: WinDef.UINT): Unit {
      val fnPtr = _588491698_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun put_Volume(value: Double): Unit {
      val fnPtr = _588491698_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Volume(): Double {
      val fnPtr = _588491698_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun GetVideoEncodingProperties(): VideoEncodingProperties? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_AudioEffectDefinitions(): IVector<IAudioEffectDefinition?>? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IAudioEffectDefinition?>>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IAudioEffectDefinition?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_VideoEffectDefinitions(): IVector<IVideoEffectDefinition?>? {
      val fnPtr = _588491698_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IVideoEffectDefinition?>>()
      val hr = fn.invokeHR(arrayOf(__588491698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IVideoEffectDefinition?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaClip_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __588491698_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaClip, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53f253665fba3ea4869324761811140a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaClip(ptr: Pointer?): WithDefault = IMediaClip_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaClip {
      val address = segment.toRawLongValue()
      return makeIMediaClip(Pointer(address))
    }

    public override fun toNative(obj: IMediaClip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__588491698_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaClip): Array<IMediaClip?> = (elements as
        Array<IMediaClip?>).castToImpl<IMediaClip,IMediaClip_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaClip?> = arrayOfNulls<IMediaClip_Impl>(size)
        as Array<IMediaClip?>
  }
}
