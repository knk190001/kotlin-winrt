package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageFile
import Windows.Storage.StorageFile
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

@ABIMarker(ISharedStorageAccessManagerStatics.ABI::class)
@Signature("{c6132ada-34b1-4849-bd5f-d09fee3158c5}")
@Guid("c6132ada34b14849bd5fd09fee3158c5")
@WinRTInterface("c6132ada34b14849bd5fd09fee3158c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISharedStorageAccessManagerStatics.ByReference::class)
public interface ISharedStorageAccessManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddFile(`file`: IStorageFile?): String?

  @InterfaceMethod(1)
  public fun RedeemTokenForFileAsync(token: String?): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(2)
  public fun RemoveFile(token: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISharedStorageAccessManagerStatics> {
    public override fun getValue() =
        ABI.makeISharedStorageAccessManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ISharedStorageAccessManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISharedStorageAccessManagerStatics {
    public val __866388424_Ptr: Pointer?

    public val _866388424_VtblPtr: Pointer?
      get() = __866388424_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddFile(`file`: IStorageFile?): String? {
      val fnPtr = _866388424_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__866388424_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RedeemTokenForFileAsync(token: String?): IAsyncOperation<StorageFile?>? {
      val fnPtr = _866388424_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__866388424_Ptr, marshalToNative(token), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RemoveFile(token: String?): Unit {
      val fnPtr = _866388424_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__866388424_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISharedStorageAccessManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __866388424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISharedStorageAccessManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6132ada34b14849bd5fd09fee3158c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISharedStorageAccessManagerStatics(ptr: Pointer?): WithDefault =
        ISharedStorageAccessManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISharedStorageAccessManagerStatics {
      val address = segment.toRawLongValue()
      return makeISharedStorageAccessManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ISharedStorageAccessManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__866388424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISharedStorageAccessManagerStatics):
        Array<ISharedStorageAccessManagerStatics?> = (elements as
        Array<ISharedStorageAccessManagerStatics?>).castToImpl<ISharedStorageAccessManagerStatics,ISharedStorageAccessManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISharedStorageAccessManagerStatics?> =
        arrayOfNulls<ISharedStorageAccessManagerStatics_Impl>(size) as
        Array<ISharedStorageAccessManagerStatics?>
  }
}
