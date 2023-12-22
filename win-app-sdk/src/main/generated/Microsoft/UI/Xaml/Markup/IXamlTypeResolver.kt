package Microsoft.UI.Xaml.Markup

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

@ABIMarker(IXamlTypeResolver.ABI::class)
@Signature("{3fa15615-cacf-547f-b1ed-89dae8c67452}")
@Guid("3fa15615cacf547fb1ed89dae8c67452")
@WinRTInterface("3fa15615cacf547fb1ed89dae8c67452")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlTypeResolver.ByReference::class)
public interface IXamlTypeResolver : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Resolve(qualifiedTypeName: String?): TypeName?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlTypeResolver> {
    public override fun getValue() = ABI.makeIXamlTypeResolver(pointer.getPointer(0))

    public fun setValue(value: IXamlTypeResolver_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlTypeResolver {
    public val __2029775709_Ptr: Pointer?

    public val _2029775709_VtblPtr: Pointer?
      get() = __2029775709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Resolve(qualifiedTypeName: String?): TypeName? {
      val fnPtr = _2029775709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__2029775709_Ptr, marshalToNative(qualifiedTypeName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }
  }

  public class IXamlTypeResolver_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2029775709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlTypeResolver, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fa15615cacf547fb1ed89dae8c67452")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlTypeResolver(ptr: Pointer?): WithDefault = IXamlTypeResolver_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlTypeResolver {
      val address = segment.toRawLongValue()
      return makeIXamlTypeResolver(Pointer(address))
    }

    public override fun toNative(obj: IXamlTypeResolver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2029775709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlTypeResolver): Array<IXamlTypeResolver?> = (elements
        as Array<IXamlTypeResolver?>).castToImpl<IXamlTypeResolver,IXamlTypeResolver_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlTypeResolver?> =
        arrayOfNulls<IXamlTypeResolver_Impl>(size) as Array<IXamlTypeResolver?>
  }
}
