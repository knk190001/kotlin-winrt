package Windows.Media.AppBroadcasting

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

@ABIMarker(IAppBroadcastingUI.ABI::class)
@Signature("{e56f9f8f-ee99-4dca-a3c3-70af3db44f5f}")
@Guid("e56f9f8fee994dcaa3c370af3db44f5f")
@WinRTInterface("e56f9f8fee994dcaa3c370af3db44f5f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastingUI.ByReference::class)
public interface IAppBroadcastingUI : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStatus(): AppBroadcastingStatus?

  @InterfaceMethod(1)
  public fun ShowBroadcastUI(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastingUI> {
    public override fun getValue() = ABI.makeIAppBroadcastingUI(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastingUI_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastingUI {
    public val __1149862010_Ptr: Pointer?

    public val _1149862010_VtblPtr: Pointer?
      get() = __1149862010_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStatus(): AppBroadcastingStatus? {
      val fnPtr = _1149862010_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastingStatus>()
      val hr = fn.invokeHR(arrayOf(__1149862010_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastingStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowBroadcastUI(): Unit {
      val fnPtr = _1149862010_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1149862010_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastingUI_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1149862010_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastingUI, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e56f9f8fee994dcaa3c370af3db44f5f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastingUI(ptr: Pointer?): WithDefault = IAppBroadcastingUI_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastingUI {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastingUI(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastingUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1149862010_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastingUI): Array<IAppBroadcastingUI?> =
        (elements as
        Array<IAppBroadcastingUI?>).castToImpl<IAppBroadcastingUI,IAppBroadcastingUI_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastingUI?> =
        arrayOfNulls<IAppBroadcastingUI_Impl>(size) as Array<IAppBroadcastingUI?>
  }
}
