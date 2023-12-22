package Windows.Management.Deployment

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

@ABIMarker(IPackageUserInformation.ABI::class)
@Signature("{f6383423-fa09-4cbc-9055-15ca275e2e7e}")
@Guid("f6383423fa094cbc905515ca275e2e7e")
@WinRTInterface("f6383423fa094cbc905515ca275e2e7e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageUserInformation.ByReference::class)
public interface IPackageUserInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UserSecurityId(): String?

  @InterfaceMethod(1)
  public fun get_InstallState(): PackageInstallState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageUserInformation> {
    public override fun getValue() = ABI.makeIPackageUserInformation(pointer.getPointer(0))

    public fun setValue(value: IPackageUserInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageUserInformation {
    public val __1318875455_Ptr: Pointer?

    public val _1318875455_VtblPtr: Pointer?
      get() = __1318875455_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UserSecurityId(): String? {
      val fnPtr = _1318875455_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1318875455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InstallState(): PackageInstallState? {
      val fnPtr = _1318875455_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageInstallState>()
      val hr = fn.invokeHR(arrayOf(__1318875455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageInstallState>(result.getValue())
      return resultValue
    }
  }

  public class IPackageUserInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1318875455_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageUserInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6383423fa094cbc905515ca275e2e7e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageUserInformation(ptr: Pointer?): WithDefault =
        IPackageUserInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageUserInformation {
      val address = segment.toRawLongValue()
      return makeIPackageUserInformation(Pointer(address))
    }

    public override fun toNative(obj: IPackageUserInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1318875455_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageUserInformation): Array<IPackageUserInformation?>
        = (elements as
        Array<IPackageUserInformation?>).castToImpl<IPackageUserInformation,IPackageUserInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageUserInformation?> =
        arrayOfNulls<IPackageUserInformation_Impl>(size) as Array<IPackageUserInformation?>
  }
}
