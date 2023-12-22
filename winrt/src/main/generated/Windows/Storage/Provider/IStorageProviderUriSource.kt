package Windows.Storage.Provider

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

@ABIMarker(IStorageProviderUriSource.ABI::class)
@Signature("{b29806d1-8be0-4962-8bb6-0d4c2e14d47a}")
@Guid("b29806d18be049628bb60d4c2e14d47a")
@WinRTInterface("b29806d18be049628bb60d4c2e14d47a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderUriSource.ByReference::class)
public interface IStorageProviderUriSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPathForContentUri(contentUri: String?,
      result: StorageProviderGetPathForContentUriResult?): Unit

  @InterfaceMethod(1)
  public fun GetContentInfoForPath(path: String?,
      result: StorageProviderGetContentInfoForPathResult?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderUriSource> {
    public override fun getValue() = ABI.makeIStorageProviderUriSource(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderUriSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderUriSource {
    public val __1961870421_Ptr: Pointer?

    public val _1961870421_VtblPtr: Pointer?
      get() = __1961870421_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPathForContentUri(contentUri: String?,
        result: StorageProviderGetPathForContentUriResult?): Unit {
      val fnPtr = _1961870421_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1961870421_Ptr, marshalToNative(contentUri),
          marshalToNative(result),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetContentInfoForPath(path: String?,
        result: StorageProviderGetContentInfoForPathResult?): Unit {
      val fnPtr = _1961870421_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1961870421_Ptr, marshalToNative(path),
          marshalToNative(result),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageProviderUriSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1961870421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderUriSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b29806d18be049628bb60d4c2e14d47a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderUriSource(ptr: Pointer?): WithDefault =
        IStorageProviderUriSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderUriSource {
      val address = segment.toRawLongValue()
      return makeIStorageProviderUriSource(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderUriSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1961870421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderUriSource):
        Array<IStorageProviderUriSource?> = (elements as
        Array<IStorageProviderUriSource?>).castToImpl<IStorageProviderUriSource,IStorageProviderUriSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderUriSource?> =
        arrayOfNulls<IStorageProviderUriSource_Impl>(size) as Array<IStorageProviderUriSource?>
  }
}
