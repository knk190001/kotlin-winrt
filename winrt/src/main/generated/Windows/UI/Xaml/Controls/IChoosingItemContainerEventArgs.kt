package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.SelectorItem
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChoosingItemContainerEventArgs.ABI::class)
@Signature("{9bb43bce-ae67-4a80-8363-e3fe1b244f2c}")
@Guid("9bb43bceae674a808363e3fe1b244f2c")
@WinRTInterface("9bb43bceae674a808363e3fe1b244f2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChoosingItemContainerEventArgs.ByReference::class)
public interface IChoosingItemContainerEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemIndex(): Int

  @InterfaceMethod(1)
  public fun get_Item(): IUnknown?

  @InterfaceMethod(2)
  public fun get_ItemContainer(): SelectorItem?

  @InterfaceMethod(3)
  public fun put_ItemContainer(value: SelectorItem?): Unit

  @InterfaceMethod(4)
  public fun get_IsContainerPrepared(): Boolean

  @InterfaceMethod(5)
  public fun put_IsContainerPrepared(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChoosingItemContainerEventArgs> {
    public override fun getValue() = ABI.makeIChoosingItemContainerEventArgs(pointer.getPointer(0))

    public fun setValue(value: IChoosingItemContainerEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChoosingItemContainerEventArgs {
    public val __2123921625_Ptr: Pointer?

    public val _2123921625_VtblPtr: Pointer?
      get() = __2123921625_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemIndex(): Int {
      val fnPtr = _2123921625_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2123921625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Item(): IUnknown? {
      val fnPtr = _2123921625_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2123921625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ItemContainer(): SelectorItem? {
      val fnPtr = _2123921625_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SelectorItem>()
      val hr = fn.invokeHR(arrayOf(__2123921625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SelectorItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ItemContainer(value: SelectorItem?): Unit {
      val fnPtr = _2123921625_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2123921625_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsContainerPrepared(): Boolean {
      val fnPtr = _2123921625_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2123921625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsContainerPrepared(value: Boolean): Unit {
      val fnPtr = _2123921625_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2123921625_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChoosingItemContainerEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2123921625_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChoosingItemContainerEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9bb43bceae674a808363e3fe1b244f2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChoosingItemContainerEventArgs(ptr: Pointer?): WithDefault =
        IChoosingItemContainerEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChoosingItemContainerEventArgs {
      val address = segment.toRawLongValue()
      return makeIChoosingItemContainerEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IChoosingItemContainerEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2123921625_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChoosingItemContainerEventArgs):
        Array<IChoosingItemContainerEventArgs?> = (elements as
        Array<IChoosingItemContainerEventArgs?>).castToImpl<IChoosingItemContainerEventArgs,IChoosingItemContainerEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChoosingItemContainerEventArgs?> =
        arrayOfNulls<IChoosingItemContainerEventArgs_Impl>(size) as
        Array<IChoosingItemContainerEventArgs?>
  }
}
