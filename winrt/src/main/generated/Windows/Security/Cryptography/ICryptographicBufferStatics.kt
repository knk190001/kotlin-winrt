package Windows.Security.Cryptography

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
import com.github.knk190001.winrtbinding.runtime.interop.OutArray
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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICryptographicBufferStatics.ABI::class)
@Signature("{320b7e22-3cb0-4cdf-8663-1d28910065eb}")
@Guid("320b7e223cb04cdf86631d28910065eb")
@WinRTInterface("320b7e223cb04cdf86631d28910065eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICryptographicBufferStatics.ByReference::class)
public interface ICryptographicBufferStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Compare(object1: IBuffer?, object2: IBuffer?): Boolean

  @InterfaceMethod(1)
  public fun GenerateRandom(length: WinDef.UINT): IBuffer?

  @InterfaceMethod(2)
  public fun GenerateRandomNumber(): WinDef.UINT

  @InterfaceMethod(3)
  public fun CreateFromByteArray(value: Array<Byte>): IBuffer?

  @InterfaceMethod(4)
  public fun CopyToByteArray(buffer: IBuffer?, value: OutArray<Byte>): Unit

  @InterfaceMethod(5)
  public fun DecodeFromHexString(value: String?): IBuffer?

  @InterfaceMethod(6)
  public fun EncodeToHexString(buffer: IBuffer?): String?

  @InterfaceMethod(7)
  public fun DecodeFromBase64String(value: String?): IBuffer?

  @InterfaceMethod(8)
  public fun EncodeToBase64String(buffer: IBuffer?): String?

  @InterfaceMethod(9)
  public fun ConvertStringToBinary(value: String?, encoding: BinaryStringEncoding?): IBuffer?

  @InterfaceMethod(10)
  public fun ConvertBinaryToString(encoding: BinaryStringEncoding?, buffer: IBuffer?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICryptographicBufferStatics> {
    public override fun getValue() = ABI.makeICryptographicBufferStatics(pointer.getPointer(0))

    public fun setValue(value: ICryptographicBufferStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICryptographicBufferStatics {
    public val __125709784_Ptr: Pointer?

    public val _125709784_VtblPtr: Pointer?
      get() = __125709784_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Compare(object1: IBuffer?, object2: IBuffer?): Boolean {
      val fnPtr = _125709784_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__125709784_Ptr, marshalToNative(object1),
          marshalToNative(object2), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GenerateRandom(length: WinDef.UINT): IBuffer? {
      val fnPtr = _125709784_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__125709784_Ptr, length, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GenerateRandomNumber(): WinDef.UINT {
      val fnPtr = _125709784_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__125709784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun CreateFromByteArray(value: Array<Byte>): IBuffer? {
      val fnPtr = _125709784_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__125709784_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CopyToByteArray(buffer: IBuffer?, value: OutArray<Byte>): Unit {
      val fnPtr = _125709784_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__125709784_Ptr, marshalToNative(buffer),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun DecodeFromHexString(value: String?): IBuffer? {
      val fnPtr = _125709784_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__125709784_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun EncodeToHexString(buffer: IBuffer?): String? {
      val fnPtr = _125709784_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__125709784_Ptr, marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun DecodeFromBase64String(value: String?): IBuffer? {
      val fnPtr = _125709784_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__125709784_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun EncodeToBase64String(buffer: IBuffer?): String? {
      val fnPtr = _125709784_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__125709784_Ptr, marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun ConvertStringToBinary(value: String?, encoding: BinaryStringEncoding?):
        IBuffer? {
      val fnPtr = _125709784_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__125709784_Ptr, marshalToNative(value),
          marshalToNative(encoding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun ConvertBinaryToString(encoding: BinaryStringEncoding?, buffer: IBuffer?):
        String? {
      val fnPtr = _125709784_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__125709784_Ptr, marshalToNative(encoding),
          marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICryptographicBufferStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __125709784_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICryptographicBufferStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("320b7e223cb04cdf86631d28910065eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICryptographicBufferStatics(ptr: Pointer?): WithDefault =
        ICryptographicBufferStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICryptographicBufferStatics {
      val address = segment.toRawLongValue()
      return makeICryptographicBufferStatics(Pointer(address))
    }

    public override fun toNative(obj: ICryptographicBufferStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__125709784_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICryptographicBufferStatics):
        Array<ICryptographicBufferStatics?> = (elements as
        Array<ICryptographicBufferStatics?>).castToImpl<ICryptographicBufferStatics,ICryptographicBufferStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICryptographicBufferStatics?> =
        arrayOfNulls<ICryptographicBufferStatics_Impl>(size) as Array<ICryptographicBufferStatics?>
  }
}
