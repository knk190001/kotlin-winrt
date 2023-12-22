package Windows.UI.Xaml.Resources

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ICustomXamlResourceLoaderOverrides.ABI::class)
@Signature("{f851e991-af02-46e8-9af8-427b7ebfe9f8}")
@Guid("f851e991af0246e89af8427b7ebfe9f8")
@WinRTInterface("f851e991af0246e89af8427b7ebfe9f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomXamlResourceLoaderOverrides.ByReference::class)
public interface ICustomXamlResourceLoaderOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetResource(
    resourceId: String?,
    objectType: String?,
    propertyName: String?,
    propertyType: String?
  ): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomXamlResourceLoaderOverrides> {
    public override fun getValue() =
        ABI.makeICustomXamlResourceLoaderOverrides(pointer.getPointer(0))

    public fun setValue(value: ICustomXamlResourceLoaderOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomXamlResourceLoaderOverrides {
    public val __340117202_Ptr: Pointer?

    public val _340117202_VtblPtr: Pointer?
      get() = __340117202_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetResource(
      resourceId: String?,
      objectType: String?,
      propertyName: String?,
      propertyType: String?
    ): IUnknown? {
      val fnPtr = _340117202_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__340117202_Ptr, marshalToNative(resourceId),
          marshalToNative(objectType), marshalToNative(propertyName), marshalToNative(propertyType),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class ICustomXamlResourceLoaderOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __340117202_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomXamlResourceLoaderOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f851e991af0246e89af8427b7ebfe9f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomXamlResourceLoaderOverrides(ptr: Pointer?): WithDefault =
        ICustomXamlResourceLoaderOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomXamlResourceLoaderOverrides {
      val address = segment.toRawLongValue()
      return makeICustomXamlResourceLoaderOverrides(Pointer(address))
    }

    public override fun toNative(obj: ICustomXamlResourceLoaderOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__340117202_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomXamlResourceLoaderOverrides):
        Array<ICustomXamlResourceLoaderOverrides?> = (elements as
        Array<ICustomXamlResourceLoaderOverrides?>).castToImpl<ICustomXamlResourceLoaderOverrides,ICustomXamlResourceLoaderOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomXamlResourceLoaderOverrides?> =
        arrayOfNulls<ICustomXamlResourceLoaderOverrides_Impl>(size) as
        Array<ICustomXamlResourceLoaderOverrides?>
  }
}
