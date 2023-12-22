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

@ABIMarker(IStorageProviderGetContentInfoForPathResult.ABI::class)
@Signature("{2564711d-aa89-4d12-82e3-f72a92e33966}")
@Guid("2564711daa894d1282e3f72a92e33966")
@WinRTInterface("2564711daa894d1282e3f72a92e33966")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderGetContentInfoForPathResult.ByReference::class)
public interface IStorageProviderGetContentInfoForPathResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): StorageProviderUriSourceStatus?

  @InterfaceMethod(1)
  public fun put_Status(value: StorageProviderUriSourceStatus?): Unit

  @InterfaceMethod(2)
  public fun get_ContentUri(): String?

  @InterfaceMethod(3)
  public fun put_ContentUri(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_ContentId(): String?

  @InterfaceMethod(5)
  public fun put_ContentId(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderGetContentInfoForPathResult> {
    public override fun getValue() =
        ABI.makeIStorageProviderGetContentInfoForPathResult(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderGetContentInfoForPathResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderGetContentInfoForPathResult {
    public val __628368792_Ptr: Pointer?

    public val _628368792_VtblPtr: Pointer?
      get() = __628368792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): StorageProviderUriSourceStatus? {
      val fnPtr = _628368792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderUriSourceStatus>()
      val hr = fn.invokeHR(arrayOf(__628368792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderUriSourceStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Status(value: StorageProviderUriSourceStatus?): Unit {
      val fnPtr = _628368792_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__628368792_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ContentUri(): String? {
      val fnPtr = _628368792_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__628368792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ContentUri(value: String?): Unit {
      val fnPtr = _628368792_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__628368792_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ContentId(): String? {
      val fnPtr = _628368792_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__628368792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ContentId(value: String?): Unit {
      val fnPtr = _628368792_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__628368792_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageProviderGetContentInfoForPathResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __628368792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderGetContentInfoForPathResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2564711daa894d1282e3f72a92e33966")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderGetContentInfoForPathResult(ptr: Pointer?): WithDefault =
        IStorageProviderGetContentInfoForPathResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IStorageProviderGetContentInfoForPathResult {
      val address = segment.toRawLongValue()
      return makeIStorageProviderGetContentInfoForPathResult(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderGetContentInfoForPathResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__628368792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderGetContentInfoForPathResult):
        Array<IStorageProviderGetContentInfoForPathResult?> = (elements as
        Array<IStorageProviderGetContentInfoForPathResult?>).castToImpl<IStorageProviderGetContentInfoForPathResult,IStorageProviderGetContentInfoForPathResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderGetContentInfoForPathResult?> =
        arrayOfNulls<IStorageProviderGetContentInfoForPathResult_Impl>(size) as
        Array<IStorageProviderGetContentInfoForPathResult?>
  }
}
