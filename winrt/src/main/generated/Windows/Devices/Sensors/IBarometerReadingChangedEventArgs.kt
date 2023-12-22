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

@ABIMarker(IBarometerReadingChangedEventArgs.ABI::class)
@Signature("{3d84945f-037b-404f-9bbb-6232d69543c3}")
@Guid("3d84945f037b404f9bbb6232d69543c3")
@WinRTInterface("3d84945f037b404f9bbb6232d69543c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarometerReadingChangedEventArgs.ByReference::class)
public interface IBarometerReadingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): BarometerReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarometerReadingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIBarometerReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBarometerReadingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarometerReadingChangedEventArgs {
    public val __1761634866_Ptr: Pointer?

    public val _1761634866_VtblPtr: Pointer?
      get() = __1761634866_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): BarometerReading? {
      val fnPtr = _1761634866_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarometerReading>()
      val hr = fn.invokeHR(arrayOf(__1761634866_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarometerReading>(result.getValue())
      return resultValue
    }
  }

  public class IBarometerReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1761634866_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarometerReadingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d84945f037b404f9bbb6232d69543c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarometerReadingChangedEventArgs(ptr: Pointer?): WithDefault =
        IBarometerReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarometerReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBarometerReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBarometerReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1761634866_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarometerReadingChangedEventArgs):
        Array<IBarometerReadingChangedEventArgs?> = (elements as
        Array<IBarometerReadingChangedEventArgs?>).castToImpl<IBarometerReadingChangedEventArgs,IBarometerReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarometerReadingChangedEventArgs?> =
        arrayOfNulls<IBarometerReadingChangedEventArgs_Impl>(size) as
        Array<IBarometerReadingChangedEventArgs?>
  }
}
