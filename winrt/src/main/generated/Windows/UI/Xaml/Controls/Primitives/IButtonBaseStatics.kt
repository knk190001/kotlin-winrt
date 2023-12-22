package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IButtonBaseStatics.ABI::class)
@Signature("{67ef17e1-fe37-474f-9e97-3b5e0b30f2df}")
@Guid("67ef17e1fe37474f9e973b5e0b30f2df")
@WinRTInterface("67ef17e1fe37474f9e973b5e0b30f2df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IButtonBaseStatics.ByReference::class)
public interface IButtonBaseStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClickModeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsPointerOverProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsPressedProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_CommandProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_CommandParameterProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IButtonBaseStatics> {
    public override fun getValue() = ABI.makeIButtonBaseStatics(pointer.getPointer(0))

    public fun setValue(value: IButtonBaseStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IButtonBaseStatics {
    public val __648718790_Ptr: Pointer?

    public val _648718790_VtblPtr: Pointer?
      get() = __648718790_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClickModeProperty(): DependencyProperty? {
      val fnPtr = _648718790_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__648718790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsPointerOverProperty(): DependencyProperty? {
      val fnPtr = _648718790_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__648718790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsPressedProperty(): DependencyProperty? {
      val fnPtr = _648718790_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__648718790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CommandProperty(): DependencyProperty? {
      val fnPtr = _648718790_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__648718790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CommandParameterProperty(): DependencyProperty? {
      val fnPtr = _648718790_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__648718790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IButtonBaseStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __648718790_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IButtonBaseStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67ef17e1fe37474f9e973b5e0b30f2df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIButtonBaseStatics(ptr: Pointer?): WithDefault = IButtonBaseStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IButtonBaseStatics {
      val address = segment.toRawLongValue()
      return makeIButtonBaseStatics(Pointer(address))
    }

    public override fun toNative(obj: IButtonBaseStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__648718790_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IButtonBaseStatics): Array<IButtonBaseStatics?> =
        (elements as
        Array<IButtonBaseStatics?>).castToImpl<IButtonBaseStatics,IButtonBaseStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IButtonBaseStatics?> =
        arrayOfNulls<IButtonBaseStatics_Impl>(size) as Array<IButtonBaseStatics?>
  }
}
