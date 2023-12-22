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

@ABIMarker(IKnownFoldersStatics3.ABI::class)
@Signature("{c5194341-9742-4ed5-823d-fc1401148764}")
@Guid("c519434197424ed5823dfc1401148764")
@WinRTInterface("c519434197424ed5823dfc1401148764")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownFoldersStatics3.ByReference::class)
public interface IKnownFoldersStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFolderForUserAsync(user: User?, folderId: KnownFolderId?):
      IAsyncOperation<StorageFolder?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownFoldersStatics3> {
    public override fun getValue() = ABI.makeIKnownFoldersStatics3(pointer.getPointer(0))

    public fun setValue(value: IKnownFoldersStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownFoldersStatics3 {
    public val __872774071_Ptr: Pointer?

    public val _872774071_VtblPtr: Pointer?
      get() = __872774071_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFolderForUserAsync(user: User?, folderId: KnownFolderId?):
        IAsyncOperation<StorageFolder?>? {
      val fnPtr = _872774071_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__872774071_Ptr, marshalToNative(user),
          marshalToNative(folderId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }
  }

  public class IKnownFoldersStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __872774071_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownFoldersStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c519434197424ed5823dfc1401148764")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownFoldersStatics3(ptr: Pointer?): WithDefault =
        IKnownFoldersStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownFoldersStatics3 {
      val address = segment.toRawLongValue()
      return makeIKnownFoldersStatics3(Pointer(address))
    }

    public override fun toNative(obj: IKnownFoldersStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__872774071_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownFoldersStatics3): Array<IKnownFoldersStatics3?> =
        (elements as
        Array<IKnownFoldersStatics3?>).castToImpl<IKnownFoldersStatics3,IKnownFoldersStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownFoldersStatics3?> =
        arrayOfNulls<IKnownFoldersStatics3_Impl>(size) as Array<IKnownFoldersStatics3?>
  }
}
