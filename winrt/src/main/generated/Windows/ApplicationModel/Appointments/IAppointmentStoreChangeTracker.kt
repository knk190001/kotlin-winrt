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

@ABIMarker(IAppointmentStoreChangeTracker.ABI::class)
@Signature("{1b25f4b1-8ece-4f17-93c8-e6412458fd5c}")
@Guid("1b25f4b18ece4f1793c8e6412458fd5c")
@WinRTInterface("1b25f4b18ece4f1793c8e6412458fd5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStoreChangeTracker.ByReference::class)
public interface IAppointmentStoreChangeTracker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetChangeReader(): AppointmentStoreChangeReader?

  @InterfaceMethod(1)
  public fun Enable(): Unit

  @InterfaceMethod(2)
  public fun Reset(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStoreChangeTracker> {
    public override fun getValue() = ABI.makeIAppointmentStoreChangeTracker(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStoreChangeTracker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStoreChangeTracker {
    public val __1030879685_Ptr: Pointer?

    public val _1030879685_VtblPtr: Pointer?
      get() = __1030879685_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetChangeReader(): AppointmentStoreChangeReader? {
      val fnPtr = _1030879685_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentStoreChangeReader>()
      val hr = fn.invokeHR(arrayOf(__1030879685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentStoreChangeReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Enable(): Unit {
      val fnPtr = _1030879685_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1030879685_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Reset(): Unit {
      val fnPtr = _1030879685_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1030879685_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppointmentStoreChangeTracker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1030879685_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStoreChangeTracker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b25f4b18ece4f1793c8e6412458fd5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStoreChangeTracker(ptr: Pointer?): WithDefault =
        IAppointmentStoreChangeTracker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentStoreChangeTracker {
      val address = segment.toRawLongValue()
      return makeIAppointmentStoreChangeTracker(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStoreChangeTracker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1030879685_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStoreChangeTracker):
        Array<IAppointmentStoreChangeTracker?> = (elements as
        Array<IAppointmentStoreChangeTracker?>).castToImpl<IAppointmentStoreChangeTracker,IAppointmentStoreChangeTracker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStoreChangeTracker?> =
        arrayOfNulls<IAppointmentStoreChangeTracker_Impl>(size) as
        Array<IAppointmentStoreChangeTracker?>
  }
}
