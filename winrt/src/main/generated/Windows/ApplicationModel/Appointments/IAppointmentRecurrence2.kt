package Windows.ApplicationModel.Appointments

import Windows.ApplicationModel.Appointments.IAppointmentRecurrence.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentRecurrence2.ABI::class)
@Signature("{3df3a2e0-05a7-4f50-9f86-b03f9436254d}")
@Guid("3df3a2e005a74f509f86b03f9436254d")
@WinRTInterface("3df3a2e005a74f509f86b03f9436254d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentRecurrence2.ByReference::class)
public interface IAppointmentRecurrence2 : NativeMapped, IWinRTInterface, IAppointmentRecurrence {
  @InterfaceMethod(0)
  public fun get_RecurrenceType(): RecurrenceType?

  @InterfaceMethod(1)
  public fun get_TimeZone(): String?

  @InterfaceMethod(2)
  public fun put_TimeZone(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentRecurrence2> {
    public override fun getValue() = ABI.makeIAppointmentRecurrence2(pointer.getPointer(0))

    public fun setValue(value: IAppointmentRecurrence2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentRecurrence2, IAppointmentRecurrence.WithDefault {
    public val __590997170_Ptr: Pointer?

    public val _590997170_VtblPtr: Pointer?
      get() = __590997170_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RecurrenceType(): RecurrenceType? {
      val fnPtr = _590997170_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RecurrenceType>()
      val hr = fn.invokeHR(arrayOf(__590997170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RecurrenceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TimeZone(): String? {
      val fnPtr = _590997170_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__590997170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_TimeZone(value: String?): Unit {
      val fnPtr = _590997170_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__590997170_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppointmentRecurrence2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAppointmentRecurrence {
    public override val __1681632412_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_590997170_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __590997170_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentRecurrence2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3df3a2e005a74f509f86b03f9436254d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentRecurrence2(ptr: Pointer?): WithDefault =
        IAppointmentRecurrence2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentRecurrence2 {
      val address = segment.toRawLongValue()
      return makeIAppointmentRecurrence2(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentRecurrence2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__590997170_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentRecurrence2): Array<IAppointmentRecurrence2?>
        = (elements as
        Array<IAppointmentRecurrence2?>).castToImpl<IAppointmentRecurrence2,IAppointmentRecurrence2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentRecurrence2?> =
        arrayOfNulls<IAppointmentRecurrence2_Impl>(size) as Array<IAppointmentRecurrence2?>
  }
}
