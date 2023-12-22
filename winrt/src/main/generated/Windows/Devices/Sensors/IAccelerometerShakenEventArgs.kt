package Windows.Devices.Sensors

import Windows.Foundation.DateTime
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

@ABIMarker(IAccelerometerShakenEventArgs.ABI::class)
@Signature("{95ff01d1-4a28-4f35-98e8-8178aae4084a}")
@Guid("95ff01d14a284f3598e88178aae4084a")
@WinRTInterface("95ff01d14a284f3598e88178aae4084a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccelerometerShakenEventArgs.ByReference::class)
public interface IAccelerometerShakenEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccelerometerShakenEventArgs> {
    public override fun getValue() = ABI.makeIAccelerometerShakenEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAccelerometerShakenEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccelerometerShakenEventArgs {
    public val __1387967252_Ptr: Pointer?

    public val _1387967252_VtblPtr: Pointer?
      get() = __1387967252_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _1387967252_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1387967252_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IAccelerometerShakenEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1387967252_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccelerometerShakenEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95ff01d14a284f3598e88178aae4084a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccelerometerShakenEventArgs(ptr: Pointer?): WithDefault =
        IAccelerometerShakenEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccelerometerShakenEventArgs {
      val address = segment.toRawLongValue()
      return makeIAccelerometerShakenEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAccelerometerShakenEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1387967252_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccelerometerShakenEventArgs):
        Array<IAccelerometerShakenEventArgs?> = (elements as
        Array<IAccelerometerShakenEventArgs?>).castToImpl<IAccelerometerShakenEventArgs,IAccelerometerShakenEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccelerometerShakenEventArgs?> =
        arrayOfNulls<IAccelerometerShakenEventArgs_Impl>(size) as
        Array<IAccelerometerShakenEventArgs?>
  }
}
