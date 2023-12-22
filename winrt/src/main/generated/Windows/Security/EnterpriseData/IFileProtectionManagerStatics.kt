package Windows.Security.EnterpriseData

import Windows.Foundation.IAsyncOperation
import Windows.Storage.CreationCollisionOption
import Windows.Storage.IStorageFile
import Windows.Storage.IStorageFolder
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

@ABIMarker(IFileProtectionManagerStatics.ABI::class)
@Signature("{5846fc9b-e613-426b-bb38-88cba1dc9adb}")
@Guid("5846fc9be613426bbb3888cba1dc9adb")
@WinRTInterface("5846fc9be613426bbb3888cba1dc9adb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileProtectionManagerStatics.ByReference::class)
public interface IFileProtectionManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ProtectAsync(target: IStorageItem?, identity: String?):
      IAsyncOperation<FileProtectionInfo?>?

  @InterfaceMethod(1)
  public fun CopyProtectionAsync(source: IStorageItem?, target: IStorageItem?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun GetProtectionInfoAsync(source: IStorageItem?): IAsyncOperation<FileProtectionInfo?>?

  @InterfaceMethod(3)
  public fun SaveFileAsContainerAsync(protectedFile: IStorageFile?):
      IAsyncOperation<ProtectedContainerExportResult?>?

  @InterfaceMethod(4)
  public fun LoadFileFromContainerAsync(containerFile: IStorageFile?):
      IAsyncOperation<ProtectedContainerImportResult?>?

  @InterfaceMethod(5)
  public fun LoadFileFromContainerAsync(containerFile: IStorageFile?, target: IStorageItem?):
      IAsyncOperation<ProtectedContainerImportResult?>?

  @InterfaceMethod(6)
  public fun CreateProtectedAndOpenAsync(
    parentFolder: IStorageFolder?,
    desiredName: String?,
    identity: String?,
    collisionOption: CreationCollisionOption?
  ): IAsyncOperation<ProtectedFileCreateResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileProtectionManagerStatics> {
    public override fun getValue() = ABI.makeIFileProtectionManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IFileProtectionManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileProtectionManagerStatics {
    public val __569131192_Ptr: Pointer?

    public val _569131192_VtblPtr: Pointer?
      get() = __569131192_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ProtectAsync(target: IStorageItem?, identity: String?):
        IAsyncOperation<FileProtectionInfo?>? {
      val fnPtr = _569131192_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FileProtectionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__569131192_Ptr, marshalToNative(target),
          marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FileProtectionInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CopyProtectionAsync(source: IStorageItem?, target: IStorageItem?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _569131192_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__569131192_Ptr, marshalToNative(source),
          marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetProtectionInfoAsync(source: IStorageItem?):
        IAsyncOperation<FileProtectionInfo?>? {
      val fnPtr = _569131192_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FileProtectionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__569131192_Ptr, marshalToNative(source), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FileProtectionInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SaveFileAsContainerAsync(protectedFile: IStorageFile?):
        IAsyncOperation<ProtectedContainerExportResult?>? {
      val fnPtr = _569131192_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectedContainerExportResult?>>()
      val hr = fn.invokeHR(arrayOf(__569131192_Ptr, marshalToNative(protectedFile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectedContainerExportResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun LoadFileFromContainerAsync(containerFile: IStorageFile?):
        IAsyncOperation<ProtectedContainerImportResult?>? {
      val fnPtr = _569131192_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectedContainerImportResult?>>()
      val hr = fn.invokeHR(arrayOf(__569131192_Ptr, marshalToNative(containerFile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectedContainerImportResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun LoadFileFromContainerAsync(containerFile: IStorageFile?,
        target: IStorageItem?): IAsyncOperation<ProtectedContainerImportResult?>? {
      val fnPtr = _569131192_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectedContainerImportResult?>>()
      val hr = fn.invokeHR(arrayOf(__569131192_Ptr, marshalToNative(containerFile),
          marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectedContainerImportResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateProtectedAndOpenAsync(
      parentFolder: IStorageFolder?,
      desiredName: String?,
      identity: String?,
      collisionOption: CreationCollisionOption?
    ): IAsyncOperation<ProtectedFileCreateResult?>? {
      val fnPtr = _569131192_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectedFileCreateResult?>>()
      val hr = fn.invokeHR(arrayOf(__569131192_Ptr, marshalToNative(parentFolder),
          marshalToNative(desiredName), marshalToNative(identity), marshalToNative(collisionOption),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectedFileCreateResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IFileProtectionManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __569131192_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileProtectionManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5846fc9be613426bbb3888cba1dc9adb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileProtectionManagerStatics(ptr: Pointer?): WithDefault =
        IFileProtectionManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileProtectionManagerStatics {
      val address = segment.toRawLongValue()
      return makeIFileProtectionManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IFileProtectionManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__569131192_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileProtectionManagerStatics):
        Array<IFileProtectionManagerStatics?> = (elements as
        Array<IFileProtectionManagerStatics?>).castToImpl<IFileProtectionManagerStatics,IFileProtectionManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileProtectionManagerStatics?> =
        arrayOfNulls<IFileProtectionManagerStatics_Impl>(size) as
        Array<IFileProtectionManagerStatics?>
  }
}
