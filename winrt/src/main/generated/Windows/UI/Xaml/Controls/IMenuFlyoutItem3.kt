package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.MenuFlyoutItemTemplateSettings
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMenuFlyoutItem3.ABI::class)
@Signature("{9727b2e3-b2b6-49dc-8c22-e0138b941559}")
@Guid("9727b2e3b2b649dc8c22e0138b941559")
@WinRTInterface("9727b2e3b2b649dc8c22e0138b941559")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutItem3.ByReference::class)
public interface IMenuFlyoutItem3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyboardAcceleratorTextOverride(): String?

  @InterfaceMethod(1)
  public fun put_KeyboardAcceleratorTextOverride(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_TemplateSettings(): MenuFlyoutItemTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutItem3> {
    public override fun getValue() = ABI.makeIMenuFlyoutItem3(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutItem3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutItem3 {
    public val __171815990_Ptr: Pointer?

    public val _171815990_VtblPtr: Pointer?
      get() = __171815990_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyboardAcceleratorTextOverride(): String? {
      val fnPtr = _171815990_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__171815990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_KeyboardAcceleratorTextOverride(value: String?): Unit {
      val fnPtr = _171815990_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__171815990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TemplateSettings(): MenuFlyoutItemTemplateSettings? {
      val fnPtr = _171815990_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuFlyoutItemTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__171815990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuFlyoutItemTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutItem3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __171815990_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutItem3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9727b2e3b2b649dc8c22e0138b941559")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutItem3(ptr: Pointer?): WithDefault = IMenuFlyoutItem3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutItem3 {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutItem3(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutItem3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__171815990_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutItem3): Array<IMenuFlyoutItem3?> = (elements as
        Array<IMenuFlyoutItem3?>).castToImpl<IMenuFlyoutItem3,IMenuFlyoutItem3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutItem3?> =
        arrayOfNulls<IMenuFlyoutItem3_Impl>(size) as Array<IMenuFlyoutItem3?>
  }
}
