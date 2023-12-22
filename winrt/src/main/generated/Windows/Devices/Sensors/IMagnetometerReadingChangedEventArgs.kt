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

@ABIMarker(IMagnetometerReadingChangedEventArgs.ABI::class)
@Signature("{17eae872-2eb9-4ee7-8ad0-3127537d949b}")
@Guid("17eae8722eb94ee78ad03127537d949b")
@WinRTInterface("17eae8722eb94ee78ad03127537d949b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagnetometerReadingChangedEventArgs.ByReference::class)
public interface IMagnetometerReadingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): MagnetometerReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagnetometerReadingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIMagnetometerReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMagnetometerReadingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagnetometerReadingChangedEventArgs {
    public val __1009841537_Ptr: Pointer?

    public val _1009841537_VtblPtr: Pointer?
      get() = __1009841537_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): MagnetometerReading? {
      val fnPtr = _1009841537_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagnetometerReading>()
      val hr = fn.invokeHR(arrayOf(__1009841537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagnetometerReading>(result.getValue())
      return resultValue
    }
  }

  public class IMagnetometerReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1009841537_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagnetometerReadingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17eae8722eb94ee78ad03127537d949b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagnetometerReadingChangedEventArgs(ptr: Pointer?): WithDefault =
        IMagnetometerReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagnetometerReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMagnetometerReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMagnetometerReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1009841537_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagnetometerReadingChangedEventArgs):
        Array<IMagnetometerReadingChangedEventArgs?> = (elements as
        Array<IMagnetometerReadingChangedEventArgs?>).castToImpl<IMagnetometerReadingChangedEventArgs,IMagnetometerReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagnetometerReadingChangedEventArgs?> =
        arrayOfNulls<IMagnetometerReadingChangedEventArgs_Impl>(size) as
        Array<IMagnetometerReadingChangedEventArgs?>
  }
}
