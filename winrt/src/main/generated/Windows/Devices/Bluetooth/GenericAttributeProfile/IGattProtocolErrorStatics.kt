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

@ABIMarker(IGattProtocolErrorStatics.ABI::class)
@Signature("{ca46c5c5-0ecc-4809-bea3-cf79bc991e37}")
@Guid("ca46c5c50ecc4809bea3cf79bc991e37")
@WinRTInterface("ca46c5c50ecc4809bea3cf79bc991e37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattProtocolErrorStatics.ByReference::class)
public interface IGattProtocolErrorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InvalidHandle(): Byte

  @InterfaceMethod(1)
  public fun get_ReadNotPermitted(): Byte

  @InterfaceMethod(2)
  public fun get_WriteNotPermitted(): Byte

  @InterfaceMethod(3)
  public fun get_InvalidPdu(): Byte

  @InterfaceMethod(4)
  public fun get_InsufficientAuthentication(): Byte

  @InterfaceMethod(5)
  public fun get_RequestNotSupported(): Byte

  @InterfaceMethod(6)
  public fun get_InvalidOffset(): Byte

  @InterfaceMethod(7)
  public fun get_InsufficientAuthorization(): Byte

  @InterfaceMethod(8)
  public fun get_PrepareQueueFull(): Byte

  @InterfaceMethod(9)
  public fun get_AttributeNotFound(): Byte

  @InterfaceMethod(10)
  public fun get_AttributeNotLong(): Byte

  @InterfaceMethod(11)
  public fun get_InsufficientEncryptionKeySize(): Byte

  @InterfaceMethod(12)
  public fun get_InvalidAttributeValueLength(): Byte

  @InterfaceMethod(13)
  public fun get_UnlikelyError(): Byte

  @InterfaceMethod(14)
  public fun get_InsufficientEncryption(): Byte

  @InterfaceMethod(15)
  public fun get_UnsupportedGroupType(): Byte

  @InterfaceMethod(16)
  public fun get_InsufficientResources(): Byte

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattProtocolErrorStatics> {
    public override fun getValue() = ABI.makeIGattProtocolErrorStatics(pointer.getPointer(0))

    public fun setValue(value: IGattProtocolErrorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattProtocolErrorStatics {
    public val __1175529328_Ptr: Pointer?

    public val _1175529328_VtblPtr: Pointer?
      get() = __1175529328_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InvalidHandle(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ReadNotPermitted(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_WriteNotPermitted(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_InvalidPdu(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_InsufficientAuthentication(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_RequestNotSupported(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_InvalidOffset(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_InsufficientAuthorization(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_PrepareQueueFull(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_AttributeNotFound(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_AttributeNotLong(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_InsufficientEncryptionKeySize(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_InvalidAttributeValueLength(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_UnlikelyError(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_InsufficientEncryption(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_UnsupportedGroupType(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_InsufficientResources(): Byte {
      val fnPtr = _1175529328_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1175529328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }
  }

  public class IGattProtocolErrorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1175529328_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattProtocolErrorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca46c5c50ecc4809bea3cf79bc991e37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattProtocolErrorStatics(ptr: Pointer?): WithDefault =
        IGattProtocolErrorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattProtocolErrorStatics {
      val address = segment.toRawLongValue()
      return makeIGattProtocolErrorStatics(Pointer(address))
    }

    public override fun toNative(obj: IGattProtocolErrorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1175529328_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattProtocolErrorStatics):
        Array<IGattProtocolErrorStatics?> = (elements as
        Array<IGattProtocolErrorStatics?>).castToImpl<IGattProtocolErrorStatics,IGattProtocolErrorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattProtocolErrorStatics?> =
        arrayOfNulls<IGattProtocolErrorStatics_Impl>(size) as Array<IGattProtocolErrorStatics?>
  }
}
