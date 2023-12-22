package Windows.Devices.Input

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

@ABIMarker(IMouseDevice.ABI::class)
@Signature("{88edf458-f2c8-49f4-be1f-c256b388bc11}")
@Guid("88edf458f2c849f4be1fc256b388bc11")
@WinRTInterface("88edf458f2c849f4be1fc256b388bc11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMouseDevice.ByReference::class)
public interface IMouseDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_MouseMoved(handler: TypedEventHandler<MouseDevice?, MouseEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_MouseMoved(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMouseDevice> {
    public override fun getValue() = ABI.makeIMouseDevice(pointer.getPointer(0))

    public fun setValue(value: IMouseDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMouseDevice {
    public val __419908288_Ptr: Pointer?

    public val _419908288_VtblPtr: Pointer?
      get() = __419908288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_MouseMoved(handler: TypedEventHandler<MouseDevice?, MouseEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _419908288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__419908288_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_MouseMoved(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _419908288_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__419908288_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMouseDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __419908288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMouseDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88edf458f2c849f4be1fc256b388bc11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMouseDevice(ptr: Pointer?): WithDefault = IMouseDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMouseDevice {
      val address = segment.toRawLongValue()
      return makeIMouseDevice(Pointer(address))
    }

    public override fun toNative(obj: IMouseDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__419908288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMouseDevice): Array<IMouseDevice?> = (elements as
        Array<IMouseDevice?>).castToImpl<IMouseDevice,IMouseDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMouseDevice?> =
        arrayOfNulls<IMouseDevice_Impl>(size) as Array<IMouseDevice?>
  }
}
