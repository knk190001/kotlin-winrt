package Windows.Graphics.Printing3D

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

@ABIMarker(IPrint3DManager.ABI::class)
@Signature("{4d2fcb0a-7366-4971-8bd5-17c4e3e8c6c0}")
@Guid("4d2fcb0a736649718bd517c4e3e8c6c0")
@WinRTInterface("4d2fcb0a736649718bd517c4e3e8c6c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DManager.ByReference::class)
public interface IPrint3DManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_TaskRequested(eventHandler: TypedEventHandler<Print3DManager?,
      Print3DTaskRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_TaskRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DManager> {
    public override fun getValue() = ABI.makeIPrint3DManager(pointer.getPointer(0))

    public fun setValue(value: IPrint3DManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DManager {
    public val __982993498_Ptr: Pointer?

    public val _982993498_VtblPtr: Pointer?
      get() = __982993498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_TaskRequested(eventHandler: TypedEventHandler<Print3DManager?,
        Print3DTaskRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _982993498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__982993498_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_TaskRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _982993498_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__982993498_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrint3DManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __982993498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d2fcb0a736649718bd517c4e3e8c6c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DManager(ptr: Pointer?): WithDefault = IPrint3DManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DManager {
      val address = segment.toRawLongValue()
      return makeIPrint3DManager(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__982993498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DManager): Array<IPrint3DManager?> = (elements as
        Array<IPrint3DManager?>).castToImpl<IPrint3DManager,IPrint3DManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DManager?> =
        arrayOfNulls<IPrint3DManager_Impl>(size) as Array<IPrint3DManager?>
  }
}
