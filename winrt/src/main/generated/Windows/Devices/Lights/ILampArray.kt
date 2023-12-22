package Windows.Devices.Lights

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Numerics.Vector3
import Windows.Foundation.TimeSpan
import Windows.Storage.Streams.IBuffer
import Windows.System.VirtualKey
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILampArray.ABI::class)
@Signature("{7ace9787-c8a0-4e95-a1e0-d58676538649}")
@Guid("7ace9787c8a04e95a1e0d58676538649")
@WinRTInterface("7ace9787c8a04e95a1e0d58676538649")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArray.ByReference::class)
public interface ILampArray : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_HardwareVendorId(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_HardwareProductId(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun get_HardwareVersion(): WinDef.USHORT

  @InterfaceMethod(4)
  public fun get_LampArrayKind(): LampArrayKind?

  @InterfaceMethod(5)
  public fun get_LampCount(): Int

  @InterfaceMethod(6)
  public fun get_MinUpdateInterval(): TimeSpan?

  @InterfaceMethod(7)
  public fun get_BoundingBox(): Vector3?

  @InterfaceMethod(8)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(9)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_BrightnessLevel(): Double

  @InterfaceMethod(11)
  public fun put_BrightnessLevel(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_IsConnected(): Boolean

  @InterfaceMethod(13)
  public fun get_SupportsVirtualKeys(): Boolean

  @InterfaceMethod(14)
  public fun GetLampInfo(lampIndex: Int): LampInfo?

  @InterfaceMethod(15)
  public fun GetIndicesForKey(key: VirtualKey?): Array<Int>?

  @InterfaceMethod(16)
  public fun GetIndicesForPurposes(purposes: LampPurposes?): Array<Int>?

  @InterfaceMethod(17)
  public fun SetColor(desiredColor: Color?): Unit

  @InterfaceMethod(18)
  public fun SetColorForIndex(lampIndex: Int, desiredColor: Color?): Unit

  @InterfaceMethod(19)
  public fun SetSingleColorForIndices(desiredColor: Color?, lampIndexes: Array<Int>): Unit

  @InterfaceMethod(20)
  public fun SetColorsForIndices(desiredColors: Array<Color?>, lampIndexes: Array<Int>): Unit

  @InterfaceMethod(21)
  public fun SetColorsForKey(desiredColor: Color?, key: VirtualKey?): Unit

  @InterfaceMethod(22)
  public fun SetColorsForKeys(desiredColors: Array<Color?>, keys: Array<VirtualKey?>): Unit

  @InterfaceMethod(23)
  public fun SetColorsForPurposes(desiredColor: Color?, purposes: LampPurposes?): Unit

  @InterfaceMethod(24)
  public fun SendMessageAsync(messageId: Int, message: IBuffer?): IAsyncAction?

  @InterfaceMethod(25)
  public fun RequestMessageAsync(messageId: Int): IAsyncOperation<IBuffer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILampArray> {
    public override fun getValue() = ABI.makeILampArray(pointer.getPointer(0))

    public fun setValue(value: ILampArray_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArray {
    public val __497106257_Ptr: Pointer?

    public val _497106257_VtblPtr: Pointer?
      get() = __497106257_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _497106257_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HardwareVendorId(): WinDef.USHORT {
      val fnPtr = _497106257_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_HardwareProductId(): WinDef.USHORT {
      val fnPtr = _497106257_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_HardwareVersion(): WinDef.USHORT {
      val fnPtr = _497106257_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_LampArrayKind(): LampArrayKind? {
      val fnPtr = _497106257_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampArrayKind>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampArrayKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_LampCount(): Int {
      val fnPtr = _497106257_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_MinUpdateInterval(): TimeSpan? {
      val fnPtr = _497106257_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_BoundingBox(): Vector3? {
      val fnPtr = _497106257_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _497106257_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _497106257_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_BrightnessLevel(): Double {
      val fnPtr = _497106257_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_BrightnessLevel(value: Double): Unit {
      val fnPtr = _497106257_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsConnected(): Boolean {
      val fnPtr = _497106257_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_SupportsVirtualKeys(): Boolean {
      val fnPtr = _497106257_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun GetLampInfo(lampIndex: Int): LampInfo? {
      val fnPtr = _497106257_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampInfo>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, lampIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun GetIndicesForKey(key: VirtualKey?): Array<Int>? {
      val fnPtr = _497106257_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Int>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, marshalToNative(key), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetIndicesForPurposes(purposes: LampPurposes?): Array<Int>? {
      val fnPtr = _497106257_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Int>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, marshalToNative(purposes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun SetColor(desiredColor: Color?): Unit {
      val fnPtr = _497106257_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, marshalToNative(desiredColor),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun SetColorForIndex(lampIndex: Int, desiredColor: Color?): Unit {
      val fnPtr = _497106257_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, lampIndex, marshalToNative(desiredColor),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun SetSingleColorForIndices(desiredColor: Color?, lampIndexes: Array<Int>):
        Unit {
      val fnPtr = _497106257_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, marshalToNative(desiredColor),
          lampIndexes.size,marshalToNative(lampIndexes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun SetColorsForIndices(desiredColors: Array<Color?>, lampIndexes: Array<Int>):
        Unit {
      val fnPtr = _497106257_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,
          desiredColors.size,marshalToNative(desiredColors),
          lampIndexes.size,marshalToNative(lampIndexes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun SetColorsForKey(desiredColor: Color?, key: VirtualKey?): Unit {
      val fnPtr = _497106257_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, marshalToNative(desiredColor),
          marshalToNative(key),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun SetColorsForKeys(desiredColors: Array<Color?>, keys: Array<VirtualKey?>):
        Unit {
      val fnPtr = _497106257_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr,
          desiredColors.size,marshalToNative(desiredColors), keys.size,marshalToNative(keys),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun SetColorsForPurposes(desiredColor: Color?, purposes: LampPurposes?): Unit {
      val fnPtr = _497106257_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, marshalToNative(desiredColor),
          marshalToNative(purposes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun SendMessageAsync(messageId: Int, message: IBuffer?): IAsyncAction? {
      val fnPtr = _497106257_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, messageId, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun RequestMessageAsync(messageId: Int): IAsyncOperation<IBuffer?>? {
      val fnPtr = _497106257_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__497106257_Ptr, messageId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }
  }

  public class ILampArray_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __497106257_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArray, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ace9787c8a04e95a1e0d58676538649")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArray(ptr: Pointer?): WithDefault = ILampArray_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArray {
      val address = segment.toRawLongValue()
      return makeILampArray(Pointer(address))
    }

    public override fun toNative(obj: ILampArray): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__497106257_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArray): Array<ILampArray?> = (elements as
        Array<ILampArray?>).castToImpl<ILampArray,ILampArray_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArray?> = arrayOfNulls<ILampArray_Impl>(size)
        as Array<ILampArray?>
  }
}
