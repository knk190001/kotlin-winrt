package Windows.ApplicationModel.Contacts

import Windows.Foundation.Deferral
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

@ABIMarker(IContactPanelClosingEventArgs.ABI::class)
@Signature("{222174d3-cf4b-46d7-b739-6edc16110bfb}")
@Guid("222174d3cf4b46d7b7396edc16110bfb")
@WinRTInterface("222174d3cf4b46d7b7396edc16110bfb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPanelClosingEventArgs.ByReference::class)
public interface IContactPanelClosingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPanelClosingEventArgs> {
    public override fun getValue() = ABI.makeIContactPanelClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactPanelClosingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPanelClosingEventArgs {
    public val __860657102_Ptr: Pointer?

    public val _860657102_VtblPtr: Pointer?
      get() = __860657102_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _860657102_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__860657102_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IContactPanelClosingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __860657102_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPanelClosingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("222174d3cf4b46d7b7396edc16110bfb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPanelClosingEventArgs(ptr: Pointer?): WithDefault =
        IContactPanelClosingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPanelClosingEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactPanelClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactPanelClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__860657102_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPanelClosingEventArgs):
        Array<IContactPanelClosingEventArgs?> = (elements as
        Array<IContactPanelClosingEventArgs?>).castToImpl<IContactPanelClosingEventArgs,IContactPanelClosingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPanelClosingEventArgs?> =
        arrayOfNulls<IContactPanelClosingEventArgs_Impl>(size) as
        Array<IContactPanelClosingEventArgs?>
  }
}
