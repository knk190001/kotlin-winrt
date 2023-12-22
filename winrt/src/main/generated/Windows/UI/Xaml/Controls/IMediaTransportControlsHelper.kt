package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaTransportControlsHelper.ABI::class)
@Signature("{3d41d509-ff44-4420-807e-8f7a2e2c4251}")
@Guid("3d41d509ff444420807e8f7a2e2c4251")
@WinRTInterface("3d41d509ff444420807e8f7a2e2c4251")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTransportControlsHelper.ByReference::class)
public interface IMediaTransportControlsHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTransportControlsHelper> {
    public override fun getValue() = ABI.makeIMediaTransportControlsHelper(pointer.getPointer(0))

    public fun setValue(value: IMediaTransportControlsHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTransportControlsHelper {
    public val __1030452443_Ptr: Pointer?

    public val _1030452443_VtblPtr: Pointer?
      get() = __1030452443_Ptr?.getPointer(0)
  }

  public class IMediaTransportControlsHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1030452443_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTransportControlsHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d41d509ff444420807e8f7a2e2c4251")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTransportControlsHelper(ptr: Pointer?): WithDefault =
        IMediaTransportControlsHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTransportControlsHelper {
      val address = segment.toRawLongValue()
      return makeIMediaTransportControlsHelper(Pointer(address))
    }

    public override fun toNative(obj: IMediaTransportControlsHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1030452443_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTransportControlsHelper):
        Array<IMediaTransportControlsHelper?> = (elements as
        Array<IMediaTransportControlsHelper?>).castToImpl<IMediaTransportControlsHelper,IMediaTransportControlsHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTransportControlsHelper?> =
        arrayOfNulls<IMediaTransportControlsHelper_Impl>(size) as
        Array<IMediaTransportControlsHelper?>
  }
}
