package Windows.UI.Xaml

import Windows.UI.Xaml.Media.ElementCompositeMode
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

@ABIMarker(IUIElement2.ABI::class)
@Signature("{676d0bf9-b66c-41d6-ba50-58cf87f201d1}")
@Guid("676d0bf9b66c41d6ba5058cf87f201d1")
@WinRTInterface("676d0bf9b66c41d6ba5058cf87f201d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElement2.ByReference::class)
public interface IUIElement2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CompositeMode(): ElementCompositeMode?

  @InterfaceMethod(1)
  public fun put_CompositeMode(value: ElementCompositeMode?): Unit

  @InterfaceMethod(2)
  public fun CancelDirectManipulations(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUIElement2> {
    public override fun getValue() = ABI.makeIUIElement2(pointer.getPointer(0))

    public fun setValue(value: IUIElement2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElement2 {
    public val __1021118236_Ptr: Pointer?

    public val _1021118236_VtblPtr: Pointer?
      get() = __1021118236_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CompositeMode(): ElementCompositeMode? {
      val fnPtr = _1021118236_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementCompositeMode>()
      val hr = fn.invokeHR(arrayOf(__1021118236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementCompositeMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CompositeMode(value: ElementCompositeMode?): Unit {
      val fnPtr = _1021118236_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118236_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun CancelDirectManipulations(): Boolean {
      val fnPtr = _1021118236_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1021118236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IUIElement2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1021118236_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElement2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("676d0bf9b66c41d6ba5058cf87f201d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElement2(ptr: Pointer?): WithDefault = IUIElement2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElement2 {
      val address = segment.toRawLongValue()
      return makeIUIElement2(Pointer(address))
    }

    public override fun toNative(obj: IUIElement2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1021118236_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElement2): Array<IUIElement2?> = (elements as
        Array<IUIElement2?>).castToImpl<IUIElement2,IUIElement2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElement2?> =
        arrayOfNulls<IUIElement2_Impl>(size) as Array<IUIElement2?>
  }
}
