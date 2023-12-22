package Windows.ApplicationModel.Appointments

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

@ABIMarker(IAppointmentStoreChangedEventArgs.ABI::class)
@Signature("{2285f8b9-0791-417e-bfea-cc6d41636c8c}")
@Guid("2285f8b90791417ebfeacc6d41636c8c")
@WinRTInterface("2285f8b90791417ebfeacc6d41636c8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStoreChangedEventArgs.ByReference::class)
public interface IAppointmentStoreChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): AppointmentStoreChangedDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStoreChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentStoreChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStoreChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStoreChangedEventArgs {
    public val __1220993904_Ptr: Pointer?

    public val _1220993904_VtblPtr: Pointer?
      get() = __1220993904_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): AppointmentStoreChangedDeferral? {
      val fnPtr = _1220993904_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentStoreChangedDeferral>()
      val hr = fn.invokeHR(arrayOf(__1220993904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentStoreChangedDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentStoreChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1220993904_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStoreChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2285f8b90791417ebfeacc6d41636c8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStoreChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppointmentStoreChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentStoreChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentStoreChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStoreChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1220993904_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStoreChangedEventArgs):
        Array<IAppointmentStoreChangedEventArgs?> = (elements as
        Array<IAppointmentStoreChangedEventArgs?>).castToImpl<IAppointmentStoreChangedEventArgs,IAppointmentStoreChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStoreChangedEventArgs?> =
        arrayOfNulls<IAppointmentStoreChangedEventArgs_Impl>(size) as
        Array<IAppointmentStoreChangedEventArgs?>
  }
}
