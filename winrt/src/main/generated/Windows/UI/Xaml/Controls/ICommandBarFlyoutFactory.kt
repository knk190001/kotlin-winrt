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

@ABIMarker(ICommandBarFlyoutFactory.ABI::class)
@Signature("{dd6441b3-6df1-593d-b80c-daf5c1daee41}")
@Guid("dd6441b36df1593db80cdaf5c1daee41")
@WinRTInterface("dd6441b36df1593db80cdaf5c1daee41")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarFlyoutFactory.ByReference::class)
public interface ICommandBarFlyoutFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): CommandBarFlyout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarFlyoutFactory> {
    public override fun getValue() = ABI.makeICommandBarFlyoutFactory(pointer.getPointer(0))

    public fun setValue(value: ICommandBarFlyoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarFlyoutFactory {
    public val __1270668043_Ptr: Pointer?

    public val _1270668043_VtblPtr: Pointer?
      get() = __1270668043_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CommandBarFlyout? {
      val fnPtr = _1270668043_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarFlyout>()
      val hr = fn.invokeHR(arrayOf(__1270668043_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarFlyout>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarFlyoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1270668043_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarFlyoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd6441b36df1593db80cdaf5c1daee41")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarFlyoutFactory(ptr: Pointer?): WithDefault =
        ICommandBarFlyoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarFlyoutFactory {
      val address = segment.toRawLongValue()
      return makeICommandBarFlyoutFactory(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarFlyoutFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1270668043_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarFlyoutFactory):
        Array<ICommandBarFlyoutFactory?> = (elements as
        Array<ICommandBarFlyoutFactory?>).castToImpl<ICommandBarFlyoutFactory,ICommandBarFlyoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarFlyoutFactory?> =
        arrayOfNulls<ICommandBarFlyoutFactory_Impl>(size) as Array<ICommandBarFlyoutFactory?>
  }
}
