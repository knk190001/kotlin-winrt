package Windows.UI.Xaml.Documents

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

@ABIMarker(IHyperlinkStatics3.ABI::class)
@Signature("{3e15dea0-205e-4947-99a5-74e757e8e1b4}")
@Guid("3e15dea0205e494799a574e757e8e1b4")
@WinRTInterface("3e15dea0205e494799a574e757e8e1b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlinkStatics3.ByReference::class)
public interface IHyperlinkStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_XYFocusLeftProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_XYFocusRightProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_XYFocusUpProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_XYFocusDownProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_ElementSoundModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHyperlinkStatics3> {
    public override fun getValue() = ABI.makeIHyperlinkStatics3(pointer.getPointer(0))

    public fun setValue(value: IHyperlinkStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlinkStatics3 {
    public val __1118548372_Ptr: Pointer?

    public val _1118548372_VtblPtr: Pointer?
      get() = __1118548372_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_XYFocusLeftProperty(): DependencyProperty? {
      val fnPtr = _1118548372_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1118548372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_XYFocusRightProperty(): DependencyProperty? {
      val fnPtr = _1118548372_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1118548372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_XYFocusUpProperty(): DependencyProperty? {
      val fnPtr = _1118548372_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1118548372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_XYFocusDownProperty(): DependencyProperty? {
      val fnPtr = _1118548372_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1118548372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ElementSoundModeProperty(): DependencyProperty? {
      val fnPtr = _1118548372_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1118548372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IHyperlinkStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1118548372_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlinkStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3e15dea0205e494799a574e757e8e1b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlinkStatics3(ptr: Pointer?): WithDefault = IHyperlinkStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlinkStatics3 {
      val address = segment.toRawLongValue()
      return makeIHyperlinkStatics3(Pointer(address))
    }

    public override fun toNative(obj: IHyperlinkStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1118548372_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlinkStatics3): Array<IHyperlinkStatics3?> =
        (elements as
        Array<IHyperlinkStatics3?>).castToImpl<IHyperlinkStatics3,IHyperlinkStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlinkStatics3?> =
        arrayOfNulls<IHyperlinkStatics3_Impl>(size) as Array<IHyperlinkStatics3?>
  }
}
