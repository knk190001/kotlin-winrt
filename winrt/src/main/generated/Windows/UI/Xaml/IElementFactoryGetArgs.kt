package Windows.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IElementFactoryGetArgs.ABI::class)
@Signature("{fb508774-41a3-5829-9255-cf452d041df4}")
@Guid("fb50877441a358299255cf452d041df4")
@WinRTInterface("fb50877441a358299255cf452d041df4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElementFactoryGetArgs.ByReference::class)
public interface IElementFactoryGetArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Data(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_Parent(): UIElement?

  @InterfaceMethod(3)
  public fun put_Parent(value: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IElementFactoryGetArgs> {
    public override fun getValue() = ABI.makeIElementFactoryGetArgs(pointer.getPointer(0))

    public fun setValue(value: IElementFactoryGetArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElementFactoryGetArgs {
    public val __1752628237_Ptr: Pointer?

    public val _1752628237_VtblPtr: Pointer?
      get() = __1752628237_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): IUnknown? {
      val fnPtr = _1752628237_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1752628237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Data(value: IUnknown?): Unit {
      val fnPtr = _1752628237_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752628237_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Parent(): UIElement? {
      val fnPtr = _1752628237_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1752628237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Parent(value: UIElement?): Unit {
      val fnPtr = _1752628237_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752628237_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IElementFactoryGetArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1752628237_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementFactoryGetArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb50877441a358299255cf452d041df4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementFactoryGetArgs(ptr: Pointer?): WithDefault =
        IElementFactoryGetArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementFactoryGetArgs {
      val address = segment.toRawLongValue()
      return makeIElementFactoryGetArgs(Pointer(address))
    }

    public override fun toNative(obj: IElementFactoryGetArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1752628237_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElementFactoryGetArgs): Array<IElementFactoryGetArgs?> =
        (elements as
        Array<IElementFactoryGetArgs?>).castToImpl<IElementFactoryGetArgs,IElementFactoryGetArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElementFactoryGetArgs?> =
        arrayOfNulls<IElementFactoryGetArgs_Impl>(size) as Array<IElementFactoryGetArgs?>
  }
}
