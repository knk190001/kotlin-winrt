package Windows.UI.Input

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

@ABIMarker(IPointerVisualizationSettings.ABI::class)
@Signature("{4d1e6461-84f7-499d-bd91-2a36e2b7aaa2}")
@Guid("4d1e646184f7499dbd912a36e2b7aaa2")
@WinRTInterface("4d1e646184f7499dbd912a36e2b7aaa2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerVisualizationSettings.ByReference::class)
public interface IPointerVisualizationSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_IsContactFeedbackEnabled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_IsContactFeedbackEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_IsBarrelButtonFeedbackEnabled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsBarrelButtonFeedbackEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerVisualizationSettings> {
    public override fun getValue() = ABI.makeIPointerVisualizationSettings(pointer.getPointer(0))

    public fun setValue(value: IPointerVisualizationSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerVisualizationSettings {
    public val __1473378568_Ptr: Pointer?

    public val _1473378568_VtblPtr: Pointer?
      get() = __1473378568_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsContactFeedbackEnabled(value: Boolean): Unit {
      val fnPtr = _1473378568_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1473378568_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_IsContactFeedbackEnabled(): Boolean {
      val fnPtr = _1473378568_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1473378568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsBarrelButtonFeedbackEnabled(value: Boolean): Unit {
      val fnPtr = _1473378568_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1473378568_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsBarrelButtonFeedbackEnabled(): Boolean {
      val fnPtr = _1473378568_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1473378568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPointerVisualizationSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1473378568_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerVisualizationSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d1e646184f7499dbd912a36e2b7aaa2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerVisualizationSettings(ptr: Pointer?): WithDefault =
        IPointerVisualizationSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerVisualizationSettings {
      val address = segment.toRawLongValue()
      return makeIPointerVisualizationSettings(Pointer(address))
    }

    public override fun toNative(obj: IPointerVisualizationSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1473378568_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerVisualizationSettings):
        Array<IPointerVisualizationSettings?> = (elements as
        Array<IPointerVisualizationSettings?>).castToImpl<IPointerVisualizationSettings,IPointerVisualizationSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerVisualizationSettings?> =
        arrayOfNulls<IPointerVisualizationSettings_Impl>(size) as
        Array<IPointerVisualizationSettings?>
  }
}
