package Windows.Graphics.Holographic

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IHolographicSpace2.ABI::class)
@Signature("{4f81a9a8-b7ff-4883-9827-7d677287ea70}")
@Guid("4f81a9a8b7ff488398277d677287ea70")
@WinRTInterface("4f81a9a8b7ff488398277d677287ea70")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicSpace2.ByReference::class)
public interface IHolographicSpace2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UserPresence(): HolographicSpaceUserPresence?

  @InterfaceMethod(1)
  public fun add_UserPresenceChanged(handler: TypedEventHandler<HolographicSpace?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_UserPresenceChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun WaitForNextFrameReady(): Unit

  @InterfaceMethod(4)
  public fun WaitForNextFrameReadyWithHeadStart(requestedHeadStartDuration: TimeSpan?): Unit

  @InterfaceMethod(5)
  public fun CreateFramePresentationMonitor(maxQueuedReports: WinDef.UINT):
      HolographicFramePresentationMonitor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicSpace2> {
    public override fun getValue() = ABI.makeIHolographicSpace2(pointer.getPointer(0))

    public fun setValue(value: IHolographicSpace2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicSpace2 {
    public val __12649401_Ptr: Pointer?

    public val _12649401_VtblPtr: Pointer?
      get() = __12649401_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UserPresence(): HolographicSpaceUserPresence? {
      val fnPtr = _12649401_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicSpaceUserPresence>()
      val hr = fn.invokeHR(arrayOf(__12649401_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicSpaceUserPresence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_UserPresenceChanged(handler: TypedEventHandler<HolographicSpace?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _12649401_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__12649401_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_UserPresenceChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _12649401_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__12649401_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun WaitForNextFrameReady(): Unit {
      val fnPtr = _12649401_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__12649401_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun WaitForNextFrameReadyWithHeadStart(requestedHeadStartDuration: TimeSpan?):
        Unit {
      val fnPtr = _12649401_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__12649401_Ptr, marshalToNative(requestedHeadStartDuration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun CreateFramePresentationMonitor(maxQueuedReports: WinDef.UINT):
        HolographicFramePresentationMonitor? {
      val fnPtr = _12649401_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicFramePresentationMonitor>()
      val hr = fn.invokeHR(arrayOf(__12649401_Ptr, maxQueuedReports, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicFramePresentationMonitor>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicSpace2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __12649401_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicSpace2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f81a9a8b7ff488398277d677287ea70")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicSpace2(ptr: Pointer?): WithDefault = IHolographicSpace2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicSpace2 {
      val address = segment.toRawLongValue()
      return makeIHolographicSpace2(Pointer(address))
    }

    public override fun toNative(obj: IHolographicSpace2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__12649401_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicSpace2): Array<IHolographicSpace2?> =
        (elements as
        Array<IHolographicSpace2?>).castToImpl<IHolographicSpace2,IHolographicSpace2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicSpace2?> =
        arrayOfNulls<IHolographicSpace2_Impl>(size) as Array<IHolographicSpace2?>
  }
}
