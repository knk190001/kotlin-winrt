package Windows.ApplicationModel.Appointments

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentException.ABI::class)
@Signature("{a2076767-16f6-4bce-9f5a-8600b8019fcb}")
@Guid("a207676716f64bce9f5a8600b8019fcb")
@WinRTInterface("a207676716f64bce9f5a8600b8019fcb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentException.ByReference::class)
public interface IAppointmentException : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Appointment(): Appointment?

  @InterfaceMethod(1)
  public fun get_ExceptionProperties(): IVectorView<String?>?

  @InterfaceMethod(2)
  public fun get_IsDeleted(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentException> {
    public override fun getValue() = ABI.makeIAppointmentException(pointer.getPointer(0))

    public fun setValue(value: IAppointmentException_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentException {
    public val __708197989_Ptr: Pointer?

    public val _708197989_VtblPtr: Pointer?
      get() = __708197989_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Appointment(): Appointment? {
      val fnPtr = _708197989_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Appointment>()
      val hr = fn.invokeHR(arrayOf(__708197989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Appointment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExceptionProperties(): IVectorView<String?>? {
      val fnPtr = _708197989_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__708197989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsDeleted(): Boolean {
      val fnPtr = _708197989_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__708197989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppointmentException_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __708197989_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentException, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a207676716f64bce9f5a8600b8019fcb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentException(ptr: Pointer?): WithDefault =
        IAppointmentException_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentException {
      val address = segment.toRawLongValue()
      return makeIAppointmentException(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentException): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__708197989_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentException): Array<IAppointmentException?> =
        (elements as
        Array<IAppointmentException?>).castToImpl<IAppointmentException,IAppointmentException_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentException?> =
        arrayOfNulls<IAppointmentException_Impl>(size) as Array<IAppointmentException?>
  }
}
