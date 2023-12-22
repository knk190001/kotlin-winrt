package Windows.Devices.SmartCards

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType
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

@ABIMarker(ISmartCardCryptogramGenerator.ABI::class)
@Signature("{e39f587b-edd3-4e49-b594-0ff5e4d0c76f}")
@Guid("e39f587bedd34e49b5940ff5e4d0c76f")
@WinRTInterface("e39f587bedd34e49b5940ff5e4d0c76f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardCryptogramGenerator.ByReference::class)
public interface ISmartCardCryptogramGenerator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedCryptogramMaterialTypes(): IVectorView<SmartCardCryptogramMaterialType?>?

  @InterfaceMethod(1)
  public fun get_SupportedCryptogramAlgorithms(): IVectorView<SmartCardCryptogramAlgorithm?>?

  @InterfaceMethod(2)
  public fun get_SupportedCryptogramMaterialPackageFormats():
      IVectorView<SmartCardCryptogramMaterialPackageFormat?>?

  @InterfaceMethod(3)
  public fun get_SupportedCryptogramMaterialPackageConfirmationResponseFormats():
      IVectorView<SmartCardCryptogramMaterialPackageConfirmationResponseFormat?>?

  @InterfaceMethod(4)
  public fun get_SupportedSmartCardCryptogramStorageKeyCapabilities():
      IVectorView<SmartCardCryptogramStorageKeyCapabilities?>?

  @InterfaceMethod(5)
  public fun DeleteCryptogramMaterialStorageKeyAsync(storageKeyName: String?):
      IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>?

  @InterfaceMethod(6)
  public fun CreateCryptogramMaterialStorageKeyAsync(
    promptingBehavior: SmartCardUnlockPromptingBehavior?,
    storageKeyName: String?,
    algorithm: SmartCardCryptogramStorageKeyAlgorithm?,
    capabilities: SmartCardCryptogramStorageKeyCapabilities?
  ): IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>?

  @InterfaceMethod(7)
  public fun RequestCryptogramMaterialStorageKeyInfoAsync(
    promptingBehavior: SmartCardUnlockPromptingBehavior?,
    storageKeyName: String?,
    format: CryptographicPublicKeyBlobType?
  ): IAsyncOperation<SmartCardCryptogramStorageKeyInfo?>?

  @InterfaceMethod(8)
  public fun ImportCryptogramMaterialPackageAsync(
    format: SmartCardCryptogramMaterialPackageFormat?,
    storageKeyName: String?,
    materialPackageName: String?,
    cryptogramMaterialPackage: IBuffer?
  ): IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>?

  @InterfaceMethod(9)
  public fun TryProvePossessionOfCryptogramMaterialPackageAsync(
    promptingBehavior: SmartCardUnlockPromptingBehavior?,
    responseFormat: SmartCardCryptogramMaterialPackageConfirmationResponseFormat?,
    materialPackageName: String?,
    materialName: String?,
    challenge: IBuffer?
  ): IAsyncOperation<SmartCardCryptogramMaterialPossessionProof?>?

  @InterfaceMethod(10)
  public
      fun RequestUnlockCryptogramMaterialForUseAsync(promptingBehavior: SmartCardUnlockPromptingBehavior?):
      IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>?

  @InterfaceMethod(11)
  public fun DeleteCryptogramMaterialPackageAsync(materialPackageName: String?):
      IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramGenerator> {
    public override fun getValue() = ABI.makeISmartCardCryptogramGenerator(pointer.getPointer(0))

    public fun setValue(value: ISmartCardCryptogramGenerator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramGenerator {
    public val __185617429_Ptr: Pointer?

    public val _185617429_VtblPtr: Pointer?
      get() = __185617429_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedCryptogramMaterialTypes():
        IVectorView<SmartCardCryptogramMaterialType?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SmartCardCryptogramMaterialType?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SmartCardCryptogramMaterialType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedCryptogramAlgorithms():
        IVectorView<SmartCardCryptogramAlgorithm?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SmartCardCryptogramAlgorithm?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SmartCardCryptogramAlgorithm?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SupportedCryptogramMaterialPackageFormats():
        IVectorView<SmartCardCryptogramMaterialPackageFormat?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SmartCardCryptogramMaterialPackageFormat?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SmartCardCryptogramMaterialPackageFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SupportedCryptogramMaterialPackageConfirmationResponseFormats():
        IVectorView<SmartCardCryptogramMaterialPackageConfirmationResponseFormat?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IVectorView<SmartCardCryptogramMaterialPackageConfirmationResponseFormat?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SmartCardCryptogramMaterialPackageConfirmationResponseFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SupportedSmartCardCryptogramStorageKeyCapabilities():
        IVectorView<SmartCardCryptogramStorageKeyCapabilities?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SmartCardCryptogramStorageKeyCapabilities?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SmartCardCryptogramStorageKeyCapabilities?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun DeleteCryptogramMaterialStorageKeyAsync(storageKeyName: String?):
        IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr, marshalToNative(storageKeyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateCryptogramMaterialStorageKeyAsync(
      promptingBehavior: SmartCardUnlockPromptingBehavior?,
      storageKeyName: String?,
      algorithm: SmartCardCryptogramStorageKeyAlgorithm?,
      capabilities: SmartCardCryptogramStorageKeyCapabilities?
    ): IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr, marshalToNative(promptingBehavior),
          marshalToNative(storageKeyName), marshalToNative(algorithm),
          marshalToNative(capabilities), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun RequestCryptogramMaterialStorageKeyInfoAsync(
      promptingBehavior: SmartCardUnlockPromptingBehavior?,
      storageKeyName: String?,
      format: CryptographicPublicKeyBlobType?
    ): IAsyncOperation<SmartCardCryptogramStorageKeyInfo?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardCryptogramStorageKeyInfo?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr, marshalToNative(promptingBehavior),
          marshalToNative(storageKeyName), marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramStorageKeyInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ImportCryptogramMaterialPackageAsync(
      format: SmartCardCryptogramMaterialPackageFormat?,
      storageKeyName: String?,
      materialPackageName: String?,
      cryptogramMaterialPackage: IBuffer?
    ): IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr, marshalToNative(format),
          marshalToNative(storageKeyName), marshalToNative(materialPackageName),
          marshalToNative(cryptogramMaterialPackage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun TryProvePossessionOfCryptogramMaterialPackageAsync(
      promptingBehavior: SmartCardUnlockPromptingBehavior?,
      responseFormat: SmartCardCryptogramMaterialPackageConfirmationResponseFormat?,
      materialPackageName: String?,
      materialName: String?,
      challenge: IBuffer?
    ): IAsyncOperation<SmartCardCryptogramMaterialPossessionProof?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramMaterialPossessionProof?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr, marshalToNative(promptingBehavior),
          marshalToNative(responseFormat), marshalToNative(materialPackageName),
          marshalToNative(materialName), marshalToNative(challenge), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramMaterialPossessionProof?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override
        fun RequestUnlockCryptogramMaterialForUseAsync(promptingBehavior: SmartCardUnlockPromptingBehavior?):
        IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr, marshalToNative(promptingBehavior), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun DeleteCryptogramMaterialPackageAsync(materialPackageName: String?):
        IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>? {
      val fnPtr = _185617429_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__185617429_Ptr, marshalToNative(materialPackageName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardCryptogramGenerator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __185617429_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramGenerator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e39f587bedd34e49b5940ff5e4d0c76f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardCryptogramGenerator(ptr: Pointer?): WithDefault =
        ISmartCardCryptogramGenerator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardCryptogramGenerator {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramGenerator(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardCryptogramGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__185617429_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardCryptogramGenerator):
        Array<ISmartCardCryptogramGenerator?> = (elements as
        Array<ISmartCardCryptogramGenerator?>).castToImpl<ISmartCardCryptogramGenerator,ISmartCardCryptogramGenerator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardCryptogramGenerator?> =
        arrayOfNulls<ISmartCardCryptogramGenerator_Impl>(size) as
        Array<ISmartCardCryptogramGenerator?>
  }
}
