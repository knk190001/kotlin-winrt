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

@ABIMarker(ISliderStatics2.ABI::class)
@Signature("{00e7935d-79a5-4759-96a6-29e0a94add33}")
@Guid("00e7935d79a5475996a629e0a94add33")
@WinRTInterface("00e7935d79a5475996a629e0a94add33")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISliderStatics2.ByReference::class)
public interface ISliderStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISliderStatics2> {
    public override fun getValue() = ABI.makeISliderStatics2(pointer.getPointer(0))

    public fun setValue(value: ISliderStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISliderStatics2 {
    public val __869703638_Ptr: Pointer?

    public val _869703638_VtblPtr: Pointer?
      get() = __869703638_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _869703638_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__869703638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _869703638_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__869703638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISliderStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __869703638_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISliderStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00e7935d79a5475996a629e0a94add33")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISliderStatics2(ptr: Pointer?): WithDefault = ISliderStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISliderStatics2 {
      val address = segment.toRawLongValue()
      return makeISliderStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISliderStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__869703638_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISliderStatics2): Array<ISliderStatics2?> = (elements as
        Array<ISliderStatics2?>).castToImpl<ISliderStatics2,ISliderStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISliderStatics2?> =
        arrayOfNulls<ISliderStatics2_Impl>(size) as Array<ISliderStatics2?>
  }
}
