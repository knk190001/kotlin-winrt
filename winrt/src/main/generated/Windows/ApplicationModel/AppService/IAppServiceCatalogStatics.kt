package Windows.ApplicationModel.AppService

import Windows.ApplicationModel.AppInfo
import Windows.Foundation.Collections.IVectorView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppServiceCatalogStatics.ABI::class)
@Signature("{ef0d2507-d132-4c85-8395-3c31d5a1e941}")
@Guid("ef0d2507d1324c8583953c31d5a1e941")
@WinRTInterface("ef0d2507d1324c8583953c31d5a1e941")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceCatalogStatics.ByReference::class)
public interface IAppServiceCatalogStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAppServiceProvidersAsync(appServiceName: String?):
      IAsyncOperation<IVectorView<AppInfo?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceCatalogStatics> {
    public override fun getValue() = ABI.makeIAppServiceCatalogStatics(pointer.getPointer(0))

    public fun setValue(value: IAppServiceCatalogStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceCatalogStatics {
    public val __404517227_Ptr: Pointer?

    public val _404517227_VtblPtr: Pointer?
      get() = __404517227_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAppServiceProvidersAsync(appServiceName: String?):
        IAsyncOperation<IVectorView<AppInfo?>?>? {
      val fnPtr = _404517227_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__404517227_Ptr, marshalToNative(appServiceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInfo?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppServiceCatalogStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __404517227_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceCatalogStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef0d2507d1324c8583953c31d5a1e941")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceCatalogStatics(ptr: Pointer?): WithDefault =
        IAppServiceCatalogStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceCatalogStatics {
      val address = segment.toRawLongValue()
      return makeIAppServiceCatalogStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceCatalogStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__404517227_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceCatalogStatics):
        Array<IAppServiceCatalogStatics?> = (elements as
        Array<IAppServiceCatalogStatics?>).castToImpl<IAppServiceCatalogStatics,IAppServiceCatalogStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceCatalogStatics?> =
        arrayOfNulls<IAppServiceCatalogStatics_Impl>(size) as Array<IAppServiceCatalogStatics?>
  }
}
