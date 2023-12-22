package Windows.Security.Cryptography.Core

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICryptographicEngineStatics2.ABI::class)
@Signature("{675948fe-df9f-4191-92c7-6ce6f58420e0}")
@Guid("675948fedf9f419192c76ce6f58420e0")
@WinRTInterface("675948fedf9f419192c76ce6f58420e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICryptographicEngineStatics2.ByReference::class)
public interface ICryptographicEngineStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SignHashedData(key: CryptographicKey?, `data`: IBuffer?): IBuffer?

  @InterfaceMethod(1)
  public fun VerifySignatureWithHashInput(
    key: CryptographicKey?,
    `data`: IBuffer?,
    signature: IBuffer?
  ): Boolean

  @InterfaceMethod(2)
  public fun DecryptAsync(
    key: CryptographicKey?,
    `data`: IBuffer?,
    iv: IBuffer?
  ): IAsyncOperation<IBuffer?>?

  @InterfaceMethod(3)
  public fun SignAsync(key: CryptographicKey?, `data`: IBuffer?): IAsyncOperation<IBuffer?>?

  @InterfaceMethod(4)
  public fun SignHashedDataAsync(key: CryptographicKey?, `data`: IBuffer?):
      IAsyncOperation<IBuffer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICryptographicEngineStatics2> {
    public override fun getValue() = ABI.makeICryptographicEngineStatics2(pointer.getPointer(0))

    public fun setValue(value: ICryptographicEngineStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICryptographicEngineStatics2 {
    public val __425186293_Ptr: Pointer?

    public val _425186293_VtblPtr: Pointer?
      get() = __425186293_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SignHashedData(key: CryptographicKey?, `data`: IBuffer?): IBuffer? {
      val fnPtr = _425186293_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__425186293_Ptr, marshalToNative(key), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun VerifySignatureWithHashInput(
      key: CryptographicKey?,
      `data`: IBuffer?,
      signature: IBuffer?
    ): Boolean {
      val fnPtr = _425186293_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__425186293_Ptr, marshalToNative(key), marshalToNative(data),
          marshalToNative(signature), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun DecryptAsync(
      key: CryptographicKey?,
      `data`: IBuffer?,
      iv: IBuffer?
    ): IAsyncOperation<IBuffer?>? {
      val fnPtr = _425186293_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__425186293_Ptr, marshalToNative(key), marshalToNative(data),
          marshalToNative(iv), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SignAsync(key: CryptographicKey?, `data`: IBuffer?):
        IAsyncOperation<IBuffer?>? {
      val fnPtr = _425186293_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__425186293_Ptr, marshalToNative(key), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SignHashedDataAsync(key: CryptographicKey?, `data`: IBuffer?):
        IAsyncOperation<IBuffer?>? {
      val fnPtr = _425186293_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__425186293_Ptr, marshalToNative(key), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }
  }

  public class ICryptographicEngineStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __425186293_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICryptographicEngineStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("675948fedf9f419192c76ce6f58420e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICryptographicEngineStatics2(ptr: Pointer?): WithDefault =
        ICryptographicEngineStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICryptographicEngineStatics2 {
      val address = segment.toRawLongValue()
      return makeICryptographicEngineStatics2(Pointer(address))
    }

    public override fun toNative(obj: ICryptographicEngineStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__425186293_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICryptographicEngineStatics2):
        Array<ICryptographicEngineStatics2?> = (elements as
        Array<ICryptographicEngineStatics2?>).castToImpl<ICryptographicEngineStatics2,ICryptographicEngineStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICryptographicEngineStatics2?> =
        arrayOfNulls<ICryptographicEngineStatics2_Impl>(size) as
        Array<ICryptographicEngineStatics2?>
  }
}
