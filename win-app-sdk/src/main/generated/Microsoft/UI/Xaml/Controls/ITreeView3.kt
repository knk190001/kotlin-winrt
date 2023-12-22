package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ITreeView3.ABI::class)
@Signature("{a1b5538e-7956-5671-afd0-4c0f38122b70}")
@Guid("a1b5538e79565671afd04c0f38122b70")
@WinRTInterface("a1b5538e79565671afd04c0f38122b70")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeView3.ByReference::class)
public interface ITreeView3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SelectionChanged(handler: TypedEventHandler<TreeView?,
      TreeViewSelectionChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITreeView3> {
    public override fun getValue() = ABI.makeITreeView3(pointer.getPointer(0))

    public fun setValue(value: ITreeView3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeView3 {
    public val __559281335_Ptr: Pointer?

    public val _559281335_VtblPtr: Pointer?
      get() = __559281335_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_SelectionChanged(handler: TypedEventHandler<TreeView?,
        TreeViewSelectionChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _559281335_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__559281335_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _559281335_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281335_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITreeView3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __559281335_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeView3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1b5538e79565671afd04c0f38122b70")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeView3(ptr: Pointer?): WithDefault = ITreeView3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeView3 {
      val address = segment.toRawLongValue()
      return makeITreeView3(Pointer(address))
    }

    public override fun toNative(obj: ITreeView3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__559281335_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeView3): Array<ITreeView3?> = (elements as
        Array<ITreeView3?>).castToImpl<ITreeView3,ITreeView3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeView3?> = arrayOfNulls<ITreeView3_Impl>(size)
        as Array<ITreeView3?>
  }
}
