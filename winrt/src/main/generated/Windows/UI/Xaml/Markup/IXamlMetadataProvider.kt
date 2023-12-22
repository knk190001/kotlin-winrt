package Windows.UI.Xaml.Markup

import Windows.UI.Xaml.Interop.TypeName
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

@ABIMarker(IXamlMetadataProvider.ABI::class)
@Signature("{b3765d69-68a5-4b32-8861-fdb90c1f5836}")
@Guid("b3765d6968a54b328861fdb90c1f5836")
@WinRTInterface("b3765d6968a54b328861fdb90c1f5836")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlMetadataProvider.ByReference::class)
public interface IXamlMetadataProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetXamlType(type: TypeName?): IXamlType?

  @InterfaceMethod(1)
  public fun GetXamlType(fullName: String?): IXamlType?

  @InterfaceMethod(2)
  public fun GetXmlnsDefinitions(): Array<XmlnsDefinition?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlMetadataProvider> {
    public override fun getValue() = ABI.makeIXamlMetadataProvider(pointer.getPointer(0))

    public fun setValue(value: IXamlMetadataProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlMetadataProvider {
    public val __1252956370_Ptr: Pointer?

    public val _1252956370_VtblPtr: Pointer?
      get() = __1252956370_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetXamlType(type: TypeName?): IXamlType? {
      val fnPtr = _1252956370_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlType>()
      val hr = fn.invokeHR(arrayOf(__1252956370_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetXamlType(fullName: String?): IXamlType? {
      val fnPtr = _1252956370_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlType>()
      val hr = fn.invokeHR(arrayOf(__1252956370_Ptr, marshalToNative(fullName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetXmlnsDefinitions(): Array<XmlnsDefinition?>? {
      val fnPtr = _1252956370_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<XmlnsDefinition>()
      val hr = fn.invokeHR(arrayOf(__1252956370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array as Array<XmlnsDefinition?>
      return resultValue
    }
  }

  public class IXamlMetadataProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1252956370_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlMetadataProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3765d6968a54b328861fdb90c1f5836")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlMetadataProvider(ptr: Pointer?): WithDefault =
        IXamlMetadataProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlMetadataProvider {
      val address = segment.toRawLongValue()
      return makeIXamlMetadataProvider(Pointer(address))
    }

    public override fun toNative(obj: IXamlMetadataProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1252956370_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlMetadataProvider): Array<IXamlMetadataProvider?> =
        (elements as
        Array<IXamlMetadataProvider?>).castToImpl<IXamlMetadataProvider,IXamlMetadataProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlMetadataProvider?> =
        arrayOfNulls<IXamlMetadataProvider_Impl>(size) as Array<IXamlMetadataProvider?>
  }
}
