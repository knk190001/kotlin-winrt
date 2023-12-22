package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(ISplitView3.ABI::class)
@Signature("{0ea12d8d-1171-407b-96d3-5e1b470c3ec5}")
@Guid("0ea12d8d1171407b96d35e1b470c3ec5")
@WinRTInterface("0ea12d8d1171407b96d35e1b470c3ec5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitView3.ByReference::class)
public interface ISplitView3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PaneOpening(handler: TypedEventHandler<SplitView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PaneOpening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_PaneOpened(handler: TypedEventHandler<SplitView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PaneOpened(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISplitView3> {
    public override fun getValue() = ABI.makeISplitView3(pointer.getPointer(0))

    public fun setValue(value: ISplitView3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitView3 {
    public val __1871062960_Ptr: Pointer?

    public val _1871062960_VtblPtr: Pointer?
      get() = __1871062960_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_PaneOpening(handler: TypedEventHandler<SplitView?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1871062960_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1871062960_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PaneOpening(token: EventRegistrationToken?): Unit {
      val fnPtr = _1871062960_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1871062960_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_PaneOpened(handler: TypedEventHandler<SplitView?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1871062960_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1871062960_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PaneOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _1871062960_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1871062960_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISplitView3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1871062960_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitView3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ea12d8d1171407b96d35e1b470c3ec5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitView3(ptr: Pointer?): WithDefault = ISplitView3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitView3 {
      val address = segment.toRawLongValue()
      return makeISplitView3(Pointer(address))
    }

    public override fun toNative(obj: ISplitView3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1871062960_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitView3): Array<ISplitView3?> = (elements as
        Array<ISplitView3?>).castToImpl<ISplitView3,ISplitView3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitView3?> =
        arrayOfNulls<ISplitView3_Impl>(size) as Array<ISplitView3?>
  }
}
