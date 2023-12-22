package Windows.UI.Xaml.Controls

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

@ABIMarker(IStackPanelStatics4.ABI::class)
@Signature("{279cdd71-067b-459f-815f-ecd85c5e4843}")
@Guid("279cdd71067b459f815fecd85c5e4843")
@WinRTInterface("279cdd71067b459f815fecd85c5e4843")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStackPanelStatics4.ByReference::class)
public interface IStackPanelStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SpacingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStackPanelStatics4> {
    public override fun getValue() = ABI.makeIStackPanelStatics4(pointer.getPointer(0))

    public fun setValue(value: IStackPanelStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStackPanelStatics4 {
    public val __803404455_Ptr: Pointer?

    public val _803404455_VtblPtr: Pointer?
      get() = __803404455_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SpacingProperty(): DependencyProperty? {
      val fnPtr = _803404455_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__803404455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IStackPanelStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __803404455_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStackPanelStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("279cdd71067b459f815fecd85c5e4843")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStackPanelStatics4(ptr: Pointer?): WithDefault = IStackPanelStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStackPanelStatics4 {
      val address = segment.toRawLongValue()
      return makeIStackPanelStatics4(Pointer(address))
    }

    public override fun toNative(obj: IStackPanelStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__803404455_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStackPanelStatics4): Array<IStackPanelStatics4?> =
        (elements as
        Array<IStackPanelStatics4?>).castToImpl<IStackPanelStatics4,IStackPanelStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStackPanelStatics4?> =
        arrayOfNulls<IStackPanelStatics4_Impl>(size) as Array<IStackPanelStatics4?>
  }
}
