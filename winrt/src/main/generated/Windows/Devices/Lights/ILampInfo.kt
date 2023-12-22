package Windows.Devices.Lights

import Windows.Foundation.IReference
import Windows.Foundation.Numerics.Vector3
import Windows.Foundation.TimeSpan
import Windows.UI.Color
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

@ABIMarker(ILampInfo.ABI::class)
@Signature("{30bb521c-0acf-49da-8c10-150b9cf62713}")
@Guid("30bb521c0acf49da8c10150b9cf62713")
@WinRTInterface("30bb521c0acf49da8c10150b9cf62713")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampInfo.ByReference::class)
public interface ILampInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Index(): Int

  @InterfaceMethod(1)
  public fun get_Purposes(): LampPurposes?

  @InterfaceMethod(2)
  public fun get_Position(): Vector3?

  @InterfaceMethod(3)
  public fun get_RedLevelCount(): Int

  @InterfaceMethod(4)
  public fun get_GreenLevelCount(): Int

  @InterfaceMethod(5)
  public fun get_BlueLevelCount(): Int

  @InterfaceMethod(6)
  public fun get_GainLevelCount(): Int

  @InterfaceMethod(7)
  public fun get_FixedColor(): IReference<Color?>?

  @InterfaceMethod(8)
  public fun GetNearestSupportedColor(desiredColor: Color?): Color?

  @InterfaceMethod(9)
  public fun get_UpdateLatency(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILampInfo> {
    public override fun getValue() = ABI.makeILampInfo(pointer.getPointer(0))

    public fun setValue(value: ILampInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampInfo {
    public val __1923392842_Ptr: Pointer?

    public val _1923392842_VtblPtr: Pointer?
      get() = __1923392842_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Index(): Int {
      val fnPtr = _1923392842_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1923392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Purposes(): LampPurposes? {
      val fnPtr = _1923392842_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampPurposes>()
      val hr = fn.invokeHR(arrayOf(__1923392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampPurposes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Position(): Vector3? {
      val fnPtr = _1923392842_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1923392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RedLevelCount(): Int {
      val fnPtr = _1923392842_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1923392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_GreenLevelCount(): Int {
      val fnPtr = _1923392842_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1923392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_BlueLevelCount(): Int {
      val fnPtr = _1923392842_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1923392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_GainLevelCount(): Int {
      val fnPtr = _1923392842_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1923392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_FixedColor(): IReference<Color?>? {
      val fnPtr = _1923392842_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1923392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetNearestSupportedColor(desiredColor: Color?): Color? {
      val fnPtr = _1923392842_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1923392842_Ptr, marshalToNative(desiredColor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_UpdateLatency(): TimeSpan? {
      val fnPtr = _1923392842_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1923392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class ILampInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1923392842_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30bb521c0acf49da8c10150b9cf62713")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampInfo(ptr: Pointer?): WithDefault = ILampInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampInfo {
      val address = segment.toRawLongValue()
      return makeILampInfo(Pointer(address))
    }

    public override fun toNative(obj: ILampInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1923392842_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampInfo): Array<ILampInfo?> = (elements as
        Array<ILampInfo?>).castToImpl<ILampInfo,ILampInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampInfo?> = arrayOfNulls<ILampInfo_Impl>(size)
        as Array<ILampInfo?>
  }
}
