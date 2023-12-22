package Microsoft.UI.Xaml.Shapes

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

@ABIMarker(ILineStatics.ABI::class)
@Signature("{a425bf93-f1f3-5dcb-997e-b6a26f7ae8c0}")
@Guid("a425bf93f1f35dcb997eb6a26f7ae8c0")
@WinRTInterface("a425bf93f1f35dcb997eb6a26f7ae8c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineStatics.ByReference::class)
public interface ILineStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_X1Property(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_Y1Property(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_X2Property(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_Y2Property(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILineStatics> {
    public override fun getValue() = ABI.makeILineStatics(pointer.getPointer(0))

    public fun setValue(value: ILineStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineStatics {
    public val __1353706566_Ptr: Pointer?

    public val _1353706566_VtblPtr: Pointer?
      get() = __1353706566_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_X1Property(): DependencyProperty? {
      val fnPtr = _1353706566_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1353706566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Y1Property(): DependencyProperty? {
      val fnPtr = _1353706566_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1353706566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_X2Property(): DependencyProperty? {
      val fnPtr = _1353706566_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1353706566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Y2Property(): DependencyProperty? {
      val fnPtr = _1353706566_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1353706566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ILineStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1353706566_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a425bf93f1f35dcb997eb6a26f7ae8c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineStatics(ptr: Pointer?): WithDefault = ILineStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineStatics {
      val address = segment.toRawLongValue()
      return makeILineStatics(Pointer(address))
    }

    public override fun toNative(obj: ILineStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1353706566_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineStatics): Array<ILineStatics?> = (elements as
        Array<ILineStatics?>).castToImpl<ILineStatics,ILineStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineStatics?> =
        arrayOfNulls<ILineStatics_Impl>(size) as Array<ILineStatics?>
  }
}
