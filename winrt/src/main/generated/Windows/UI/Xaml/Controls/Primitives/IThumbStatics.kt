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

@ABIMarker(IThumbStatics.ABI::class)
@Signature("{955024eb-36f3-4672-a186-baaf626ac4ad}")
@Guid("955024eb36f34672a186baaf626ac4ad")
@WinRTInterface("955024eb36f34672a186baaf626ac4ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThumbStatics.ByReference::class)
public interface IThumbStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDraggingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IThumbStatics>
      {
    public override fun getValue() = ABI.makeIThumbStatics(pointer.getPointer(0))

    public fun setValue(value: IThumbStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThumbStatics {
    public val __1572055531_Ptr: Pointer?

    public val _1572055531_VtblPtr: Pointer?
      get() = __1572055531_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDraggingProperty(): DependencyProperty? {
      val fnPtr = _1572055531_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1572055531_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IThumbStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1572055531_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThumbStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("955024eb36f34672a186baaf626ac4ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThumbStatics(ptr: Pointer?): WithDefault = IThumbStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThumbStatics {
      val address = segment.toRawLongValue()
      return makeIThumbStatics(Pointer(address))
    }

    public override fun toNative(obj: IThumbStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1572055531_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThumbStatics): Array<IThumbStatics?> = (elements as
        Array<IThumbStatics?>).castToImpl<IThumbStatics,IThumbStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThumbStatics?> =
        arrayOfNulls<IThumbStatics_Impl>(size) as Array<IThumbStatics?>
  }
}
