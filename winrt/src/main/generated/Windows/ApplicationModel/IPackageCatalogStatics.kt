package Windows.ApplicationModel

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

@ABIMarker(IPackageCatalogStatics.ABI::class)
@Signature("{a18c9696-e65b-4634-ba21-5e63eb7244a7}")
@Guid("a18c9696e65b4634ba215e63eb7244a7")
@WinRTInterface("a18c9696e65b4634ba215e63eb7244a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageCatalogStatics.ByReference::class)
public interface IPackageCatalogStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenForCurrentPackage(): PackageCatalog?

  @InterfaceMethod(1)
  public fun OpenForCurrentUser(): PackageCatalog?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageCatalogStatics> {
    public override fun getValue() = ABI.makeIPackageCatalogStatics(pointer.getPointer(0))

    public fun setValue(value: IPackageCatalogStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageCatalogStatics {
    public val __145361805_Ptr: Pointer?

    public val _145361805_VtblPtr: Pointer?
      get() = __145361805_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OpenForCurrentPackage(): PackageCatalog? {
      val fnPtr = _145361805_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageCatalog>()
      val hr = fn.invokeHR(arrayOf(__145361805_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageCatalog>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun OpenForCurrentUser(): PackageCatalog? {
      val fnPtr = _145361805_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageCatalog>()
      val hr = fn.invokeHR(arrayOf(__145361805_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageCatalog>(result.getValue())
      return resultValue
    }
  }

  public class IPackageCatalogStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __145361805_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageCatalogStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a18c9696e65b4634ba215e63eb7244a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageCatalogStatics(ptr: Pointer?): WithDefault =
        IPackageCatalogStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageCatalogStatics {
      val address = segment.toRawLongValue()
      return makeIPackageCatalogStatics(Pointer(address))
    }

    public override fun toNative(obj: IPackageCatalogStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__145361805_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageCatalogStatics): Array<IPackageCatalogStatics?> =
        (elements as
        Array<IPackageCatalogStatics?>).castToImpl<IPackageCatalogStatics,IPackageCatalogStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageCatalogStatics?> =
        arrayOfNulls<IPackageCatalogStatics_Impl>(size) as Array<IPackageCatalogStatics?>
  }
}
