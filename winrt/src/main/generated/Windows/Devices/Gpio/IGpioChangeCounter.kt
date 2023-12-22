package Windows.Devices.Gpio

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGpioChangeCounter.ABI::class)
@Signature("{cb5ec0de-6801-43ff-803d-4576628a8b26}")
@Guid("cb5ec0de680143ff803d4576628a8b26")
@WinRTInterface("cb5ec0de680143ff803d4576628a8b26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioChangeCounter.ByReference::class)
public interface IGpioChangeCounter : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun put_Polarity(value: GpioChangePolarity?): Unit

  @InterfaceMethod(1)
  public fun get_Polarity(): GpioChangePolarity?

  @InterfaceMethod(2)
  public fun get_IsStarted(): Boolean

  @InterfaceMethod(3)
  public fun Start(): Unit

  @InterfaceMethod(4)
  public fun Stop(): Unit

  @InterfaceMethod(5)
  public fun Read(): GpioChangeCount?

  @InterfaceMethod(6)
  public fun Reset(): GpioChangeCount?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGpioChangeCounter> {
    public override fun getValue() = ABI.makeIGpioChangeCounter(pointer.getPointer(0))

    public fun setValue(value: IGpioChangeCounter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioChangeCounter, IClosable.WithDefault {
    public val __1404136769_Ptr: Pointer?

    public val _1404136769_VtblPtr: Pointer?
      get() = __1404136769_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Polarity(value: GpioChangePolarity?): Unit {
      val fnPtr = _1404136769_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1404136769_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Polarity(): GpioChangePolarity? {
      val fnPtr = _1404136769_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioChangePolarity>()
      val hr = fn.invokeHR(arrayOf(__1404136769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioChangePolarity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsStarted(): Boolean {
      val fnPtr = _1404136769_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1404136769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun Start(): Unit {
      val fnPtr = _1404136769_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1404136769_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Stop(): Unit {
      val fnPtr = _1404136769_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1404136769_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Read(): GpioChangeCount? {
      val fnPtr = _1404136769_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioChangeCount>()
      val hr = fn.invokeHR(arrayOf(__1404136769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioChangeCount>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun Reset(): GpioChangeCount? {
      val fnPtr = _1404136769_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioChangeCount>()
      val hr = fn.invokeHR(arrayOf(__1404136769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioChangeCount>(result.getValue())
      return resultValue
    }
  }

  public class IGpioChangeCounter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1404136769_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1404136769_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioChangeCounter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb5ec0de680143ff803d4576628a8b26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioChangeCounter(ptr: Pointer?): WithDefault = IGpioChangeCounter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGpioChangeCounter {
      val address = segment.toRawLongValue()
      return makeIGpioChangeCounter(Pointer(address))
    }

    public override fun toNative(obj: IGpioChangeCounter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1404136769_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioChangeCounter): Array<IGpioChangeCounter?> =
        (elements as
        Array<IGpioChangeCounter?>).castToImpl<IGpioChangeCounter,IGpioChangeCounter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioChangeCounter?> =
        arrayOfNulls<IGpioChangeCounter_Impl>(size) as Array<IGpioChangeCounter?>
  }
}
