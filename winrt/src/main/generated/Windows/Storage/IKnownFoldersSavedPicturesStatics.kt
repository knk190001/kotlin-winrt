package Windows.Storage

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

@ABIMarker(IKnownFoldersSavedPicturesStatics.ABI::class)
@Signature("{055c93ea-253d-467c-b6ca-a97da1e9a18d}")
@Guid("055c93ea253d467cb6caa97da1e9a18d")
@WinRTInterface("055c93ea253d467cb6caa97da1e9a18d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownFoldersSavedPicturesStatics.ByReference::class)
public interface IKnownFoldersSavedPicturesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SavedPictures(): StorageFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownFoldersSavedPicturesStatics> {
    public override fun getValue() =
        ABI.makeIKnownFoldersSavedPicturesStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownFoldersSavedPicturesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownFoldersSavedPicturesStatics {
    public val __1612294652_Ptr: Pointer?

    public val _1612294652_VtblPtr: Pointer?
      get() = __1612294652_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SavedPictures(): StorageFolder? {
      val fnPtr = _1612294652_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__1612294652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }
  }

  public class IKnownFoldersSavedPicturesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1612294652_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownFoldersSavedPicturesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("055c93ea253d467cb6caa97da1e9a18d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownFoldersSavedPicturesStatics(ptr: Pointer?): WithDefault =
        IKnownFoldersSavedPicturesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownFoldersSavedPicturesStatics {
      val address = segment.toRawLongValue()
      return makeIKnownFoldersSavedPicturesStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownFoldersSavedPicturesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1612294652_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownFoldersSavedPicturesStatics):
        Array<IKnownFoldersSavedPicturesStatics?> = (elements as
        Array<IKnownFoldersSavedPicturesStatics?>).castToImpl<IKnownFoldersSavedPicturesStatics,IKnownFoldersSavedPicturesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownFoldersSavedPicturesStatics?> =
        arrayOfNulls<IKnownFoldersSavedPicturesStatics_Impl>(size) as
        Array<IKnownFoldersSavedPicturesStatics?>
  }
}
