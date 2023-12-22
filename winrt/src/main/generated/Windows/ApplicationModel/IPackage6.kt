package Windows.ApplicationModel

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IPackage6.ABI::class)
@Signature("{8b1ad942-12d7-4754-ae4e-638cbc0e3a2e}")
@Guid("8b1ad94212d74754ae4e638cbc0e3a2e")
@WinRTInterface("8b1ad94212d74754ae4e638cbc0e3a2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackage6.ByReference::class)
public interface IPackage6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAppInstallerInfo(): AppInstallerInfo?

  @InterfaceMethod(1)
  public fun CheckUpdateAvailabilityAsync(): IAsyncOperation<PackageUpdateAvailabilityResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPackage6> {
    public override fun getValue() = ABI.makeIPackage6(pointer.getPointer(0))

    public fun setValue(value: IPackage6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackage6 {
    public val __1252479851_Ptr: Pointer?

    public val _1252479851_VtblPtr: Pointer?
      get() = __1252479851_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAppInstallerInfo(): AppInstallerInfo? {
      val fnPtr = _1252479851_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstallerInfo>()
      val hr = fn.invokeHR(arrayOf(__1252479851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstallerInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CheckUpdateAvailabilityAsync():
        IAsyncOperation<PackageUpdateAvailabilityResult?>? {
      val fnPtr = _1252479851_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PackageUpdateAvailabilityResult?>>()
      val hr = fn.invokeHR(arrayOf(__1252479851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PackageUpdateAvailabilityResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackage6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1252479851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackage6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b1ad94212d74754ae4e638cbc0e3a2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackage6(ptr: Pointer?): WithDefault = IPackage6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackage6 {
      val address = segment.toRawLongValue()
      return makeIPackage6(Pointer(address))
    }

    public override fun toNative(obj: IPackage6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1252479851_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage6): Array<IPackage6?> = (elements as
        Array<IPackage6?>).castToImpl<IPackage6,IPackage6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage6?> = arrayOfNulls<IPackage6_Impl>(size)
        as Array<IPackage6?>
  }
}
