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

@ABIMarker(IInjectedInputPenInfo.ABI::class)
@Signature("{6b40ad03-ca1e-5527-7e02-2828540bb1d4}")
@Guid("6b40ad03ca1e55277e022828540bb1d4")
@WinRTInterface("6b40ad03ca1e55277e022828540bb1d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInjectedInputPenInfo.ByReference::class)
public interface IInjectedInputPenInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerInfo(): InjectedInputPointerInfo?

  @InterfaceMethod(1)
  public fun put_PointerInfo(value: InjectedInputPointerInfo?): Unit

  @InterfaceMethod(2)
  public fun get_PenButtons(): InjectedInputPenButtons?

  @InterfaceMethod(3)
  public fun put_PenButtons(value: InjectedInputPenButtons?): Unit

  @InterfaceMethod(4)
  public fun get_PenParameters(): InjectedInputPenParameters?

  @InterfaceMethod(5)
  public fun put_PenParameters(value: InjectedInputPenParameters?): Unit

  @InterfaceMethod(6)
  public fun get_Pressure(): Double

  @InterfaceMethod(7)
  public fun put_Pressure(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_Rotation(): Double

  @InterfaceMethod(9)
  public fun put_Rotation(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_TiltX(): Int

  @InterfaceMethod(11)
  public fun put_TiltX(value: Int): Unit

  @InterfaceMethod(12)
  public fun get_TiltY(): Int

  @InterfaceMethod(13)
  public fun put_TiltY(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInjectedInputPenInfo> {
    public override fun getValue() = ABI.makeIInjectedInputPenInfo(pointer.getPointer(0))

    public fun setValue(value: IInjectedInputPenInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInjectedInputPenInfo {
    public val __78246712_Ptr: Pointer?

    public val _78246712_VtblPtr: Pointer?
      get() = __78246712_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerInfo(): InjectedInputPointerInfo? {
      val fnPtr = _78246712_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InjectedInputPointerInfo>()
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InjectedInputPointerInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PointerInfo(value: InjectedInputPointerInfo?): Unit {
      val fnPtr = _78246712_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PenButtons(): InjectedInputPenButtons? {
      val fnPtr = _78246712_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InjectedInputPenButtons>()
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InjectedInputPenButtons>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PenButtons(value: InjectedInputPenButtons?): Unit {
      val fnPtr = _78246712_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PenParameters(): InjectedInputPenParameters? {
      val fnPtr = _78246712_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InjectedInputPenParameters>()
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InjectedInputPenParameters>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PenParameters(value: InjectedInputPenParameters?): Unit {
      val fnPtr = _78246712_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Pressure(): Double {
      val fnPtr = _78246712_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Pressure(value: Double): Unit {
      val fnPtr = _78246712_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Rotation(): Double {
      val fnPtr = _78246712_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_Rotation(value: Double): Unit {
      val fnPtr = _78246712_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_TiltX(): Int {
      val fnPtr = _78246712_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_TiltX(value: Int): Unit {
      val fnPtr = _78246712_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_TiltY(): Int {
      val fnPtr = _78246712_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_TiltY(value: Int): Unit {
      val fnPtr = _78246712_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78246712_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInjectedInputPenInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __78246712_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInjectedInputPenInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b40ad03ca1e55277e022828540bb1d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInjectedInputPenInfo(ptr: Pointer?): WithDefault =
        IInjectedInputPenInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInjectedInputPenInfo {
      val address = segment.toRawLongValue()
      return makeIInjectedInputPenInfo(Pointer(address))
    }

    public override fun toNative(obj: IInjectedInputPenInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__78246712_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInjectedInputPenInfo): Array<IInjectedInputPenInfo?> =
        (elements as
        Array<IInjectedInputPenInfo?>).castToImpl<IInjectedInputPenInfo,IInjectedInputPenInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInjectedInputPenInfo?> =
        arrayOfNulls<IInjectedInputPenInfo_Impl>(size) as Array<IInjectedInputPenInfo?>
  }
}
