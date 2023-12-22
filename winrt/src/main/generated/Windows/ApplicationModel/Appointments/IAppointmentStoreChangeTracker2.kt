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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentStoreChangeTracker2.ABI::class)
@Signature("{b66aaf45-9542-4cf7-8550-eb370e0c08d3}")
@Guid("b66aaf4595424cf78550eb370e0c08d3")
@WinRTInterface("b66aaf4595424cf78550eb370e0c08d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStoreChangeTracker2.ByReference::class)
public interface IAppointmentStoreChangeTracker2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTracking(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStoreChangeTracker2> {
    public override fun getValue() = ABI.makeIAppointmentStoreChangeTracker2(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStoreChangeTracker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStoreChangeTracker2 {
    public val __1892499113_Ptr: Pointer?

    public val _1892499113_VtblPtr: Pointer?
      get() = __1892499113_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTracking(): Boolean {
      val fnPtr = _1892499113_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1892499113_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppointmentStoreChangeTracker2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1892499113_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStoreChangeTracker2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b66aaf4595424cf78550eb370e0c08d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStoreChangeTracker2(ptr: Pointer?): WithDefault =
        IAppointmentStoreChangeTracker2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentStoreChangeTracker2 {
      val address = segment.toRawLongValue()
      return makeIAppointmentStoreChangeTracker2(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStoreChangeTracker2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1892499113_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStoreChangeTracker2):
        Array<IAppointmentStoreChangeTracker2?> = (elements as
        Array<IAppointmentStoreChangeTracker2?>).castToImpl<IAppointmentStoreChangeTracker2,IAppointmentStoreChangeTracker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStoreChangeTracker2?> =
        arrayOfNulls<IAppointmentStoreChangeTracker2_Impl>(size) as
        Array<IAppointmentStoreChangeTracker2?>
  }
}
