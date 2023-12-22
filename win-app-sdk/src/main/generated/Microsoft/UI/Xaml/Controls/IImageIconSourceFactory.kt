package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IImageIconSourceFactory.ABI::class)
@Signature("{24f76321-71bd-530a-8cc8-3f615cd1437a}")
@Guid("24f7632171bd530a8cc83f615cd1437a")
@WinRTInterface("24f7632171bd530a8cc83f615cd1437a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageIconSourceFactory.ByReference::class)
public interface IImageIconSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ImageIconSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageIconSourceFactory> {
    public override fun getValue() = ABI.makeIImageIconSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IImageIconSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageIconSourceFactory {
    public val __1960041758_Ptr: Pointer?

    public val _1960041758_VtblPtr: Pointer?
      get() = __1960041758_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ImageIconSource? {
      val fnPtr = _1960041758_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageIconSource>()
      val hr = fn.invokeHR(arrayOf(__1960041758_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageIconSource>(result.getValue())
      return resultValue
    }
  }

  public class IImageIconSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1960041758_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageIconSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24f7632171bd530a8cc83f615cd1437a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageIconSourceFactory(ptr: Pointer?): WithDefault =
        IImageIconSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageIconSourceFactory {
      val address = segment.toRawLongValue()
      return makeIImageIconSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IImageIconSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1960041758_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageIconSourceFactory): Array<IImageIconSourceFactory?>
        = (elements as
        Array<IImageIconSourceFactory?>).castToImpl<IImageIconSourceFactory,IImageIconSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageIconSourceFactory?> =
        arrayOfNulls<IImageIconSourceFactory_Impl>(size) as Array<IImageIconSourceFactory?>
  }
}
