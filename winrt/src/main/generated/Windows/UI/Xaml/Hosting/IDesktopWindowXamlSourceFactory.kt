package Windows.UI.Xaml.Hosting

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

@ABIMarker(IDesktopWindowXamlSourceFactory.ABI::class)
@Signature("{5cd61dc0-2561-56e1-8e75-6e44173805e3}")
@Guid("5cd61dc0256156e18e756e44173805e3")
@WinRTInterface("5cd61dc0256156e18e756e44173805e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopWindowXamlSourceFactory.ByReference::class)
public interface IDesktopWindowXamlSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      DesktopWindowXamlSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopWindowXamlSourceFactory> {
    public override fun getValue() = ABI.makeIDesktopWindowXamlSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IDesktopWindowXamlSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopWindowXamlSourceFactory {
    public val __1094588319_Ptr: Pointer?

    public val _1094588319_VtblPtr: Pointer?
      get() = __1094588319_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        DesktopWindowXamlSource? {
      val fnPtr = _1094588319_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DesktopWindowXamlSource>()
      val hr = fn.invokeHR(arrayOf(__1094588319_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DesktopWindowXamlSource>(result.getValue())
      return resultValue
    }
  }

  public class IDesktopWindowXamlSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1094588319_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopWindowXamlSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5cd61dc0256156e18e756e44173805e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopWindowXamlSourceFactory(ptr: Pointer?): WithDefault =
        IDesktopWindowXamlSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopWindowXamlSourceFactory {
      val address = segment.toRawLongValue()
      return makeIDesktopWindowXamlSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IDesktopWindowXamlSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1094588319_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopWindowXamlSourceFactory):
        Array<IDesktopWindowXamlSourceFactory?> = (elements as
        Array<IDesktopWindowXamlSourceFactory?>).castToImpl<IDesktopWindowXamlSourceFactory,IDesktopWindowXamlSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopWindowXamlSourceFactory?> =
        arrayOfNulls<IDesktopWindowXamlSourceFactory_Impl>(size) as
        Array<IDesktopWindowXamlSourceFactory?>
  }
}
