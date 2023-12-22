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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IZoomSettings.ABI::class)
@Signature("{6ad66b24-14b4-4bfd-b18f-88fe24463b52}")
@Guid("6ad66b2414b44bfdb18f88fe24463b52")
@WinRTInterface("6ad66b2414b44bfdb18f88fe24463b52")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IZoomSettings.ByReference::class)
public interface IZoomSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): ZoomTransitionMode?

  @InterfaceMethod(1)
  public fun put_Mode(value: ZoomTransitionMode?): Unit

  @InterfaceMethod(2)
  public fun get_Value(): Float

  @InterfaceMethod(3)
  public fun put_Value(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IZoomSettings>
      {
    public override fun getValue() = ABI.makeIZoomSettings(pointer.getPointer(0))

    public fun setValue(value: IZoomSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IZoomSettings {
    public val __201345207_Ptr: Pointer?

    public val _201345207_VtblPtr: Pointer?
      get() = __201345207_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): ZoomTransitionMode? {
      val fnPtr = _201345207_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ZoomTransitionMode>()
      val hr = fn.invokeHR(arrayOf(__201345207_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ZoomTransitionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mode(value: ZoomTransitionMode?): Unit {
      val fnPtr = _201345207_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__201345207_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Value(): Float {
      val fnPtr = _201345207_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__201345207_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Value(value: Float): Unit {
      val fnPtr = _201345207_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__201345207_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IZoomSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __201345207_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IZoomSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ad66b2414b44bfdb18f88fe24463b52")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIZoomSettings(ptr: Pointer?): WithDefault = IZoomSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IZoomSettings {
      val address = segment.toRawLongValue()
      return makeIZoomSettings(Pointer(address))
    }

    public override fun toNative(obj: IZoomSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__201345207_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IZoomSettings): Array<IZoomSettings?> = (elements as
        Array<IZoomSettings?>).castToImpl<IZoomSettings,IZoomSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IZoomSettings?> =
        arrayOfNulls<IZoomSettings_Impl>(size) as Array<IZoomSettings?>
  }
}
