package Windows.Devices.Gpio

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

@ABIMarker(IGpioChangeReaderFactory.ABI::class)
@Signature("{a9598ef3-390e-441a-9d1c-e8de0b2df0df}")
@Guid("a9598ef3390e441a9d1ce8de0b2df0df")
@WinRTInterface("a9598ef3390e441a9d1ce8de0b2df0df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioChangeReaderFactory.ByReference::class)
public interface IGpioChangeReaderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(pin: GpioPin?): GpioChangeReader?

  @InterfaceMethod(1)
  public fun CreateWithCapacity(pin: GpioPin?, minCapacity: Int): GpioChangeReader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGpioChangeReaderFactory> {
    public override fun getValue() = ABI.makeIGpioChangeReaderFactory(pointer.getPointer(0))

    public fun setValue(value: IGpioChangeReaderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioChangeReaderFactory {
    public val __694811978_Ptr: Pointer?

    public val _694811978_VtblPtr: Pointer?
      get() = __694811978_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(pin: GpioPin?): GpioChangeReader? {
      val fnPtr = _694811978_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioChangeReader>()
      val hr = fn.invokeHR(arrayOf(__694811978_Ptr, marshalToNative(pin), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioChangeReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithCapacity(pin: GpioPin?, minCapacity: Int): GpioChangeReader? {
      val fnPtr = _694811978_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioChangeReader>()
      val hr = fn.invokeHR(arrayOf(__694811978_Ptr, marshalToNative(pin), minCapacity, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioChangeReader>(result.getValue())
      return resultValue
    }
  }

  public class IGpioChangeReaderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __694811978_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioChangeReaderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9598ef3390e441a9d1ce8de0b2df0df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioChangeReaderFactory(ptr: Pointer?): WithDefault =
        IGpioChangeReaderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGpioChangeReaderFactory {
      val address = segment.toRawLongValue()
      return makeIGpioChangeReaderFactory(Pointer(address))
    }

    public override fun toNative(obj: IGpioChangeReaderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__694811978_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioChangeReaderFactory):
        Array<IGpioChangeReaderFactory?> = (elements as
        Array<IGpioChangeReaderFactory?>).castToImpl<IGpioChangeReaderFactory,IGpioChangeReaderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioChangeReaderFactory?> =
        arrayOfNulls<IGpioChangeReaderFactory_Impl>(size) as Array<IGpioChangeReaderFactory?>
  }
}
