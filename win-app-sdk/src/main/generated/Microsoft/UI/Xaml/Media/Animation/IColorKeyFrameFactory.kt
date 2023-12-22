package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IColorKeyFrameFactory.ABI::class)
@Signature("{a82cc182-9d80-508c-b962-d74225587200}")
@Guid("a82cc1829d80508cb962d74225587200")
@WinRTInterface("a82cc1829d80508cb962d74225587200")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorKeyFrameFactory.ByReference::class)
public interface IColorKeyFrameFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ColorKeyFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorKeyFrameFactory> {
    public override fun getValue() = ABI.makeIColorKeyFrameFactory(pointer.getPointer(0))

    public fun setValue(value: IColorKeyFrameFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorKeyFrameFactory {
    public val __1510821748_Ptr: Pointer?

    public val _1510821748_VtblPtr: Pointer?
      get() = __1510821748_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ColorKeyFrame? {
      val fnPtr = _1510821748_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorKeyFrame>()
      val hr = fn.invokeHR(arrayOf(__1510821748_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorKeyFrame>(result.getValue())
      return resultValue
    }
  }

  public class IColorKeyFrameFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1510821748_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorKeyFrameFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a82cc1829d80508cb962d74225587200")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorKeyFrameFactory(ptr: Pointer?): WithDefault =
        IColorKeyFrameFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorKeyFrameFactory {
      val address = segment.toRawLongValue()
      return makeIColorKeyFrameFactory(Pointer(address))
    }

    public override fun toNative(obj: IColorKeyFrameFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1510821748_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorKeyFrameFactory): Array<IColorKeyFrameFactory?> =
        (elements as
        Array<IColorKeyFrameFactory?>).castToImpl<IColorKeyFrameFactory,IColorKeyFrameFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorKeyFrameFactory?> =
        arrayOfNulls<IColorKeyFrameFactory_Impl>(size) as Array<IColorKeyFrameFactory?>
  }
}
