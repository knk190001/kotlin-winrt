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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKnownFoldersStatics4.ABI::class)
@Signature("{1722e6bf-9ff9-4b21-bed5-90ecb13a192e}")
@Guid("1722e6bf9ff94b21bed590ecb13a192e")
@WinRTInterface("1722e6bf9ff94b21bed590ecb13a192e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownFoldersStatics4.ByReference::class)
public interface IKnownFoldersStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessAsync(folderId: KnownFolderId?):
      IAsyncOperation<KnownFoldersAccessStatus?>?

  @InterfaceMethod(1)
  public fun RequestAccessForUserAsync(user: User?, folderId: KnownFolderId?):
      IAsyncOperation<KnownFoldersAccessStatus?>?

  @InterfaceMethod(2)
  public fun GetFolderAsync(folderId: KnownFolderId?): IAsyncOperation<StorageFolder?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownFoldersStatics4> {
    public override fun getValue() = ABI.makeIKnownFoldersStatics4(pointer.getPointer(0))

    public fun setValue(value: IKnownFoldersStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownFoldersStatics4 {
    public val __872774070_Ptr: Pointer?

    public val _872774070_VtblPtr: Pointer?
      get() = __872774070_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessAsync(folderId: KnownFolderId?):
        IAsyncOperation<KnownFoldersAccessStatus?>? {
      val fnPtr = _872774070_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<KnownFoldersAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__872774070_Ptr, marshalToNative(folderId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<KnownFoldersAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAccessForUserAsync(user: User?, folderId: KnownFolderId?):
        IAsyncOperation<KnownFoldersAccessStatus?>? {
      val fnPtr = _872774070_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<KnownFoldersAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__872774070_Ptr, marshalToNative(user),
          marshalToNative(folderId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<KnownFoldersAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetFolderAsync(folderId: KnownFolderId?): IAsyncOperation<StorageFolder?>? {
      val fnPtr = _872774070_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__872774070_Ptr, marshalToNative(folderId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }
  }

  public class IKnownFoldersStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __872774070_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownFoldersStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1722e6bf9ff94b21bed590ecb13a192e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownFoldersStatics4(ptr: Pointer?): WithDefault =
        IKnownFoldersStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownFoldersStatics4 {
      val address = segment.toRawLongValue()
      return makeIKnownFoldersStatics4(Pointer(address))
    }

    public override fun toNative(obj: IKnownFoldersStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__872774070_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownFoldersStatics4): Array<IKnownFoldersStatics4?> =
        (elements as
        Array<IKnownFoldersStatics4?>).castToImpl<IKnownFoldersStatics4,IKnownFoldersStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownFoldersStatics4?> =
        arrayOfNulls<IKnownFoldersStatics4_Impl>(size) as Array<IKnownFoldersStatics4?>
  }
}
