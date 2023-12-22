package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IContactPickerActivatedEventArgs.ABI::class)
@Signature("{ce57aae7-6449-45a7-971f-d113be7a8936}")
@Guid("ce57aae7644945a7971fd113be7a8936")
@WinRTInterface("ce57aae7644945a7971fd113be7a8936")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPickerActivatedEventArgs.ByReference::class)
public interface IContactPickerActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_ContactPickerUI(): ContactPickerUI?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPickerActivatedEventArgs> {
    public override fun getValue() = ABI.makeIContactPickerActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactPickerActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPickerActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __54142709_Ptr: Pointer?

    public val _54142709_VtblPtr: Pointer?
      get() = __54142709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactPickerUI(): ContactPickerUI? {
      val fnPtr = _54142709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactPickerUI>()
      val hr = fn.invokeHR(arrayOf(__54142709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactPickerUI>(result.getValue())
      return resultValue
    }
  }

  public class IContactPickerActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_54142709_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __54142709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPickerActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce57aae7644945a7971fd113be7a8936")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPickerActivatedEventArgs(ptr: Pointer?): WithDefault =
        IContactPickerActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPickerActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactPickerActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactPickerActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__54142709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPickerActivatedEventArgs):
        Array<IContactPickerActivatedEventArgs?> = (elements as
        Array<IContactPickerActivatedEventArgs?>).castToImpl<IContactPickerActivatedEventArgs,IContactPickerActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPickerActivatedEventArgs?> =
        arrayOfNulls<IContactPickerActivatedEventArgs_Impl>(size) as
        Array<IContactPickerActivatedEventArgs?>
  }
}
