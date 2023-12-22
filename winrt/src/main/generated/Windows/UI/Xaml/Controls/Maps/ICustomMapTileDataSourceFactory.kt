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

@ABIMarker(ICustomMapTileDataSourceFactory.ABI::class)
@Signature("{c8477947-c955-4f22-9444-a1d8d744af11}")
@Guid("c8477947c9554f229444a1d8d744af11")
@WinRTInterface("c8477947c9554f229444a1d8d744af11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomMapTileDataSourceFactory.ByReference::class)
public interface ICustomMapTileDataSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      CustomMapTileDataSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomMapTileDataSourceFactory> {
    public override fun getValue() = ABI.makeICustomMapTileDataSourceFactory(pointer.getPointer(0))

    public fun setValue(value: ICustomMapTileDataSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomMapTileDataSourceFactory {
    public val __1443565059_Ptr: Pointer?

    public val _1443565059_VtblPtr: Pointer?
      get() = __1443565059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CustomMapTileDataSource? {
      val fnPtr = _1443565059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CustomMapTileDataSource>()
      val hr = fn.invokeHR(arrayOf(__1443565059_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CustomMapTileDataSource>(result.getValue())
      return resultValue
    }
  }

  public class ICustomMapTileDataSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1443565059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomMapTileDataSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c8477947c9554f229444a1d8d744af11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomMapTileDataSourceFactory(ptr: Pointer?): WithDefault =
        ICustomMapTileDataSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomMapTileDataSourceFactory {
      val address = segment.toRawLongValue()
      return makeICustomMapTileDataSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: ICustomMapTileDataSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1443565059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomMapTileDataSourceFactory):
        Array<ICustomMapTileDataSourceFactory?> = (elements as
        Array<ICustomMapTileDataSourceFactory?>).castToImpl<ICustomMapTileDataSourceFactory,ICustomMapTileDataSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomMapTileDataSourceFactory?> =
        arrayOfNulls<ICustomMapTileDataSourceFactory_Impl>(size) as
        Array<ICustomMapTileDataSourceFactory?>
  }
}
