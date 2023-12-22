package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(ICommandBarFlyoutCommandBarStatics.ABI::class)
@Signature("{5f7fb950-7c7d-5f5c-8fc5-91344f3b034c}")
@Guid("5f7fb9507c7d5f5c8fc591344f3b034c")
@WinRTInterface("5f7fb9507c7d5f5c8fc591344f3b034c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarFlyoutCommandBarStatics.ByReference::class)
public interface ICommandBarFlyoutCommandBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SystemBackdropProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarFlyoutCommandBarStatics> {
    public override fun getValue() =
        ABI.makeICommandBarFlyoutCommandBarStatics(pointer.getPointer(0))

    public fun setValue(value: ICommandBarFlyoutCommandBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarFlyoutCommandBarStatics {
    public val __1048866057_Ptr: Pointer?

    public val _1048866057_VtblPtr: Pointer?
      get() = __1048866057_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SystemBackdropProperty(): DependencyProperty? {
      val fnPtr = _1048866057_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1048866057_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarFlyoutCommandBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1048866057_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarFlyoutCommandBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f7fb9507c7d5f5c8fc591344f3b034c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarFlyoutCommandBarStatics(ptr: Pointer?): WithDefault =
        ICommandBarFlyoutCommandBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarFlyoutCommandBarStatics {
      val address = segment.toRawLongValue()
      return makeICommandBarFlyoutCommandBarStatics(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarFlyoutCommandBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1048866057_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarFlyoutCommandBarStatics):
        Array<ICommandBarFlyoutCommandBarStatics?> = (elements as
        Array<ICommandBarFlyoutCommandBarStatics?>).castToImpl<ICommandBarFlyoutCommandBarStatics,ICommandBarFlyoutCommandBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarFlyoutCommandBarStatics?> =
        arrayOfNulls<ICommandBarFlyoutCommandBarStatics_Impl>(size) as
        Array<ICommandBarFlyoutCommandBarStatics?>
  }
}
