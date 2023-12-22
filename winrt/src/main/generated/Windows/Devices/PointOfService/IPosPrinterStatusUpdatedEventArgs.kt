package Windows.Devices.PointOfService

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

@ABIMarker(IPosPrinterStatusUpdatedEventArgs.ABI::class)
@Signature("{2edb87df-13a6-428d-ba81-b0e7c3e5a3cd}")
@Guid("2edb87df13a6428dba81b0e7c3e5a3cd")
@WinRTInterface("2edb87df13a6428dba81b0e7c3e5a3cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPosPrinterStatusUpdatedEventArgs.ByReference::class)
public interface IPosPrinterStatusUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): PosPrinterStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPosPrinterStatusUpdatedEventArgs> {
    public override fun getValue() =
        ABI.makeIPosPrinterStatusUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPosPrinterStatusUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPosPrinterStatusUpdatedEventArgs {
    public val __1484919277_Ptr: Pointer?

    public val _1484919277_VtblPtr: Pointer?
      get() = __1484919277_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): PosPrinterStatus? {
      val fnPtr = _1484919277_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterStatus>()
      val hr = fn.invokeHR(arrayOf(__1484919277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterStatus>(result.getValue())
      return resultValue
    }
  }

  public class IPosPrinterStatusUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1484919277_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPosPrinterStatusUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2edb87df13a6428dba81b0e7c3e5a3cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPosPrinterStatusUpdatedEventArgs(ptr: Pointer?): WithDefault =
        IPosPrinterStatusUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPosPrinterStatusUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPosPrinterStatusUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPosPrinterStatusUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1484919277_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPosPrinterStatusUpdatedEventArgs):
        Array<IPosPrinterStatusUpdatedEventArgs?> = (elements as
        Array<IPosPrinterStatusUpdatedEventArgs?>).castToImpl<IPosPrinterStatusUpdatedEventArgs,IPosPrinterStatusUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPosPrinterStatusUpdatedEventArgs?> =
        arrayOfNulls<IPosPrinterStatusUpdatedEventArgs_Impl>(size) as
        Array<IPosPrinterStatusUpdatedEventArgs?>
  }
}
