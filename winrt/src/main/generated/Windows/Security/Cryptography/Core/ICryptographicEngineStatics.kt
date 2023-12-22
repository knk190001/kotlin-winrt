package Windows.Security.Cryptography.Core

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICryptographicEngineStatics.ABI::class)
@Signature("{9fea0639-6ff7-4c85-a095-95eb31715eb9}")
@Guid("9fea06396ff74c85a09595eb31715eb9")
@WinRTInterface("9fea06396ff74c85a09595eb31715eb9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICryptographicEngineStatics.ByReference::class)
public interface ICryptographicEngineStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Encrypt(
    key: CryptographicKey?,
    `data`: IBuffer?,
    iv: IBuffer?
  ): IBuffer?

  @InterfaceMethod(1)
  public fun Decrypt(
    key: CryptographicKey?,
    `data`: IBuffer?,
    iv: IBuffer?
  ): IBuffer?

  @InterfaceMethod(2)
  public fun EncryptAndAuthenticate(
    key: CryptographicKey?,
    `data`: IBuffer?,
    nonce: IBuffer?,
    authenticatedData: IBuffer?
  ): EncryptedAndAuthenticatedData?

  @InterfaceMethod(3)
  public fun DecryptAndAuthenticate(
    key: CryptographicKey?,
    `data`: IBuffer?,
    nonce: IBuffer?,
    authenticationTag: IBuffer?,
    authenticatedData: IBuffer?
  ): IBuffer?

  @InterfaceMethod(4)
  public fun Sign(key: CryptographicKey?, `data`: IBuffer?): IBuffer?

  @InterfaceMethod(5)
  public fun VerifySignature(
    key: CryptographicKey?,
    `data`: IBuffer?,
    signature: IBuffer?
  ): Boolean

  @InterfaceMethod(6)
  public fun DeriveKeyMaterial(
    key: CryptographicKey?,
    parameters: KeyDerivationParameters?,
    desiredKeySize: WinDef.UINT
  ): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICryptographicEngineStatics> {
    public override fun getValue() = ABI.makeICryptographicEngineStatics(pointer.getPointer(0))

    public fun setValue(value: ICryptographicEngineStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICryptographicEngineStatics {
    public val __567905017_Ptr: Pointer?

    public val _567905017_VtblPtr: Pointer?
      get() = __567905017_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Encrypt(
      key: CryptographicKey?,
      `data`: IBuffer?,
      iv: IBuffer?
    ): IBuffer? {
      val fnPtr = _567905017_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__567905017_Ptr, marshalToNative(key), marshalToNative(data),
          marshalToNative(iv), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Decrypt(
      key: CryptographicKey?,
      `data`: IBuffer?,
      iv: IBuffer?
    ): IBuffer? {
      val fnPtr = _567905017_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__567905017_Ptr, marshalToNative(key), marshalToNative(data),
          marshalToNative(iv), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun EncryptAndAuthenticate(
      key: CryptographicKey?,
      `data`: IBuffer?,
      nonce: IBuffer?,
      authenticatedData: IBuffer?
    ): EncryptedAndAuthenticatedData? {
      val fnPtr = _567905017_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EncryptedAndAuthenticatedData>()
      val hr = fn.invokeHR(arrayOf(__567905017_Ptr, marshalToNative(key), marshalToNative(data),
          marshalToNative(nonce), marshalToNative(authenticatedData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EncryptedAndAuthenticatedData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun DecryptAndAuthenticate(
      key: CryptographicKey?,
      `data`: IBuffer?,
      nonce: IBuffer?,
      authenticationTag: IBuffer?,
      authenticatedData: IBuffer?
    ): IBuffer? {
      val fnPtr = _567905017_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__567905017_Ptr, marshalToNative(key), marshalToNative(data),
          marshalToNative(nonce), marshalToNative(authenticationTag),
          marshalToNative(authenticatedData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Sign(key: CryptographicKey?, `data`: IBuffer?): IBuffer? {
      val fnPtr = _567905017_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__567905017_Ptr, marshalToNative(key), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun VerifySignature(
      key: CryptographicKey?,
      `data`: IBuffer?,
      signature: IBuffer?
    ): Boolean {
      val fnPtr = _567905017_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__567905017_Ptr, marshalToNative(key), marshalToNative(data),
          marshalToNative(signature), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun DeriveKeyMaterial(
      key: CryptographicKey?,
      parameters: KeyDerivationParameters?,
      desiredKeySize: WinDef.UINT
    ): IBuffer? {
      val fnPtr = _567905017_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__567905017_Ptr, marshalToNative(key),
          marshalToNative(parameters), desiredKeySize, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class ICryptographicEngineStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __567905017_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICryptographicEngineStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fea06396ff74c85a09595eb31715eb9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICryptographicEngineStatics(ptr: Pointer?): WithDefault =
        ICryptographicEngineStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICryptographicEngineStatics {
      val address = segment.toRawLongValue()
      return makeICryptographicEngineStatics(Pointer(address))
    }

    public override fun toNative(obj: ICryptographicEngineStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__567905017_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICryptographicEngineStatics):
        Array<ICryptographicEngineStatics?> = (elements as
        Array<ICryptographicEngineStatics?>).castToImpl<ICryptographicEngineStatics,ICryptographicEngineStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICryptographicEngineStatics?> =
        arrayOfNulls<ICryptographicEngineStatics_Impl>(size) as Array<ICryptographicEngineStatics?>
  }
}
