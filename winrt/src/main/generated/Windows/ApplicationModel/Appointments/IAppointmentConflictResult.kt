package Windows.ApplicationModel.Appointments

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

@ABIMarker(IAppointmentConflictResult.ABI::class)
@Signature("{d5cdf0be-2f2f-3b7d-af0a-a7e20f3a46e3}")
@Guid("d5cdf0be2f2f3b7daf0aa7e20f3a46e3")
@WinRTInterface("d5cdf0be2f2f3b7daf0aa7e20f3a46e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentConflictResult.ByReference::class)
public interface IAppointmentConflictResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): AppointmentConflictType?

  @InterfaceMethod(1)
  public fun get_Date(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentConflictResult> {
    public override fun getValue() = ABI.makeIAppointmentConflictResult(pointer.getPointer(0))

    public fun setValue(value: IAppointmentConflictResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentConflictResult {
    public val __1040893757_Ptr: Pointer?

    public val _1040893757_VtblPtr: Pointer?
      get() = __1040893757_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): AppointmentConflictType? {
      val fnPtr = _1040893757_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentConflictType>()
      val hr = fn.invokeHR(arrayOf(__1040893757_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentConflictType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Date(): DateTime? {
      val fnPtr = _1040893757_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1040893757_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentConflictResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1040893757_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentConflictResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5cdf0be2f2f3b7daf0aa7e20f3a46e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentConflictResult(ptr: Pointer?): WithDefault =
        IAppointmentConflictResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentConflictResult {
      val address = segment.toRawLongValue()
      return makeIAppointmentConflictResult(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentConflictResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1040893757_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentConflictResult):
        Array<IAppointmentConflictResult?> = (elements as
        Array<IAppointmentConflictResult?>).castToImpl<IAppointmentConflictResult,IAppointmentConflictResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentConflictResult?> =
        arrayOfNulls<IAppointmentConflictResult_Impl>(size) as Array<IAppointmentConflictResult?>
  }
}
