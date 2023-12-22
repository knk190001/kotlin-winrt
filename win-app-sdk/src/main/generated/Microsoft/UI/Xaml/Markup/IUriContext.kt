package Microsoft.UI.Xaml.Markup

import Windows.Foundation.Uri
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

@ABIMarker(IUriContext.ABI::class)
@Signature("{fb8605f6-8f05-52ee-a01c-3a9e118a6ea2}")
@Guid("fb8605f68f0552eea01c3a9e118a6ea2")
@WinRTInterface("fb8605f68f0552eea01c3a9e118a6ea2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUriContext.ByReference::class)
public interface IUriContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BaseUri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUriContext> {
    public override fun getValue() = ABI.makeIUriContext(pointer.getPointer(0))

    public fun setValue(value: IUriContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUriContext {
    public val __9907720_Ptr: Pointer?

    public val _9907720_VtblPtr: Pointer?
      get() = __9907720_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BaseUri(): Uri? {
      val fnPtr = _9907720_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__9907720_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IUriContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __9907720_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUriContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb8605f68f0552eea01c3a9e118a6ea2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUriContext(ptr: Pointer?): WithDefault = IUriContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUriContext {
      val address = segment.toRawLongValue()
      return makeIUriContext(Pointer(address))
    }

    public override fun toNative(obj: IUriContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__9907720_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUriContext): Array<IUriContext?> = (elements as
        Array<IUriContext?>).castToImpl<IUriContext,IUriContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUriContext?> =
        arrayOfNulls<IUriContext_Impl>(size) as Array<IUriContext?>
  }
}
