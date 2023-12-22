package Windows.Security.EnterpriseData

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageFile
import Windows.Storage.IStorageItem
import Windows.Storage.NameCollisionOption
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

@ABIMarker(IFileProtectionManagerStatics2.ABI::class)
@Signature("{83d2a745-0483-41ab-b2d5-bc7f23d74ebb}")
@Guid("83d2a745048341abb2d5bc7f23d74ebb")
@WinRTInterface("83d2a745048341abb2d5bc7f23d74ebb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileProtectionManagerStatics2.ByReference::class)
public interface IFileProtectionManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsContainerAsync(`file`: IStorageFile?): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun LoadFileFromContainerAsync(
    containerFile: IStorageFile?,
    target: IStorageItem?,
    collisionOption: NameCollisionOption?
  ): IAsyncOperation<ProtectedContainerImportResult?>?

  @InterfaceMethod(2)
  public fun SaveFileAsContainerAsync(protectedFile: IStorageFile?,
      sharedWithIdentities: IIterable<String?>?): IAsyncOperation<ProtectedContainerExportResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileProtectionManagerStatics2> {
    public override fun getValue() = ABI.makeIFileProtectionManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IFileProtectionManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileProtectionManagerStatics2 {
    public val __463197718_Ptr: Pointer?

    public val _463197718_VtblPtr: Pointer?
      get() = __463197718_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsContainerAsync(`file`: IStorageFile?): IAsyncOperation<Boolean>? {
      val fnPtr = _463197718_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__463197718_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LoadFileFromContainerAsync(
      containerFile: IStorageFile?,
      target: IStorageItem?,
      collisionOption: NameCollisionOption?
    ): IAsyncOperation<ProtectedContainerImportResult?>? {
      val fnPtr = _463197718_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectedContainerImportResult?>>()
      val hr = fn.invokeHR(arrayOf(__463197718_Ptr, marshalToNative(containerFile),
          marshalToNative(target), marshalToNative(collisionOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectedContainerImportResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SaveFileAsContainerAsync(protectedFile: IStorageFile?,
        sharedWithIdentities: IIterable<String?>?):
        IAsyncOperation<ProtectedContainerExportResult?>? {
      val fnPtr = _463197718_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectedContainerExportResult?>>()
      val hr = fn.invokeHR(arrayOf(__463197718_Ptr, marshalToNative(protectedFile),
          marshalToNative(sharedWithIdentities), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectedContainerExportResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IFileProtectionManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __463197718_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileProtectionManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83d2a745048341abb2d5bc7f23d74ebb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileProtectionManagerStatics2(ptr: Pointer?): WithDefault =
        IFileProtectionManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileProtectionManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIFileProtectionManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IFileProtectionManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__463197718_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileProtectionManagerStatics2):
        Array<IFileProtectionManagerStatics2?> = (elements as
        Array<IFileProtectionManagerStatics2?>).castToImpl<IFileProtectionManagerStatics2,IFileProtectionManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileProtectionManagerStatics2?> =
        arrayOfNulls<IFileProtectionManagerStatics2_Impl>(size) as
        Array<IFileProtectionManagerStatics2?>
  }
}
