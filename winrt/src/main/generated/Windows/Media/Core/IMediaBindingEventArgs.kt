package Windows.Media.Core

import Windows.Foundation.Deferral
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
import Windows.Storage.Streams.IRandomAccessStream
import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IMediaBindingEventArgs.ABI::class)
@Signature("{b61cb25a-1b6d-4630-a86d-2f0837f712e5}")
@Guid("b61cb25a1b6d4630a86d2f0837f712e5")
@WinRTInterface("b61cb25a1b6d4630a86d2f0837f712e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaBindingEventArgs.ByReference::class)
public interface IMediaBindingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Canceled(handler: TypedEventHandler<MediaBindingEventArgs?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Canceled(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_MediaBinder(): MediaBinder?

  @InterfaceMethod(3)
  public fun GetDeferral(): Deferral?

  @InterfaceMethod(4)
  public fun SetUri(uri: Uri?): Unit

  @InterfaceMethod(5)
  public fun SetStream(stream: IRandomAccessStream?, contentType: String?): Unit

  @InterfaceMethod(6)
  public fun SetStreamReference(stream: IRandomAccessStreamReference?, contentType: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaBindingEventArgs> {
    public override fun getValue() = ABI.makeIMediaBindingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaBindingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaBindingEventArgs {
    public val __1175088609_Ptr: Pointer?

    public val _1175088609_VtblPtr: Pointer?
      get() = __1175088609_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Canceled(handler: TypedEventHandler<MediaBindingEventArgs?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1175088609_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1175088609_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Canceled(token: EventRegistrationToken?): Unit {
      val fnPtr = _1175088609_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1175088609_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MediaBinder(): MediaBinder? {
      val fnPtr = _1175088609_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaBinder>()
      val hr = fn.invokeHR(arrayOf(__1175088609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaBinder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1175088609_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1175088609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetUri(uri: Uri?): Unit {
      val fnPtr = _1175088609_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1175088609_Ptr, marshalToNative(uri),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SetStream(stream: IRandomAccessStream?, contentType: String?): Unit {
      val fnPtr = _1175088609_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1175088609_Ptr, marshalToNative(stream),
          marshalToNative(contentType),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetStreamReference(stream: IRandomAccessStreamReference?,
        contentType: String?): Unit {
      val fnPtr = _1175088609_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1175088609_Ptr, marshalToNative(stream),
          marshalToNative(contentType),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaBindingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1175088609_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaBindingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b61cb25a1b6d4630a86d2f0837f712e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaBindingEventArgs(ptr: Pointer?): WithDefault =
        IMediaBindingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaBindingEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaBindingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaBindingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1175088609_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaBindingEventArgs): Array<IMediaBindingEventArgs?> =
        (elements as
        Array<IMediaBindingEventArgs?>).castToImpl<IMediaBindingEventArgs,IMediaBindingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaBindingEventArgs?> =
        arrayOfNulls<IMediaBindingEventArgs_Impl>(size) as Array<IMediaBindingEventArgs?>
  }
}
