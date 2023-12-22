package Windows.Devices.Sensors

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

@ABIMarker(IGyrometerReadingChangedEventArgs.ABI::class)
@Signature("{0fdf1895-6f9e-42ce-8d58-388c0ab8356d}")
@Guid("0fdf18956f9e42ce8d58388c0ab8356d")
@WinRTInterface("0fdf18956f9e42ce8d58388c0ab8356d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGyrometerReadingChangedEventArgs.ByReference::class)
public interface IGyrometerReadingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): GyrometerReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGyrometerReadingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIGyrometerReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGyrometerReadingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGyrometerReadingChangedEventArgs {
    public val __902011713_Ptr: Pointer?

    public val _902011713_VtblPtr: Pointer?
      get() = __902011713_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): GyrometerReading? {
      val fnPtr = _902011713_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GyrometerReading>()
      val hr = fn.invokeHR(arrayOf(__902011713_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GyrometerReading>(result.getValue())
      return resultValue
    }
  }

  public class IGyrometerReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __902011713_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGyrometerReadingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0fdf18956f9e42ce8d58388c0ab8356d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGyrometerReadingChangedEventArgs(ptr: Pointer?): WithDefault =
        IGyrometerReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGyrometerReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGyrometerReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGyrometerReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__902011713_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGyrometerReadingChangedEventArgs):
        Array<IGyrometerReadingChangedEventArgs?> = (elements as
        Array<IGyrometerReadingChangedEventArgs?>).castToImpl<IGyrometerReadingChangedEventArgs,IGyrometerReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGyrometerReadingChangedEventArgs?> =
        arrayOfNulls<IGyrometerReadingChangedEventArgs_Impl>(size) as
        Array<IGyrometerReadingChangedEventArgs?>
  }
}
