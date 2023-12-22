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

@ABIMarker(ICompassReadingChangedEventArgs.ABI::class)
@Signature("{8f1549b0-e8bc-4c7e-b009-4e41df137072}")
@Guid("8f1549b0e8bc4c7eb0094e41df137072")
@WinRTInterface("8f1549b0e8bc4c7eb0094e41df137072")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompassReadingChangedEventArgs.ByReference::class)
public interface ICompassReadingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): CompassReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompassReadingChangedEventArgs> {
    public override fun getValue() = ABI.makeICompassReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICompassReadingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompassReadingChangedEventArgs {
    public val __449646697_Ptr: Pointer?

    public val _449646697_VtblPtr: Pointer?
      get() = __449646697_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): CompassReading? {
      val fnPtr = _449646697_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompassReading>()
      val hr = fn.invokeHR(arrayOf(__449646697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompassReading>(result.getValue())
      return resultValue
    }
  }

  public class ICompassReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __449646697_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompassReadingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f1549b0e8bc4c7eb0094e41df137072")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompassReadingChangedEventArgs(ptr: Pointer?): WithDefault =
        ICompassReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompassReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeICompassReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICompassReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__449646697_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompassReadingChangedEventArgs):
        Array<ICompassReadingChangedEventArgs?> = (elements as
        Array<ICompassReadingChangedEventArgs?>).castToImpl<ICompassReadingChangedEventArgs,ICompassReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompassReadingChangedEventArgs?> =
        arrayOfNulls<ICompassReadingChangedEventArgs_Impl>(size) as
        Array<ICompassReadingChangedEventArgs?>
  }
}
