package Windows.Devices.SmartCards

import Windows.Foundation.DateTime
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardCryptogramStorageKeyCharacteristics.ABI::class)
@Signature("{8552546e-4457-4825-b464-635471a39f5c}")
@Guid("8552546e44574825b464635471a39f5c")
@WinRTInterface("8552546e44574825b464635471a39f5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardCryptogramStorageKeyCharacteristics.ByReference::class)
public interface ISmartCardCryptogramStorageKeyCharacteristics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StorageKeyName(): String?

  @InterfaceMethod(1)
  public fun get_DateCreated(): DateTime?

  @InterfaceMethod(2)
  public fun get_Algorithm(): SmartCardCryptogramStorageKeyAlgorithm?

  @InterfaceMethod(3)
  public fun get_Capabilities(): SmartCardCryptogramStorageKeyCapabilities?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramStorageKeyCharacteristics> {
    public override fun getValue() =
        ABI.makeISmartCardCryptogramStorageKeyCharacteristics(pointer.getPointer(0))

    public fun setValue(value: ISmartCardCryptogramStorageKeyCharacteristics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramStorageKeyCharacteristics {
    public val __517946122_Ptr: Pointer?

    public val _517946122_VtblPtr: Pointer?
      get() = __517946122_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StorageKeyName(): String? {
      val fnPtr = _517946122_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__517946122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DateCreated(): DateTime? {
      val fnPtr = _517946122_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__517946122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Algorithm(): SmartCardCryptogramStorageKeyAlgorithm? {
      val fnPtr = _517946122_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramStorageKeyAlgorithm>()
      val hr = fn.invokeHR(arrayOf(__517946122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardCryptogramStorageKeyAlgorithm>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Capabilities(): SmartCardCryptogramStorageKeyCapabilities? {
      val fnPtr = _517946122_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramStorageKeyCapabilities>()
      val hr = fn.invokeHR(arrayOf(__517946122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SmartCardCryptogramStorageKeyCapabilities>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardCryptogramStorageKeyCharacteristics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __517946122_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramStorageKeyCharacteristics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8552546e44574825b464635471a39f5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardCryptogramStorageKeyCharacteristics(ptr: Pointer?): WithDefault =
        ISmartCardCryptogramStorageKeyCharacteristics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISmartCardCryptogramStorageKeyCharacteristics {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramStorageKeyCharacteristics(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardCryptogramStorageKeyCharacteristics): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__517946122_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardCryptogramStorageKeyCharacteristics):
        Array<ISmartCardCryptogramStorageKeyCharacteristics?> = (elements as
        Array<ISmartCardCryptogramStorageKeyCharacteristics?>).castToImpl<ISmartCardCryptogramStorageKeyCharacteristics,ISmartCardCryptogramStorageKeyCharacteristics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardCryptogramStorageKeyCharacteristics?> =
        arrayOfNulls<ISmartCardCryptogramStorageKeyCharacteristics_Impl>(size) as
        Array<ISmartCardCryptogramStorageKeyCharacteristics?>
  }
}
