package Windows.Media.Core

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

@ABIMarker(IMediaSourceAppServiceConnection.ABI::class)
@Signature("{61e1ea97-1916-4810-b7f4-b642be829596}")
@Guid("61e1ea9719164810b7f4b642be829596")
@WinRTInterface("61e1ea9719164810b7f4b642be829596")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSourceAppServiceConnection.ByReference::class)
public interface IMediaSourceAppServiceConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun add_InitializeMediaStreamSourceRequested(handler: TypedEventHandler<MediaSourceAppServiceConnection?,
      InitializeMediaStreamSourceRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_InitializeMediaStreamSourceRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun Start(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaSourceAppServiceConnection> {
    public override fun getValue() = ABI.makeIMediaSourceAppServiceConnection(pointer.getPointer(0))

    public fun setValue(value: IMediaSourceAppServiceConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSourceAppServiceConnection {
    public val __930575772_Ptr: Pointer?

    public val _930575772_VtblPtr: Pointer?
      get() = __930575772_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_InitializeMediaStreamSourceRequested(handler: TypedEventHandler<MediaSourceAppServiceConnection?,
        InitializeMediaStreamSourceRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _930575772_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__930575772_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_InitializeMediaStreamSourceRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _930575772_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__930575772_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Start(): Unit {
      val fnPtr = _930575772_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__930575772_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaSourceAppServiceConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __930575772_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSourceAppServiceConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61e1ea9719164810b7f4b642be829596")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSourceAppServiceConnection(ptr: Pointer?): WithDefault =
        IMediaSourceAppServiceConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaSourceAppServiceConnection {
      val address = segment.toRawLongValue()
      return makeIMediaSourceAppServiceConnection(Pointer(address))
    }

    public override fun toNative(obj: IMediaSourceAppServiceConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__930575772_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSourceAppServiceConnection):
        Array<IMediaSourceAppServiceConnection?> = (elements as
        Array<IMediaSourceAppServiceConnection?>).castToImpl<IMediaSourceAppServiceConnection,IMediaSourceAppServiceConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSourceAppServiceConnection?> =
        arrayOfNulls<IMediaSourceAppServiceConnection_Impl>(size) as
        Array<IMediaSourceAppServiceConnection?>
  }
}
