package Windows.Devices.SmartCards

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardCryptogramGenerator2.ABI::class)
@Signature("{7116aa34-5d6d-4b4a-96a3-efa47d2a7e25}")
@Guid("7116aa345d6d4b4a96a3efa47d2a7e25")
@WinRTInterface("7116aa345d6d4b4a96a3efa47d2a7e25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardCryptogramGenerator2.ByReference::class)
public interface ISmartCardCryptogramGenerator2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ValidateRequestApduAsync(
    promptingBehavior: SmartCardUnlockPromptingBehavior?,
    apduToValidate: IBuffer?,
    cryptogramPlacementSteps: IIterable<SmartCardCryptogramPlacementStep?>?
  ): IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>?

  @InterfaceMethod(1)
  public fun GetAllCryptogramStorageKeyCharacteristicsAsync():
      IAsyncOperation<SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult?>?

  @InterfaceMethod(2)
  public fun GetAllCryptogramMaterialPackageCharacteristicsAsync():
      IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialPackageCharacteristicsResult?>?

  @InterfaceMethod(3)
  public fun GetAllCryptogramMaterialPackageCharacteristicsAsync(storageKeyName: String?):
      IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialPackageCharacteristicsResult?>?

  @InterfaceMethod(4)
  public
      fun GetAllCryptogramMaterialCharacteristicsAsync(promptingBehavior: SmartCardUnlockPromptingBehavior?,
      materialPackageName: String?):
      IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramGenerator2> {
    public override fun getValue() = ABI.makeISmartCardCryptogramGenerator2(pointer.getPointer(0))

    public fun setValue(value: ISmartCardCryptogramGenerator2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramGenerator2 {
    public val __1459173053_Ptr: Pointer?

    public val _1459173053_VtblPtr: Pointer?
      get() = __1459173053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ValidateRequestApduAsync(
      promptingBehavior: SmartCardUnlockPromptingBehavior?,
      apduToValidate: IBuffer?,
      cryptogramPlacementSteps: IIterable<SmartCardCryptogramPlacementStep?>?
    ): IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>? {
      val fnPtr = _1459173053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1459173053_Ptr, marshalToNative(promptingBehavior),
          marshalToNative(apduToValidate), marshalToNative(cryptogramPlacementSteps), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAllCryptogramStorageKeyCharacteristicsAsync():
        IAsyncOperation<SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult?>? {
      val fnPtr = _1459173053_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1459173053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAllCryptogramMaterialPackageCharacteristicsAsync():
        IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialPackageCharacteristicsResult?>? {
      val fnPtr = _1459173053_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialPackageCharacteristicsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1459173053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialPackageCharacteristicsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun GetAllCryptogramMaterialPackageCharacteristicsAsync(storageKeyName: String?):
        IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialPackageCharacteristicsResult?>? {
      val fnPtr = _1459173053_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialPackageCharacteristicsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1459173053_Ptr, marshalToNative(storageKeyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialPackageCharacteristicsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override
        fun GetAllCryptogramMaterialCharacteristicsAsync(promptingBehavior: SmartCardUnlockPromptingBehavior?,
        materialPackageName: String?):
        IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult?>? {
      val fnPtr = _1459173053_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1459173053_Ptr, marshalToNative(promptingBehavior),
          marshalToNative(materialPackageName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardCryptogramGenerator2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1459173053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramGenerator2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7116aa345d6d4b4a96a3efa47d2a7e25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardCryptogramGenerator2(ptr: Pointer?): WithDefault =
        ISmartCardCryptogramGenerator2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardCryptogramGenerator2 {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramGenerator2(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardCryptogramGenerator2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1459173053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardCryptogramGenerator2):
        Array<ISmartCardCryptogramGenerator2?> = (elements as
        Array<ISmartCardCryptogramGenerator2?>).castToImpl<ISmartCardCryptogramGenerator2,ISmartCardCryptogramGenerator2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardCryptogramGenerator2?> =
        arrayOfNulls<ISmartCardCryptogramGenerator2_Impl>(size) as
        Array<ISmartCardCryptogramGenerator2?>
  }
}
