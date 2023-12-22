package Windows.UI.Xaml

import Windows.UI.Xaml.Input.Pointer
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

@ABIMarker(IUIElementStatics3.ABI::class)
@Signature("{d1f87ade-eca1-4561-a32b-64601b4e0597}")
@Guid("d1f87adeeca14561a32b64601b4e0597")
@WinRTInterface("d1f87adeeca14561a32b64601b4e0597")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementStatics3.ByReference::class)
public interface IUIElementStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Transform3DProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CanDragProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun TryStartDirectManipulation(value: Pointer?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementStatics3> {
    public override fun getValue() = ABI.makeIUIElementStatics3(pointer.getPointer(0))

    public fun setValue(value: IUIElementStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementStatics3 {
    public val __1915643132_Ptr: com.sun.jna.Pointer?

    public val _1915643132_VtblPtr: com.sun.jna.Pointer?
      get() = __1915643132_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Transform3DProperty(): DependencyProperty? {
      val fnPtr = _1915643132_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanDragProperty(): DependencyProperty? {
      val fnPtr = _1915643132_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryStartDirectManipulation(value: Pointer?): Boolean {
      val fnPtr = _1915643132_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1915643132_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IUIElementStatics3_Impl(
    ptr: com.sun.jna.Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1915643132_Ptr: com.sun.jna.Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1f87adeeca14561a32b64601b4e0597")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementStatics3(ptr: com.sun.jna.Pointer?): WithDefault =
        IUIElementStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementStatics3 {
      val address = segment.toRawLongValue()
      return makeIUIElementStatics3(com.sun.jna.Pointer(address))
    }

    public override fun toNative(obj: IUIElementStatics3): MemoryAddress =
        MemoryAddress.ofLong(com.sun.jna.Pointer.nativeValue((obj as WithDefault).__1915643132_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementStatics3): Array<IUIElementStatics3?> =
        (elements as
        Array<IUIElementStatics3?>).castToImpl<IUIElementStatics3,IUIElementStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementStatics3?> =
        arrayOfNulls<IUIElementStatics3_Impl>(size) as Array<IUIElementStatics3?>
  }
}
