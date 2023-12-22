package Windows.Phone.Management.Deployment

import Windows.Management.Deployment.PackageInstallState
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

@ABIMarker(IPackageInstallResult.ABI::class)
@Signature("{33e8eed5-0f7e-4473-967c-7d6e1c0e7de1}")
@Guid("33e8eed50f7e4473967c7d6e1c0e7de1")
@WinRTInterface("33e8eed50f7e4473967c7d6e1c0e7de1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageInstallResult.ByReference::class)
public interface IPackageInstallResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProductId(): String?

  @InterfaceMethod(1)
  public fun get_InstallState(): PackageInstallState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageInstallResult> {
    public override fun getValue() = ABI.makeIPackageInstallResult(pointer.getPointer(0))

    public fun setValue(value: IPackageInstallResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageInstallResult {
    public val __20966998_Ptr: Pointer?

    public val _20966998_VtblPtr: Pointer?
      get() = __20966998_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProductId(): String? {
      val fnPtr = _20966998_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__20966998_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InstallState(): PackageInstallState? {
      val fnPtr = _20966998_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageInstallState>()
      val hr = fn.invokeHR(arrayOf(__20966998_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageInstallState>(result.getValue())
      return resultValue
    }
  }

  public class IPackageInstallResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __20966998_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageInstallResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33e8eed50f7e4473967c7d6e1c0e7de1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageInstallResult(ptr: Pointer?): WithDefault =
        IPackageInstallResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageInstallResult {
      val address = segment.toRawLongValue()
      return makeIPackageInstallResult(Pointer(address))
    }

    public override fun toNative(obj: IPackageInstallResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__20966998_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageInstallResult): Array<IPackageInstallResult?> =
        (elements as
        Array<IPackageInstallResult?>).castToImpl<IPackageInstallResult,IPackageInstallResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageInstallResult?> =
        arrayOfNulls<IPackageInstallResult_Impl>(size) as Array<IPackageInstallResult?>
  }
}
