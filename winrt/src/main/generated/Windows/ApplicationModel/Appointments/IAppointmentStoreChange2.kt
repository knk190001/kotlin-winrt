package Windows.ApplicationModel.Appointments

import Windows.ApplicationModel.Appointments.IAppointmentStoreChange.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IAppointmentStoreChange2.ABI::class)
@Signature("{b37d0dce-5211-4402-a608-a96fe70b8ee2}")
@Guid("b37d0dce52114402a608a96fe70b8ee2")
@WinRTInterface("b37d0dce52114402a608a96fe70b8ee2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStoreChange2.ByReference::class)
public interface IAppointmentStoreChange2 : NativeMapped, IWinRTInterface, IAppointmentStoreChange {
  @InterfaceMethod(0)
  public fun get_AppointmentCalendar(): AppointmentCalendar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStoreChange2> {
    public override fun getValue() = ABI.makeIAppointmentStoreChange2(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStoreChange2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStoreChange2, IAppointmentStoreChange.WithDefault {
    public val __997289365_Ptr: Pointer?

    public val _997289365_VtblPtr: Pointer?
      get() = __997289365_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppointmentCalendar(): AppointmentCalendar? {
      val fnPtr = _997289365_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentCalendar>()
      val hr = fn.invokeHR(arrayOf(__997289365_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentCalendar>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentStoreChange2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAppointmentStoreChange {
    public override val __2110380605_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_997289365_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __997289365_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStoreChange2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b37d0dce52114402a608a96fe70b8ee2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStoreChange2(ptr: Pointer?): WithDefault =
        IAppointmentStoreChange2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentStoreChange2 {
      val address = segment.toRawLongValue()
      return makeIAppointmentStoreChange2(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStoreChange2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__997289365_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStoreChange2):
        Array<IAppointmentStoreChange2?> = (elements as
        Array<IAppointmentStoreChange2?>).castToImpl<IAppointmentStoreChange2,IAppointmentStoreChange2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStoreChange2?> =
        arrayOfNulls<IAppointmentStoreChange2_Impl>(size) as Array<IAppointmentStoreChange2?>
  }
}
