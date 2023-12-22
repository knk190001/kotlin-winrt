package Windows.Media.Devices.Core

import Windows.Foundation.IReference
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrameIsoSpeedControl.ABI::class)
@Signature("{1a03efed-786a-4c75-a557-7ab9a85f588c}")
@Guid("1a03efed786a4c75a5577ab9a85f588c")
@WinRTInterface("1a03efed786a4c75a5577ab9a85f588c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameIsoSpeedControl.ByReference::class)
public interface IFrameIsoSpeedControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Auto(): Boolean

  @InterfaceMethod(1)
  public fun put_Auto(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Value(): IReference<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun put_Value(value: IReference<WinDef.UINT>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameIsoSpeedControl> {
    public override fun getValue() = ABI.makeIFrameIsoSpeedControl(pointer.getPointer(0))

    public fun setValue(value: IFrameIsoSpeedControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameIsoSpeedControl {
    public val __265213042_Ptr: Pointer?

    public val _265213042_VtblPtr: Pointer?
      get() = __265213042_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Auto(): Boolean {
      val fnPtr = _265213042_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__265213042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Auto(value: Boolean): Unit {
      val fnPtr = _265213042_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__265213042_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Value(): IReference<WinDef.UINT>? {
      val fnPtr = _265213042_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__265213042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Value(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _265213042_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__265213042_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameIsoSpeedControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __265213042_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameIsoSpeedControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a03efed786a4c75a5577ab9a85f588c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameIsoSpeedControl(ptr: Pointer?): WithDefault =
        IFrameIsoSpeedControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameIsoSpeedControl {
      val address = segment.toRawLongValue()
      return makeIFrameIsoSpeedControl(Pointer(address))
    }

    public override fun toNative(obj: IFrameIsoSpeedControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__265213042_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameIsoSpeedControl): Array<IFrameIsoSpeedControl?> =
        (elements as
        Array<IFrameIsoSpeedControl?>).castToImpl<IFrameIsoSpeedControl,IFrameIsoSpeedControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameIsoSpeedControl?> =
        arrayOfNulls<IFrameIsoSpeedControl_Impl>(size) as Array<IFrameIsoSpeedControl?>
  }
}
