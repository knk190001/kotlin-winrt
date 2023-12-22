package Microsoft.UI.Xaml.Controls

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStackLayout.ABI::class)
@Signature("{3ea9c3dd-8103-571f-9e07-44ea76c91a10}")
@Guid("3ea9c3dd8103571f9e0744ea76c91a10")
@WinRTInterface("3ea9c3dd8103571f9e0744ea76c91a10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStackLayout.ByReference::class)
public interface IStackLayout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(1)
  public fun put_Orientation(value: Orientation?): Unit

  @InterfaceMethod(2)
  public fun get_Spacing(): Double

  @InterfaceMethod(3)
  public fun put_Spacing(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStackLayout> {
    public override fun getValue() = ABI.makeIStackLayout(pointer.getPointer(0))

    public fun setValue(value: IStackLayout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStackLayout {
    public val __878592939_Ptr: Pointer?

    public val _878592939_VtblPtr: Pointer?
      get() = __878592939_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _878592939_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__878592939_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _878592939_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__878592939_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Spacing(): Double {
      val fnPtr = _878592939_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__878592939_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Spacing(value: Double): Unit {
      val fnPtr = _878592939_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__878592939_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStackLayout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __878592939_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStackLayout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ea9c3dd8103571f9e0744ea76c91a10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStackLayout(ptr: Pointer?): WithDefault = IStackLayout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStackLayout {
      val address = segment.toRawLongValue()
      return makeIStackLayout(Pointer(address))
    }

    public override fun toNative(obj: IStackLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__878592939_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStackLayout): Array<IStackLayout?> = (elements as
        Array<IStackLayout?>).castToImpl<IStackLayout,IStackLayout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStackLayout?> =
        arrayOfNulls<IStackLayout_Impl>(size) as Array<IStackLayout?>
  }
}
