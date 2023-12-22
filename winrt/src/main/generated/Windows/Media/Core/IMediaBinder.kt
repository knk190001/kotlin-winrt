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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaBinder.ABI::class)
@Signature("{2b7e40aa-de07-424f-83f1-f1de46c4fa2e}")
@Guid("2b7e40aade07424f83f1f1de46c4fa2e")
@WinRTInterface("2b7e40aade07424f83f1f1de46c4fa2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaBinder.ByReference::class)
public interface IMediaBinder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Binding(handler: TypedEventHandler<MediaBinder?, MediaBindingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Binding(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_Token(): String?

  @InterfaceMethod(3)
  public fun put_Token(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Source(): MediaSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaBinder> {
    public override fun getValue() = ABI.makeIMediaBinder(pointer.getPointer(0))

    public fun setValue(value: IMediaBinder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaBinder {
    public val __584186041_Ptr: Pointer?

    public val _584186041_VtblPtr: Pointer?
      get() = __584186041_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Binding(handler: TypedEventHandler<MediaBinder?,
        MediaBindingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _584186041_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__584186041_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Binding(token: EventRegistrationToken?): Unit {
      val fnPtr = _584186041_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__584186041_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Token(): String? {
      val fnPtr = _584186041_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__584186041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Token(value: String?): Unit {
      val fnPtr = _584186041_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__584186041_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Source(): MediaSource? {
      val fnPtr = _584186041_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__584186041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }
  }

  public class IMediaBinder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __584186041_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaBinder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b7e40aade07424f83f1f1de46c4fa2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaBinder(ptr: Pointer?): WithDefault = IMediaBinder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaBinder {
      val address = segment.toRawLongValue()
      return makeIMediaBinder(Pointer(address))
    }

    public override fun toNative(obj: IMediaBinder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__584186041_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaBinder): Array<IMediaBinder?> = (elements as
        Array<IMediaBinder?>).castToImpl<IMediaBinder,IMediaBinder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaBinder?> =
        arrayOfNulls<IMediaBinder_Impl>(size) as Array<IMediaBinder?>
  }
}
