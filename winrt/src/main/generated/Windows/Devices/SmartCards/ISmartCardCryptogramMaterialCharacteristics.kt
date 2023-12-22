package Windows.Devices.SmartCards

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ISmartCardCryptogramMaterialCharacteristics.ABI::class)
@Signature("{fc9ac5cc-c1d7-4153-923b-a2d43c6c8d49}")
@Guid("fc9ac5ccc1d74153923ba2d43c6c8d49")
@WinRTInterface("fc9ac5ccc1d74153923ba2d43c6c8d49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardCryptogramMaterialCharacteristics.ByReference::class)
public interface ISmartCardCryptogramMaterialCharacteristics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaterialName(): String?

  @InterfaceMethod(1)
  public fun get_AllowedAlgorithms(): IVectorView<SmartCardCryptogramAlgorithm?>?

  @InterfaceMethod(2)
  public fun get_AllowedProofOfPossessionAlgorithms():
      IVectorView<SmartCardCryptogramMaterialPackageConfirmationResponseFormat?>?

  @InterfaceMethod(3)
  public fun get_AllowedValidations(): IVectorView<SmartCardCryptogramAlgorithm?>?

  @InterfaceMethod(4)
  public fun get_MaterialType(): SmartCardCryptogramMaterialType?

  @InterfaceMethod(5)
  public fun get_ProtectionMethod(): SmartCardCryptogramMaterialProtectionMethod?

  @InterfaceMethod(6)
  public fun get_ProtectionVersion(): Int

  @InterfaceMethod(7)
  public fun get_MaterialLength(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramMaterialCharacteristics> {
    public override fun getValue() =
        ABI.makeISmartCardCryptogramMaterialCharacteristics(pointer.getPointer(0))

    public fun setValue(value: ISmartCardCryptogramMaterialCharacteristics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramMaterialCharacteristics {
    public val __918976557_Ptr: Pointer?

    public val _918976557_VtblPtr: Pointer?
      get() = __918976557_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaterialName(): String? {
      val fnPtr = _918976557_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__918976557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AllowedAlgorithms(): IVectorView<SmartCardCryptogramAlgorithm?>? {
      val fnPtr = _918976557_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SmartCardCryptogramAlgorithm?>>()
      val hr = fn.invokeHR(arrayOf(__918976557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SmartCardCryptogramAlgorithm?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AllowedProofOfPossessionAlgorithms():
        IVectorView<SmartCardCryptogramMaterialPackageConfirmationResponseFormat?>? {
      val fnPtr = _918976557_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IVectorView<SmartCardCryptogramMaterialPackageConfirmationResponseFormat?>>()
      val hr = fn.invokeHR(arrayOf(__918976557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SmartCardCryptogramMaterialPackageConfirmationResponseFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AllowedValidations(): IVectorView<SmartCardCryptogramAlgorithm?>? {
      val fnPtr = _918976557_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SmartCardCryptogramAlgorithm?>>()
      val hr = fn.invokeHR(arrayOf(__918976557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SmartCardCryptogramAlgorithm?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MaterialType(): SmartCardCryptogramMaterialType? {
      val fnPtr = _918976557_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramMaterialType>()
      val hr = fn.invokeHR(arrayOf(__918976557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardCryptogramMaterialType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ProtectionMethod(): SmartCardCryptogramMaterialProtectionMethod? {
      val fnPtr = _918976557_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramMaterialProtectionMethod>()
      val hr = fn.invokeHR(arrayOf(__918976557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SmartCardCryptogramMaterialProtectionMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ProtectionVersion(): Int {
      val fnPtr = _918976557_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__918976557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_MaterialLength(): Int {
      val fnPtr = _918976557_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__918976557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ISmartCardCryptogramMaterialCharacteristics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __918976557_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramMaterialCharacteristics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc9ac5ccc1d74153923ba2d43c6c8d49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardCryptogramMaterialCharacteristics(ptr: Pointer?): WithDefault =
        ISmartCardCryptogramMaterialCharacteristics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISmartCardCryptogramMaterialCharacteristics {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramMaterialCharacteristics(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardCryptogramMaterialCharacteristics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__918976557_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardCryptogramMaterialCharacteristics):
        Array<ISmartCardCryptogramMaterialCharacteristics?> = (elements as
        Array<ISmartCardCryptogramMaterialCharacteristics?>).castToImpl<ISmartCardCryptogramMaterialCharacteristics,ISmartCardCryptogramMaterialCharacteristics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardCryptogramMaterialCharacteristics?> =
        arrayOfNulls<ISmartCardCryptogramMaterialCharacteristics_Impl>(size) as
        Array<ISmartCardCryptogramMaterialCharacteristics?>
  }
}
