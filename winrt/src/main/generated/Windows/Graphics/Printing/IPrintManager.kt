package Windows.Graphics.Printing

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

@ABIMarker(IPrintManager.ABI::class)
@Signature("{ff2a9694-8c99-44fd-ae4a-19d9aa9a0f0a}")
@Guid("ff2a96948c9944fdae4a19d9aa9a0f0a")
@WinRTInterface("ff2a96948c9944fdae4a19d9aa9a0f0a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintManager.ByReference::class)
public interface IPrintManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PrintTaskRequested(eventHandler: TypedEventHandler<PrintManager?,
      PrintTaskRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PrintTaskRequested(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPrintManager>
      {
    public override fun getValue() = ABI.makeIPrintManager(pointer.getPointer(0))

    public fun setValue(value: IPrintManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintManager {
    public val __998526724_Ptr: Pointer?

    public val _998526724_VtblPtr: Pointer?
      get() = __998526724_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_PrintTaskRequested(eventHandler: TypedEventHandler<PrintManager?,
        PrintTaskRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _998526724_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__998526724_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PrintTaskRequested(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _998526724_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__998526724_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __998526724_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff2a96948c9944fdae4a19d9aa9a0f0a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintManager(ptr: Pointer?): WithDefault = IPrintManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintManager {
      val address = segment.toRawLongValue()
      return makeIPrintManager(Pointer(address))
    }

    public override fun toNative(obj: IPrintManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__998526724_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintManager): Array<IPrintManager?> = (elements as
        Array<IPrintManager?>).castToImpl<IPrintManager,IPrintManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintManager?> =
        arrayOfNulls<IPrintManager_Impl>(size) as Array<IPrintManager?>
  }
}
