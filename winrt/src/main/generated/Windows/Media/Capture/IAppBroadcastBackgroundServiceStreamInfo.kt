package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastBackgroundServiceStreamInfo.ABI::class)
@Signature("{31dc02bc-990a-4904-aa96-fe364381f136}")
@Guid("31dc02bc990a4904aa96fe364381f136")
@WinRTInterface("31dc02bc990a4904aa96fe364381f136")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastBackgroundServiceStreamInfo.ByReference::class)
public interface IAppBroadcastBackgroundServiceStreamInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StreamState(): AppBroadcastStreamState?

  @InterfaceMethod(1)
  public fun put_DesiredVideoEncodingBitrate(value: WinDef.ULONG): Unit

  @InterfaceMethod(2)
  public fun get_DesiredVideoEncodingBitrate(): WinDef.ULONG

  @InterfaceMethod(3)
  public fun put_BandwidthTestBitrate(value: WinDef.ULONG): Unit

  @InterfaceMethod(4)
  public fun get_BandwidthTestBitrate(): WinDef.ULONG

  @InterfaceMethod(5)
  public fun put_AudioCodec(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_AudioCodec(): String?

  @InterfaceMethod(7)
  public fun get_BroadcastStreamReader(): AppBroadcastStreamReader?

  @InterfaceMethod(8)
  public
      fun add_StreamStateChanged(handler: TypedEventHandler<AppBroadcastBackgroundServiceStreamInfo?,
      AppBroadcastStreamStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_StreamStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public
      fun add_VideoEncodingResolutionChanged(handler: TypedEventHandler<AppBroadcastBackgroundServiceStreamInfo?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_VideoEncodingResolutionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public
      fun add_VideoEncodingBitrateChanged(handler: TypedEventHandler<AppBroadcastBackgroundServiceStreamInfo?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_VideoEncodingBitrateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastBackgroundServiceStreamInfo> {
    public override fun getValue() =
        ABI.makeIAppBroadcastBackgroundServiceStreamInfo(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastBackgroundServiceStreamInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastBackgroundServiceStreamInfo {
    public val __1727517373_Ptr: Pointer?

    public val _1727517373_VtblPtr: Pointer?
      get() = __1727517373_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StreamState(): AppBroadcastStreamState? {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastStreamState>()
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastStreamState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DesiredVideoEncodingBitrate(value: WinDef.ULONG): Unit {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DesiredVideoEncodingBitrate(): WinDef.ULONG {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_BandwidthTestBitrate(value: WinDef.ULONG): Unit {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BandwidthTestBitrate(): WinDef.ULONG {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AudioCodec(value: String?): Unit {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AudioCodec(): String? {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_BroadcastStreamReader(): AppBroadcastStreamReader? {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastStreamReader>()
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastStreamReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override
        fun add_StreamStateChanged(handler: TypedEventHandler<AppBroadcastBackgroundServiceStreamInfo?,
        AppBroadcastStreamStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_StreamStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override
        fun add_VideoEncodingResolutionChanged(handler: TypedEventHandler<AppBroadcastBackgroundServiceStreamInfo?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_VideoEncodingResolutionChanged(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override
        fun add_VideoEncodingBitrateChanged(handler: TypedEventHandler<AppBroadcastBackgroundServiceStreamInfo?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_VideoEncodingBitrateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1727517373_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1727517373_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastBackgroundServiceStreamInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1727517373_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastBackgroundServiceStreamInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("31dc02bc990a4904aa96fe364381f136")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastBackgroundServiceStreamInfo(ptr: Pointer?): WithDefault =
        IAppBroadcastBackgroundServiceStreamInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBroadcastBackgroundServiceStreamInfo {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastBackgroundServiceStreamInfo(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastBackgroundServiceStreamInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1727517373_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastBackgroundServiceStreamInfo):
        Array<IAppBroadcastBackgroundServiceStreamInfo?> = (elements as
        Array<IAppBroadcastBackgroundServiceStreamInfo?>).castToImpl<IAppBroadcastBackgroundServiceStreamInfo,IAppBroadcastBackgroundServiceStreamInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastBackgroundServiceStreamInfo?> =
        arrayOfNulls<IAppBroadcastBackgroundServiceStreamInfo_Impl>(size) as
        Array<IAppBroadcastBackgroundServiceStreamInfo?>
  }
}
