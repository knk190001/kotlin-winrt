package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastStreamReader.ABI::class)
@Signature("{b338bcf9-3364-4460-b5f1-3cc2796a8aa2}")
@Guid("b338bcf933644460b5f13cc2796a8aa2")
@WinRTInterface("b338bcf933644460b5f13cc2796a8aa2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastStreamReader.ByReference::class)
public interface IAppBroadcastStreamReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AudioChannels(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_AudioSampleRate(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_AudioAacSequence(): IBuffer?

  @InterfaceMethod(3)
  public fun get_AudioBitrate(): WinDef.UINT

  @InterfaceMethod(4)
  public fun TryGetNextAudioFrame(): AppBroadcastStreamAudioFrame?

  @InterfaceMethod(5)
  public fun get_VideoWidth(): WinDef.UINT

  @InterfaceMethod(6)
  public fun get_VideoHeight(): WinDef.UINT

  @InterfaceMethod(7)
  public fun get_VideoBitrate(): WinDef.UINT

  @InterfaceMethod(8)
  public fun TryGetNextVideoFrame(): AppBroadcastStreamVideoFrame?

  @InterfaceMethod(9)
  public fun add_AudioFrameArrived(value: TypedEventHandler<AppBroadcastStreamReader?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_AudioFrameArrived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_VideoFrameArrived(value: TypedEventHandler<AppBroadcastStreamReader?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_VideoFrameArrived(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastStreamReader> {
    public override fun getValue() = ABI.makeIAppBroadcastStreamReader(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastStreamReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastStreamReader {
    public val __235694085_Ptr: Pointer?

    public val _235694085_VtblPtr: Pointer?
      get() = __235694085_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioChannels(): WinDef.UINT {
      val fnPtr = _235694085_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AudioSampleRate(): WinDef.UINT {
      val fnPtr = _235694085_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_AudioAacSequence(): IBuffer? {
      val fnPtr = _235694085_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AudioBitrate(): WinDef.UINT {
      val fnPtr = _235694085_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun TryGetNextAudioFrame(): AppBroadcastStreamAudioFrame? {
      val fnPtr = _235694085_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastStreamAudioFrame>()
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastStreamAudioFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_VideoWidth(): WinDef.UINT {
      val fnPtr = _235694085_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_VideoHeight(): WinDef.UINT {
      val fnPtr = _235694085_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_VideoBitrate(): WinDef.UINT {
      val fnPtr = _235694085_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun TryGetNextVideoFrame(): AppBroadcastStreamVideoFrame? {
      val fnPtr = _235694085_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastStreamVideoFrame>()
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastStreamVideoFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun add_AudioFrameArrived(value: TypedEventHandler<AppBroadcastStreamReader?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _235694085_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_AudioFrameArrived(token: EventRegistrationToken?): Unit {
      val fnPtr = _235694085_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_VideoFrameArrived(value: TypedEventHandler<AppBroadcastStreamReader?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _235694085_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_VideoFrameArrived(token: EventRegistrationToken?): Unit {
      val fnPtr = _235694085_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__235694085_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastStreamReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __235694085_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastStreamReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b338bcf933644460b5f13cc2796a8aa2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastStreamReader(ptr: Pointer?): WithDefault =
        IAppBroadcastStreamReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastStreamReader {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastStreamReader(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastStreamReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__235694085_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastStreamReader):
        Array<IAppBroadcastStreamReader?> = (elements as
        Array<IAppBroadcastStreamReader?>).castToImpl<IAppBroadcastStreamReader,IAppBroadcastStreamReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastStreamReader?> =
        arrayOfNulls<IAppBroadcastStreamReader_Impl>(size) as Array<IAppBroadcastStreamReader?>
  }
}
