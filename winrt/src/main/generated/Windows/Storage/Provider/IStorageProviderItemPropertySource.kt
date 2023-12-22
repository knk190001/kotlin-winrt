package Windows.Storage.Provider

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IStorageProviderItemPropertySource.ABI::class)
@Signature("{8f6f9c3e-f632-4a9b-8d99-d2d7a11df56a}")
@Guid("8f6f9c3ef6324a9b8d99d2d7a11df56a")
@WinRTInterface("8f6f9c3ef6324a9b8d99d2d7a11df56a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderItemPropertySource.ByReference::class)
public interface IStorageProviderItemPropertySource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetItemProperties(itemPath: String?): IIterable<StorageProviderItemProperty?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderItemPropertySource> {
    public override fun getValue() =
        ABI.makeIStorageProviderItemPropertySource(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderItemPropertySource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderItemPropertySource {
    public val __64651349_Ptr: Pointer?

    public val _64651349_VtblPtr: Pointer?
      get() = __64651349_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetItemProperties(itemPath: String?):
        IIterable<StorageProviderItemProperty?>? {
      val fnPtr = _64651349_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<StorageProviderItemProperty?>>()
      val hr = fn.invokeHR(arrayOf(__64651349_Ptr, marshalToNative(itemPath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IIterable<StorageProviderItemProperty?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProviderItemPropertySource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __64651349_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderItemPropertySource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f6f9c3ef6324a9b8d99d2d7a11df56a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderItemPropertySource(ptr: Pointer?): WithDefault =
        IStorageProviderItemPropertySource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderItemPropertySource {
      val address = segment.toRawLongValue()
      return makeIStorageProviderItemPropertySource(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderItemPropertySource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__64651349_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderItemPropertySource):
        Array<IStorageProviderItemPropertySource?> = (elements as
        Array<IStorageProviderItemPropertySource?>).castToImpl<IStorageProviderItemPropertySource,IStorageProviderItemPropertySource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderItemPropertySource?> =
        arrayOfNulls<IStorageProviderItemPropertySource_Impl>(size) as
        Array<IStorageProviderItemPropertySource?>
  }
}
