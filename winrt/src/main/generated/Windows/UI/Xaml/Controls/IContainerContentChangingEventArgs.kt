package Windows.UI.Xaml.Controls

import Windows.Foundation.TypedEventHandler
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IContainerContentChangingEventArgs.ABI::class)
@Signature("{07deeaa7-018f-4dda-b399-fd4e13a31bea}")
@Guid("07deeaa7018f4ddab399fd4e13a31bea")
@WinRTInterface("07deeaa7018f4ddab399fd4e13a31bea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContainerContentChangingEventArgs.ByReference::class)
public interface IContainerContentChangingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemContainer(): SelectorItem?

  @InterfaceMethod(1)
  public fun get_InRecycleQueue(): Boolean

  @InterfaceMethod(2)
  public fun get_ItemIndex(): Int

  @InterfaceMethod(3)
  public fun get_Item(): IUnknown?

  @InterfaceMethod(4)
  public fun get_Phase(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_Handled(): Boolean

  @InterfaceMethod(6)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun RegisterUpdateCallback(callback: TypedEventHandler<ListViewBase?,
      ContainerContentChangingEventArgs?>?): Unit

  @InterfaceMethod(8)
  public fun RegisterUpdateCallback(callbackPhase: WinDef.UINT,
      callback: TypedEventHandler<ListViewBase?, ContainerContentChangingEventArgs?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContainerContentChangingEventArgs> {
    public override fun getValue() =
        ABI.makeIContainerContentChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContainerContentChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContainerContentChangingEventArgs {
    public val __597287478_Ptr: Pointer?

    public val _597287478_VtblPtr: Pointer?
      get() = __597287478_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemContainer(): SelectorItem? {
      val fnPtr = _597287478_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SelectorItem>()
      val hr = fn.invokeHR(arrayOf(__597287478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SelectorItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InRecycleQueue(): Boolean {
      val fnPtr = _597287478_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__597287478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ItemIndex(): Int {
      val fnPtr = _597287478_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__597287478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Item(): IUnknown? {
      val fnPtr = _597287478_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__597287478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Phase(): WinDef.UINT {
      val fnPtr = _597287478_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__597287478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Handled(): Boolean {
      val fnPtr = _597287478_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__597287478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _597287478_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__597287478_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun RegisterUpdateCallback(callback: TypedEventHandler<ListViewBase?,
        ContainerContentChangingEventArgs?>?): Unit {
      val fnPtr = _597287478_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__597287478_Ptr, marshalToNative(callback),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun RegisterUpdateCallback(callbackPhase: WinDef.UINT,
        callback: TypedEventHandler<ListViewBase?, ContainerContentChangingEventArgs?>?): Unit {
      val fnPtr = _597287478_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__597287478_Ptr, callbackPhase, marshalToNative(callback),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContainerContentChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __597287478_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContainerContentChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07deeaa7018f4ddab399fd4e13a31bea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContainerContentChangingEventArgs(ptr: Pointer?): WithDefault =
        IContainerContentChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContainerContentChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeIContainerContentChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContainerContentChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__597287478_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContainerContentChangingEventArgs):
        Array<IContainerContentChangingEventArgs?> = (elements as
        Array<IContainerContentChangingEventArgs?>).castToImpl<IContainerContentChangingEventArgs,IContainerContentChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContainerContentChangingEventArgs?> =
        arrayOfNulls<IContainerContentChangingEventArgs_Impl>(size) as
        Array<IContainerContentChangingEventArgs?>
  }
}
