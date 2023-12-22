package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentsProviderActivatedEventArgs.ABI::class)
@Signature("{3364c405-933c-4e7d-a034-500fb8dcd9f3}")
@Guid("3364c405933c4e7da034500fb8dcd9f3")
@WinRTInterface("3364c405933c4e7da034500fb8dcd9f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentsProviderActivatedEventArgs.ByReference::class)
public interface IAppointmentsProviderActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Verb(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentsProviderActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentsProviderActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentsProviderActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentsProviderActivatedEventArgs,
      IActivatedEventArgs.WithDefault {
    public val __1135855692_Ptr: Pointer?

    public val _1135855692_VtblPtr: Pointer?
      get() = __1135855692_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Verb(): String? {
      val fnPtr = _1135855692_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1135855692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentsProviderActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1135855692_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1135855692_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentsProviderActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3364c405933c4e7da034500fb8dcd9f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentsProviderActivatedEventArgs(ptr: Pointer?): WithDefault =
        IAppointmentsProviderActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentsProviderActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentsProviderActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentsProviderActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1135855692_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentsProviderActivatedEventArgs):
        Array<IAppointmentsProviderActivatedEventArgs?> = (elements as
        Array<IAppointmentsProviderActivatedEventArgs?>).castToImpl<IAppointmentsProviderActivatedEventArgs,IAppointmentsProviderActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentsProviderActivatedEventArgs?> =
        arrayOfNulls<IAppointmentsProviderActivatedEventArgs_Impl>(size) as
        Array<IAppointmentsProviderActivatedEventArgs?>
  }
}
