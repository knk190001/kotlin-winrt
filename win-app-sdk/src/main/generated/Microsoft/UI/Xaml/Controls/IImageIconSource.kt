package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Media.ImageSource
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

@ABIMarker(IImageIconSource.ABI::class)
@Signature("{67f75be0-c84d-57ff-9f68-039c81ea7896}")
@Guid("67f75be0c84d57ff9f68039c81ea7896")
@WinRTInterface("67f75be0c84d57ff9f68039c81ea7896")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageIconSource.ByReference::class)
public interface IImageIconSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ImageSource(): ImageSource?

  @InterfaceMethod(1)
  public fun put_ImageSource(value: ImageSource?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageIconSource> {
    public override fun getValue() = ABI.makeIImageIconSource(pointer.getPointer(0))

    public fun setValue(value: IImageIconSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageIconSource {
    public val __1318874376_Ptr: Pointer?

    public val _1318874376_VtblPtr: Pointer?
      get() = __1318874376_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ImageSource(): ImageSource? {
      val fnPtr = _1318874376_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__1318874376_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ImageSource(value: ImageSource?): Unit {
      val fnPtr = _1318874376_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1318874376_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IImageIconSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1318874376_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageIconSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67f75be0c84d57ff9f68039c81ea7896")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageIconSource(ptr: Pointer?): WithDefault = IImageIconSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageIconSource {
      val address = segment.toRawLongValue()
      return makeIImageIconSource(Pointer(address))
    }

    public override fun toNative(obj: IImageIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1318874376_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageIconSource): Array<IImageIconSource?> = (elements as
        Array<IImageIconSource?>).castToImpl<IImageIconSource,IImageIconSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageIconSource?> =
        arrayOfNulls<IImageIconSource_Impl>(size) as Array<IImageIconSource?>
  }
}
