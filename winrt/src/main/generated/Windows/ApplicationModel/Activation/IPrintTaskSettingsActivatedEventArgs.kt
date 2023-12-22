package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.Devices.Printers.Extensions.PrintTaskConfiguration
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

@ABIMarker(IPrintTaskSettingsActivatedEventArgs.ABI::class)
@Signature("{ee30a0c9-ce56-4865-ba8e-8954ac271107}")
@Guid("ee30a0c9ce564865ba8e8954ac271107")
@WinRTInterface("ee30a0c9ce564865ba8e8954ac271107")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskSettingsActivatedEventArgs.ByReference::class)
public interface IPrintTaskSettingsActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Configuration(): PrintTaskConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskSettingsActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintTaskSettingsActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskSettingsActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskSettingsActivatedEventArgs,
      IActivatedEventArgs.WithDefault {
    public val __1889950994_Ptr: Pointer?

    public val _1889950994_VtblPtr: Pointer?
      get() = __1889950994_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Configuration(): PrintTaskConfiguration? {
      val fnPtr = _1889950994_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTaskConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1889950994_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTaskConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskSettingsActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1889950994_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1889950994_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskSettingsActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee30a0c9ce564865ba8e8954ac271107")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskSettingsActivatedEventArgs(ptr: Pointer?): WithDefault =
        IPrintTaskSettingsActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskSettingsActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintTaskSettingsActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskSettingsActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1889950994_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskSettingsActivatedEventArgs):
        Array<IPrintTaskSettingsActivatedEventArgs?> = (elements as
        Array<IPrintTaskSettingsActivatedEventArgs?>).castToImpl<IPrintTaskSettingsActivatedEventArgs,IPrintTaskSettingsActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskSettingsActivatedEventArgs?> =
        arrayOfNulls<IPrintTaskSettingsActivatedEventArgs_Impl>(size) as
        Array<IPrintTaskSettingsActivatedEventArgs?>
  }
}
