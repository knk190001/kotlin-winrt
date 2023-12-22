package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Media.Casting.CastingSource
import Windows.Media.Playback.IMediaPlaybackSource
import Windows.UI.Xaml.Media.PartialMediaFailureDetectedEventArgs
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

@ABIMarker(IMediaElement3.ABI::class)
@Signature("{479f6f13-0fdb-4ed8-928a-4d39169c3cd2}")
@Guid("479f6f130fdb4ed8928a4d39169c3cd2")
@WinRTInterface("479f6f130fdb4ed8928a4d39169c3cd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaElement3.ByReference::class)
public interface IMediaElement3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TransportControls(): MediaTransportControls?

  @InterfaceMethod(1)
  public fun put_TransportControls(value: MediaTransportControls?): Unit

  @InterfaceMethod(2)
  public fun add_PartialMediaFailureDetected(handler: TypedEventHandler<MediaElement?,
      PartialMediaFailureDetectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PartialMediaFailureDetected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun SetPlaybackSource(source: IMediaPlaybackSource?): Unit

  @InterfaceMethod(5)
  public fun GetAsCastingSource(): CastingSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaElement3>
      {
    public override fun getValue() = ABI.makeIMediaElement3(pointer.getPointer(0))

    public fun setValue(value: IMediaElement3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaElement3 {
    public val __141057505_Ptr: Pointer?

    public val _141057505_VtblPtr: Pointer?
      get() = __141057505_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TransportControls(): MediaTransportControls? {
      val fnPtr = _141057505_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaTransportControls>()
      val hr = fn.invokeHR(arrayOf(__141057505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaTransportControls>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TransportControls(value: MediaTransportControls?): Unit {
      val fnPtr = _141057505_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__141057505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_PartialMediaFailureDetected(handler: TypedEventHandler<MediaElement?,
        PartialMediaFailureDetectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _141057505_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__141057505_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PartialMediaFailureDetected(token: EventRegistrationToken?): Unit {
      val fnPtr = _141057505_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__141057505_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetPlaybackSource(source: IMediaPlaybackSource?): Unit {
      val fnPtr = _141057505_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__141057505_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetAsCastingSource(): CastingSource? {
      val fnPtr = _141057505_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CastingSource>()
      val hr = fn.invokeHR(arrayOf(__141057505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CastingSource>(result.getValue())
      return resultValue
    }
  }

  public class IMediaElement3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __141057505_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaElement3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("479f6f130fdb4ed8928a4d39169c3cd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaElement3(ptr: Pointer?): WithDefault = IMediaElement3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaElement3 {
      val address = segment.toRawLongValue()
      return makeIMediaElement3(Pointer(address))
    }

    public override fun toNative(obj: IMediaElement3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__141057505_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaElement3): Array<IMediaElement3?> = (elements as
        Array<IMediaElement3?>).castToImpl<IMediaElement3,IMediaElement3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaElement3?> =
        arrayOfNulls<IMediaElement3_Impl>(size) as Array<IMediaElement3?>
  }
}
