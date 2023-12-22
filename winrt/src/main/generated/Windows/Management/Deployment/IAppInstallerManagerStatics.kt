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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppInstallerManagerStatics.ABI::class)
@Signature("{c95a6ed5-fc59-5336-9b2e-2b07c5e61434}")
@Guid("c95a6ed5fc5953369b2e2b07c5e61434")
@WinRTInterface("c95a6ed5fc5953369b2e2b07c5e61434")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallerManagerStatics.ByReference::class)
public interface IAppInstallerManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): AppInstallerManager?

  @InterfaceMethod(1)
  public fun GetForSystem(): AppInstallerManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallerManagerStatics> {
    public override fun getValue() = ABI.makeIAppInstallerManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAppInstallerManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallerManagerStatics {
    public val __1789486499_Ptr: Pointer?

    public val _1789486499_VtblPtr: Pointer?
      get() = __1789486499_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): AppInstallerManager? {
      val fnPtr = _1789486499_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstallerManager>()
      val hr = fn.invokeHR(arrayOf(__1789486499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstallerManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForSystem(): AppInstallerManager? {
      val fnPtr = _1789486499_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstallerManager>()
      val hr = fn.invokeHR(arrayOf(__1789486499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstallerManager>(result.getValue())
      return resultValue
    }
  }

  public class IAppInstallerManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1789486499_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallerManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c95a6ed5fc5953369b2e2b07c5e61434")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallerManagerStatics(ptr: Pointer?): WithDefault =
        IAppInstallerManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallerManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAppInstallerManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallerManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1789486499_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallerManagerStatics):
        Array<IAppInstallerManagerStatics?> = (elements as
        Array<IAppInstallerManagerStatics?>).castToImpl<IAppInstallerManagerStatics,IAppInstallerManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallerManagerStatics?> =
        arrayOfNulls<IAppInstallerManagerStatics_Impl>(size) as Array<IAppInstallerManagerStatics?>
  }
}
