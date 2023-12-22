package Windows.UI.Input.Preview.Injection

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInjectedInputTouchInfo.ABI::class)
@Signature("{224fd1df-43e8-5ef5-510a-69ca8c9b4c28}")
@Guid("224fd1df43e85ef5510a69ca8c9b4c28")
@WinRTInterface("224fd1df43e85ef5510a69ca8c9b4c28")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInjectedInputTouchInfo.ByReference::class)
public interface IInjectedInputTouchInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Contact(): InjectedInputRectangle?

  @InterfaceMethod(1)
  public fun put_Contact(value: InjectedInputRectangle?): Unit

  @InterfaceMethod(2)
  public fun get_Orientation(): Int

  @InterfaceMethod(3)
  public fun put_Orientation(value: Int): Unit

  @InterfaceMethod(4)
  public fun get_PointerInfo(): InjectedInputPointerInfo?

  @InterfaceMethod(5)
  public fun put_PointerInfo(value: InjectedInputPointerInfo?): Unit

  @InterfaceMethod(6)
  public fun get_Pressure(): Double

  @InterfaceMethod(7)
  public fun put_Pressure(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_TouchParameters(): InjectedInputTouchParameters?

  @InterfaceMethod(9)
  public fun put_TouchParameters(value: InjectedInputTouchParameters?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInjectedInputTouchInfo> {
    public override fun getValue() = ABI.makeIInjectedInputTouchInfo(pointer.getPointer(0))

    public fun setValue(value: IInjectedInputTouchInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInjectedInputTouchInfo {
    public val __2145423842_Ptr: Pointer?

    public val _2145423842_VtblPtr: Pointer?
      get() = __2145423842_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Contact(): InjectedInputRectangle? {
      val fnPtr = _2145423842_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InjectedInputRectangle>()
      val hr = fn.invokeHR(arrayOf(__2145423842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InjectedInputRectangle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Contact(value: InjectedInputRectangle?): Unit {
      val fnPtr = _2145423842_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2145423842_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Orientation(): Int {
      val fnPtr = _2145423842_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2145423842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Orientation(value: Int): Unit {
      val fnPtr = _2145423842_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2145423842_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PointerInfo(): InjectedInputPointerInfo? {
      val fnPtr = _2145423842_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InjectedInputPointerInfo>()
      val hr = fn.invokeHR(arrayOf(__2145423842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InjectedInputPointerInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PointerInfo(value: InjectedInputPointerInfo?): Unit {
      val fnPtr = _2145423842_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2145423842_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Pressure(): Double {
      val fnPtr = _2145423842_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2145423842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Pressure(value: Double): Unit {
      val fnPtr = _2145423842_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2145423842_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TouchParameters(): InjectedInputTouchParameters? {
      val fnPtr = _2145423842_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InjectedInputTouchParameters>()
      val hr = fn.invokeHR(arrayOf(__2145423842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InjectedInputTouchParameters>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_TouchParameters(value: InjectedInputTouchParameters?): Unit {
      val fnPtr = _2145423842_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2145423842_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInjectedInputTouchInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2145423842_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInjectedInputTouchInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("224fd1df43e85ef5510a69ca8c9b4c28")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInjectedInputTouchInfo(ptr: Pointer?): WithDefault =
        IInjectedInputTouchInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInjectedInputTouchInfo {
      val address = segment.toRawLongValue()
      return makeIInjectedInputTouchInfo(Pointer(address))
    }

    public override fun toNative(obj: IInjectedInputTouchInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2145423842_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInjectedInputTouchInfo): Array<IInjectedInputTouchInfo?>
        = (elements as
        Array<IInjectedInputTouchInfo?>).castToImpl<IInjectedInputTouchInfo,IInjectedInputTouchInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInjectedInputTouchInfo?> =
        arrayOfNulls<IInjectedInputTouchInfo_Impl>(size) as Array<IInjectedInputTouchInfo?>
  }
}
