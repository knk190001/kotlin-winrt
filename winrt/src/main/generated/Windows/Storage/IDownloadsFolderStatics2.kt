package Windows.Storage

import Windows.Foundation.IAsyncOperation
import Windows.System.User
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

@ABIMarker(IDownloadsFolderStatics2.ABI::class)
@Signature("{e93045bd-8ef8-4f8e-8d15-ac0e265f390d}")
@Guid("e93045bd8ef84f8e8d15ac0e265f390d")
@WinRTInterface("e93045bd8ef84f8e8d15ac0e265f390d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDownloadsFolderStatics2.ByReference::class)
public interface IDownloadsFolderStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFileForUserAsync(user: User?, desiredName: String?):
      IAsyncOperation<StorageFile?>?

  @InterfaceMethod(1)
  public fun CreateFolderForUserAsync(user: User?, desiredName: String?):
      IAsyncOperation<StorageFolder?>?

  @InterfaceMethod(2)
  public fun CreateFileForUserAsync(
    user: User?,
    desiredName: String?,
    option: CreationCollisionOption?
  ): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(3)
  public fun CreateFolderForUserAsync(
    user: User?,
    desiredName: String?,
    option: CreationCollisionOption?
  ): IAsyncOperation<StorageFolder?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDownloadsFolderStatics2> {
    public override fun getValue() = ABI.makeIDownloadsFolderStatics2(pointer.getPointer(0))

    public fun setValue(value: IDownloadsFolderStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDownloadsFolderStatics2 {
    public val __1830354771_Ptr: Pointer?

    public val _1830354771_VtblPtr: Pointer?
      get() = __1830354771_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFileForUserAsync(user: User?, desiredName: String?):
        IAsyncOperation<StorageFile?>? {
      val fnPtr = _1830354771_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__1830354771_Ptr, marshalToNative(user),
          marshalToNative(desiredName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFolderForUserAsync(user: User?, desiredName: String?):
        IAsyncOperation<StorageFolder?>? {
      val fnPtr = _1830354771_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__1830354771_Ptr, marshalToNative(user),
          marshalToNative(desiredName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFileForUserAsync(
      user: User?,
      desiredName: String?,
      option: CreationCollisionOption?
    ): IAsyncOperation<StorageFile?>? {
      val fnPtr = _1830354771_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__1830354771_Ptr, marshalToNative(user),
          marshalToNative(desiredName), marshalToNative(option), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFolderForUserAsync(
      user: User?,
      desiredName: String?,
      option: CreationCollisionOption?
    ): IAsyncOperation<StorageFolder?>? {
      val fnPtr = _1830354771_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__1830354771_Ptr, marshalToNative(user),
          marshalToNative(desiredName), marshalToNative(option), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }
  }

  public class IDownloadsFolderStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1830354771_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDownloadsFolderStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e93045bd8ef84f8e8d15ac0e265f390d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDownloadsFolderStatics2(ptr: Pointer?): WithDefault =
        IDownloadsFolderStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDownloadsFolderStatics2 {
      val address = segment.toRawLongValue()
      return makeIDownloadsFolderStatics2(Pointer(address))
    }

    public override fun toNative(obj: IDownloadsFolderStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1830354771_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDownloadsFolderStatics2):
        Array<IDownloadsFolderStatics2?> = (elements as
        Array<IDownloadsFolderStatics2?>).castToImpl<IDownloadsFolderStatics2,IDownloadsFolderStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDownloadsFolderStatics2?> =
        arrayOfNulls<IDownloadsFolderStatics2_Impl>(size) as Array<IDownloadsFolderStatics2?>
  }
}
