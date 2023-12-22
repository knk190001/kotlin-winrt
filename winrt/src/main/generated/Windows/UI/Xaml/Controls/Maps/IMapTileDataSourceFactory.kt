package Windows.UI.Xaml.Controls.Maps

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMapTileDataSourceFactory.ABI::class)
@Signature("{a3920fbd-e446-4648-a74d-fd2c5d557c06}")
@Guid("a3920fbde4464648a74dfd2c5d557c06")
@WinRTInterface("a3920fbde4464648a74dfd2c5d557c06")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileDataSourceFactory.ByReference::class)
public interface IMapTileDataSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): MapTileDataSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileDataSourceFactory> {
    public override fun getValue() = ABI.makeIMapTileDataSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IMapTileDataSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileDataSourceFactory {
    public val __2072115668_Ptr: Pointer?

    public val _2072115668_VtblPtr: Pointer?
      get() = __2072115668_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MapTileDataSource? {
      val fnPtr = _2072115668_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileDataSource>()
      val hr = fn.invokeHR(arrayOf(__2072115668_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileDataSource>(result.getValue())
      return resultValue
    }
  }

  public class IMapTileDataSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2072115668_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileDataSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3920fbde4464648a74dfd2c5d557c06")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileDataSourceFactory(ptr: Pointer?): WithDefault =
        IMapTileDataSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileDataSourceFactory {
      val address = segment.toRawLongValue()
      return makeIMapTileDataSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IMapTileDataSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2072115668_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileDataSourceFactory):
        Array<IMapTileDataSourceFactory?> = (elements as
        Array<IMapTileDataSourceFactory?>).castToImpl<IMapTileDataSourceFactory,IMapTileDataSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileDataSourceFactory?> =
        arrayOfNulls<IMapTileDataSourceFactory_Impl>(size) as Array<IMapTileDataSourceFactory?>
  }
}
