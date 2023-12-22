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

@ABIMarker(IAppBarToggleButtonStatics4.ABI::class)
@Signature("{a478b984-e916-4137-bdbd-95bd46ff3ce6}")
@Guid("a478b984e9164137bdbd95bd46ff3ce6")
@WinRTInterface("a478b984e9164137bdbd95bd46ff3ce6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButtonStatics4.ByReference::class)
public interface IAppBarToggleButtonStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyboardAcceleratorTextOverrideProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButtonStatics4> {
    public override fun getValue() = ABI.makeIAppBarToggleButtonStatics4(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButtonStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButtonStatics4 {
    public val __795215549_Ptr: Pointer?

    public val _795215549_VtblPtr: Pointer?
      get() = __795215549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyboardAcceleratorTextOverrideProperty(): DependencyProperty? {
      val fnPtr = _795215549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__795215549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarToggleButtonStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __795215549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButtonStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a478b984e9164137bdbd95bd46ff3ce6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButtonStatics4(ptr: Pointer?): WithDefault =
        IAppBarToggleButtonStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarToggleButtonStatics4 {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButtonStatics4(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButtonStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__795215549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButtonStatics4):
        Array<IAppBarToggleButtonStatics4?> = (elements as
        Array<IAppBarToggleButtonStatics4?>).castToImpl<IAppBarToggleButtonStatics4,IAppBarToggleButtonStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButtonStatics4?> =
        arrayOfNulls<IAppBarToggleButtonStatics4_Impl>(size) as Array<IAppBarToggleButtonStatics4?>
  }
}
