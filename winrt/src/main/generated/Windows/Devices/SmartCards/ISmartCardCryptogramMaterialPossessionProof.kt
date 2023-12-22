package Windows.Devices.SmartCards

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ISmartCardCryptogramMaterialPossessionProof.ABI::class)
@Signature("{e5b9ab8c-a141-4135-9add-b0d2e3aa1fc9}")
@Guid("e5b9ab8ca14141359addb0d2e3aa1fc9")
@WinRTInterface("e5b9ab8ca14141359addb0d2e3aa1fc9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardCryptogramMaterialPossessionProof.ByReference::class)
public interface ISmartCardCryptogramMaterialPossessionProof : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OperationStatus(): SmartCardCryptogramGeneratorOperationStatus?

  @InterfaceMethod(1)
  public fun get_Proof(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramMaterialPossessionProof> {
    public override fun getValue() =
        ABI.makeISmartCardCryptogramMaterialPossessionProof(pointer.getPointer(0))

    public fun setValue(value: ISmartCardCryptogramMaterialPossessionProof_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramMaterialPossessionProof {
    public val __1588080189_Ptr: Pointer?

    public val _1588080189_VtblPtr: Pointer?
      get() = __1588080189_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OperationStatus(): SmartCardCryptogramGeneratorOperationStatus? {
      val fnPtr = _1588080189_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramGeneratorOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1588080189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SmartCardCryptogramGeneratorOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Proof(): IBuffer? {
      val fnPtr = _1588080189_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1588080189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardCryptogramMaterialPossessionProof_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1588080189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramMaterialPossessionProof, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5b9ab8ca14141359addb0d2e3aa1fc9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardCryptogramMaterialPossessionProof(ptr: Pointer?): WithDefault =
        ISmartCardCryptogramMaterialPossessionProof_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISmartCardCryptogramMaterialPossessionProof {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramMaterialPossessionProof(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardCryptogramMaterialPossessionProof): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1588080189_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardCryptogramMaterialPossessionProof):
        Array<ISmartCardCryptogramMaterialPossessionProof?> = (elements as
        Array<ISmartCardCryptogramMaterialPossessionProof?>).castToImpl<ISmartCardCryptogramMaterialPossessionProof,ISmartCardCryptogramMaterialPossessionProof_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardCryptogramMaterialPossessionProof?> =
        arrayOfNulls<ISmartCardCryptogramMaterialPossessionProof_Impl>(size) as
        Array<ISmartCardCryptogramMaterialPossessionProof?>
  }
}
