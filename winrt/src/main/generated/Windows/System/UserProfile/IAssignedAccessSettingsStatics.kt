package Windows.System.UserProfile

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

@ABIMarker(IAssignedAccessSettingsStatics.ABI::class)
@Signature("{34a81d0d-8a29-5ef3-a7be-618e6ac3bd01}")
@Guid("34a81d0d8a295ef3a7be618e6ac3bd01")
@WinRTInterface("34a81d0d8a295ef3a7be618e6ac3bd01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAssignedAccessSettingsStatics.ByReference::class)
public interface IAssignedAccessSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): AssignedAccessSettings?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): AssignedAccessSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAssignedAccessSettingsStatics> {
    public override fun getValue() = ABI.makeIAssignedAccessSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IAssignedAccessSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAssignedAccessSettingsStatics {
    public val __744729295_Ptr: Pointer?

    public val _744729295_VtblPtr: Pointer?
      get() = __744729295_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): AssignedAccessSettings? {
      val fnPtr = _744729295_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AssignedAccessSettings>()
      val hr = fn.invokeHR(arrayOf(__744729295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AssignedAccessSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): AssignedAccessSettings? {
      val fnPtr = _744729295_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AssignedAccessSettings>()
      val hr = fn.invokeHR(arrayOf(__744729295_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AssignedAccessSettings>(result.getValue())
      return resultValue
    }
  }

  public class IAssignedAccessSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __744729295_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAssignedAccessSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34a81d0d8a295ef3a7be618e6ac3bd01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAssignedAccessSettingsStatics(ptr: Pointer?): WithDefault =
        IAssignedAccessSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAssignedAccessSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIAssignedAccessSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IAssignedAccessSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__744729295_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAssignedAccessSettingsStatics):
        Array<IAssignedAccessSettingsStatics?> = (elements as
        Array<IAssignedAccessSettingsStatics?>).castToImpl<IAssignedAccessSettingsStatics,IAssignedAccessSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAssignedAccessSettingsStatics?> =
        arrayOfNulls<IAssignedAccessSettingsStatics_Impl>(size) as
        Array<IAssignedAccessSettingsStatics?>
  }
}
