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

@ABIMarker(IDiagnosticsSettings.ABI::class)
@Signature("{e5e9eccd-2711-44e0-973c-491d78048d24}")
@Guid("e5e9eccd271144e0973c491d78048d24")
@WinRTInterface("e5e9eccd271144e0973c491d78048d24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDiagnosticsSettings.ByReference::class)
public interface IDiagnosticsSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanUseDiagnosticsToTailorExperiences(): Boolean

  @InterfaceMethod(1)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDiagnosticsSettings> {
    public override fun getValue() = ABI.makeIDiagnosticsSettings(pointer.getPointer(0))

    public fun setValue(value: IDiagnosticsSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDiagnosticsSettings {
    public val __488125808_Ptr: Pointer?

    public val _488125808_VtblPtr: Pointer?
      get() = __488125808_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanUseDiagnosticsToTailorExperiences(): Boolean {
      val fnPtr = _488125808_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__488125808_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_User(): User? {
      val fnPtr = _488125808_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__488125808_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IDiagnosticsSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __488125808_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDiagnosticsSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5e9eccd271144e0973c491d78048d24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDiagnosticsSettings(ptr: Pointer?): WithDefault = IDiagnosticsSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDiagnosticsSettings {
      val address = segment.toRawLongValue()
      return makeIDiagnosticsSettings(Pointer(address))
    }

    public override fun toNative(obj: IDiagnosticsSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__488125808_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDiagnosticsSettings): Array<IDiagnosticsSettings?> =
        (elements as
        Array<IDiagnosticsSettings?>).castToImpl<IDiagnosticsSettings,IDiagnosticsSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDiagnosticsSettings?> =
        arrayOfNulls<IDiagnosticsSettings_Impl>(size) as Array<IDiagnosticsSettings?>
  }
}
