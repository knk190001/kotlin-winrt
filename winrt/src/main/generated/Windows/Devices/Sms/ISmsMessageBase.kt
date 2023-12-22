package Windows.Devices.Sms

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

@ABIMarker(ISmsMessageBase.ABI::class)
@Signature("{2cf0fe30-fe50-4fc6-aa88-4ccfe27a29ea}")
@Guid("2cf0fe30fe504fc6aa884ccfe27a29ea")
@WinRTInterface("2cf0fe30fe504fc6aa884ccfe27a29ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsMessageBase.ByReference::class)
public interface ISmsMessageBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MessageType(): SmsMessageType?

  @InterfaceMethod(1)
  public fun get_DeviceId(): String?

  @InterfaceMethod(2)
  public fun get_CellularClass(): CellularClass?

  @InterfaceMethod(3)
  public fun get_MessageClass(): SmsMessageClass?

  @InterfaceMethod(4)
  public fun get_SimIccId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsMessageBase> {
    public override fun getValue() = ABI.makeISmsMessageBase(pointer.getPointer(0))

    public fun setValue(value: ISmsMessageBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsMessageBase {
    public val __1120832021_Ptr: Pointer?

    public val _1120832021_VtblPtr: Pointer?
      get() = __1120832021_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MessageType(): SmsMessageType? {
      val fnPtr = _1120832021_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsMessageType>()
      val hr = fn.invokeHR(arrayOf(__1120832021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsMessageType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1120832021_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1120832021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CellularClass(): CellularClass? {
      val fnPtr = _1120832021_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CellularClass>()
      val hr = fn.invokeHR(arrayOf(__1120832021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CellularClass>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MessageClass(): SmsMessageClass? {
      val fnPtr = _1120832021_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsMessageClass>()
      val hr = fn.invokeHR(arrayOf(__1120832021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsMessageClass>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SimIccId(): String? {
      val fnPtr = _1120832021_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1120832021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISmsMessageBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1120832021_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsMessageBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2cf0fe30fe504fc6aa884ccfe27a29ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsMessageBase(ptr: Pointer?): WithDefault = ISmsMessageBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsMessageBase {
      val address = segment.toRawLongValue()
      return makeISmsMessageBase(Pointer(address))
    }

    public override fun toNative(obj: ISmsMessageBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1120832021_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsMessageBase): Array<ISmsMessageBase?> = (elements as
        Array<ISmsMessageBase?>).castToImpl<ISmsMessageBase,ISmsMessageBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsMessageBase?> =
        arrayOfNulls<ISmsMessageBase_Impl>(size) as Array<ISmsMessageBase?>
  }
}
