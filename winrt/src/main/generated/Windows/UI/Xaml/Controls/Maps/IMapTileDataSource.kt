package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapTileDataSource.ABI::class)
@Signature("{c03d9f5e-be1f-4c69-9969-79467a513c38}")
@Guid("c03d9f5ebe1f4c69996979467a513c38")
@WinRTInterface("c03d9f5ebe1f4c69996979467a513c38")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileDataSource.ByReference::class)
public interface IMapTileDataSource : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileDataSource> {
    public override fun getValue() = ABI.makeIMapTileDataSource(pointer.getPointer(0))

    public fun setValue(value: IMapTileDataSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileDataSource {
    public val __858830594_Ptr: Pointer?

    public val _858830594_VtblPtr: Pointer?
      get() = __858830594_Ptr?.getPointer(0)
  }

  public class IMapTileDataSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __858830594_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileDataSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c03d9f5ebe1f4c69996979467a513c38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileDataSource(ptr: Pointer?): WithDefault = IMapTileDataSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileDataSource {
      val address = segment.toRawLongValue()
      return makeIMapTileDataSource(Pointer(address))
    }

    public override fun toNative(obj: IMapTileDataSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__858830594_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileDataSource): Array<IMapTileDataSource?> =
        (elements as
        Array<IMapTileDataSource?>).castToImpl<IMapTileDataSource,IMapTileDataSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileDataSource?> =
        arrayOfNulls<IMapTileDataSource_Impl>(size) as Array<IMapTileDataSource?>
  }
}
