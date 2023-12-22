package Windows.Devices.PointOfService.Provider

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

@ABIMarker(IBarcodeScannerProviderTriggerDetails.ABI::class)
@Signature("{50856d82-24e3-48ce-99c7-70aac1cbc9f7}")
@Guid("50856d8224e348ce99c770aac1cbc9f7")
@WinRTInterface("50856d8224e348ce99c770aac1cbc9f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerProviderTriggerDetails.ByReference::class)
public interface IBarcodeScannerProviderTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Connection(): BarcodeScannerProviderConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerProviderTriggerDetails> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerProviderTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerProviderTriggerDetails {
    public val __1783238451_Ptr: Pointer?

    public val _1783238451_VtblPtr: Pointer?
      get() = __1783238451_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Connection(): BarcodeScannerProviderConnection? {
      val fnPtr = _1783238451_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeScannerProviderConnection>()
      val hr = fn.invokeHR(arrayOf(__1783238451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarcodeScannerProviderConnection>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerProviderTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1783238451_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerProviderTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50856d8224e348ce99c770aac1cbc9f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerProviderTriggerDetails(ptr: Pointer?): WithDefault =
        IBarcodeScannerProviderTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1783238451_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerProviderTriggerDetails):
        Array<IBarcodeScannerProviderTriggerDetails?> = (elements as
        Array<IBarcodeScannerProviderTriggerDetails?>).castToImpl<IBarcodeScannerProviderTriggerDetails,IBarcodeScannerProviderTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerProviderTriggerDetails?> =
        arrayOfNulls<IBarcodeScannerProviderTriggerDetails_Impl>(size) as
        Array<IBarcodeScannerProviderTriggerDetails?>
  }
}
