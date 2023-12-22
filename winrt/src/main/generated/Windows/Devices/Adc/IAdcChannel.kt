package Windows.Devices.Adc

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdcChannel.ABI::class)
@Signature("{040bf414-2588-4a56-abef-73a260acc60a}")
@Guid("040bf41425884a56abef73a260acc60a")
@WinRTInterface("040bf41425884a56abef73a260acc60a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdcChannel.ByReference::class)
public interface IAdcChannel : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Controller(): AdcController?

  @InterfaceMethod(1)
  public fun ReadValue(): Int

  @InterfaceMethod(2)
  public fun ReadRatio(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAdcChannel> {
    public override fun getValue() = ABI.makeIAdcChannel(pointer.getPointer(0))

    public fun setValue(value: IAdcChannel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdcChannel, IClosable.WithDefault {
    public val __1743217112_Ptr: Pointer?

    public val _1743217112_VtblPtr: Pointer?
      get() = __1743217112_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Controller(): AdcController? {
      val fnPtr = _1743217112_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdcController>()
      val hr = fn.invokeHR(arrayOf(__1743217112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdcController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReadValue(): Int {
      val fnPtr = _1743217112_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1743217112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun ReadRatio(): Double {
      val fnPtr = _1743217112_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1743217112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IAdcChannel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1743217112_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1743217112_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdcChannel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("040bf41425884a56abef73a260acc60a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdcChannel(ptr: Pointer?): WithDefault = IAdcChannel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdcChannel {
      val address = segment.toRawLongValue()
      return makeIAdcChannel(Pointer(address))
    }

    public override fun toNative(obj: IAdcChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1743217112_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdcChannel): Array<IAdcChannel?> = (elements as
        Array<IAdcChannel?>).castToImpl<IAdcChannel,IAdcChannel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdcChannel?> =
        arrayOfNulls<IAdcChannel_Impl>(size) as Array<IAdcChannel?>
  }
}
