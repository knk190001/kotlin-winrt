package Windows.Media.Playlists

import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageFile
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

@ABIMarker(IPlaylistStatics.ABI::class)
@Signature("{c5c331cd-81f9-4ff3-95b9-70b6ff046b68}")
@Guid("c5c331cd81f94ff395b970b6ff046b68")
@WinRTInterface("c5c331cd81f94ff395b970b6ff046b68")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaylistStatics.ByReference::class)
public interface IPlaylistStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadAsync(`file`: IStorageFile?): IAsyncOperation<Playlist?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaylistStatics> {
    public override fun getValue() = ABI.makeIPlaylistStatics(pointer.getPointer(0))

    public fun setValue(value: IPlaylistStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaylistStatics {
    public val __1168892822_Ptr: Pointer?

    public val _1168892822_VtblPtr: Pointer?
      get() = __1168892822_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadAsync(`file`: IStorageFile?): IAsyncOperation<Playlist?>? {
      val fnPtr = _1168892822_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Playlist?>>()
      val hr = fn.invokeHR(arrayOf(__1168892822_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Playlist?>>(result.getValue())
      return resultValue
    }
  }

  public class IPlaylistStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1168892822_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaylistStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5c331cd81f94ff395b970b6ff046b68")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaylistStatics(ptr: Pointer?): WithDefault = IPlaylistStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaylistStatics {
      val address = segment.toRawLongValue()
      return makeIPlaylistStatics(Pointer(address))
    }

    public override fun toNative(obj: IPlaylistStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1168892822_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaylistStatics): Array<IPlaylistStatics?> = (elements as
        Array<IPlaylistStatics?>).castToImpl<IPlaylistStatics,IPlaylistStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaylistStatics?> =
        arrayOfNulls<IPlaylistStatics_Impl>(size) as Array<IPlaylistStatics?>
  }
}
