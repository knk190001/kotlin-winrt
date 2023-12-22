package Windows.Media.Devices

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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaDeviceControl.ABI::class)
@Signature("{efa8dfa9-6f75-4863-ba0b-583f3036b4de}")
@Guid("efa8dfa96f754863ba0b583f3036b4de")
@WinRTInterface("efa8dfa96f754863ba0b583f3036b4de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaDeviceControl.ByReference::class)
public interface IMediaDeviceControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Capabilities(): MediaDeviceControlCapabilities?

  @InterfaceMethod(1)
  public fun TryGetValue(value: Double): Boolean

  @InterfaceMethod(2)
  public fun TrySetValue(value: Double): Boolean

  @InterfaceMethod(3)
  public fun TryGetAuto(value: Boolean): Boolean

  @InterfaceMethod(4)
  public fun TrySetAuto(value: Boolean): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaDeviceControl> {
    public override fun getValue() = ABI.makeIMediaDeviceControl(pointer.getPointer(0))

    public fun setValue(value: IMediaDeviceControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaDeviceControl {
    public val __1575972740_Ptr: Pointer?

    public val _1575972740_VtblPtr: Pointer?
      get() = __1575972740_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Capabilities(): MediaDeviceControlCapabilities? {
      val fnPtr = _1575972740_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControlCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1575972740_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControlCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetValue(value: Double): Boolean {
      val fnPtr = _1575972740_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1575972740_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun TrySetValue(value: Double): Boolean {
      val fnPtr = _1575972740_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1575972740_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun TryGetAuto(value: Boolean): Boolean {
      val fnPtr = _1575972740_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1575972740_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun TrySetAuto(value: Boolean): Boolean {
      val fnPtr = _1575972740_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1575972740_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMediaDeviceControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1575972740_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaDeviceControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efa8dfa96f754863ba0b583f3036b4de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaDeviceControl(ptr: Pointer?): WithDefault = IMediaDeviceControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaDeviceControl {
      val address = segment.toRawLongValue()
      return makeIMediaDeviceControl(Pointer(address))
    }

    public override fun toNative(obj: IMediaDeviceControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1575972740_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaDeviceControl): Array<IMediaDeviceControl?> =
        (elements as
        Array<IMediaDeviceControl?>).castToImpl<IMediaDeviceControl,IMediaDeviceControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaDeviceControl?> =
        arrayOfNulls<IMediaDeviceControl_Impl>(size) as Array<IMediaDeviceControl?>
  }
}
