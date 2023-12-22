package Microsoft.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVirtualizingStackPanel.ABI::class)
@Signature("{7d6103dc-2427-5576-9a69-bf53e2d7180b}")
@Guid("7d6103dc242755769a69bf53e2d7180b")
@WinRTInterface("7d6103dc242755769a69bf53e2d7180b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingStackPanel.ByReference::class)
public interface IVirtualizingStackPanel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreScrollSnapPointsRegular(): Boolean

  @InterfaceMethod(1)
  public fun put_AreScrollSnapPointsRegular(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(3)
  public fun put_Orientation(value: Orientation?): Unit

  @InterfaceMethod(4)
  public fun add_CleanUpVirtualizedItemEvent(handler: CleanUpVirtualizedItemEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_CleanUpVirtualizedItemEvent(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingStackPanel> {
    public override fun getValue() = ABI.makeIVirtualizingStackPanel(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingStackPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingStackPanel {
    public val __1218941033_Ptr: Pointer?

    public val _1218941033_VtblPtr: Pointer?
      get() = __1218941033_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreScrollSnapPointsRegular(): Boolean {
      val fnPtr = _1218941033_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1218941033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AreScrollSnapPointsRegular(value: Boolean): Unit {
      val fnPtr = _1218941033_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1218941033_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _1218941033_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__1218941033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _1218941033_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1218941033_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_CleanUpVirtualizedItemEvent(handler: CleanUpVirtualizedItemEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1218941033_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1218941033_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_CleanUpVirtualizedItemEvent(token: EventRegistrationToken?): Unit {
      val fnPtr = _1218941033_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1218941033_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVirtualizingStackPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1218941033_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingStackPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d6103dc242755769a69bf53e2d7180b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingStackPanel(ptr: Pointer?): WithDefault =
        IVirtualizingStackPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingStackPanel {
      val address = segment.toRawLongValue()
      return makeIVirtualizingStackPanel(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingStackPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1218941033_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingStackPanel): Array<IVirtualizingStackPanel?>
        = (elements as
        Array<IVirtualizingStackPanel?>).castToImpl<IVirtualizingStackPanel,IVirtualizingStackPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingStackPanel?> =
        arrayOfNulls<IVirtualizingStackPanel_Impl>(size) as Array<IVirtualizingStackPanel?>
  }
}
