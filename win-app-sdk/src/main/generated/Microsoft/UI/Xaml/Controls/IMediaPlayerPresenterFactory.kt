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

@ABIMarker(IMediaPlayerPresenterFactory.ABI::class)
@Signature("{3a96e3f8-ec04-5922-901c-11ba3607cf93}")
@Guid("3a96e3f8ec045922901c11ba3607cf93")
@WinRTInterface("3a96e3f8ec045922901c11ba3607cf93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerPresenterFactory.ByReference::class)
public interface IMediaPlayerPresenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      MediaPlayerPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerPresenterFactory> {
    public override fun getValue() = ABI.makeIMediaPlayerPresenterFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerPresenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerPresenterFactory {
    public val __1872896736_Ptr: Pointer?

    public val _1872896736_VtblPtr: Pointer?
      get() = __1872896736_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MediaPlayerPresenter? {
      val fnPtr = _1872896736_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayerPresenter>()
      val hr = fn.invokeHR(arrayOf(__1872896736_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayerPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlayerPresenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1872896736_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerPresenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a96e3f8ec045922901c11ba3607cf93")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerPresenterFactory(ptr: Pointer?): WithDefault =
        IMediaPlayerPresenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerPresenterFactory {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerPresenterFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerPresenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1872896736_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerPresenterFactory):
        Array<IMediaPlayerPresenterFactory?> = (elements as
        Array<IMediaPlayerPresenterFactory?>).castToImpl<IMediaPlayerPresenterFactory,IMediaPlayerPresenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerPresenterFactory?> =
        arrayOfNulls<IMediaPlayerPresenterFactory_Impl>(size) as
        Array<IMediaPlayerPresenterFactory?>
  }
}
