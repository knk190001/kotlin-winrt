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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAssignedAccessSettings.ABI::class)
@Signature("{1bc57f1c-e971-5757-b8e0-512f8b8c46d2}")
@Guid("1bc57f1ce9715757b8e0512f8b8c46d2")
@WinRTInterface("1bc57f1ce9715757b8e0512f8b8c46d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAssignedAccessSettings.ByReference::class)
public interface IAssignedAccessSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_IsSingleAppKioskMode(): Boolean

  @InterfaceMethod(2)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAssignedAccessSettings> {
    public override fun getValue() = ABI.makeIAssignedAccessSettings(pointer.getPointer(0))

    public fun setValue(value: IAssignedAccessSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAssignedAccessSettings {
    public val __1012738036_Ptr: Pointer?

    public val _1012738036_VtblPtr: Pointer?
      get() = __1012738036_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1012738036_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1012738036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsSingleAppKioskMode(): Boolean {
      val fnPtr = _1012738036_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1012738036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_User(): User? {
      val fnPtr = _1012738036_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1012738036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IAssignedAccessSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1012738036_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAssignedAccessSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1bc57f1ce9715757b8e0512f8b8c46d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAssignedAccessSettings(ptr: Pointer?): WithDefault =
        IAssignedAccessSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAssignedAccessSettings {
      val address = segment.toRawLongValue()
      return makeIAssignedAccessSettings(Pointer(address))
    }

    public override fun toNative(obj: IAssignedAccessSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1012738036_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAssignedAccessSettings): Array<IAssignedAccessSettings?>
        = (elements as
        Array<IAssignedAccessSettings?>).castToImpl<IAssignedAccessSettings,IAssignedAccessSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAssignedAccessSettings?> =
        arrayOfNulls<IAssignedAccessSettings_Impl>(size) as Array<IAssignedAccessSettings?>
  }
}
