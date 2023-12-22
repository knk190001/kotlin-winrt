package Windows.Media.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.TypedEventHandler
import Windows.Media.Core.IMediaSource2.ABI.IID
import Windows.Media.Playback.IMediaPlaybackSource
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaSource3.ABI::class)
@Signature("{b59f0d9b-4b6e-41ed-bbb4-7c7509a994ad}")
@Guid("b59f0d9b4b6e41edbbb47c7509a994ad")
@WinRTInterface("b59f0d9b4b6e41edbbb47c7509a994ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSource3.ByReference::class)
public interface IMediaSource3 : NativeMapped, IWinRTInterface, IMediaSource2, IMediaPlaybackSource,
    IClosable {
  @InterfaceMethod(0)
  public fun add_StateChanged(handler: TypedEventHandler<MediaSource?,
      MediaSourceStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_State(): MediaSourceState?

  @InterfaceMethod(3)
  public fun Reset(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaSource3>
      {
    public override fun getValue() = ABI.makeIMediaSource3(pointer.getPointer(0))

    public fun setValue(value: IMediaSource3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSource3, IMediaSource2.WithDefault,
      IMediaPlaybackSource.WithDefault, IClosable.WithDefault {
    public val __983754167_Ptr: Pointer?

    public val _983754167_VtblPtr: Pointer?
      get() = __983754167_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_StateChanged(handler: TypedEventHandler<MediaSource?,
        MediaSourceStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _983754167_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__983754167_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _983754167_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__983754167_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_State(): MediaSourceState? {
      val fnPtr = _983754167_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSourceState>()
      val hr = fn.invokeHR(arrayOf(__983754167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSourceState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Reset(): Unit {
      val fnPtr = _983754167_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__983754167_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaSource3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaSource2,
      IMediaPlaybackSource, IClosable {
    public override val __983754168_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_983754167_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1097311199_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaPlaybackSource.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_983754167_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_983754167_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __983754167_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSource3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b59f0d9b4b6e41edbbb47c7509a994ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSource3(ptr: Pointer?): WithDefault = IMediaSource3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaSource3 {
      val address = segment.toRawLongValue()
      return makeIMediaSource3(Pointer(address))
    }

    public override fun toNative(obj: IMediaSource3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__983754167_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSource3): Array<IMediaSource3?> = (elements as
        Array<IMediaSource3?>).castToImpl<IMediaSource3,IMediaSource3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSource3?> =
        arrayOfNulls<IMediaSource3_Impl>(size) as Array<IMediaSource3?>
  }
}
