package Windows.Media.Playback

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundMediaPlayerStatics.ABI::class)
@Signature("{856ddbc1-55f7-471f-a0f2-68ac4c904592}")
@Guid("856ddbc155f7471fa0f268ac4c904592")
@WinRTInterface("856ddbc155f7471fa0f268ac4c904592")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundMediaPlayerStatics.ByReference::class)
public interface IBackgroundMediaPlayerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): MediaPlayer?

  @InterfaceMethod(1)
  public
      fun add_MessageReceivedFromBackground(value: EventHandler<MediaPlayerDataReceivedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_MessageReceivedFromBackground(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public
      fun add_MessageReceivedFromForeground(value: EventHandler<MediaPlayerDataReceivedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_MessageReceivedFromForeground(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun SendMessageToBackground(value: ValueSet?): Unit

  @InterfaceMethod(6)
  public fun SendMessageToForeground(value: ValueSet?): Unit

  @InterfaceMethod(7)
  public fun IsMediaPlaying(): Boolean

  @InterfaceMethod(8)
  public fun Shutdown(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundMediaPlayerStatics> {
    public override fun getValue() = ABI.makeIBackgroundMediaPlayerStatics(pointer.getPointer(0))

    public fun setValue(value: IBackgroundMediaPlayerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundMediaPlayerStatics {
    public val __1111631047_Ptr: Pointer?

    public val _1111631047_VtblPtr: Pointer?
      get() = __1111631047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): MediaPlayer? {
      val fnPtr = _1111631047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayer>()
      val hr = fn.invokeHR(arrayOf(__1111631047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun add_MessageReceivedFromBackground(value: EventHandler<MediaPlayerDataReceivedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1111631047_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1111631047_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_MessageReceivedFromBackground(token: EventRegistrationToken?): Unit {
      val fnPtr = _1111631047_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1111631047_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override
        fun add_MessageReceivedFromForeground(value: EventHandler<MediaPlayerDataReceivedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1111631047_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1111631047_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_MessageReceivedFromForeground(token: EventRegistrationToken?): Unit {
      val fnPtr = _1111631047_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1111631047_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SendMessageToBackground(value: ValueSet?): Unit {
      val fnPtr = _1111631047_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1111631047_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SendMessageToForeground(value: ValueSet?): Unit {
      val fnPtr = _1111631047_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1111631047_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun IsMediaPlaying(): Boolean {
      val fnPtr = _1111631047_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1111631047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun Shutdown(): Unit {
      val fnPtr = _1111631047_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1111631047_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundMediaPlayerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1111631047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundMediaPlayerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("856ddbc155f7471fa0f268ac4c904592")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundMediaPlayerStatics(ptr: Pointer?): WithDefault =
        IBackgroundMediaPlayerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundMediaPlayerStatics {
      val address = segment.toRawLongValue()
      return makeIBackgroundMediaPlayerStatics(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundMediaPlayerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1111631047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundMediaPlayerStatics):
        Array<IBackgroundMediaPlayerStatics?> = (elements as
        Array<IBackgroundMediaPlayerStatics?>).castToImpl<IBackgroundMediaPlayerStatics,IBackgroundMediaPlayerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundMediaPlayerStatics?> =
        arrayOfNulls<IBackgroundMediaPlayerStatics_Impl>(size) as
        Array<IBackgroundMediaPlayerStatics?>
  }
}
