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

@ABIMarker(IInfoBadgeStatics.ABI::class)
@Signature("{b0160061-b463-54de-81ac-64f390d4f25d}")
@Guid("b0160061b46354de81ac64f390d4f25d")
@WinRTInterface("b0160061b46354de81ac64f390d4f25d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBadgeStatics.ByReference::class)
public interface IInfoBadgeStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ValueProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IconSourceProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_TemplateSettingsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBadgeStatics> {
    public override fun getValue() = ABI.makeIInfoBadgeStatics(pointer.getPointer(0))

    public fun setValue(value: IInfoBadgeStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBadgeStatics {
    public val __1460384311_Ptr: Pointer?

    public val _1460384311_VtblPtr: Pointer?
      get() = __1460384311_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ValueProperty(): DependencyProperty? {
      val fnPtr = _1460384311_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1460384311_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IconSourceProperty(): DependencyProperty? {
      val fnPtr = _1460384311_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1460384311_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TemplateSettingsProperty(): DependencyProperty? {
      val fnPtr = _1460384311_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1460384311_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInfoBadgeStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1460384311_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBadgeStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0160061b46354de81ac64f390d4f25d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBadgeStatics(ptr: Pointer?): WithDefault = IInfoBadgeStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBadgeStatics {
      val address = segment.toRawLongValue()
      return makeIInfoBadgeStatics(Pointer(address))
    }

    public override fun toNative(obj: IInfoBadgeStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1460384311_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBadgeStatics): Array<IInfoBadgeStatics?> = (elements
        as Array<IInfoBadgeStatics?>).castToImpl<IInfoBadgeStatics,IInfoBadgeStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBadgeStatics?> =
        arrayOfNulls<IInfoBadgeStatics_Impl>(size) as Array<IInfoBadgeStatics?>
  }
}
