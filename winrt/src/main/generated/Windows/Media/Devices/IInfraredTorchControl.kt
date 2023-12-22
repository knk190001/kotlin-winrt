package Windows.Media.Devices

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInfraredTorchControl.ABI::class)
@Signature("{1cba2c83-6cb6-5a04-a6fc-3be7b33ff056}")
@Guid("1cba2c836cb65a04a6fc3be7b33ff056")
@WinRTInterface("1cba2c836cb65a04a6fc3be7b33ff056")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfraredTorchControl.ByReference::class)
public interface IInfraredTorchControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_SupportedModes(): IVectorView<InfraredTorchMode?>?

  @InterfaceMethod(2)
  public fun get_CurrentMode(): InfraredTorchMode?

  @InterfaceMethod(3)
  public fun put_CurrentMode(value: InfraredTorchMode?): Unit

  @InterfaceMethod(4)
  public fun get_MinPower(): Int

  @InterfaceMethod(5)
  public fun get_MaxPower(): Int

  @InterfaceMethod(6)
  public fun get_PowerStep(): Int

  @InterfaceMethod(7)
  public fun get_Power(): Int

  @InterfaceMethod(8)
  public fun put_Power(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfraredTorchControl> {
    public override fun getValue() = ABI.makeIInfraredTorchControl(pointer.getPointer(0))

    public fun setValue(value: IInfraredTorchControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfraredTorchControl {
    public val __2106131517_Ptr: Pointer?

    public val _2106131517_VtblPtr: Pointer?
      get() = __2106131517_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSupported(): Boolean {
      val fnPtr = _2106131517_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2106131517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SupportedModes(): IVectorView<InfraredTorchMode?>? {
      val fnPtr = _2106131517_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<InfraredTorchMode?>>()
      val hr = fn.invokeHR(arrayOf(__2106131517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<InfraredTorchMode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CurrentMode(): InfraredTorchMode? {
      val fnPtr = _2106131517_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfraredTorchMode>()
      val hr = fn.invokeHR(arrayOf(__2106131517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfraredTorchMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CurrentMode(value: InfraredTorchMode?): Unit {
      val fnPtr = _2106131517_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2106131517_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MinPower(): Int {
      val fnPtr = _2106131517_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2106131517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_MaxPower(): Int {
      val fnPtr = _2106131517_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2106131517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_PowerStep(): Int {
      val fnPtr = _2106131517_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2106131517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_Power(): Int {
      val fnPtr = _2106131517_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2106131517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_Power(value: Int): Unit {
      val fnPtr = _2106131517_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2106131517_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInfraredTorchControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2106131517_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfraredTorchControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1cba2c836cb65a04a6fc3be7b33ff056")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfraredTorchControl(ptr: Pointer?): WithDefault =
        IInfraredTorchControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfraredTorchControl {
      val address = segment.toRawLongValue()
      return makeIInfraredTorchControl(Pointer(address))
    }

    public override fun toNative(obj: IInfraredTorchControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2106131517_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfraredTorchControl): Array<IInfraredTorchControl?> =
        (elements as
        Array<IInfraredTorchControl?>).castToImpl<IInfraredTorchControl,IInfraredTorchControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfraredTorchControl?> =
        arrayOfNulls<IInfraredTorchControl_Impl>(size) as Array<IInfraredTorchControl?>
  }
}
