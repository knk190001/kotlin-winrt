package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IFlyoutBaseStatics3.ABI::class)
@Signature("{7ba92e4f-dd16-4be4-99db-bd9d4406c0f8}")
@Guid("7ba92e4fdd164be499dbbd9d4406c0f8")
@WinRTInterface("7ba92e4fdd164be499dbbd9d4406c0f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBaseStatics3.ByReference::class)
public interface IFlyoutBaseStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OverlayInputPassThroughElementProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutBaseStatics3> {
    public override fun getValue() = ABI.makeIFlyoutBaseStatics3(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBaseStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBaseStatics3 {
    public val __1942908022_Ptr: Pointer?

    public val _1942908022_VtblPtr: Pointer?
      get() = __1942908022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OverlayInputPassThroughElementProperty(): DependencyProperty? {
      val fnPtr = _1942908022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1942908022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFlyoutBaseStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1942908022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBaseStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ba92e4fdd164be499dbbd9d4406c0f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBaseStatics3(ptr: Pointer?): WithDefault = IFlyoutBaseStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBaseStatics3 {
      val address = segment.toRawLongValue()
      return makeIFlyoutBaseStatics3(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBaseStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1942908022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBaseStatics3): Array<IFlyoutBaseStatics3?> =
        (elements as
        Array<IFlyoutBaseStatics3?>).castToImpl<IFlyoutBaseStatics3,IFlyoutBaseStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBaseStatics3?> =
        arrayOfNulls<IFlyoutBaseStatics3_Impl>(size) as Array<IFlyoutBaseStatics3?>
  }
}
