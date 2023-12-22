package Windows.ApplicationModel.AppExtensions

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

@ABIMarker(IAppExtensionCatalogStatics.ABI::class)
@Signature("{3c36668a-5f18-4f0b-9ce5-cab61d196f11}")
@Guid("3c36668a5f184f0b9ce5cab61d196f11")
@WinRTInterface("3c36668a5f184f0b9ce5cab61d196f11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppExtensionCatalogStatics.ByReference::class)
public interface IAppExtensionCatalogStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Open(appExtensionName: String?): AppExtensionCatalog?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppExtensionCatalogStatics> {
    public override fun getValue() = ABI.makeIAppExtensionCatalogStatics(pointer.getPointer(0))

    public fun setValue(value: IAppExtensionCatalogStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppExtensionCatalogStatics {
    public val __1133296616_Ptr: Pointer?

    public val _1133296616_VtblPtr: Pointer?
      get() = __1133296616_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Open(appExtensionName: String?): AppExtensionCatalog? {
      val fnPtr = _1133296616_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppExtensionCatalog>()
      val hr = fn.invokeHR(arrayOf(__1133296616_Ptr, marshalToNative(appExtensionName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppExtensionCatalog>(result.getValue())
      return resultValue
    }
  }

  public class IAppExtensionCatalogStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1133296616_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppExtensionCatalogStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c36668a5f184f0b9ce5cab61d196f11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppExtensionCatalogStatics(ptr: Pointer?): WithDefault =
        IAppExtensionCatalogStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppExtensionCatalogStatics {
      val address = segment.toRawLongValue()
      return makeIAppExtensionCatalogStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppExtensionCatalogStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1133296616_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppExtensionCatalogStatics):
        Array<IAppExtensionCatalogStatics?> = (elements as
        Array<IAppExtensionCatalogStatics?>).castToImpl<IAppExtensionCatalogStatics,IAppExtensionCatalogStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppExtensionCatalogStatics?> =
        arrayOfNulls<IAppExtensionCatalogStatics_Impl>(size) as Array<IAppExtensionCatalogStatics?>
  }
}
