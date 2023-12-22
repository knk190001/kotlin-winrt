package Windows.Media.Editing

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVector
import Windows.Foundation.TimeSpan
import Windows.Media.Effects.IAudioEffectDefinition
import Windows.Media.MediaProperties.AudioEncodingProperties
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundAudioTrack.ABI::class)
@Signature("{4b91b3bd-9e21-4266-a9c2-67dd011a2357}")
@Guid("4b91b3bd9e214266a9c267dd011a2357")
@WinRTInterface("4b91b3bd9e214266a9c267dd011a2357")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundAudioTrack.ByReference::class)
public interface IBackgroundAudioTrack : NativeMapped, IWinRTInterface {
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
  public fun put_Delay(value: TimeSpan?): Unit

  @InterfaceMethod(8)
  public fun get_Delay(): TimeSpan?

  @InterfaceMethod(9)
  public fun put_Volume(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_Volume(): Double

  @InterfaceMethod(11)
  public fun Clone(): BackgroundAudioTrack?

  @InterfaceMethod(12)
  public fun GetAudioEncodingProperties(): AudioEncodingProperties?

  @InterfaceMethod(13)
  public fun get_AudioEffectDefinitions(): IVector<IAudioEffectDefinition?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundAudioTrack> {
    public override fun getValue() = ABI.makeIBackgroundAudioTrack(pointer.getPointer(0))

    public fun setValue(value: IBackgroundAudioTrack_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundAudioTrack {
    public val __183579735_Ptr: Pointer?

    public val _183579735_VtblPtr: Pointer?
      get() = __183579735_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TrimTimeFromStart(): TimeSpan? {
      val fnPtr = _183579735_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TrimTimeFromStart(value: TimeSpan?): Unit {
      val fnPtr = _183579735_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TrimTimeFromEnd(): TimeSpan? {
      val fnPtr = _183579735_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TrimTimeFromEnd(value: TimeSpan?): Unit {
      val fnPtr = _183579735_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OriginalDuration(): TimeSpan? {
      val fnPtr = _183579735_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_TrimmedDuration(): TimeSpan? {
      val fnPtr = _183579735_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_UserData(): IMap<String?, String?>? {
      val fnPtr = _183579735_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Delay(value: TimeSpan?): Unit {
      val fnPtr = _183579735_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Delay(): TimeSpan? {
      val fnPtr = _183579735_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Volume(value: Double): Unit {
      val fnPtr = _183579735_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Volume(): Double {
      val fnPtr = _183579735_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun Clone(): BackgroundAudioTrack? {
      val fnPtr = _183579735_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundAudioTrack>()
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundAudioTrack>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetAudioEncodingProperties(): AudioEncodingProperties? {
      val fnPtr = _183579735_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_AudioEffectDefinitions(): IVector<IAudioEffectDefinition?>? {
      val fnPtr = _183579735_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IAudioEffectDefinition?>>()
      val hr = fn.invokeHR(arrayOf(__183579735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IAudioEffectDefinition?>>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundAudioTrack_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __183579735_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundAudioTrack, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b91b3bd9e214266a9c267dd011a2357")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundAudioTrack(ptr: Pointer?): WithDefault =
        IBackgroundAudioTrack_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundAudioTrack {
      val address = segment.toRawLongValue()
      return makeIBackgroundAudioTrack(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundAudioTrack): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__183579735_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundAudioTrack): Array<IBackgroundAudioTrack?> =
        (elements as
        Array<IBackgroundAudioTrack?>).castToImpl<IBackgroundAudioTrack,IBackgroundAudioTrack_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundAudioTrack?> =
        arrayOfNulls<IBackgroundAudioTrack_Impl>(size) as Array<IBackgroundAudioTrack?>
  }
}
