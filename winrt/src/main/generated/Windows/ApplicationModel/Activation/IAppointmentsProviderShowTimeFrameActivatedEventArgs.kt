package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IAppointmentsProviderActivatedEventArgs.ABI.IID
import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
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

@ABIMarker(IAppointmentsProviderShowTimeFrameActivatedEventArgs.ABI::class)
@Signature("{9baeaba6-0e0b-49aa-babc-12b1dc774986}")
@Guid("9baeaba60e0b49aababc12b1dc774986")
@WinRTInterface("9baeaba60e0b49aababc12b1dc774986")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentsProviderShowTimeFrameActivatedEventArgs.ByReference::class)
public interface IAppointmentsProviderShowTimeFrameActivatedEventArgs : NativeMapped,
    IWinRTInterface, IAppointmentsProviderActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_TimeToShow(): DateTime?

  @InterfaceMethod(1)
  public fun get_Duration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentsProviderShowTimeFrameActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentsProviderShowTimeFrameActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentsProviderShowTimeFrameActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentsProviderShowTimeFrameActivatedEventArgs,
      IAppointmentsProviderActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __632685541_Ptr: Pointer?

    public val _632685541_VtblPtr: Pointer?
      get() = __632685541_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TimeToShow(): DateTime? {
      val fnPtr = _632685541_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__632685541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _632685541_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__632685541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentsProviderShowTimeFrameActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IAppointmentsProviderActivatedEventArgs, IActivatedEventArgs {
    public override val __1135855692_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_632685541_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_632685541_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __632685541_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentsProviderShowTimeFrameActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9baeaba60e0b49aababc12b1dc774986")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentsProviderShowTimeFrameActivatedEventArgs(ptr: Pointer?): WithDefault
        = IAppointmentsProviderShowTimeFrameActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentsProviderShowTimeFrameActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentsProviderShowTimeFrameActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentsProviderShowTimeFrameActivatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__632685541_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentsProviderShowTimeFrameActivatedEventArgs):
        Array<IAppointmentsProviderShowTimeFrameActivatedEventArgs?> = (elements as
        Array<IAppointmentsProviderShowTimeFrameActivatedEventArgs?>).castToImpl<IAppointmentsProviderShowTimeFrameActivatedEventArgs,IAppointmentsProviderShowTimeFrameActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentsProviderShowTimeFrameActivatedEventArgs?> =
        arrayOfNulls<IAppointmentsProviderShowTimeFrameActivatedEventArgs_Impl>(size) as
        Array<IAppointmentsProviderShowTimeFrameActivatedEventArgs?>
  }
}
