package Windows.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISplitViewPaneClosingEventArgs.ABI::class)
@Signature("{93cf494e-7a95-44d8-9562-1b348248da9f}")
@Guid("93cf494e7a9544d895621b348248da9f")
@WinRTInterface("93cf494e7a9544d895621b348248da9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitViewPaneClosingEventArgs.ByReference::class)
public interface ISplitViewPaneClosingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(1)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitViewPaneClosingEventArgs> {
    public override fun getValue() = ABI.makeISplitViewPaneClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISplitViewPaneClosingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitViewPaneClosingEventArgs {
    public val __296588749_Ptr: Pointer?

    public val _296588749_VtblPtr: Pointer?
      get() = __296588749_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _296588749_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__296588749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _296588749_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__296588749_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISplitViewPaneClosingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __296588749_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitViewPaneClosingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93cf494e7a9544d895621b348248da9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitViewPaneClosingEventArgs(ptr: Pointer?): WithDefault =
        ISplitViewPaneClosingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitViewPaneClosingEventArgs {
      val address = segment.toRawLongValue()
      return makeISplitViewPaneClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISplitViewPaneClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__296588749_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitViewPaneClosingEventArgs):
        Array<ISplitViewPaneClosingEventArgs?> = (elements as
        Array<ISplitViewPaneClosingEventArgs?>).castToImpl<ISplitViewPaneClosingEventArgs,ISplitViewPaneClosingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitViewPaneClosingEventArgs?> =
        arrayOfNulls<ISplitViewPaneClosingEventArgs_Impl>(size) as
        Array<ISplitViewPaneClosingEventArgs?>
  }
}
