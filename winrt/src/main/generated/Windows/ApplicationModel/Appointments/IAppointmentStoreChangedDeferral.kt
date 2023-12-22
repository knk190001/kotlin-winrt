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

@ABIMarker(IAppointmentStoreChangedDeferral.ABI::class)
@Signature("{4cb82026-fedb-4bc3-9662-95a9befdf4df}")
@Guid("4cb82026fedb4bc3966295a9befdf4df")
@WinRTInterface("4cb82026fedb4bc3966295a9befdf4df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStoreChangedDeferral.ByReference::class)
public interface IAppointmentStoreChangedDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStoreChangedDeferral> {
    public override fun getValue() = ABI.makeIAppointmentStoreChangedDeferral(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStoreChangedDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStoreChangedDeferral {
    public val __916512174_Ptr: Pointer?

    public val _916512174_VtblPtr: Pointer?
      get() = __916512174_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _916512174_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__916512174_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppointmentStoreChangedDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __916512174_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStoreChangedDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4cb82026fedb4bc3966295a9befdf4df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStoreChangedDeferral(ptr: Pointer?): WithDefault =
        IAppointmentStoreChangedDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentStoreChangedDeferral {
      val address = segment.toRawLongValue()
      return makeIAppointmentStoreChangedDeferral(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStoreChangedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__916512174_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStoreChangedDeferral):
        Array<IAppointmentStoreChangedDeferral?> = (elements as
        Array<IAppointmentStoreChangedDeferral?>).castToImpl<IAppointmentStoreChangedDeferral,IAppointmentStoreChangedDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStoreChangedDeferral?> =
        arrayOfNulls<IAppointmentStoreChangedDeferral_Impl>(size) as
        Array<IAppointmentStoreChangedDeferral?>
  }
}
