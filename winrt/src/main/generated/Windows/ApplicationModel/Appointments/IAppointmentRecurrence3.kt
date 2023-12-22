package Windows.ApplicationModel.Appointments

import Windows.ApplicationModel.Appointments.IAppointmentRecurrence2.ABI.IID
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

@ABIMarker(IAppointmentRecurrence3.ABI::class)
@Signature("{89ff96d9-da4d-4a17-8dd2-1cebc2b5ff9d}")
@Guid("89ff96d9da4d4a178dd21cebc2b5ff9d")
@WinRTInterface("89ff96d9da4d4a178dd21cebc2b5ff9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentRecurrence3.ByReference::class)
public interface IAppointmentRecurrence3 : NativeMapped, IWinRTInterface, IAppointmentRecurrence2,
    IAppointmentRecurrence {
  @InterfaceMethod(0)
  public fun get_CalendarIdentifier(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentRecurrence3> {
    public override fun getValue() = ABI.makeIAppointmentRecurrence3(pointer.getPointer(0))

    public fun setValue(value: IAppointmentRecurrence3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentRecurrence3, IAppointmentRecurrence2.WithDefault,
      IAppointmentRecurrence.WithDefault {
    public val __590997169_Ptr: Pointer?

    public val _590997169_VtblPtr: Pointer?
      get() = __590997169_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CalendarIdentifier(): String? {
      val fnPtr = _590997169_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__590997169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentRecurrence3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAppointmentRecurrence2,
      IAppointmentRecurrence {
    public override val __590997170_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_590997169_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1681632412_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IAppointmentRecurrence.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_590997169_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __590997169_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentRecurrence3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("89ff96d9da4d4a178dd21cebc2b5ff9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentRecurrence3(ptr: Pointer?): WithDefault =
        IAppointmentRecurrence3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentRecurrence3 {
      val address = segment.toRawLongValue()
      return makeIAppointmentRecurrence3(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentRecurrence3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__590997169_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentRecurrence3): Array<IAppointmentRecurrence3?>
        = (elements as
        Array<IAppointmentRecurrence3?>).castToImpl<IAppointmentRecurrence3,IAppointmentRecurrence3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentRecurrence3?> =
        arrayOfNulls<IAppointmentRecurrence3_Impl>(size) as Array<IAppointmentRecurrence3?>
  }
}
