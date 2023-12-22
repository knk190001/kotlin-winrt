package Windows.UI.Xaml

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

@ABIMarker(IResourceDictionaryFactory.ABI::class)
@Signature("{ea3639b5-31b7-4271-92c9-7c9584a91c22}")
@Guid("ea3639b531b7427192c97c9584a91c22")
@WinRTInterface("ea3639b531b7427192c97c9584a91c22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceDictionaryFactory.ByReference::class)
public interface IResourceDictionaryFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      ResourceDictionary?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceDictionaryFactory> {
    public override fun getValue() = ABI.makeIResourceDictionaryFactory(pointer.getPointer(0))

    public fun setValue(value: IResourceDictionaryFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceDictionaryFactory {
    public val __1835034860_Ptr: Pointer?

    public val _1835034860_VtblPtr: Pointer?
      get() = __1835034860_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ResourceDictionary? {
      val fnPtr = _1835034860_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceDictionary>()
      val hr = fn.invokeHR(arrayOf(__1835034860_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceDictionary>(result.getValue())
      return resultValue
    }
  }

  public class IResourceDictionaryFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1835034860_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceDictionaryFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea3639b531b7427192c97c9584a91c22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceDictionaryFactory(ptr: Pointer?): WithDefault =
        IResourceDictionaryFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceDictionaryFactory {
      val address = segment.toRawLongValue()
      return makeIResourceDictionaryFactory(Pointer(address))
    }

    public override fun toNative(obj: IResourceDictionaryFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1835034860_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceDictionaryFactory):
        Array<IResourceDictionaryFactory?> = (elements as
        Array<IResourceDictionaryFactory?>).castToImpl<IResourceDictionaryFactory,IResourceDictionaryFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceDictionaryFactory?> =
        arrayOfNulls<IResourceDictionaryFactory_Impl>(size) as Array<IResourceDictionaryFactory?>
  }
}
