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

@ABIMarker(IKnownFoldersPlaylistsStatics.ABI::class)
@Signature("{dad5ecd6-306f-4d6a-b496-46ba8eb106ce}")
@Guid("dad5ecd6306f4d6ab49646ba8eb106ce")
@WinRTInterface("dad5ecd6306f4d6ab49646ba8eb106ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownFoldersPlaylistsStatics.ByReference::class)
public interface IKnownFoldersPlaylistsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Playlists(): StorageFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownFoldersPlaylistsStatics> {
    public override fun getValue() = ABI.makeIKnownFoldersPlaylistsStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownFoldersPlaylistsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownFoldersPlaylistsStatics {
    public val __1454600671_Ptr: Pointer?

    public val _1454600671_VtblPtr: Pointer?
      get() = __1454600671_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Playlists(): StorageFolder? {
      val fnPtr = _1454600671_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__1454600671_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }
  }

  public class IKnownFoldersPlaylistsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1454600671_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownFoldersPlaylistsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dad5ecd6306f4d6ab49646ba8eb106ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownFoldersPlaylistsStatics(ptr: Pointer?): WithDefault =
        IKnownFoldersPlaylistsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownFoldersPlaylistsStatics {
      val address = segment.toRawLongValue()
      return makeIKnownFoldersPlaylistsStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownFoldersPlaylistsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1454600671_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownFoldersPlaylistsStatics):
        Array<IKnownFoldersPlaylistsStatics?> = (elements as
        Array<IKnownFoldersPlaylistsStatics?>).castToImpl<IKnownFoldersPlaylistsStatics,IKnownFoldersPlaylistsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownFoldersPlaylistsStatics?> =
        arrayOfNulls<IKnownFoldersPlaylistsStatics_Impl>(size) as
        Array<IKnownFoldersPlaylistsStatics?>
  }
}
