package Windows.ApplicationModel.Appointments

import Windows.System.User
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

@ABIMarker(IAppointmentManagerStatics3.ABI::class)
@Signature("{2f9ae09c-b34c-4dc7-a35d-cafd88ae3ec6}")
@Guid("2f9ae09cb34c4dc7a35dcafd88ae3ec6")
@WinRTInterface("2f9ae09cb34c4dc7a35dcafd88ae3ec6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentManagerStatics3.ByReference::class)
public interface IAppointmentManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUser(user: User?): AppointmentManagerForUser?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentManagerStatics3> {
    public override fun getValue() = ABI.makeIAppointmentManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IAppointmentManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentManagerStatics3 {
    public val __282212391_Ptr: Pointer?

    public val _282212391_VtblPtr: Pointer?
      get() = __282212391_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUser(user: User?): AppointmentManagerForUser? {
      val fnPtr = _282212391_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentManagerForUser>()
      val hr = fn.invokeHR(arrayOf(__282212391_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentManagerForUser>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __282212391_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f9ae09cb34c4dc7a35dcafd88ae3ec6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentManagerStatics3(ptr: Pointer?): WithDefault =
        IAppointmentManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIAppointmentManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__282212391_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentManagerStatics3):
        Array<IAppointmentManagerStatics3?> = (elements as
        Array<IAppointmentManagerStatics3?>).castToImpl<IAppointmentManagerStatics3,IAppointmentManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentManagerStatics3?> =
        arrayOfNulls<IAppointmentManagerStatics3_Impl>(size) as Array<IAppointmentManagerStatics3?>
  }
}
