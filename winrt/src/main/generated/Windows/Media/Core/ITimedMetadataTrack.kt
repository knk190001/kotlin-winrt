package Windows.Media.Core

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Media.Core.IMediaTrack.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ITimedMetadataTrack.ABI::class)
@Signature("{9e6aed9e-f67a-49a9-b330-cf03b0e9cf07}")
@Guid("9e6aed9ef67a49a9b330cf03b0e9cf07")
@WinRTInterface("9e6aed9ef67a49a9b330cf03b0e9cf07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedMetadataTrack.ByReference::class)
public interface ITimedMetadataTrack : NativeMapped, IWinRTInterface, IMediaTrack {
  @InterfaceMethod(0)
  public fun add_CueEntered(handler: TypedEventHandler<TimedMetadataTrack?, MediaCueEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_CueEntered(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_CueExited(handler: TypedEventHandler<TimedMetadataTrack?, MediaCueEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_CueExited(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_TrackFailed(handler: TypedEventHandler<TimedMetadataTrack?,
      TimedMetadataTrackFailedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_TrackFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_Cues(): IVectorView<IMediaCue?>?

  @InterfaceMethod(7)
  public fun get_ActiveCues(): IVectorView<IMediaCue?>?

  @InterfaceMethod(8)
  public fun get_TimedMetadataKind(): TimedMetadataKind?

  @InterfaceMethod(9)
  public fun get_DispatchType(): String?

  @InterfaceMethod(10)
  public fun AddCue(cue: IMediaCue?): Unit

  @InterfaceMethod(11)
  public fun RemoveCue(cue: IMediaCue?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedMetadataTrack> {
    public override fun getValue() = ABI.makeITimedMetadataTrack(pointer.getPointer(0))

    public fun setValue(value: ITimedMetadataTrack_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedMetadataTrack, IMediaTrack.WithDefault {
    public val __771862778_Ptr: Pointer?

    public val _771862778_VtblPtr: Pointer?
      get() = __771862778_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_CueEntered(handler: TypedEventHandler<TimedMetadataTrack?,
        MediaCueEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _771862778_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_CueEntered(token: EventRegistrationToken?): Unit {
      val fnPtr = _771862778_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_CueExited(handler: TypedEventHandler<TimedMetadataTrack?,
        MediaCueEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _771862778_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_CueExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _771862778_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_TrackFailed(handler: TypedEventHandler<TimedMetadataTrack?,
        TimedMetadataTrackFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _771862778_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_TrackFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _771862778_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Cues(): IVectorView<IMediaCue?>? {
      val fnPtr = _771862778_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IMediaCue?>>()
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IMediaCue?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ActiveCues(): IVectorView<IMediaCue?>? {
      val fnPtr = _771862778_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IMediaCue?>>()
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IMediaCue?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_TimedMetadataKind(): TimedMetadataKind? {
      val fnPtr = _771862778_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataKind>()
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_DispatchType(): String? {
      val fnPtr = _771862778_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun AddCue(cue: IMediaCue?): Unit {
      val fnPtr = _771862778_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr, marshalToNative(cue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun RemoveCue(cue: IMediaCue?): Unit {
      val fnPtr = _771862778_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__771862778_Ptr, marshalToNative(cue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimedMetadataTrack_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaTrack {
    public override val __1836839004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_771862778_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __771862778_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedMetadataTrack, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e6aed9ef67a49a9b330cf03b0e9cf07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedMetadataTrack(ptr: Pointer?): WithDefault = ITimedMetadataTrack_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedMetadataTrack {
      val address = segment.toRawLongValue()
      return makeITimedMetadataTrack(Pointer(address))
    }

    public override fun toNative(obj: ITimedMetadataTrack): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__771862778_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedMetadataTrack): Array<ITimedMetadataTrack?> =
        (elements as
        Array<ITimedMetadataTrack?>).castToImpl<ITimedMetadataTrack,ITimedMetadataTrack_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedMetadataTrack?> =
        arrayOfNulls<ITimedMetadataTrack_Impl>(size) as Array<ITimedMetadataTrack?>
  }
}
