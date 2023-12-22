package Windows.Security.EnterpriseData

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
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

@ABIMarker(IDataProtectionManagerStatics.ABI::class)
@Signature("{b6149b74-9144-4ee4-8a8a-30b5f361430e}")
@Guid("b6149b7491444ee48a8a30b5f361430e")
@WinRTInterface("b6149b7491444ee48a8a30b5f361430e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataProtectionManagerStatics.ByReference::class)
public interface IDataProtectionManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ProtectAsync(`data`: IBuffer?, identity: String?):
      IAsyncOperation<BufferProtectUnprotectResult?>?

  @InterfaceMethod(1)
  public fun UnprotectAsync(`data`: IBuffer?): IAsyncOperation<BufferProtectUnprotectResult?>?

  @InterfaceMethod(2)
  public fun ProtectStreamAsync(
    unprotectedStream: IInputStream?,
    identity: String?,
    protectedStream: IOutputStream?
  ): IAsyncOperation<DataProtectionInfo?>?

  @InterfaceMethod(3)
  public fun UnprotectStreamAsync(protectedStream: IInputStream?,
      unprotectedStream: IOutputStream?): IAsyncOperation<DataProtectionInfo?>?

  @InterfaceMethod(4)
  public fun GetProtectionInfoAsync(protectedData: IBuffer?): IAsyncOperation<DataProtectionInfo?>?

  @InterfaceMethod(5)
  public fun GetStreamProtectionInfoAsync(protectedStream: IInputStream?):
      IAsyncOperation<DataProtectionInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataProtectionManagerStatics> {
    public override fun getValue() = ABI.makeIDataProtectionManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IDataProtectionManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataProtectionManagerStatics {
    public val __804425590_Ptr: Pointer?

    public val _804425590_VtblPtr: Pointer?
      get() = __804425590_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ProtectAsync(`data`: IBuffer?, identity: String?):
        IAsyncOperation<BufferProtectUnprotectResult?>? {
      val fnPtr = _804425590_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BufferProtectUnprotectResult?>>()
      val hr = fn.invokeHR(arrayOf(__804425590_Ptr, marshalToNative(data),
          marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<BufferProtectUnprotectResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UnprotectAsync(`data`: IBuffer?):
        IAsyncOperation<BufferProtectUnprotectResult?>? {
      val fnPtr = _804425590_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BufferProtectUnprotectResult?>>()
      val hr = fn.invokeHR(arrayOf(__804425590_Ptr, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<BufferProtectUnprotectResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ProtectStreamAsync(
      unprotectedStream: IInputStream?,
      identity: String?,
      protectedStream: IOutputStream?
    ): IAsyncOperation<DataProtectionInfo?>? {
      val fnPtr = _804425590_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataProtectionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__804425590_Ptr, marshalToNative(unprotectedStream),
          marshalToNative(identity), marshalToNative(protectedStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataProtectionInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun UnprotectStreamAsync(protectedStream: IInputStream?,
        unprotectedStream: IOutputStream?): IAsyncOperation<DataProtectionInfo?>? {
      val fnPtr = _804425590_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataProtectionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__804425590_Ptr, marshalToNative(protectedStream),
          marshalToNative(unprotectedStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataProtectionInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetProtectionInfoAsync(protectedData: IBuffer?):
        IAsyncOperation<DataProtectionInfo?>? {
      val fnPtr = _804425590_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataProtectionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__804425590_Ptr, marshalToNative(protectedData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataProtectionInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetStreamProtectionInfoAsync(protectedStream: IInputStream?):
        IAsyncOperation<DataProtectionInfo?>? {
      val fnPtr = _804425590_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataProtectionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__804425590_Ptr, marshalToNative(protectedStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataProtectionInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IDataProtectionManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __804425590_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataProtectionManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6149b7491444ee48a8a30b5f361430e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataProtectionManagerStatics(ptr: Pointer?): WithDefault =
        IDataProtectionManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataProtectionManagerStatics {
      val address = segment.toRawLongValue()
      return makeIDataProtectionManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IDataProtectionManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__804425590_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataProtectionManagerStatics):
        Array<IDataProtectionManagerStatics?> = (elements as
        Array<IDataProtectionManagerStatics?>).castToImpl<IDataProtectionManagerStatics,IDataProtectionManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataProtectionManagerStatics?> =
        arrayOfNulls<IDataProtectionManagerStatics_Impl>(size) as
        Array<IDataProtectionManagerStatics?>
  }
}
