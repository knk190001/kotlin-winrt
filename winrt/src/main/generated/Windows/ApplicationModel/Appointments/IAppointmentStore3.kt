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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentStore3.ABI::class)
@Signature("{4251940b-b078-470a-9a40-c2e01761f72f}")
@Guid("4251940bb078470a9a40c2e01761f72f")
@WinRTInterface("4251940bb078470a9a40c2e01761f72f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStore3.ByReference::class)
public interface IAppointmentStore3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetChangeTracker(identity: String?): AppointmentStoreChangeTracker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStore3> {
    public override fun getValue() = ABI.makeIAppointmentStore3(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStore3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStore3 {
    public val __1799656870_Ptr: Pointer?

    public val _1799656870_VtblPtr: Pointer?
      get() = __1799656870_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetChangeTracker(identity: String?): AppointmentStoreChangeTracker? {
      val fnPtr = _1799656870_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentStoreChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__1799656870_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentStoreChangeTracker>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentStore3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1799656870_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStore3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4251940bb078470a9a40c2e01761f72f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStore3(ptr: Pointer?): WithDefault = IAppointmentStore3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentStore3 {
      val address = segment.toRawLongValue()
      return makeIAppointmentStore3(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStore3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1799656870_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStore3): Array<IAppointmentStore3?> =
        (elements as
        Array<IAppointmentStore3?>).castToImpl<IAppointmentStore3,IAppointmentStore3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStore3?> =
        arrayOfNulls<IAppointmentStore3_Impl>(size) as Array<IAppointmentStore3?>
  }
}
