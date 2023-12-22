package Windows.Devices.Radios

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IRadio.ABI::class)
@Signature("{252118df-b33e-416a-875f-1cf38ae2d83e}")
@Guid("252118dfb33e416a875f1cf38ae2d83e")
@WinRTInterface("252118dfb33e416a875f1cf38ae2d83e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadio.ByReference::class)
public interface IRadio : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetStateAsync(value: RadioState?): IAsyncOperation<RadioAccessStatus?>?

  @InterfaceMethod(1)
  public fun add_StateChanged(handler: TypedEventHandler<Radio?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_StateChanged(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun get_State(): RadioState?

  @InterfaceMethod(4)
  public fun get_Name(): String?

  @InterfaceMethod(5)
  public fun get_Kind(): RadioKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRadio> {
    public override fun getValue() = ABI.makeIRadio(pointer.getPointer(0))

    public fun setValue(value: IRadio_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadio {
    public val __96204646_Ptr: Pointer?

    public val _96204646_VtblPtr: Pointer?
      get() = __96204646_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetStateAsync(value: RadioState?): IAsyncOperation<RadioAccessStatus?>? {
      val fnPtr = _96204646_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RadioAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__96204646_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<RadioAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_StateChanged(handler: TypedEventHandler<Radio?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _96204646_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__96204646_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_StateChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _96204646_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__96204646_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_State(): RadioState? {
      val fnPtr = _96204646_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadioState>()
      val hr = fn.invokeHR(arrayOf(__96204646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadioState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Name(): String? {
      val fnPtr = _96204646_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__96204646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Kind(): RadioKind? {
      val fnPtr = _96204646_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadioKind>()
      val hr = fn.invokeHR(arrayOf(__96204646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadioKind>(result.getValue())
      return resultValue
    }
  }

  public class IRadio_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __96204646_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadio, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("252118dfb33e416a875f1cf38ae2d83e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadio(ptr: Pointer?): WithDefault = IRadio_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadio {
      val address = segment.toRawLongValue()
      return makeIRadio(Pointer(address))
    }

    public override fun toNative(obj: IRadio): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__96204646_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadio): Array<IRadio?> = (elements as
        Array<IRadio?>).castToImpl<IRadio,IRadio_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadio?> = arrayOfNulls<IRadio_Impl>(size) as
        Array<IRadio?>
  }
}
