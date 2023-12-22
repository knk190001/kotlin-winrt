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

@ABIMarker(IStorageProviderGetPathForContentUriResult.ABI::class)
@Signature("{63711a9d-4118-45a6-acb6-22c49d019f40}")
@Guid("63711a9d411845a6acb622c49d019f40")
@WinRTInterface("63711a9d411845a6acb622c49d019f40")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderGetPathForContentUriResult.ByReference::class)
public interface IStorageProviderGetPathForContentUriResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): StorageProviderUriSourceStatus?

  @InterfaceMethod(1)
  public fun put_Status(value: StorageProviderUriSourceStatus?): Unit

  @InterfaceMethod(2)
  public fun get_Path(): String?

  @InterfaceMethod(3)
  public fun put_Path(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderGetPathForContentUriResult> {
    public override fun getValue() =
        ABI.makeIStorageProviderGetPathForContentUriResult(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderGetPathForContentUriResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderGetPathForContentUriResult {
    public val __1338791792_Ptr: Pointer?

    public val _1338791792_VtblPtr: Pointer?
      get() = __1338791792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): StorageProviderUriSourceStatus? {
      val fnPtr = _1338791792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderUriSourceStatus>()
      val hr = fn.invokeHR(arrayOf(__1338791792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderUriSourceStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Status(value: StorageProviderUriSourceStatus?): Unit {
      val fnPtr = _1338791792_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1338791792_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Path(): String? {
      val fnPtr = _1338791792_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1338791792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Path(value: String?): Unit {
      val fnPtr = _1338791792_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1338791792_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageProviderGetPathForContentUriResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1338791792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderGetPathForContentUriResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63711a9d411845a6acb622c49d019f40")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderGetPathForContentUriResult(ptr: Pointer?): WithDefault =
        IStorageProviderGetPathForContentUriResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IStorageProviderGetPathForContentUriResult {
      val address = segment.toRawLongValue()
      return makeIStorageProviderGetPathForContentUriResult(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderGetPathForContentUriResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1338791792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderGetPathForContentUriResult):
        Array<IStorageProviderGetPathForContentUriResult?> = (elements as
        Array<IStorageProviderGetPathForContentUriResult?>).castToImpl<IStorageProviderGetPathForContentUriResult,IStorageProviderGetPathForContentUriResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderGetPathForContentUriResult?> =
        arrayOfNulls<IStorageProviderGetPathForContentUriResult_Impl>(size) as
        Array<IStorageProviderGetPathForContentUriResult?>
  }
}
