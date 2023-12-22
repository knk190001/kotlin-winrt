package Windows.Devices.WiFiDirect

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWiFiDirectInformationElement.ABI::class)
@Signature("{affb72d6-76bb-497e-ac8b-dc72838bc309}")
@Guid("affb72d676bb497eac8bdc72838bc309")
@WinRTInterface("affb72d676bb497eac8bdc72838bc309")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectInformationElement.ByReference::class)
public interface IWiFiDirectInformationElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Oui(): IBuffer?

  @InterfaceMethod(1)
  public fun put_Oui(value: IBuffer?): Unit

  @InterfaceMethod(2)
  public fun get_OuiType(): Byte

  @InterfaceMethod(3)
  public fun put_OuiType(value: Byte): Unit

  @InterfaceMethod(4)
  public fun get_Value(): IBuffer?

  @InterfaceMethod(5)
  public fun put_Value(value: IBuffer?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectInformationElement> {
    public override fun getValue() = ABI.makeIWiFiDirectInformationElement(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectInformationElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectInformationElement {
    public val __136956061_Ptr: Pointer?

    public val _136956061_VtblPtr: Pointer?
      get() = __136956061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Oui(): IBuffer? {
      val fnPtr = _136956061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__136956061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Oui(value: IBuffer?): Unit {
      val fnPtr = _136956061_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__136956061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OuiType(): Byte {
      val fnPtr = _136956061_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__136956061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_OuiType(value: Byte): Unit {
      val fnPtr = _136956061_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__136956061_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Value(): IBuffer? {
      val fnPtr = _136956061_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__136956061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Value(value: IBuffer?): Unit {
      val fnPtr = _136956061_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__136956061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWiFiDirectInformationElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __136956061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectInformationElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("affb72d676bb497eac8bdc72838bc309")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectInformationElement(ptr: Pointer?): WithDefault =
        IWiFiDirectInformationElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectInformationElement {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectInformationElement(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectInformationElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__136956061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectInformationElement):
        Array<IWiFiDirectInformationElement?> = (elements as
        Array<IWiFiDirectInformationElement?>).castToImpl<IWiFiDirectInformationElement,IWiFiDirectInformationElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectInformationElement?> =
        arrayOfNulls<IWiFiDirectInformationElement_Impl>(size) as
        Array<IWiFiDirectInformationElement?>
  }
}
