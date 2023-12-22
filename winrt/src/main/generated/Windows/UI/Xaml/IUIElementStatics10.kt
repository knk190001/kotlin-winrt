package Windows.UI.Xaml

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

@ABIMarker(IUIElementStatics10.ABI::class)
@Signature("{60d25362-4b3e-53da-8b78-38db94ae8f26}")
@Guid("60d253624b3e53da8b7838db94ae8f26")
@WinRTInterface("60d253624b3e53da8b7838db94ae8f26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementStatics10.ByReference::class)
public interface IUIElementStatics10 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShadowProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementStatics10> {
    public override fun getValue() = ABI.makeIUIElementStatics10(pointer.getPointer(0))

    public fun setValue(value: IUIElementStatics10_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementStatics10 {
    public val __744605038_Ptr: Pointer?

    public val _744605038_VtblPtr: Pointer?
      get() = __744605038_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShadowProperty(): DependencyProperty? {
      val fnPtr = _744605038_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__744605038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IUIElementStatics10_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __744605038_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementStatics10, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("60d253624b3e53da8b7838db94ae8f26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementStatics10(ptr: Pointer?): WithDefault = IUIElementStatics10_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementStatics10 {
      val address = segment.toRawLongValue()
      return makeIUIElementStatics10(Pointer(address))
    }

    public override fun toNative(obj: IUIElementStatics10): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__744605038_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementStatics10): Array<IUIElementStatics10?> =
        (elements as
        Array<IUIElementStatics10?>).castToImpl<IUIElementStatics10,IUIElementStatics10_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementStatics10?> =
        arrayOfNulls<IUIElementStatics10_Impl>(size) as Array<IUIElementStatics10?>
  }
}
