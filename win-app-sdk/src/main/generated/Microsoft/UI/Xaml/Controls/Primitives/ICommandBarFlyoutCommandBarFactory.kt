package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(ICommandBarFlyoutCommandBarFactory.ABI::class)
@Signature("{58dbcda9-38e4-5efc-b740-26fda3d0a3c6}")
@Guid("58dbcda938e45efcb74026fda3d0a3c6")
@WinRTInterface("58dbcda938e45efcb74026fda3d0a3c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarFlyoutCommandBarFactory.ByReference::class)
public interface ICommandBarFlyoutCommandBarFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      CommandBarFlyoutCommandBar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarFlyoutCommandBarFactory> {
    public override fun getValue() =
        ABI.makeICommandBarFlyoutCommandBarFactory(pointer.getPointer(0))

    public fun setValue(value: ICommandBarFlyoutCommandBarFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarFlyoutCommandBarFactory {
    public val __1854119502_Ptr: Pointer?

    public val _1854119502_VtblPtr: Pointer?
      get() = __1854119502_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CommandBarFlyoutCommandBar? {
      val fnPtr = _1854119502_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarFlyoutCommandBar>()
      val hr = fn.invokeHR(arrayOf(__1854119502_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarFlyoutCommandBar>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarFlyoutCommandBarFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1854119502_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarFlyoutCommandBarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58dbcda938e45efcb74026fda3d0a3c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarFlyoutCommandBarFactory(ptr: Pointer?): WithDefault =
        ICommandBarFlyoutCommandBarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarFlyoutCommandBarFactory {
      val address = segment.toRawLongValue()
      return makeICommandBarFlyoutCommandBarFactory(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarFlyoutCommandBarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1854119502_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarFlyoutCommandBarFactory):
        Array<ICommandBarFlyoutCommandBarFactory?> = (elements as
        Array<ICommandBarFlyoutCommandBarFactory?>).castToImpl<ICommandBarFlyoutCommandBarFactory,ICommandBarFlyoutCommandBarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarFlyoutCommandBarFactory?> =
        arrayOfNulls<ICommandBarFlyoutCommandBarFactory_Impl>(size) as
        Array<ICommandBarFlyoutCommandBarFactory?>
  }
}
