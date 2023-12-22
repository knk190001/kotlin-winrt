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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILocalMapTileDataSourceFactory.ABI::class)
@Signature("{c5cfe9fc-72ac-4839-8a0d-011f24693c79}")
@Guid("c5cfe9fc72ac48398a0d011f24693c79")
@WinRTInterface("c5cfe9fc72ac48398a0d011f24693c79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILocalMapTileDataSourceFactory.ByReference::class)
public interface ILocalMapTileDataSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      LocalMapTileDataSource?

  @InterfaceMethod(1)
  public fun CreateInstanceWithUriFormatString(
    uriFormatString: String?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): LocalMapTileDataSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILocalMapTileDataSourceFactory> {
    public override fun getValue() = ABI.makeILocalMapTileDataSourceFactory(pointer.getPointer(0))

    public fun setValue(value: ILocalMapTileDataSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILocalMapTileDataSourceFactory {
    public val __1831382709_Ptr: Pointer?

    public val _1831382709_VtblPtr: Pointer?
      get() = __1831382709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        LocalMapTileDataSource? {
      val fnPtr = _1831382709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LocalMapTileDataSource>()
      val hr = fn.invokeHR(arrayOf(__1831382709_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LocalMapTileDataSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceWithUriFormatString(
      uriFormatString: String?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): LocalMapTileDataSource? {
      val fnPtr = _1831382709_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LocalMapTileDataSource>()
      val hr = fn.invokeHR(arrayOf(__1831382709_Ptr, marshalToNative(uriFormatString),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LocalMapTileDataSource>(result.getValue())
      return resultValue
    }
  }

  public class ILocalMapTileDataSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1831382709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILocalMapTileDataSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5cfe9fc72ac48398a0d011f24693c79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILocalMapTileDataSourceFactory(ptr: Pointer?): WithDefault =
        ILocalMapTileDataSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILocalMapTileDataSourceFactory {
      val address = segment.toRawLongValue()
      return makeILocalMapTileDataSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: ILocalMapTileDataSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1831382709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILocalMapTileDataSourceFactory):
        Array<ILocalMapTileDataSourceFactory?> = (elements as
        Array<ILocalMapTileDataSourceFactory?>).castToImpl<ILocalMapTileDataSourceFactory,ILocalMapTileDataSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILocalMapTileDataSourceFactory?> =
        arrayOfNulls<ILocalMapTileDataSourceFactory_Impl>(size) as
        Array<ILocalMapTileDataSourceFactory?>
  }
}
