package Windows.Devices.Bluetooth.GenericAttributeProfile

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattPresentationFormatStatics.ABI::class)
@Signature("{196d0020-faad-45dc-ae5b-2ac3184e84db}")
@Guid("196d0020faad45dcae5b2ac3184e84db")
@WinRTInterface("196d0020faad45dcae5b2ac3184e84db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattPresentationFormatStatics.ByReference::class)
public interface IGattPresentationFormatStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BluetoothSigAssignedNumbers(): Byte

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattPresentationFormatStatics> {
    public override fun getValue() = ABI.makeIGattPresentationFormatStatics(pointer.getPointer(0))

    public fun setValue(value: IGattPresentationFormatStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattPresentationFormatStatics {
    public val __1249053063_Ptr: Pointer?

    public val _1249053063_VtblPtr: Pointer?
      get() = __1249053063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BluetoothSigAssignedNumbers(): Byte {
      val fnPtr = _1249053063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1249053063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }
  }

  public class IGattPresentationFormatStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1249053063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattPresentationFormatStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("196d0020faad45dcae5b2ac3184e84db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattPresentationFormatStatics(ptr: Pointer?): WithDefault =
        IGattPresentationFormatStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattPresentationFormatStatics {
      val address = segment.toRawLongValue()
      return makeIGattPresentationFormatStatics(Pointer(address))
    }

    public override fun toNative(obj: IGattPresentationFormatStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1249053063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattPresentationFormatStatics):
        Array<IGattPresentationFormatStatics?> = (elements as
        Array<IGattPresentationFormatStatics?>).castToImpl<IGattPresentationFormatStatics,IGattPresentationFormatStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattPresentationFormatStatics?> =
        arrayOfNulls<IGattPresentationFormatStatics_Impl>(size) as
        Array<IGattPresentationFormatStatics?>
  }
}
