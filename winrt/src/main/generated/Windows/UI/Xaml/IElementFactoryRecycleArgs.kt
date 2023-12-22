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

@ABIMarker(IElementFactoryRecycleArgs.ABI::class)
@Signature("{86f16b14-37e8-5dd8-a90c-25d3710318b0}")
@Guid("86f16b1437e85dd8a90c25d3710318b0")
@WinRTInterface("86f16b1437e85dd8a90c25d3710318b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElementFactoryRecycleArgs.ByReference::class)
public interface IElementFactoryRecycleArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Element(): UIElement?

  @InterfaceMethod(1)
  public fun put_Element(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_Parent(): UIElement?

  @InterfaceMethod(3)
  public fun put_Parent(value: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IElementFactoryRecycleArgs> {
    public override fun getValue() = ABI.makeIElementFactoryRecycleArgs(pointer.getPointer(0))

    public fun setValue(value: IElementFactoryRecycleArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElementFactoryRecycleArgs {
    public val __396275888_Ptr: Pointer?

    public val _396275888_VtblPtr: Pointer?
      get() = __396275888_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Element(): UIElement? {
      val fnPtr = _396275888_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__396275888_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Element(value: UIElement?): Unit {
      val fnPtr = _396275888_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__396275888_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Parent(): UIElement? {
      val fnPtr = _396275888_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__396275888_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Parent(value: UIElement?): Unit {
      val fnPtr = _396275888_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__396275888_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IElementFactoryRecycleArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __396275888_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementFactoryRecycleArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86f16b1437e85dd8a90c25d3710318b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementFactoryRecycleArgs(ptr: Pointer?): WithDefault =
        IElementFactoryRecycleArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementFactoryRecycleArgs {
      val address = segment.toRawLongValue()
      return makeIElementFactoryRecycleArgs(Pointer(address))
    }

    public override fun toNative(obj: IElementFactoryRecycleArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__396275888_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElementFactoryRecycleArgs):
        Array<IElementFactoryRecycleArgs?> = (elements as
        Array<IElementFactoryRecycleArgs?>).castToImpl<IElementFactoryRecycleArgs,IElementFactoryRecycleArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElementFactoryRecycleArgs?> =
        arrayOfNulls<IElementFactoryRecycleArgs_Impl>(size) as Array<IElementFactoryRecycleArgs?>
  }
}
