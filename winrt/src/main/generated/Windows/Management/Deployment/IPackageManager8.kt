package Windows.Management.Deployment

import Windows.Foundation.IAsyncOperationWithProgress
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

@ABIMarker(IPackageManager8.ABI::class)
@Signature("{b8575330-1298-4ee2-80ee-7f659c5d2782}")
@Guid("b857533012984ee280ee7f659c5d2782")
@WinRTInterface("b857533012984ee280ee7f659c5d2782")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageManager8.ByReference::class)
public interface IPackageManager8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DeprovisionPackageForAllUsersAsync(packageFamilyName: String?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageManager8> {
    public override fun getValue() = ABI.makeIPackageManager8(pointer.getPointer(0))

    public fun setValue(value: IPackageManager8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageManager8 {
    public val __438863629_Ptr: Pointer?

    public val _438863629_VtblPtr: Pointer?
      get() = __438863629_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DeprovisionPackageForAllUsersAsync(packageFamilyName: String?):
        IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863629_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863629_Ptr, marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageManager8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438863629_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageManager8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b857533012984ee280ee7f659c5d2782")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageManager8(ptr: Pointer?): WithDefault = IPackageManager8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageManager8 {
      val address = segment.toRawLongValue()
      return makeIPackageManager8(Pointer(address))
    }

    public override fun toNative(obj: IPackageManager8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438863629_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageManager8): Array<IPackageManager8?> = (elements as
        Array<IPackageManager8?>).castToImpl<IPackageManager8,IPackageManager8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageManager8?> =
        arrayOfNulls<IPackageManager8_Impl>(size) as Array<IPackageManager8?>
  }
}
