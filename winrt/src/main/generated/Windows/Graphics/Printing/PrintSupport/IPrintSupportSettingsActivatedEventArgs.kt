package Windows.Graphics.Printing.PrintSupport

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

@ABIMarker(IPrintSupportSettingsActivatedEventArgs.ABI::class)
@Signature("{1e1b565e-a013-55ea-9b8c-eea39d9fb6c1}")
@Guid("1e1b565ea01355ea9b8ceea39d9fb6c1")
@WinRTInterface("1e1b565ea01355ea9b8ceea39d9fb6c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintSupportSettingsActivatedEventArgs.ByReference::class)
public interface IPrintSupportSettingsActivatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Session(): PrintSupportSettingsUISession?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintSupportSettingsActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintSupportSettingsActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintSupportSettingsActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintSupportSettingsActivatedEventArgs {
    public val __1788633583_Ptr: Pointer?

    public val _1788633583_VtblPtr: Pointer?
      get() = __1788633583_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Session(): PrintSupportSettingsUISession? {
      val fnPtr = _1788633583_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintSupportSettingsUISession>()
      val hr = fn.invokeHR(arrayOf(__1788633583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintSupportSettingsUISession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1788633583_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1788633583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintSupportSettingsActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1788633583_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintSupportSettingsActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e1b565ea01355ea9b8ceea39d9fb6c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintSupportSettingsActivatedEventArgs(ptr: Pointer?): WithDefault =
        IPrintSupportSettingsActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrintSupportSettingsActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintSupportSettingsActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintSupportSettingsActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1788633583_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintSupportSettingsActivatedEventArgs):
        Array<IPrintSupportSettingsActivatedEventArgs?> = (elements as
        Array<IPrintSupportSettingsActivatedEventArgs?>).castToImpl<IPrintSupportSettingsActivatedEventArgs,IPrintSupportSettingsActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintSupportSettingsActivatedEventArgs?> =
        arrayOfNulls<IPrintSupportSettingsActivatedEventArgs_Impl>(size) as
        Array<IPrintSupportSettingsActivatedEventArgs?>
  }
}
