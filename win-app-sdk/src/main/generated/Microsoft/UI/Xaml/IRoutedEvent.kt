package Microsoft.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRoutedEvent.ABI::class)
@Signature("{b2b432bc-efca-575e-9d2a-703f8b9c380f}")
@Guid("b2b432bcefca575e9d2a703f8b9c380f")
@WinRTInterface("b2b432bcefca575e9d2a703f8b9c380f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRoutedEvent.ByReference::class)
public interface IRoutedEvent : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRoutedEvent> {
    public override fun getValue() = ABI.makeIRoutedEvent(pointer.getPointer(0))

    public fun setValue(value: IRoutedEvent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRoutedEvent {
    public val __921918840_Ptr: Pointer?

    public val _921918840_VtblPtr: Pointer?
      get() = __921918840_Ptr?.getPointer(0)
  }

  public class IRoutedEvent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __921918840_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRoutedEvent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2b432bcefca575e9d2a703f8b9c380f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRoutedEvent(ptr: Pointer?): WithDefault = IRoutedEvent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRoutedEvent {
      val address = segment.toRawLongValue()
      return makeIRoutedEvent(Pointer(address))
    }

    public override fun toNative(obj: IRoutedEvent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__921918840_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRoutedEvent): Array<IRoutedEvent?> = (elements as
        Array<IRoutedEvent?>).castToImpl<IRoutedEvent,IRoutedEvent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRoutedEvent?> =
        arrayOfNulls<IRoutedEvent_Impl>(size) as Array<IRoutedEvent?>
  }
}
