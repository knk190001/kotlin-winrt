package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyObject
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IControlStatics5.ABI::class)
@Signature("{f635b5a3-ef8e-404f-877b-5580473710a6}")
@Guid("f635b5a3ef8e404f877b5580473710a6")
@WinRTInterface("f635b5a3ef8e404f877b5580473710a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlStatics5.ByReference::class)
public interface IControlStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DefaultStyleResourceUriProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsTemplateKeyTipTargetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun GetIsTemplateKeyTipTarget(element: DependencyObject?): Boolean

  @InterfaceMethod(3)
  public fun SetIsTemplateKeyTipTarget(element: DependencyObject?, value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlStatics5> {
    public override fun getValue() = ABI.makeIControlStatics5(pointer.getPointer(0))

    public fun setValue(value: IControlStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlStatics5 {
    public val __2067758577_Ptr: Pointer?

    public val _2067758577_VtblPtr: Pointer?
      get() = __2067758577_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DefaultStyleResourceUriProperty(): DependencyProperty? {
      val fnPtr = _2067758577_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758577_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsTemplateKeyTipTargetProperty(): DependencyProperty? {
      val fnPtr = _2067758577_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758577_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetIsTemplateKeyTipTarget(element: DependencyObject?): Boolean {
      val fnPtr = _2067758577_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2067758577_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun SetIsTemplateKeyTipTarget(element: DependencyObject?, value: Boolean):
        Unit {
      val fnPtr = _2067758577_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067758577_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IControlStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2067758577_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f635b5a3ef8e404f877b5580473710a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlStatics5(ptr: Pointer?): WithDefault = IControlStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlStatics5 {
      val address = segment.toRawLongValue()
      return makeIControlStatics5(Pointer(address))
    }

    public override fun toNative(obj: IControlStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2067758577_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlStatics5): Array<IControlStatics5?> = (elements as
        Array<IControlStatics5?>).castToImpl<IControlStatics5,IControlStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlStatics5?> =
        arrayOfNulls<IControlStatics5_Impl>(size) as Array<IControlStatics5?>
  }
}
