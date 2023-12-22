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

@ABIMarker(IStackPanelStatics2.ABI::class)
@Signature("{d97e6257-080d-412e-a91a-ce6e5d02aad3}")
@Guid("d97e6257080d412ea91ace6e5d02aad3")
@WinRTInterface("d97e6257080d412ea91ace6e5d02aad3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStackPanelStatics2.ByReference::class)
public interface IStackPanelStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_BorderThicknessProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_PaddingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStackPanelStatics2> {
    public override fun getValue() = ABI.makeIStackPanelStatics2(pointer.getPointer(0))

    public fun setValue(value: IStackPanelStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStackPanelStatics2 {
    public val __803404453_Ptr: Pointer?

    public val _803404453_VtblPtr: Pointer?
      get() = __803404453_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BorderBrushProperty(): DependencyProperty? {
      val fnPtr = _803404453_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__803404453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _803404453_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__803404453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _803404453_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__803404453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PaddingProperty(): DependencyProperty? {
      val fnPtr = _803404453_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__803404453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IStackPanelStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __803404453_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStackPanelStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d97e6257080d412ea91ace6e5d02aad3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStackPanelStatics2(ptr: Pointer?): WithDefault = IStackPanelStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStackPanelStatics2 {
      val address = segment.toRawLongValue()
      return makeIStackPanelStatics2(Pointer(address))
    }

    public override fun toNative(obj: IStackPanelStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__803404453_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStackPanelStatics2): Array<IStackPanelStatics2?> =
        (elements as
        Array<IStackPanelStatics2?>).castToImpl<IStackPanelStatics2,IStackPanelStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStackPanelStatics2?> =
        arrayOfNulls<IStackPanelStatics2_Impl>(size) as Array<IStackPanelStatics2?>
  }
}
