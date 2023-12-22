package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Contacts.Contact
import Windows.ApplicationModel.Contacts.ContactPanel
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

@ABIMarker(IContactPanelActivatedEventArgs.ABI::class)
@Signature("{52bb63e4-d3d4-4b63-8051-4af2082cab80}")
@Guid("52bb63e4d3d44b6380514af2082cab80")
@WinRTInterface("52bb63e4d3d44b6380514af2082cab80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPanelActivatedEventArgs.ByReference::class)
public interface IContactPanelActivatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactPanel(): ContactPanel?

  @InterfaceMethod(1)
  public fun get_Contact(): Contact?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPanelActivatedEventArgs> {
    public override fun getValue() = ABI.makeIContactPanelActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactPanelActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPanelActivatedEventArgs {
    public val __1331992077_Ptr: Pointer?

    public val _1331992077_VtblPtr: Pointer?
      get() = __1331992077_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactPanel(): ContactPanel? {
      val fnPtr = _1331992077_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactPanel>()
      val hr = fn.invokeHR(arrayOf(__1331992077_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactPanel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Contact(): Contact? {
      val fnPtr = _1331992077_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Contact>()
      val hr = fn.invokeHR(arrayOf(__1331992077_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Contact>(result.getValue())
      return resultValue
    }
  }

  public class IContactPanelActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1331992077_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPanelActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52bb63e4d3d44b6380514af2082cab80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPanelActivatedEventArgs(ptr: Pointer?): WithDefault =
        IContactPanelActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPanelActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactPanelActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactPanelActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1331992077_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPanelActivatedEventArgs):
        Array<IContactPanelActivatedEventArgs?> = (elements as
        Array<IContactPanelActivatedEventArgs?>).castToImpl<IContactPanelActivatedEventArgs,IContactPanelActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPanelActivatedEventArgs?> =
        arrayOfNulls<IContactPanelActivatedEventArgs_Impl>(size) as
        Array<IContactPanelActivatedEventArgs?>
  }
}
