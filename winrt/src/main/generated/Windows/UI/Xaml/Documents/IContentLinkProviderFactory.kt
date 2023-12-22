package Windows.UI.Xaml.Documents

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentLinkProviderFactory.ABI::class)
@Signature("{57d60d3b-ef1a-4e8e-839b-d36ef3a503e0}")
@Guid("57d60d3bef1a4e8e839bd36ef3a503e0")
@WinRTInterface("57d60d3bef1a4e8e839bd36ef3a503e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentLinkProviderFactory.ByReference::class)
public interface IContentLinkProviderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      ContentLinkProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentLinkProviderFactory> {
    public override fun getValue() = ABI.makeIContentLinkProviderFactory(pointer.getPointer(0))

    public fun setValue(value: IContentLinkProviderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentLinkProviderFactory {
    public val __750784146_Ptr: Pointer?

    public val _750784146_VtblPtr: Pointer?
      get() = __750784146_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ContentLinkProvider? {
      val fnPtr = _750784146_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentLinkProvider>()
      val hr = fn.invokeHR(arrayOf(__750784146_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentLinkProvider>(result.getValue())
      return resultValue
    }
  }

  public class IContentLinkProviderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __750784146_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentLinkProviderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("57d60d3bef1a4e8e839bd36ef3a503e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentLinkProviderFactory(ptr: Pointer?): WithDefault =
        IContentLinkProviderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentLinkProviderFactory {
      val address = segment.toRawLongValue()
      return makeIContentLinkProviderFactory(Pointer(address))
    }

    public override fun toNative(obj: IContentLinkProviderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__750784146_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentLinkProviderFactory):
        Array<IContentLinkProviderFactory?> = (elements as
        Array<IContentLinkProviderFactory?>).castToImpl<IContentLinkProviderFactory,IContentLinkProviderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentLinkProviderFactory?> =
        arrayOfNulls<IContentLinkProviderFactory_Impl>(size) as Array<IContentLinkProviderFactory?>
  }
}
