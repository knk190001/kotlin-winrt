package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IFlyoutPresenterStatics.ABI::class)
@Signature("{b415a2ec-1bdd-5f94-9500-257223646469}")
@Guid("b415a2ec1bdd5f949500257223646469")
@WinRTInterface("b415a2ec1bdd5f949500257223646469")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutPresenterStatics.ByReference::class)
public interface IFlyoutPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDefaultShadowEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutPresenterStatics> {
    public override fun getValue() = ABI.makeIFlyoutPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: IFlyoutPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutPresenterStatics {
    public val __589984097_Ptr: Pointer?

    public val _589984097_VtblPtr: Pointer?
      get() = __589984097_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDefaultShadowEnabledProperty(): DependencyProperty? {
      val fnPtr = _589984097_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__589984097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFlyoutPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __589984097_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b415a2ec1bdd5f949500257223646469")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutPresenterStatics(ptr: Pointer?): WithDefault =
        IFlyoutPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutPresenterStatics {
      val address = segment.toRawLongValue()
      return makeIFlyoutPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__589984097_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutPresenterStatics): Array<IFlyoutPresenterStatics?>
        = (elements as
        Array<IFlyoutPresenterStatics?>).castToImpl<IFlyoutPresenterStatics,IFlyoutPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutPresenterStatics?> =
        arrayOfNulls<IFlyoutPresenterStatics_Impl>(size) as Array<IFlyoutPresenterStatics?>
  }
}
