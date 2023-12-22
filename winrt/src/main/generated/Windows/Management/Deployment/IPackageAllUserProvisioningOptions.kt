package Windows.Management.Deployment

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IPackageAllUserProvisioningOptions.ABI::class)
@Signature("{da35aa22-1de0-5d3e-99ff-d24f3118bf5e}")
@Guid("da35aa221de05d3e99ffd24f3118bf5e")
@WinRTInterface("da35aa221de05d3e99ffd24f3118bf5e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageAllUserProvisioningOptions.ByReference::class)
public interface IPackageAllUserProvisioningOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OptionalPackageFamilyNames(): IVector<String?>?

  @InterfaceMethod(1)
  public fun get_ProjectionOrderPackageFamilyNames(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageAllUserProvisioningOptions> {
    public override fun getValue() =
        ABI.makeIPackageAllUserProvisioningOptions(pointer.getPointer(0))

    public fun setValue(value: IPackageAllUserProvisioningOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageAllUserProvisioningOptions {
    public val __1534486873_Ptr: Pointer?

    public val _1534486873_VtblPtr: Pointer?
      get() = __1534486873_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OptionalPackageFamilyNames(): IVector<String?>? {
      val fnPtr = _1534486873_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1534486873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProjectionOrderPackageFamilyNames(): IVector<String?>? {
      val fnPtr = _1534486873_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1534486873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageAllUserProvisioningOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1534486873_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageAllUserProvisioningOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da35aa221de05d3e99ffd24f3118bf5e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageAllUserProvisioningOptions(ptr: Pointer?): WithDefault =
        IPackageAllUserProvisioningOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageAllUserProvisioningOptions {
      val address = segment.toRawLongValue()
      return makeIPackageAllUserProvisioningOptions(Pointer(address))
    }

    public override fun toNative(obj: IPackageAllUserProvisioningOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1534486873_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageAllUserProvisioningOptions):
        Array<IPackageAllUserProvisioningOptions?> = (elements as
        Array<IPackageAllUserProvisioningOptions?>).castToImpl<IPackageAllUserProvisioningOptions,IPackageAllUserProvisioningOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageAllUserProvisioningOptions?> =
        arrayOfNulls<IPackageAllUserProvisioningOptions_Impl>(size) as
        Array<IPackageAllUserProvisioningOptions?>
  }
}
