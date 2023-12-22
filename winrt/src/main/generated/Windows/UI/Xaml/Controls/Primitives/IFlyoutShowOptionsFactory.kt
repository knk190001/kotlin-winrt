package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IFlyoutShowOptionsFactory.ABI::class)
@Signature("{ce596f61-2eb4-5b4e-af69-f9af42320eee}")
@Guid("ce596f612eb45b4eaf69f9af42320eee")
@WinRTInterface("ce596f612eb45b4eaf69f9af42320eee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutShowOptionsFactory.ByReference::class)
public interface IFlyoutShowOptionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): FlyoutShowOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutShowOptionsFactory> {
    public override fun getValue() = ABI.makeIFlyoutShowOptionsFactory(pointer.getPointer(0))

    public fun setValue(value: IFlyoutShowOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutShowOptionsFactory {
    public val __229609760_Ptr: Pointer?

    public val _229609760_VtblPtr: Pointer?
      get() = __229609760_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        FlyoutShowOptions? {
      val fnPtr = _229609760_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutShowOptions>()
      val hr = fn.invokeHR(arrayOf(__229609760_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutShowOptions>(result.getValue())
      return resultValue
    }
  }

  public class IFlyoutShowOptionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __229609760_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutShowOptionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce596f612eb45b4eaf69f9af42320eee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutShowOptionsFactory(ptr: Pointer?): WithDefault =
        IFlyoutShowOptionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutShowOptionsFactory {
      val address = segment.toRawLongValue()
      return makeIFlyoutShowOptionsFactory(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutShowOptionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__229609760_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutShowOptionsFactory):
        Array<IFlyoutShowOptionsFactory?> = (elements as
        Array<IFlyoutShowOptionsFactory?>).castToImpl<IFlyoutShowOptionsFactory,IFlyoutShowOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutShowOptionsFactory?> =
        arrayOfNulls<IFlyoutShowOptionsFactory_Impl>(size) as Array<IFlyoutShowOptionsFactory?>
  }
}
