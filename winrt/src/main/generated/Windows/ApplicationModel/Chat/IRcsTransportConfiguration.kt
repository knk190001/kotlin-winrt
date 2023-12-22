package Windows.ApplicationModel.Chat

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

@ABIMarker(IRcsTransportConfiguration.ABI::class)
@Signature("{1fccb102-2472-4bb9-9988-c1211c83e8a9}")
@Guid("1fccb10224724bb99988c1211c83e8a9")
@WinRTInterface("1fccb10224724bb99988c1211c83e8a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRcsTransportConfiguration.ByReference::class)
public interface IRcsTransportConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxAttachmentCount(): Int

  @InterfaceMethod(1)
  public fun get_MaxMessageSizeInKilobytes(): Int

  @InterfaceMethod(2)
  public fun get_MaxGroupMessageSizeInKilobytes(): Int

  @InterfaceMethod(3)
  public fun get_MaxRecipientCount(): Int

  @InterfaceMethod(4)
  public fun get_MaxFileSizeInKilobytes(): Int

  @InterfaceMethod(5)
  public fun get_WarningFileSizeInKilobytes(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRcsTransportConfiguration> {
    public override fun getValue() = ABI.makeIRcsTransportConfiguration(pointer.getPointer(0))

    public fun setValue(value: IRcsTransportConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRcsTransportConfiguration {
    public val __627187624_Ptr: Pointer?

    public val _627187624_VtblPtr: Pointer?
      get() = __627187624_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxAttachmentCount(): Int {
      val fnPtr = _627187624_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__627187624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MaxMessageSizeInKilobytes(): Int {
      val fnPtr = _627187624_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__627187624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxGroupMessageSizeInKilobytes(): Int {
      val fnPtr = _627187624_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__627187624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MaxRecipientCount(): Int {
      val fnPtr = _627187624_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__627187624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_MaxFileSizeInKilobytes(): Int {
      val fnPtr = _627187624_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__627187624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_WarningFileSizeInKilobytes(): Int {
      val fnPtr = _627187624_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__627187624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IRcsTransportConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __627187624_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRcsTransportConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1fccb10224724bb99988c1211c83e8a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRcsTransportConfiguration(ptr: Pointer?): WithDefault =
        IRcsTransportConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRcsTransportConfiguration {
      val address = segment.toRawLongValue()
      return makeIRcsTransportConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IRcsTransportConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__627187624_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRcsTransportConfiguration):
        Array<IRcsTransportConfiguration?> = (elements as
        Array<IRcsTransportConfiguration?>).castToImpl<IRcsTransportConfiguration,IRcsTransportConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRcsTransportConfiguration?> =
        arrayOfNulls<IRcsTransportConfiguration_Impl>(size) as Array<IRcsTransportConfiguration?>
  }
}
