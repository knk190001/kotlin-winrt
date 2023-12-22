package Windows.Phone.Management.Deployment

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackageInstallResult2.ABI::class)
@Signature("{7149d909-3ff9-41ed-a717-2bc65ffc61d2}")
@Guid("7149d9093ff941eda7172bc65ffc61d2")
@WinRTInterface("7149d9093ff941eda7172bc65ffc61d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageInstallResult2.ByReference::class)
public interface IPackageInstallResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ErrorText(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageInstallResult2> {
    public override fun getValue() = ABI.makeIPackageInstallResult2(pointer.getPointer(0))

    public fun setValue(value: IPackageInstallResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageInstallResult2 {
    public val __649976988_Ptr: Pointer?

    public val _649976988_VtblPtr: Pointer?
      get() = __649976988_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ErrorText(): String? {
      val fnPtr = _649976988_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__649976988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPackageInstallResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __649976988_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageInstallResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7149d9093ff941eda7172bc65ffc61d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageInstallResult2(ptr: Pointer?): WithDefault =
        IPackageInstallResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageInstallResult2 {
      val address = segment.toRawLongValue()
      return makeIPackageInstallResult2(Pointer(address))
    }

    public override fun toNative(obj: IPackageInstallResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__649976988_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageInstallResult2): Array<IPackageInstallResult2?> =
        (elements as
        Array<IPackageInstallResult2?>).castToImpl<IPackageInstallResult2,IPackageInstallResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageInstallResult2?> =
        arrayOfNulls<IPackageInstallResult2_Impl>(size) as Array<IPackageInstallResult2?>
  }
}
