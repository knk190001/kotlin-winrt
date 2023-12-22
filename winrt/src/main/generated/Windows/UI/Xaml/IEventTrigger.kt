package Windows.UI.Xaml

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

@ABIMarker(IEventTrigger.ABI::class)
@Signature("{def8f855-0b49-4087-b1a9-b8b38488f786}")
@Guid("def8f8550b494087b1a9b8b38488f786")
@WinRTInterface("def8f8550b494087b1a9b8b38488f786")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEventTrigger.ByReference::class)
public interface IEventTrigger : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RoutedEvent(): RoutedEvent?

  @InterfaceMethod(1)
  public fun put_RoutedEvent(value: RoutedEvent?): Unit

  @InterfaceMethod(2)
  public fun get_Actions(): TriggerActionCollection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEventTrigger>
      {
    public override fun getValue() = ABI.makeIEventTrigger(pointer.getPointer(0))

    public fun setValue(value: IEventTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEventTrigger {
    public val __568257264_Ptr: Pointer?

    public val _568257264_VtblPtr: Pointer?
      get() = __568257264_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RoutedEvent(): RoutedEvent? {
      val fnPtr = _568257264_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__568257264_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RoutedEvent(value: RoutedEvent?): Unit {
      val fnPtr = _568257264_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__568257264_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Actions(): TriggerActionCollection? {
      val fnPtr = _568257264_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TriggerActionCollection>()
      val hr = fn.invokeHR(arrayOf(__568257264_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TriggerActionCollection>(result.getValue())
      return resultValue
    }
  }

  public class IEventTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __568257264_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEventTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("def8f8550b494087b1a9b8b38488f786")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEventTrigger(ptr: Pointer?): WithDefault = IEventTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEventTrigger {
      val address = segment.toRawLongValue()
      return makeIEventTrigger(Pointer(address))
    }

    public override fun toNative(obj: IEventTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__568257264_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEventTrigger): Array<IEventTrigger?> = (elements as
        Array<IEventTrigger?>).castToImpl<IEventTrigger,IEventTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEventTrigger?> =
        arrayOfNulls<IEventTrigger_Impl>(size) as Array<IEventTrigger?>
  }
}
