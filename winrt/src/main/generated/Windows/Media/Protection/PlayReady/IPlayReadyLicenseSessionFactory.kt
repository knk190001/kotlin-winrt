package Windows.Media.Protection.PlayReady

import Windows.Foundation.Collections.IPropertySet
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

@ABIMarker(IPlayReadyLicenseSessionFactory.ABI::class)
@Signature("{62492699-6527-429e-98be-48d798ac2739}")
@Guid("624926996527429e98be48d798ac2739")
@WinRTInterface("624926996527429e98be48d798ac2739")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyLicenseSessionFactory.ByReference::class)
public interface IPlayReadyLicenseSessionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(configuration: IPropertySet?): PlayReadyLicenseSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyLicenseSessionFactory> {
    public override fun getValue() = ABI.makeIPlayReadyLicenseSessionFactory(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyLicenseSessionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyLicenseSessionFactory {
    public val __226793184_Ptr: Pointer?

    public val _226793184_VtblPtr: Pointer?
      get() = __226793184_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(configuration: IPropertySet?): PlayReadyLicenseSession? {
      val fnPtr = _226793184_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyLicenseSession>()
      val hr = fn.invokeHR(arrayOf(__226793184_Ptr, marshalToNative(configuration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyLicenseSession>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyLicenseSessionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __226793184_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyLicenseSessionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("624926996527429e98be48d798ac2739")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyLicenseSessionFactory(ptr: Pointer?): WithDefault =
        IPlayReadyLicenseSessionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyLicenseSessionFactory {
      val address = segment.toRawLongValue()
      return makeIPlayReadyLicenseSessionFactory(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyLicenseSessionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__226793184_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyLicenseSessionFactory):
        Array<IPlayReadyLicenseSessionFactory?> = (elements as
        Array<IPlayReadyLicenseSessionFactory?>).castToImpl<IPlayReadyLicenseSessionFactory,IPlayReadyLicenseSessionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyLicenseSessionFactory?> =
        arrayOfNulls<IPlayReadyLicenseSessionFactory_Impl>(size) as
        Array<IPlayReadyLicenseSessionFactory?>
  }
}
