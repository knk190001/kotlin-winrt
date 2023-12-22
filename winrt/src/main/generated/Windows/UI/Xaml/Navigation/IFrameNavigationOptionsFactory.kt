package Windows.UI.Xaml.Navigation

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

@ABIMarker(IFrameNavigationOptionsFactory.ABI::class)
@Signature("{d4681e41-7e6d-5c7c-aca0-478681cc6fce}")
@Guid("d4681e417e6d5c7caca0478681cc6fce")
@WinRTInterface("d4681e417e6d5c7caca0478681cc6fce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameNavigationOptionsFactory.ByReference::class)
public interface IFrameNavigationOptionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      FrameNavigationOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameNavigationOptionsFactory> {
    public override fun getValue() = ABI.makeIFrameNavigationOptionsFactory(pointer.getPointer(0))

    public fun setValue(value: IFrameNavigationOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameNavigationOptionsFactory {
    public val __1821507791_Ptr: Pointer?

    public val _1821507791_VtblPtr: Pointer?
      get() = __1821507791_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        FrameNavigationOptions? {
      val fnPtr = _1821507791_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameNavigationOptions>()
      val hr = fn.invokeHR(arrayOf(__1821507791_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameNavigationOptions>(result.getValue())
      return resultValue
    }
  }

  public class IFrameNavigationOptionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1821507791_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameNavigationOptionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4681e417e6d5c7caca0478681cc6fce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameNavigationOptionsFactory(ptr: Pointer?): WithDefault =
        IFrameNavigationOptionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameNavigationOptionsFactory {
      val address = segment.toRawLongValue()
      return makeIFrameNavigationOptionsFactory(Pointer(address))
    }

    public override fun toNative(obj: IFrameNavigationOptionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1821507791_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameNavigationOptionsFactory):
        Array<IFrameNavigationOptionsFactory?> = (elements as
        Array<IFrameNavigationOptionsFactory?>).castToImpl<IFrameNavigationOptionsFactory,IFrameNavigationOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameNavigationOptionsFactory?> =
        arrayOfNulls<IFrameNavigationOptionsFactory_Impl>(size) as
        Array<IFrameNavigationOptionsFactory?>
  }
}
