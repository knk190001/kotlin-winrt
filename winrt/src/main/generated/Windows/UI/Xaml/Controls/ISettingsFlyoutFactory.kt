package Windows.UI.Xaml.Controls

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

@ABIMarker(ISettingsFlyoutFactory.ABI::class)
@Signature("{480c7011-57aa-4db6-b6fd-ec676f6d414e}")
@Guid("480c701157aa4db6b6fdec676f6d414e")
@WinRTInterface("480c701157aa4db6b6fdec676f6d414e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISettingsFlyoutFactory.ByReference::class)
public interface ISettingsFlyoutFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): SettingsFlyout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISettingsFlyoutFactory> {
    public override fun getValue() = ABI.makeISettingsFlyoutFactory(pointer.getPointer(0))

    public fun setValue(value: ISettingsFlyoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISettingsFlyoutFactory {
    public val __2017317008_Ptr: Pointer?

    public val _2017317008_VtblPtr: Pointer?
      get() = __2017317008_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        SettingsFlyout? {
      val fnPtr = _2017317008_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SettingsFlyout>()
      val hr = fn.invokeHR(arrayOf(__2017317008_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SettingsFlyout>(result.getValue())
      return resultValue
    }
  }

  public class ISettingsFlyoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2017317008_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISettingsFlyoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("480c701157aa4db6b6fdec676f6d414e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISettingsFlyoutFactory(ptr: Pointer?): WithDefault =
        ISettingsFlyoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISettingsFlyoutFactory {
      val address = segment.toRawLongValue()
      return makeISettingsFlyoutFactory(Pointer(address))
    }

    public override fun toNative(obj: ISettingsFlyoutFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2017317008_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISettingsFlyoutFactory): Array<ISettingsFlyoutFactory?> =
        (elements as
        Array<ISettingsFlyoutFactory?>).castToImpl<ISettingsFlyoutFactory,ISettingsFlyoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISettingsFlyoutFactory?> =
        arrayOfNulls<ISettingsFlyoutFactory_Impl>(size) as Array<ISettingsFlyoutFactory?>
  }
}
