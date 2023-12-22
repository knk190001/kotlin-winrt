package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(IItemContainer.ABI::class)
@Signature("{6332a67f-7fd9-53c7-afd8-cfa1237cf6d1}")
@Guid("6332a67f7fd953c7afd8cfa1237cf6d1")
@WinRTInterface("6332a67f7fd953c7afd8cfa1237cf6d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemContainer.ByReference::class)
public interface IItemContainer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Child(): UIElement?

  @InterfaceMethod(1)
  public fun put_Child(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_IsSelected(): Boolean

  @InterfaceMethod(3)
  public fun put_IsSelected(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IItemContainer>
      {
    public override fun getValue() = ABI.makeIItemContainer(pointer.getPointer(0))

    public fun setValue(value: IItemContainer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemContainer {
    public val __760953785_Ptr: Pointer?

    public val _760953785_VtblPtr: Pointer?
      get() = __760953785_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Child(): UIElement? {
      val fnPtr = _760953785_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__760953785_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Child(value: UIElement?): Unit {
      val fnPtr = _760953785_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__760953785_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsSelected(): Boolean {
      val fnPtr = _760953785_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__760953785_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsSelected(value: Boolean): Unit {
      val fnPtr = _760953785_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__760953785_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemContainer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __760953785_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemContainer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6332a67f7fd953c7afd8cfa1237cf6d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemContainer(ptr: Pointer?): WithDefault = IItemContainer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemContainer {
      val address = segment.toRawLongValue()
      return makeIItemContainer(Pointer(address))
    }

    public override fun toNative(obj: IItemContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__760953785_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemContainer): Array<IItemContainer?> = (elements as
        Array<IItemContainer?>).castToImpl<IItemContainer,IItemContainer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemContainer?> =
        arrayOfNulls<IItemContainer_Impl>(size) as Array<IItemContainer?>
  }
}
