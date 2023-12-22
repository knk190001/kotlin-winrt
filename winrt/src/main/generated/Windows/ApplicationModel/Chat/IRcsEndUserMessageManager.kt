package Windows.ApplicationModel.Chat

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

@ABIMarker(IRcsEndUserMessageManager.ABI::class)
@Signature("{3054ae5a-4d1f-4b59-9433-126c734e86a6}")
@Guid("3054ae5a4d1f4b599433126c734e86a6")
@WinRTInterface("3054ae5a4d1f4b599433126c734e86a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRcsEndUserMessageManager.ByReference::class)
public interface IRcsEndUserMessageManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_MessageAvailableChanged(handler: TypedEventHandler<RcsEndUserMessageManager?,
      RcsEndUserMessageAvailableEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_MessageAvailableChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRcsEndUserMessageManager> {
    public override fun getValue() = ABI.makeIRcsEndUserMessageManager(pointer.getPointer(0))

    public fun setValue(value: IRcsEndUserMessageManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRcsEndUserMessageManager {
    public val __396353489_Ptr: Pointer?

    public val _396353489_VtblPtr: Pointer?
      get() = __396353489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_MessageAvailableChanged(handler: TypedEventHandler<RcsEndUserMessageManager?,
        RcsEndUserMessageAvailableEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _396353489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__396353489_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_MessageAvailableChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _396353489_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__396353489_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRcsEndUserMessageManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __396353489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRcsEndUserMessageManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3054ae5a4d1f4b599433126c734e86a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRcsEndUserMessageManager(ptr: Pointer?): WithDefault =
        IRcsEndUserMessageManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRcsEndUserMessageManager {
      val address = segment.toRawLongValue()
      return makeIRcsEndUserMessageManager(Pointer(address))
    }

    public override fun toNative(obj: IRcsEndUserMessageManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__396353489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRcsEndUserMessageManager):
        Array<IRcsEndUserMessageManager?> = (elements as
        Array<IRcsEndUserMessageManager?>).castToImpl<IRcsEndUserMessageManager,IRcsEndUserMessageManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRcsEndUserMessageManager?> =
        arrayOfNulls<IRcsEndUserMessageManager_Impl>(size) as Array<IRcsEndUserMessageManager?>
  }
}
