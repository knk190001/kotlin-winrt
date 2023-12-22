package Windows.Management.Deployment.Preview

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

@ABIMarker(IClassicAppManagerStatics.ABI::class)
@Signature("{e2fad668-882c-4f33-b035-0df7b90d67e6}")
@Guid("e2fad668882c4f33b0350df7b90d67e6")
@WinRTInterface("e2fad668882c4f33b0350df7b90d67e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClassicAppManagerStatics.ByReference::class)
public interface IClassicAppManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindInstalledApp(appUninstallKey: String?): InstalledClassicAppInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClassicAppManagerStatics> {
    public override fun getValue() = ABI.makeIClassicAppManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IClassicAppManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClassicAppManagerStatics {
    public val __576799503_Ptr: Pointer?

    public val _576799503_VtblPtr: Pointer?
      get() = __576799503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindInstalledApp(appUninstallKey: String?): InstalledClassicAppInfo? {
      val fnPtr = _576799503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InstalledClassicAppInfo>()
      val hr = fn.invokeHR(arrayOf(__576799503_Ptr, marshalToNative(appUninstallKey), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InstalledClassicAppInfo>(result.getValue())
      return resultValue
    }
  }

  public class IClassicAppManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __576799503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClassicAppManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e2fad668882c4f33b0350df7b90d67e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClassicAppManagerStatics(ptr: Pointer?): WithDefault =
        IClassicAppManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClassicAppManagerStatics {
      val address = segment.toRawLongValue()
      return makeIClassicAppManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IClassicAppManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__576799503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClassicAppManagerStatics):
        Array<IClassicAppManagerStatics?> = (elements as
        Array<IClassicAppManagerStatics?>).castToImpl<IClassicAppManagerStatics,IClassicAppManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClassicAppManagerStatics?> =
        arrayOfNulls<IClassicAppManagerStatics_Impl>(size) as Array<IClassicAppManagerStatics?>
  }
}
