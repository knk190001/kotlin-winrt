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

@ABIMarker(ISharedPackageContainerManagerStatics.ABI::class)
@Signature("{2ef56348-838a-5f55-a89e-1198a2c627e6}")
@Guid("2ef56348838a5f55a89e1198a2c627e6")
@WinRTInterface("2ef56348838a5f55a89e1198a2c627e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISharedPackageContainerManagerStatics.ByReference::class)
public interface ISharedPackageContainerManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): SharedPackageContainerManager?

  @InterfaceMethod(1)
  public fun GetForUser(userSid: String?): SharedPackageContainerManager?

  @InterfaceMethod(2)
  public fun GetForProvisioning(): SharedPackageContainerManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISharedPackageContainerManagerStatics> {
    public override fun getValue() =
        ABI.makeISharedPackageContainerManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ISharedPackageContainerManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISharedPackageContainerManagerStatics {
    public val __188185636_Ptr: Pointer?

    public val _188185636_VtblPtr: Pointer?
      get() = __188185636_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): SharedPackageContainerManager? {
      val fnPtr = _188185636_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SharedPackageContainerManager>()
      val hr = fn.invokeHR(arrayOf(__188185636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SharedPackageContainerManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(userSid: String?): SharedPackageContainerManager? {
      val fnPtr = _188185636_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SharedPackageContainerManager>()
      val hr = fn.invokeHR(arrayOf(__188185636_Ptr, marshalToNative(userSid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SharedPackageContainerManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetForProvisioning(): SharedPackageContainerManager? {
      val fnPtr = _188185636_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SharedPackageContainerManager>()
      val hr = fn.invokeHR(arrayOf(__188185636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SharedPackageContainerManager>(result.getValue())
      return resultValue
    }
  }

  public class ISharedPackageContainerManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __188185636_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISharedPackageContainerManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ef56348838a5f55a89e1198a2c627e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISharedPackageContainerManagerStatics(ptr: Pointer?): WithDefault =
        ISharedPackageContainerManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISharedPackageContainerManagerStatics {
      val address = segment.toRawLongValue()
      return makeISharedPackageContainerManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ISharedPackageContainerManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__188185636_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISharedPackageContainerManagerStatics):
        Array<ISharedPackageContainerManagerStatics?> = (elements as
        Array<ISharedPackageContainerManagerStatics?>).castToImpl<ISharedPackageContainerManagerStatics,ISharedPackageContainerManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISharedPackageContainerManagerStatics?> =
        arrayOfNulls<ISharedPackageContainerManagerStatics_Impl>(size) as
        Array<ISharedPackageContainerManagerStatics?>
  }
}
