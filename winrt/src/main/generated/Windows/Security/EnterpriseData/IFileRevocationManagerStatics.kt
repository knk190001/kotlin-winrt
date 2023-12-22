package Windows.Security.EnterpriseData

import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageItem
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFileRevocationManagerStatics.ABI::class)
@Signature("{256bbc3d-1c5d-4260-8c75-9144cfb78ba9}")
@Guid("256bbc3d1c5d42608c759144cfb78ba9")
@WinRTInterface("256bbc3d1c5d42608c759144cfb78ba9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileRevocationManagerStatics.ByReference::class)
public interface IFileRevocationManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ProtectAsync(storageItem: IStorageItem?, enterpriseIdentity: String?):
      IAsyncOperation<FileProtectionStatus?>?

  @InterfaceMethod(1)
  public fun CopyProtectionAsync(sourceStorageItem: IStorageItem?,
      targetStorageItem: IStorageItem?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun Revoke(enterpriseIdentity: String?): Unit

  @InterfaceMethod(3)
  public fun GetStatusAsync(storageItem: IStorageItem?): IAsyncOperation<FileProtectionStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileRevocationManagerStatics> {
    public override fun getValue() = ABI.makeIFileRevocationManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IFileRevocationManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileRevocationManagerStatics {
    public val __363131725_Ptr: Pointer?

    public val _363131725_VtblPtr: Pointer?
      get() = __363131725_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ProtectAsync(storageItem: IStorageItem?, enterpriseIdentity: String?):
        IAsyncOperation<FileProtectionStatus?>? {
      val fnPtr = _363131725_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FileProtectionStatus?>>()
      val hr = fn.invokeHR(arrayOf(__363131725_Ptr, marshalToNative(storageItem),
          marshalToNative(enterpriseIdentity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FileProtectionStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CopyProtectionAsync(sourceStorageItem: IStorageItem?,
        targetStorageItem: IStorageItem?): IAsyncOperation<Boolean>? {
      val fnPtr = _363131725_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__363131725_Ptr, marshalToNative(sourceStorageItem),
          marshalToNative(targetStorageItem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Revoke(enterpriseIdentity: String?): Unit {
      val fnPtr = _363131725_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__363131725_Ptr, marshalToNative(enterpriseIdentity),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetStatusAsync(storageItem: IStorageItem?):
        IAsyncOperation<FileProtectionStatus?>? {
      val fnPtr = _363131725_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FileProtectionStatus?>>()
      val hr = fn.invokeHR(arrayOf(__363131725_Ptr, marshalToNative(storageItem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FileProtectionStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IFileRevocationManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __363131725_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileRevocationManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("256bbc3d1c5d42608c759144cfb78ba9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileRevocationManagerStatics(ptr: Pointer?): WithDefault =
        IFileRevocationManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileRevocationManagerStatics {
      val address = segment.toRawLongValue()
      return makeIFileRevocationManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IFileRevocationManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__363131725_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileRevocationManagerStatics):
        Array<IFileRevocationManagerStatics?> = (elements as
        Array<IFileRevocationManagerStatics?>).castToImpl<IFileRevocationManagerStatics,IFileRevocationManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileRevocationManagerStatics?> =
        arrayOfNulls<IFileRevocationManagerStatics_Impl>(size) as
        Array<IFileRevocationManagerStatics?>
  }
}
