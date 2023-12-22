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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExposurePriorityVideoControl.ABI::class)
@Signature("{2cb240a3-5168-4271-9ea5-47621a98a352}")
@Guid("2cb240a3516842719ea547621a98a352")
@WinRTInterface("2cb240a3516842719ea547621a98a352")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExposurePriorityVideoControl.ByReference::class)
public interface IExposurePriorityVideoControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_Enabled(): Boolean

  @InterfaceMethod(2)
  public fun put_Enabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExposurePriorityVideoControl> {
    public override fun getValue() = ABI.makeIExposurePriorityVideoControl(pointer.getPointer(0))

    public fun setValue(value: IExposurePriorityVideoControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExposurePriorityVideoControl {
    public val __1668579986_Ptr: Pointer?

    public val _1668579986_VtblPtr: Pointer?
      get() = __1668579986_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _1668579986_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1668579986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Enabled(): Boolean {
      val fnPtr = _1668579986_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1668579986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Enabled(value: Boolean): Unit {
      val fnPtr = _1668579986_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1668579986_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExposurePriorityVideoControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1668579986_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExposurePriorityVideoControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2cb240a3516842719ea547621a98a352")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExposurePriorityVideoControl(ptr: Pointer?): WithDefault =
        IExposurePriorityVideoControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExposurePriorityVideoControl {
      val address = segment.toRawLongValue()
      return makeIExposurePriorityVideoControl(Pointer(address))
    }

    public override fun toNative(obj: IExposurePriorityVideoControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1668579986_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExposurePriorityVideoControl):
        Array<IExposurePriorityVideoControl?> = (elements as
        Array<IExposurePriorityVideoControl?>).castToImpl<IExposurePriorityVideoControl,IExposurePriorityVideoControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExposurePriorityVideoControl?> =
        arrayOfNulls<IExposurePriorityVideoControl_Impl>(size) as
        Array<IExposurePriorityVideoControl?>
  }
}
