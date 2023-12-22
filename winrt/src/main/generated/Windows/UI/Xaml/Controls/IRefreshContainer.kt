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

@ABIMarker(IRefreshContainer.ABI::class)
@Signature("{535dc413-b1d5-43c1-b057-8658ce1e0ba2}")
@Guid("535dc413b1d543c1b0578658ce1e0ba2")
@WinRTInterface("535dc413b1d543c1b0578658ce1e0ba2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRefreshContainer.ByReference::class)
public interface IRefreshContainer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Visualizer(): RefreshVisualizer?

  @InterfaceMethod(1)
  public fun put_Visualizer(value: RefreshVisualizer?): Unit

  @InterfaceMethod(2)
  public fun get_PullDirection(): RefreshPullDirection?

  @InterfaceMethod(3)
  public fun put_PullDirection(value: RefreshPullDirection?): Unit

  @InterfaceMethod(4)
  public fun add_RefreshRequested(handler: TypedEventHandler<RefreshContainer?,
      RefreshRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_RefreshRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun RequestRefresh(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRefreshContainer> {
    public override fun getValue() = ABI.makeIRefreshContainer(pointer.getPointer(0))

    public fun setValue(value: IRefreshContainer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRefreshContainer {
    public val __934511618_Ptr: Pointer?

    public val _934511618_VtblPtr: Pointer?
      get() = __934511618_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Visualizer(): RefreshVisualizer? {
      val fnPtr = _934511618_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RefreshVisualizer>()
      val hr = fn.invokeHR(arrayOf(__934511618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RefreshVisualizer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Visualizer(value: RefreshVisualizer?): Unit {
      val fnPtr = _934511618_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__934511618_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PullDirection(): RefreshPullDirection? {
      val fnPtr = _934511618_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RefreshPullDirection>()
      val hr = fn.invokeHR(arrayOf(__934511618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RefreshPullDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PullDirection(value: RefreshPullDirection?): Unit {
      val fnPtr = _934511618_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__934511618_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_RefreshRequested(handler: TypedEventHandler<RefreshContainer?,
        RefreshRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _934511618_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__934511618_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_RefreshRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _934511618_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__934511618_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun RequestRefresh(): Unit {
      val fnPtr = _934511618_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__934511618_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRefreshContainer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __934511618_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRefreshContainer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("535dc413b1d543c1b0578658ce1e0ba2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRefreshContainer(ptr: Pointer?): WithDefault = IRefreshContainer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRefreshContainer {
      val address = segment.toRawLongValue()
      return makeIRefreshContainer(Pointer(address))
    }

    public override fun toNative(obj: IRefreshContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__934511618_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRefreshContainer): Array<IRefreshContainer?> = (elements
        as Array<IRefreshContainer?>).castToImpl<IRefreshContainer,IRefreshContainer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRefreshContainer?> =
        arrayOfNulls<IRefreshContainer_Impl>(size) as Array<IRefreshContainer?>
  }
}
