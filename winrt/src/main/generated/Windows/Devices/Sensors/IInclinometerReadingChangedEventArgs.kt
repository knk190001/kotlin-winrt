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

@ABIMarker(IInclinometerReadingChangedEventArgs.ABI::class)
@Signature("{4ae91dc1-e7eb-4938-8511-ae0d6b440438}")
@Guid("4ae91dc1e7eb49388511ae0d6b440438")
@WinRTInterface("4ae91dc1e7eb49388511ae0d6b440438")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometerReadingChangedEventArgs.ByReference::class)
public interface IInclinometerReadingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): InclinometerReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInclinometerReadingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIInclinometerReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IInclinometerReadingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometerReadingChangedEventArgs {
    public val __1964987242_Ptr: Pointer?

    public val _1964987242_VtblPtr: Pointer?
      get() = __1964987242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): InclinometerReading? {
      val fnPtr = _1964987242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InclinometerReading>()
      val hr = fn.invokeHR(arrayOf(__1964987242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InclinometerReading>(result.getValue())
      return resultValue
    }
  }

  public class IInclinometerReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1964987242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometerReadingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ae91dc1e7eb49388511ae0d6b440438")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometerReadingChangedEventArgs(ptr: Pointer?): WithDefault =
        IInclinometerReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometerReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIInclinometerReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IInclinometerReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1964987242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometerReadingChangedEventArgs):
        Array<IInclinometerReadingChangedEventArgs?> = (elements as
        Array<IInclinometerReadingChangedEventArgs?>).castToImpl<IInclinometerReadingChangedEventArgs,IInclinometerReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometerReadingChangedEventArgs?> =
        arrayOfNulls<IInclinometerReadingChangedEventArgs_Impl>(size) as
        Array<IInclinometerReadingChangedEventArgs?>
  }
}
